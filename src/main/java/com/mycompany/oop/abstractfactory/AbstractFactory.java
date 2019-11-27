/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;
import com.mycompany.oop.abstractfactory.adidas.AdidasProduct;
import com.mycompany.oop.abstractfactory.nike.NikeProduct;
/**
 *
 * @author Admin
 */
public abstract class AbstractFactory {
    public abstract AdidasProduct getAdidasProduct(String product);
    public abstract NikeProduct getNikeProduct(String product);
}

