package com.codeclan.topalbumlists;


public class Album {

    private int ranking;
    private String title;
    private String artist;

    public Album(Integer ranking, String title, String artist) {
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
