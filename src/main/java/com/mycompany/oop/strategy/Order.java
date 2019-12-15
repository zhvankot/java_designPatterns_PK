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
public class Order {
    private static int totalCost = 0;
    private boolean isCompleted = false;
    public void processOrder(PaymentStrategy strategy) {
        strategy.checkUserAuthetication();
    }
    
    public static int getTotalCost() {
        return totalCost;
    }
    
    public void setTotalCost(int totalCost){
        Order.totalCost += totalCost;
    }
    
    public boolean isCompleted() {
        return isCompleted;
    }
    
    public void setComplete() {
        isCompleted = true;
    }
}
