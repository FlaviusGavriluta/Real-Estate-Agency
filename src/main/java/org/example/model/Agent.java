package org.example.model;

public class Agent extends User {
    public Agent(String name, String contact) {
        super(name, contact);
    }

    public void postAd(Ad ad) {
        System.out.println(this.name + " posted an AD: " + ad);
    }
}