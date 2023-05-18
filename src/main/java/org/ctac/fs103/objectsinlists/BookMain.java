package org.ctac.fs103.objectsinlists;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("Hamlet", 104, 1603);
        books.add(book1);

        Book book2 = new Book("Lord of the Flies", 224, 1954);
        books.add(book2);

        Book book3 = new Book("1984", 328, 1949);
        books.add(book3);

        while (true) {
            System.out.println("Name of the book:");
            String name = scanner.nextLine();

            if (name.equals("")) break;

            System.out.println("How many pages?");
            int numPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Year of publication:");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(name, numPages, year));
        }

        System.out.print("What information will be printed?");
        String ans = scanner.nextLine();

        if (ans.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        } else if (ans.equalsIgnoreCase("name")) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < books.size(); i++) {
                if (i == books.size() -1) {
                    str.append("and ").append(books.get(i).getTitle());
                } else {
                    str.append(books.get(i).getTitle()).append(", ");
                }
            }
            System.out.println(str);
        } else {
            System.out.println("No information will be displayed.");
        }


    }
}
