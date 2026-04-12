/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class ChatRoom {
    private final User user;
            
    public ChatRoom(User user) {
        this.user = user;
    }
    
    public void start() {
        System.out.println("\n=== Chat Room Started ===");
        System.out.println("Welcome, " + user.getName()+ "! You can Start chatting now.");
    }
}

    