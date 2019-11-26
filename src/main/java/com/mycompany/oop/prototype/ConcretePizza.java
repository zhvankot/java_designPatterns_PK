/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.prototype;

/**
 *
 * @author Admin
 */
public class ConcretePizza implements Pizza {
    
    private String size;
    private String sauce;
    private String cheese;
    private String mushrooms;
    private String sausages;

    public void setSize(String size) {
        this.size = size;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void setSausages(String sausages) {
        this.sausages = sausages;
    }
    
    
    
    @Override
    public Pizza make() throws CloneNotSupportedException {
        return (Pizza)super.clone();
    } 

    @Override
    public String toString() {
        return "[ Pizza Builder ]"
                + "Size: " + size 
                + "| Sauce: " + sauce
                + "| Cheese: " + cheese
                + "| Mushrooms: " + mushrooms
                + "| Sausages: " + sausages;
                
    }
    
    
}
