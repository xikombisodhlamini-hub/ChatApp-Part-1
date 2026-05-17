package com.mycompany.chatapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to QuickChat ===");

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

        loginManager.register(registeredUser);

        boolean loginSuccess = loginManager.loginUser(inputUsername, inputPassword);

        System.out.println(loginManager.returnLoginStatus(loginSuccess));

        if (!loginSuccess) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        // ==========================
        // Step 3: QuickChat Menu
        // ==========================
        int choice;

        do {

            System.out.println("\n===== QUICKCHAT MENU =====");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");

            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("How many messages do you want to send? ");
                    int numMessages = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= numMessages; i++) {

                        System.out.println("\n=== Message " + i + " ===");

                        System.out.print("Enter recipient number (+27...): ");
                        String recipient = scanner.nextLine();

                        System.out.print("Enter your message: ");
                        String messageText = scanner.nextLine();

                        Message msg = new Message(i, recipient, messageText);

                        // Check recipient
                        if (!msg.checkRecipientCell()) {
                            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
                            continue;
                        }

                        // Check message length
                        System.out.println(msg.checkMessageLength());

                        if (msg.checkMessageLength().equals("Message ready to send.")) {

                            System.out.println("Message Hash: " + msg.createMessageHash());

                            System.out.println("\nChoose option:");
                            System.out.println("1) Send Message");
                            System.out.println("2) Store Message");
                            System.out.println("3) Disregard Message");

                            int messageChoice = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println(msg.sentMessage(messageChoice));

                            // Display full message details
                            System.out.println("\n===== MESSAGE DETAILS =====");
                            System.out.println("Message Hash: " + msg.createMessageHash());
                            System.out.println("Recipient: " + recipient);
                            System.out.println("Message: " + messageText);
                        }
                    }

                    break;

                case 2:
                    System.out.println("Coming Soon.");
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 3);

        // ==========================
        // Step 4: Total Messages
        // ==========================
        Message total = new Message(0, "+27000000000", "test");

        System.out.println("\nTotal messages sent: " + total.returnTotalMessages());
    }
}