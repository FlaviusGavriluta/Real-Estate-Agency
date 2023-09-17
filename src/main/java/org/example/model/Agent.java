package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Agent extends User {
    List<Ad> postedAds;

    public Agent(String name, String contact) {
        super(name, contact);
        this.postedAds = new ArrayList<>();
    }

    @Override
    String sendDirectMessageToUser(String message) {
        return null;
    }

    public void postAd(Ad ad) {
        this.postedAds.add(ad);
    }

    public void listAds(List<Ad> ads) {
        ads.forEach(System.out::println);
    }
}
