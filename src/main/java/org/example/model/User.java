package org.example.model;

public class User {
    protected String name;
    protected String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void sendDMToUser(User user, String message) {
        System.out.println(this.name + " sent message to " + user.name + ": " + message);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
