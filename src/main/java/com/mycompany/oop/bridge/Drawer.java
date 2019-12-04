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
public abstract class Drawer { //abstrakcja
    protected Palette palette;
    protected Drawer(Palette palette) {
       this.palette = palette; 
    }
    public abstract void drawShape(String color);
}
