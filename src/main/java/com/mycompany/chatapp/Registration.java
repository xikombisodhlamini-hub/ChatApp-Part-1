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

    private Scanner scanner;

    public Registration() {
        scanner = new Scanner(System.in);
    }

    // Method to start registration
    public User registerUser() {
        System.out.println("\n=== User Registration ===");

        // Get and validate username
        while (true) {
            System.out.print("Enter username (1-5 letters/numbers): ");
            String inputUsername = scanner.nextLine();

            if (Validator.checkUsername(inputUsername)) {
                this.username = inputUsername;
                break;
            } else {
                System.out.println("Invalid username. Try again.");
            }
        }

        // Get and validate password
        while (true) {
            System.out.print("Enter password (6-20 chars, can include ฿): ");
            String inputPassword = scanner.nextLine();

            if (Validator.checkPassword(inputPassword)) {
                this.password = inputPassword;
                break;
            } else {
                System.out.println("Invalid password. Try again.");
            }
        }

        // Get and validate phone number
        while (true) {
            System.out.print("Enter phone number (+27xxxxxxxxx): ");
            String inputPhone = scanner.nextLine();

            if (Validator.checkPhone(inputPhone)) {
                this.phone = inputPhone;
                break;
            } else {
                System.out.println("Invalid phone number. Try again.");
            }
        }

        System.out.println("Registration successful! Welcome, " + username + "!");
        return new User(username);
    }

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

