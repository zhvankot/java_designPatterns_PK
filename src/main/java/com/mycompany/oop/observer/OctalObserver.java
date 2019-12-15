/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;

/**
 *
 * @author Admin
 */
public class OctalObserver extends Observer {
    
     public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
   @Override
    public void update() {
        System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
    } 
}
