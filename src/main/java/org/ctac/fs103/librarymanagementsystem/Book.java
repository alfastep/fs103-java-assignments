package org.ctac.fs103.librarymanagementsystem;

class Book  extends LibraryItem{
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }


    public String getISBN() {
        return ISBN;
    }


    String getItemType() {
        return "Book";
    }

    String getItemDetails() {
        return getItemType() + " Title: " + getTitle() + " Author: " + getAuthor() + " Release Year: " + getReleaseYear()
                + " ISBN: " + getISBN();
    }
}
