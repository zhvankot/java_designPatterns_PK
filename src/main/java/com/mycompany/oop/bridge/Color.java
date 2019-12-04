/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.bridge;

/**
 *
 * @author Admin
 */
public class Color implements Palette { //Realizacja interfejsa Palette
    @Override
    public void setColor(String color){
        System.out.println("Shape color: " + color);
    }
}
