/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder_v2;
//import com.mycompany.oop.builder_v2.Choice;
import com.mycompany.oop.builder_v2.Choice;
/**
 *
 * @author Admin
 */
public class Pizza extends Choice {
    @Override
    public void buildPizzaDough(){
        query.setPizzaDough("XL, thin");
    }
    
    @Override
    public void buildPizzaSauce(){
        query.setPizzaSauce("Barbecue");
    }
    
    @Override
    public void buildPizzaIngredients(){
        query.setPizzaIngredients("Sausage, onions, mushrooms, parmedan");
    }

}
