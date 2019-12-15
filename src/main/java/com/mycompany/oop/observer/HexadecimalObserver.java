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
public class HexadecimalObserver extends Observer{
   
      public HexadecimalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Hexadecimal: " + Integer.toHexString(subject.getState()));
    }
}
