/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;
import com.mycompany.oop.abstractfactory.nike.NikeOuterwear;
import com.mycompany.oop.abstractfactory.nike.NikeShoes;
import com.mycompany.oop.abstractfactory.nike.NikeProduct;
import com.mycompany.oop.abstractfactory.adidas.AdidasProduct;
/**
 *
 * @author Admin
 */
public class NikeFactory extends AbstractFactory {
 @Override
    public AdidasProduct getAdidasProduct(String product) {
        return null;
    }
    
    @Override
    public NikeProduct getNikeProduct(String product) {
        if (product == null) return null;
        
        //The equalsIgnoreCase() method method compares two strings 
        //irrespective of the case (lower or upper) of the string
        if (product.equalsIgnoreCase("NIKE OUTWEAR")) 
            return new NikeOuterwear();
        if (product.equalsIgnoreCase("NIKE SHOES")) 
            return new NikeShoes();
        
        return null;
    }  
}