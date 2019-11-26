/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.decorator;

/**
 *
 * @author Admin
 */
public class SimplePizza implements Pizza {
    @Override
    public double getCost() {
        return 4.5;
    }
    
    @Override
    public String getIngredients(){
        return "Pizza";
    }
}
