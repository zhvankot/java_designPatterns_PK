/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;
import com.mycompany.oop.abstractfactory.adidas.AdidasOuterwear;
import com.mycompany.oop.abstractfactory.adidas.AdidasShoes;
import com.mycompany.oop.abstractfactory.adidas.AdidasProduct;
import com.mycompany.oop.abstractfactory.nike.NikeProduct;
/**
 *
 * @author Admin
 */
public class AdidasFactory extends AbstractFactory {
    @Override
    public AdidasProduct getAdidasProduct(String product) {
        if (product == null) return null;
        
        //The equalsIgnoreCase() method method compares two strings 
        //irrespective of the case (lower or upper) of the string
        if (product.equalsIgnoreCase("ADIDAS OUTWEAR")) 
            return new AdidasOuterwear();
        if (product.equalsIgnoreCase("ADIDAS SHOES")) 
            return new AdidasShoes();
        
        return null;
    }
    
    @Override
    public NikeProduct getNikeProduct(String product) {
        return null;
    }
}