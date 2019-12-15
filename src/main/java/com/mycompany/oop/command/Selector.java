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
public class Selector {
    
    private Command up, down;
    private Selector(Command upCommand, Command downCommand) {
        this.up = upCommand;
        this.down = downCommand;
    }
    private void switchOn() {
        up.run();
    }
    
    private void switchOff() {
        down.run();
    }
}
