/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder;

/**
 *
 * @author Admin
 */
public class Account {
    private String login;
    private String password;
    private String email;
    
    public static Registrar initializeRegistration() {
        return new Account().new Registrar();
    }
    
    public class Registrar {
        public Registrar login(String login) {
           System.out.println("Login: "+login);
           Account.this.login = login;
           return this;
        }
        
        public Registrar password(String password) {
           System.out.println("Password: "+password);
           Account.this.password = password;
           return this; 
        }
        
         public Registrar email(String email) {
           System.out.println("Email: "+email);
           Account.this.email = email;
           return this; 
        }
         
        public Account createAccount() {
           return Account.this;
        }
  
    
}
    
}
