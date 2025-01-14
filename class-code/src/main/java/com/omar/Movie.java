package com.omar;

public class Movie {
    private String title;
    private double rating;
    private int length;
    private String director;
    private int year;
    private boolean hasOscar;

    public Movie(double rating,String title, int length, String director, int year, boolean hasOscar) {
        this.title = title;
        this.rating = rating;
        this.length = length;
        this.director = director;
        this.year = year;
        this.hasOscar = hasOscar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHasOscar() {
        return hasOscar;
    }

    public void setHasOscar(boolean hasOscar) {
        this.hasOscar = hasOscar;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", length=" + length +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", hasOscar=" + hasOscar +
                '}';
    }
}
