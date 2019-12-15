/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class QIWIPayment implements PaymentStrategy {
   private static final Map<String, String> DATABASE = new HashMap<>();
    
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private String mobilePhone, password;
    
    private boolean signedIn;
    
    static {
        DATABASE.put("test", "test@test.com");
    }
    
     @Override
    public void checkUserAuthetication() {
        try {
            while(!signedIn) {
                
                System.out.println("***PayPal Payment***");
                
                System.out.print("Enter e-mail: ");
                mobilePhone = reader.readLine();
                
                System.out.print("Enter password: ");
                password = reader.readLine();
                
                if (authenticate()) {
                    System.out.println("Authentication successful!");
                } else {
                    System.out.println("Authentication failed!");
                }
            }         
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    @Override
    public boolean execute(int cost) {
       if(signedIn) {
           System.out.printf("Paying $%d using QIWI payment method... %n", cost);
           return true;
       } else {
        return false;
       }
    }
    
    private boolean authenticate() {
        setSignedIn(mobilePhone.equals(DATABASE.get(password)));
        return signedIn;
    }
    
    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
