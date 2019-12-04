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
public class Description implements Element{
    private String description;
    public Description(String description) {
        this.description = description;
    }
    
    @Override
    public void add() {
        System.out.printf("%nAdd description: [%s]", description);
    }
}
