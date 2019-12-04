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
public class Graph { //facade
    
    private Axis xAxis, yAxis;
    private Description description;
    private Point pointA, pointB;
    private Line line;
    
    public Graph() {
        this.xAxis = new Axis("X");
        this.yAxis = new Axis("Y");
        this.description = new Description("The graph of a function");
        this.pointA = new Point("A");
        this.pointB = new Point("B");
        this.line = new Line(pointA, pointB);
    }
    
    public void buildGraph() {
    System.out.print("Plotting...");
    xAxis.add();
    yAxis.add();
    description.add();
    pointA.add();
    pointB.add();
    line.add();
    }
}
