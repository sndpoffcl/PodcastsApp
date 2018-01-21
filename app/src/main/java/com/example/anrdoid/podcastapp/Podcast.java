package com.example.anrdoid.podcastapp;

import java.util.ArrayList;

/**
 * Created by Labtop on 20/01/18.
 */

public class Podcast extends ArrayList<Podcast> {

    String pName;
    String pDate;
    int pImageId ;

    public Podcast(String name, String date , int imageId) {
        this.pName = name;
        this.pDate = date;
        this.pImageId = imageId;
    }

    public String getPodcastName() {
        return pName;
    }

    public String getPodcastDate() {
        return pDate;
    }

    public int getPodcastImageId() {
        return pImageId;
    }

    public void setPodcastName(String name) {
        this.pName = name;
    }

    public void setPodcastDate(String date) { this.pDate = date; }

    public void setPodcastImageId(int imageId) { this.pImageId = imageId; }

}
