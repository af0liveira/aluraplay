package com.github.af0liveira.aluraplay.modelos;

public class Audio {
    private String title;
    private int durationInSeconds;
    private int timesPlayed = 0;
    private int timesLiked = 0;
    private int timesDisliked = 0;

    public void playAudio() {
        this.timesPlayed++;
        // TODO: implement logic for actually playing the audio.
    }

    public void likeAudio() {
        this.timesLiked++;
    }

    public void dislikeAudio() {
        this.timesDisliked++;
    }

    public String getTitle() {
        return  this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getTimesPlayed() {
        return this.timesPlayed;
    }

    public int getTimesLiked() {
        return this.timesLiked;
    }

    public int getTimesDisliked() {
        return this.timesDisliked;
    }
}
