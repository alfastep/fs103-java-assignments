package org.ctac.fs103.takinglibrarymanagementfurther;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " has been registered to the library.");
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findByPublicationYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> findByNumPages(int pages) {
        return books.stream()
                .filter(book -> book.getPages() > pages)
                .collect(Collectors.toList());
    }

    public List<Book> findByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public void printBookTitles() {
        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);
    }

    public void loanOutBook(User user, Book book) {
        Predicate<Book> isAvailable = b -> books.contains(b) && !b.isOnLoan();
        Predicate<Book> isOnLoanToAnyUser = Book::isOnLoan;

        if (!isAvailable.test(book)) {
            System.out.println(book.getTitle() + " is not available in the library or is already on loan.");
        } else if (isOnLoanToAnyUser.test(book)) {
            System.out.println(book.getTitle() + " is already on loan.");
        } else {
            book.setOnLoan(true);
            user.borrowBook(book);
            System.out.println(book.getTitle() + " has been loaned to " + user.getName() + ".");
        }
    }

    public void returnBook(User user, Book book) {
        if (!books.contains(book)) {
            System.out.println(book.getTitle() + " is not available in the library.");
        } else if (!user.getBooksOnLoan().contains(book)) {
            System.out.println(book.getTitle() + " is not on loan to " + user.getName() + ".");
        } else {
            user.returnBook(book);
            book.setOnLoan(false); // Set the loan status to false
            System.out.println(book.getTitle() + " has been returned by " + user.getName() + ".");
        }
    }

}
