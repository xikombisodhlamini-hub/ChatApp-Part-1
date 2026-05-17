/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class Validator {
    
    // Username: contains "_" and max 5 characters
    public static boolean checkUsername(String username) {
        return username.contains("_") & username.length() <= 5;
    }
    // Password: 8+ char, 1 uppercase, 1 number, 1 special character
    public static boolean checkPassword(String password) {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            else if (Character.isDigit(c)) hasNumber = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return password.length() >= 8 & hasCapital & hasNumber & hasSpecial;
    }
    // Phone: must start with +27 and be valid length
    public static boolean checkPhone(String phone) {
        return phone.startsWith("+27") && phone.length() <=12;
    }
}
