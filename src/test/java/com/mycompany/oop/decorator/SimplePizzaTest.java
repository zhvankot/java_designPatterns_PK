/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.decorator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class SimplePizzaTest {
    
    public SimplePizzaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCost method, of class SimplePizza.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        SimplePizza instance = new SimplePizza();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredients method, of class SimplePizza.
     */
    @Test
    public void testGetIngredients() {
        System.out.println("getIngredients");
        SimplePizza instance = new SimplePizza();
        String expResult = "";
        String result = instance.getIngredients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
