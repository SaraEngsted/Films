package com.example.moviesapp.models;

public class Films implements Comparable <Films>{

    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Films(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;

    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean getAwards() {
        return Boolean.parseBoolean(awards);
    }

    @Override
    public String toString() {
        return "Films{" +
                "year=" + year +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards='" + awards + '\'' +
                '}';
    }



    @Override
    public int compareTo(Films films) {

        if (popularity > films.getPopularity()) {
            return -1;
        } else {
            return 0;
        }

    }

}
