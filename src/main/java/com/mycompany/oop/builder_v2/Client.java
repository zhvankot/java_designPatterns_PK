/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder_v2;

/**
 *
 * @author Admin
 */
public class Client {
    private Choice choice;
    
    public void setChoice(Choice choice) {
        this.choice = choice;
    }
    
    public Query acceptQuery() {
        System.out.println("Order is accepted");
        return choice.getQuery();
    }
    
    public void buildPizza(){
        choice.createQuery();
        choice.buildPizzaDough();
        choice.buildPizzaSauce();
        choice.buildPizzaIngredients();
    }
}
