package org.example.A10.TD1.model;

public class User {
    private String username;
    private boolean isAdmin;

    public User(String username, boolean isAdmin) {
        this.username = username;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return username + (isAdmin ? " (admin)" : "");
    }
}
