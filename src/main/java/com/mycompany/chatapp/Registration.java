/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.chatapp;

import java.util.Scanner;

public class Registration {
    private String username;
    private String password;
    private String phone;
    private String firstName;
    private String lastName;

    private final Scanner scanner;

    public Registration() {
        scanner = new Scanner(System.in);
    }

    // Method to start registration
    public User registerUser() {
        System.out.println("\n=== User Registration ===");

        // Get and validate username
        while (true) {
            System.out.print("Enter username (must contain '_' and max 5 chars): ");
            String inputUsername = scanner.nextLine();

            if (Validator.checkUsername(inputUsername)) {
                this.username = inputUsername;
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted; ensure it contains '_' and is max 5 characters.");
            }
        }

        // Get and validate password
        while (true) {
            System.out.print("Enter password (min 8 chars, 1 capital, 1 number, 1 special): ");
            String inputPassword = scanner.nextLine();

            if (Validator.checkPassword(inputPassword)) {
                this.password = inputPassword;
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Paasword is not correctly formatted; ensure it has 8+ chars, capital, number, and special character.");
            }
        }
        
        // Get first name
        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        
        // Get last name
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();

        // Get and validate phone number
        while (true) {
            System.out.print("Enter phone number (+27xxxxxxxxx): ");
            String inputPhone = scanner.nextLine();

            if (Validator.checkPhone(inputPhone)) {
                this.phone = inputPhone;
                System.out.println("Cell phone number successfully added.");
                break;
            } else {
                System.out.println("Cell phone incorrectly formatted.");
            }
        }

        System.out.println("Registration successful! Welcome, " + username + "!");
        return new User(username, password, firstName, lastName, phone);
    }

        // now using real values 
        
            
    // Optional: close scanner when done
    public void closeScanner() {
        scanner.close();
    }

    // Getters for username, password, phone if needed
    public String getUsername() { 
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}

