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
public class PizzaWithSausages extends PizzaDecorator {
    public PizzaWithSausages(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double getCost(){
        return super.getCost()+ 2.0;
    }
    
    @Override
    public String getIngredients(){
        return super.getIngredients() + " +Sausages";
    }
}
