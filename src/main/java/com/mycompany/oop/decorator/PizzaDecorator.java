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
public abstract class PizzaDecorator implements Pizza {
    private Pizza pizza;
    
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public double getCost(){
        return pizza.getCost();
    }
    
    @Override
    public String getIngredients(){
        return pizza.getIngredients();
    }
}
