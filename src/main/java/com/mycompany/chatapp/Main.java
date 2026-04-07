package com.mycompany.chatapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Chat App ===");

        // ==========================
        // Step 1: Registration
        // ==========================
        Registration reg = new Registration();
        User registeredUser = reg.registerUser();

        // ==========================
        // Step 2: Login
        // ==========================
        System.out.println("\n=== Login ===");

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        Login loginManager = new Login();

        boolean loginSuccess = loginManager.authenticate(
                inputUsername,
                inputPassword,
                reg.getUsername(),
                reg.getPassword()
        );

        if (!loginSuccess) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        System.out.println("Login successful! Welcome " + inputUsername);

        // ==========================
        // Step 3: Chat Room
        // ==========================
        ChatRoom chat = new ChatRoom(registeredUser);
        chat.start();

        // ==========================
        // Step 4: Chat Loop
        // ==========================
        System.out.println("\nType messages (type 'exit' to quit)");

        while (true) {
            System.out.print(registeredUser.getName() + ": ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("ChatBot: " + generateReply(message));
        }
    }

    // Simple chatbot logic
    public static String generateReply(String message) {
        message = message.toLowerCase();

        if (message.contains("hi") || message.contains("hello")) {
            return "Hey there 👋";
        } else if (message.contains("how are you")) {
            return "I'm good, you?";
        } else if (message.contains("bye")) {
            return "See you later!";
        } else {
            return "I hear you...";
        }
    }
}