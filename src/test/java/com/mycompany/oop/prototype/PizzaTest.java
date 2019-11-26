/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.prototype;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PizzaTest {
    
    public PizzaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of make method, of class Pizza.
     */
    @Test
    public void testMake() throws Exception {
        System.out.println("make");
        Pizza instance = new PizzaImpl();
        Pizza expResult = null;
        Pizza result = instance.make();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PizzaImpl implements Pizza {

        public Pizza make() throws CloneNotSupportedException {
            return null;
        }
    }
    
}
