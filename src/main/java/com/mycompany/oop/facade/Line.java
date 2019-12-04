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
public class Line implements Element {
    private Point firstPoint;
    private Point secondPoint;
    
    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }
    
    @Override
    public void add() {
        System.out.printf("%nAdd line between point %s and %s", firstPoint.getPointTitle(), secondPoint.getPointTitle());
    }
}
