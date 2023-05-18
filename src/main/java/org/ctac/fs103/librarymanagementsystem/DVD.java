package org.ctac.fs103.librarymanagementsystem;

class DVD extends LibraryItem{
    private String director;
    private int minutes;

    public DVD (String title, int releaseYear, String director, int minutes) {
        super(title, releaseYear);
        this.director = director;
        this.minutes = minutes;
    }


    public String getDirector() {
        return director;
    }


    public int getMinutes() {
        return minutes;
    }


    String getItemType() {
        return "DVD";
    }

    String getItemDetails() {
        return getItemType() + " Title: " + getTitle() + " Director: " + getDirector() + " Release Year: " + getReleaseYear()
                + " Minutes: " + getMinutes();
    }
}
