package com.example.fitmind;

/**
 * Created by Shuaib on 2017-07-01.
 */

public class Goodie {

    public Goodie(String title, String description, int pointsNeeded ){
        this.category = title;
        this.description = description;
        this.pointsNeeded = pointsNeeded;
    }

    public Goodie(String title, String description, int pointsNeeded, int goodieId ){
        this.category = title;
        this.description = description;
        this.pointsNeeded = pointsNeeded;
        this.goodieId = goodieId;
    }

    public int getGoodieId() {
        return goodieId;
    }

    public void setGoodieId(int goodieId) {
        this.goodieId = goodieId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPointsNeeded() {
        return pointsNeeded;
    }

    public void setPointsNeeded(int pointsNeeded) {
        this.pointsNeeded = pointsNeeded;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(int sponsorId) {
        this.sponsorId = sponsorId;
    }

    private int goodieId;
    private String description;
    private int pointsNeeded;
    private String category;
    private int sponsorId;



}
