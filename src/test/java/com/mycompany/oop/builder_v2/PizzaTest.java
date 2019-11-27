/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder_v2;

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
     * Test of buildPizzaDough method, of class Pizza.
     */
    @Test
    public void testBuildPizzaDough() {
        System.out.println("buildPizzaDough");
        Pizza instance = new Pizza();
        instance.buildPizzaDough();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizzaSauce method, of class Pizza.
     */
    @Test
    public void testBuildPizzaSauce() {
        System.out.println("buildPizzaSauce");
        Pizza instance = new Pizza();
        instance.buildPizzaSauce();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizzaIngredients method, of class Pizza.
     */
    @Test
    public void testBuildPizzaIngredients() {
        System.out.println("buildPizzaIngredients");
        Pizza instance = new Pizza();
        instance.buildPizzaIngredients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
