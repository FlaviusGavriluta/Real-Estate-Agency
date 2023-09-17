package org.example.model;

public abstract class User {
    private String name;
    private String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    abstract String sendDirectMessageToUser(String message);
}
