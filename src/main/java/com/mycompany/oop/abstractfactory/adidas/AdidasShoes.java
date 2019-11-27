/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory.adidas;

/**
 *
 * @author Admin
 */
public class AdidasShoes implements AdidasProduct {
    @Override
    public void makeAdidasProduct(){
        System.out.println("Make Adidas shoes!");
    }
}