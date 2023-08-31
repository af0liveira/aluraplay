package com.github.af0liveira.aluraplay.modelos;

public class SongTrack extends Audio {
    private String artist;
    private String album;
    private String composer;
    private String genre;
    private int year;

    private String getArtist() {
        return this.artist;
    }

    private void setArtist(String artist) {
        this.artist = artist;
    }

    private String getAlbum() {
        return this.album;
    }

    private void setAlbum(String album) {
        this.album = album;
    }

    private String getComposer() {
        return this.composer;
    }

    private void setComposer(String composer) {
        this.composer = composer;
    }

    private String getGenre() {
        return this.genre;
    }
    private void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
