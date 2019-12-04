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
public class Point implements Element {
    private String pointTitle;
    
    public Point(String pointTitle) {
        this.pointTitle = pointTitle;
    }
    
    public String getPointTitle() {
        return pointTitle;
    }
    
    @Override
    public void add() {
        System.out.printf("%nAdd point %s", pointTitle);
    }
}
