package org.ctac.fs103.takinglibrarymanagementfurther;

import java.time.LocalDate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User lane = new User("Lane", 123);
        User jane = new User("Jane", 456);
        User jon = new User("Jon", 789);

        library.registerUser(lane);
        library.registerUser(jane);
        library.registerUser(jon);

        Book book1 = new Book("Lord of the Flies", "William Golding", 1954, 224, "Fiction", 0.50);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945, 140, "Fiction", 0.75);
        Book book3 = new Book("A Wrinkle in Time", "Madeleine L'Engle", 1962, 256, "Fiction", 0.85);
        Book book4 = new Book("1984", "George Orwell", 1949, 328, "Sci-Fi", 1.00);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.findByAuthor("George Orwell").forEach(System.out::println);
        System.out.println();

        library.findByPublicationYear(1962).forEach(System.out::println);
        System.out.println();

        System.out.println(library.findBookWithMostPages());
        System.out.println();

        library.findByNumPages(120).forEach(System.out::println);
        System.out.println();

        library.printBookTitles();
        System.out.println();

        library.findByCategory("fiction").forEach(System.out::println);
        System.out.println();

        library.loanOutBook(lane, book1);  // Loan out Book 1 to Lane
        library.loanOutBook(lane, book2);  // Loan out Book 2 to Lane
        library.loanOutBook(jane, book1);  // Trying to loan out Book 1 to Jane (already on loan to Lane)
        library.returnBook(lane, book1);  // Return Book 1 by User Lane
        library.loanOutBook(jane, book1);
        library.returnBook(lane, book2);
        library.returnBook(jane, book1);
        System.out.println();

        jon.borrowBook(book1);
        jon.borrowBook(book2);
        jon.borrowBook(book3);

        LocalDate today = LocalDate.now();
        LocalDate dueDate1 = today.plusWeeks(2);
        LocalDate dueDate2 = today.minusDays(2); // Overdue
        LocalDate dueDate3 = today.plusDays(5);
        LocalDate dueDate4 = today.plusDays(1);

        book1.setDueDate(dueDate1);
        book2.setDueDate(dueDate2);
        book3.setDueDate(dueDate3);
        book4.setDueDate(dueDate4);

        // Calculate late fees for the user
        double lateFees = jon.calculateLateFees();
        System.out.println("Total late fees for " + jon.getName() + ": $" + lateFees);

        // Get overdue books for the user
        List<Book> overdueBooks = jon.getOverdueBooks();
        System.out.println("Overdue books for " + jon.getName() + ":");
        overdueBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}
