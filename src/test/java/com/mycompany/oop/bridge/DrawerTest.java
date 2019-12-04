/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.bridge;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class DrawerTest {
    
    public DrawerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of drawShape method, of class Drawer.
     */
    @org.junit.Test
    public void testDrawShape() {
        System.out.println("drawShape");
        String color = "";
        Drawer instance = null;
        instance.drawShape(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DrawerImpl extends Drawer {

        public DrawerImpl() {
            super(null);
        }

        public void drawShape(String color) {
        }
    }
    
}
