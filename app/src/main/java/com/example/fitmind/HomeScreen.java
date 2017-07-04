package com.example.fitmind;

/**
 * Created by Shuaib on 2017-07-04.
 */

public class HomeScreen {

    private String title;
    private String artist;

    public HomeScreen(String title, String artist, String points, int image) {
        this.title = title;
        this.artist = artist;
        this.points = points;
        this.image = image;
    }

    private String points;
    private int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
