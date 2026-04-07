package com.mycompany.chatapp;

public class Login {

    // For demo purposes, valid username and password
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "Abc฿123";

    // Authenticate method: returns true if username AND password match
    public boolean authenticate(String username, String password, String username1, String password1) {
        // Check for null inputs to avoid errors
        if (username == null || password == null) {
            return false;
        }

        // Compare input with valid credentials
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}