package com.github.af0liveira.aluraplay.modelos;

public class PodcastEpisode extends Audio {
    private String creator;
    private String showTitle;
    private String episodeDescription;
    private int season;
    private int episode;
    private int day;
    private int month;
    private int year;

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getShowTitle() {
        return this.showTitle;
    }

    public void getShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getEpisodeDescription() {
        return this.episodeDescription;
    }

    public void setEpisodeDescription(String episodeDescription) {
        this.episodeDescription = episodeDescription;
    }

    public int getSeason() {
        return this.season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return this.episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
