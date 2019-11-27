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
public class Query {
    
    public void setPizzaDough(String pizzaDough) {
        System.out.println("Set dough: "+pizzaDough);
    }
    
    public void setPizzaSauce(String pizzaSauce) {
        System.out.println("Set sauce: "+pizzaSauce);
    }
    
    public void setPizzaIngredients(String pizzaIngredients) {
        System.out.println("Set ingredients: "+pizzaIngredients);
    }
}
