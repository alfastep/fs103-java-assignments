package org.ctac.fs103.librarymanagementsystem;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryItems = new LibraryManager<>();

        LibraryItem book1 = new Book("Lord of the Flies", 1954, "William Golding", "LF1954");
        LibraryItem book2 = new Book("Animal Farm", 1945, "George Orwell", "AF1945");
        LibraryItem dvd1 = new DVD("Interstellar", 2014, "Christopher Nolan", 169);
        LibraryItem dvd2 = new DVD("The Harder They Fall", 2021, "The Bullitts", 139);

        libraryItems.addItem(book1);
        libraryItems.addItem(dvd1);
        libraryItems.displayItems();

        System.out.println();

        libraryItems.addItem(book2);
        libraryItems.addItem(dvd2);
        libraryItems.displayItems();

        System.out.println();

        libraryItems.removeItem(dvd1);
        libraryItems.removeItem(book2);
        libraryItems.displayItems();
    }
}
