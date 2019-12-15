/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.strategy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of processOrder method, of class Order.
     */
    @Test
    public void testProcessOrder() {
        System.out.println("processOrder");
        PaymentStrategy strategy = null;
        Order instance = new Order();
//        instance.processOrder(strategy);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCost method, of class Order.
     */
    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        int expResult = 0;
        int result = Order.getTotalCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalCost method, of class Order.
     */
    @Test
    public void testSetTotalCost() {
        System.out.println("setTotalCost");
        int totalCost = 0;
        Order instance = new Order();
        instance.setTotalCost(totalCost);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isCompleted method, of class Order.
     */
    @Test
    public void testIsCompleted() {
        System.out.println("isCompleted");
        Order instance = new Order();
        boolean expResult = false;
        boolean result = instance.isCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setComplete method, of class Order.
     */
    @Test
    public void testSetComplete() {
        System.out.println("setComplete");
        Order instance = new Order();
        instance.setComplete();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
