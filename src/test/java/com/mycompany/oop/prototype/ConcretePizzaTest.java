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
public class ConcretePizzaTest {
    
    public ConcretePizzaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setSize method, of class ConcretePizza.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "";
        ConcretePizza instance = new ConcretePizza();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSauce method, of class ConcretePizza.
     */
    @Test
    public void testSetSauce() {
        System.out.println("setSauce");
        String sauce = "";
        ConcretePizza instance = new ConcretePizza();
        instance.setSauce(sauce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheese method, of class ConcretePizza.
     */
    @Test
    public void testSetCheese() {
        System.out.println("setCheese");
        String cheese = "";
        ConcretePizza instance = new ConcretePizza();
        instance.setCheese(cheese);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMushrooms method, of class ConcretePizza.
     */
    @Test
    public void testSetMushrooms() {
        System.out.println("setMushrooms");
        String mushrooms = "";
        ConcretePizza instance = new ConcretePizza();
        instance.setMushrooms(mushrooms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSausages method, of class ConcretePizza.
     */
    @Test
    public void testSetSausages() {
        System.out.println("setSausages");
        String sausages = "";
        ConcretePizza instance = new ConcretePizza();
        instance.setSausages(sausages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class ConcretePizza.
     */
    @Test
    public void testMake() throws Exception {
        System.out.println("make");
        ConcretePizza instance = new ConcretePizza();
        Pizza expResult = null;
        Pizza result = instance.make();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ConcretePizza.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ConcretePizza instance = new ConcretePizza();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
