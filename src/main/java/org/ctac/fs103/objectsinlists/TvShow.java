package org.ctac.fs103.objectsinlists;

public class TvShow {
    private String name;
    private int numEpisodes;
    private String genre;

    public TvShow(String name, int numEpisodes, String genre) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public TvShow(String name, int numEpisodes) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = "";
    }

    public TvShow(String name, String genre) {
        this.name = name;
        this.numEpisodes = 0;
        this.genre = genre;
    }

    public TvShow(String name) {
        this.name = name;
        this.numEpisodes = 0;
        this.genre = "";
    }

    public String getName() {
        return name;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getNumEpisodes() +
                " number of episodes. The genre is " + getGenre();
    }
}
