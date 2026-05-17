/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class Message {
    
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String message;
    
    private static int totalMessages = 0;
    
    public Message(int messageNumber, String recipient, String message) {
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.message = message;
        
        // Generate random 10-digit message ID
        this.messageID = String.valueOf((long)(Math.random() * 9000000000L) + 1000000000L);
        
        totalMessages++;
    }
    
    // Check message ID
    public boolean checkMessageID() {
        return messageID.length() <= 10;
    }
    
    // Check recipient number
    public boolean checkRecipientCell() {
        return recipient.matches("^\\+27\\d{9}$");
    }
    
    // Check message message length
    public String checkMessageLength() {
        
        
        if (message.length() <=250) {
            return "Message ready to send.";
        } else {
            int excess = message.length() - 250;
            return "Message exceeds 250 characters by " + excess + ", please reduce the size.";
        }
    }
    
    // Create message hash
    public String createMessageHash() {
        
        String[] words = message.split(" ");
        
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        
        String hash = messageID.substring(0, 2)
                + ":" + messageNumber
                + ":" + firstWord + lastWord;
        
        return hash. toUpperCase();
    }
    
    // Send / store / discard message 
    public String sentMessage(int choice) {
        
        switch (choice) {
            
            case 1: 
                return "Message successfully sent.";
                
            case 2:
                return "Message successfuly stored.";
                
            case 3:
                return "Press 0 to delete message.";
                
            default: 
                return "Invalid option.";
        }
    }
    
    // Total message sent
    public int returnTotalMessages() {
        return totalMessages;
    }
    
}
