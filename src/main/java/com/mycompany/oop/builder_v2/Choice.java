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
public abstract class Choice {
    protected Query query;
    
    public Query getQuery() {
        return query;
    }
    
    public void createQuery(){
        query = new Query();
    }
    
    public abstract void buildPizzaDough();
    public abstract void buildPizzaSauce();
    public abstract void buildPizzaIngredients();
}
