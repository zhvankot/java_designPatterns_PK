/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.flyweight;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CounterTerroristTest {
    
    public CounterTerroristTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setWeapon method, of class CounterTerrorist.
     */
    @Test
    public void testSetWeapon() {
        System.out.println("setWeapon");
        String weapon = "";
        CounterTerrorist instance = new CounterTerrorist();
        instance.setWeapon(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showInformation method, of class CounterTerrorist.
     */
    @Test
    public void testShowInformation() {
        System.out.println("showInformation");
        CounterTerrorist instance = new CounterTerrorist();
        instance.showInformation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
