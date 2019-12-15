/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.command;

/**
 *
 * @author Admin
 */
public class SwitchOnCommand implements Command {
    private Cat cat;
    public SwitchOnCommand(Cat cat) {
        this.cat = cat;
    }
    
    @Override
    public void run() {
        cat.appear();
    }
}
