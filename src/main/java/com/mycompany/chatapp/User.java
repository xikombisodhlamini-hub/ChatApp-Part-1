package com.mycompany.chatapp;

public class User {
    
   public String username;
   public String password;
   public  String firstName;
   public  String lastName;
   public String phone;
    
    public User(String username, String password, String firstName, String lastName, String phone) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone; 
    }

    User(String inputUsername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}