/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

/**
 *
 * @author Admin
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("ADIDAS")) return new AdidasFactory();
        if(factory.equalsIgnoreCase("NIKE")) return new NikeFactory();
        return null;
        
    }
}
