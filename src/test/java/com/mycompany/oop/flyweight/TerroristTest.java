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
public class TerroristTest {
    
    public TerroristTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setWeapon method, of class Terrorist.
     */
    @Test
    public void testSetWeapon() {
        System.out.println("setWeapon");
        String weapon = "";
        Terrorist instance = new Terrorist();
        instance.setWeapon(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showInformation method, of class Terrorist.
     */
    @Test
    public void testShowInformation() {
        System.out.println("showInformation");
        Terrorist instance = new Terrorist();
        instance.showInformation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
