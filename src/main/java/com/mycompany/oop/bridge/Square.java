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
public class Square extends Drawer { //podklas abstrakcji
    public Square(Palette palette) {
        super(palette);
    }
    @Override
    public void drawShape(String color){
        switch(color) {
            case ("#FF0000"): palette.setColor("Red");break;
            case ("#00FF00"): palette.setColor("Green");break;
            case ("#0000FF"): palette.setColor("Blue");break;
            default: System.out.println("Undefined color");
        }
    }
}
