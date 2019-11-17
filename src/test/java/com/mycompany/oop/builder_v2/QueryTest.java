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
public class QueryTest {
    
    public QueryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setPizzaDough method, of class Query.
     */
    @Test
    public void testSetPizzaDough() {
        System.out.println("setPizzaDough");
        String pizzaDough = "";
        Query instance = new Query();
        instance.setPizzaDough(pizzaDough);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPizzaSauce method, of class Query.
     */
    @Test
    public void testSetPizzaSauce() {
        System.out.println("setPizzaSauce");
        String pizzaSauce = "";
        Query instance = new Query();
        instance.setPizzaSauce(pizzaSauce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPizzaIngredients method, of class Query.
     */
    @Test
    public void testSetPizzaIngredients() {
        System.out.println("setPizzaIngredients");
        String pizzaIngredients = "";
        Query instance = new Query();
        instance.setPizzaIngredients(pizzaIngredients);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
