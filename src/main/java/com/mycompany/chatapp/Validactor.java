/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
public class Validactor {
    
    public static boolean checkUsername(String username) {
        return username.contains("_") & username.length() <= 5;
    }
    
    public static boolean checkPassword(String password) {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return password.length() >= 8 & hasCapital & hasNumber & hasSpecial;
    }
    
    public static boolean checkPhone(String phone) {
        return phone.matches("^\\+27\\d{9}$");
    }
}
