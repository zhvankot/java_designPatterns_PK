/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.facade;

/**
 *
 * @author Admin
 */
public class Axis implements Element {
    private String axis;
    public Axis(String axis) {
        this.axis = axis;
    }
    @Override
    public void add() {
        System.out.printf("%nAdd %s axis", axis);
    }
}
