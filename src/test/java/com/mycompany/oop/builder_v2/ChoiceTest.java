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
public class ChoiceTest {
    
    public ChoiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getQuery method, of class Choice.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        Choice instance = new ChoiceImpl();
        Query expResult = null;
        Query result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createQuery method, of class Choice.
     */
    @Test
    public void testCreateQuery() {
        System.out.println("createQuery");
        Choice instance = new ChoiceImpl();
        instance.createQuery();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizzaDough method, of class Choice.
     */
    @Test
    public void testBuildPizzaDough() {
        System.out.println("buildPizzaDough");
        Choice instance = new ChoiceImpl();
        instance.buildPizzaDough();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizzaSauce method, of class Choice.
     */
    @Test
    public void testBuildPizzaSauce() {
        System.out.println("buildPizzaSauce");
        Choice instance = new ChoiceImpl();
        instance.buildPizzaSauce();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizzaIngredients method, of class Choice.
     */
    @Test
    public void testBuildPizzaIngredients() {
        System.out.println("buildPizzaIngredients");
        Choice instance = new ChoiceImpl();
        instance.buildPizzaIngredients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ChoiceImpl extends Choice {

        public void buildPizzaDough() {
        }

        public void buildPizzaSauce() {
        }

        public void buildPizzaIngredients() {
        }
    }
    
}
