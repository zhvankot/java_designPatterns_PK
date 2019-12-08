/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.flyweight;

/**
 *
 * @author Admin
 */
public class Terrorist implements Player {
    private static final String MISSION = "plant a bomb";
    private String weapon;
    
    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public void showInformation() {
        System.out.printf("Player 'Terrorist' added. Weapon: %s. Mission: %s %n", weapon, MISSION);
    }
}
