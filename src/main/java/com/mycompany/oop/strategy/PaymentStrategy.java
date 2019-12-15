/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.strategy;

/**
 *
 * @author Admin
 */
public interface PaymentStrategy {
    public void checkUserAuthetication();
    public boolean execute(int cost);
}
