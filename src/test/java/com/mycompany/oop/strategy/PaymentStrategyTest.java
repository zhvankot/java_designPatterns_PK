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
public class PaymentStrategyTest {
    
    public PaymentStrategyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkUserAuthetication method, of class PaymentStrategy.
     */
    @Test
    public void testCheckUserAuthetication() {
        System.out.println("checkUserAuthetication");
        PaymentStrategy instance = new PaymentStrategyImpl();
        instance.checkUserAuthetication();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class PaymentStrategy.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        int cost = 0;
        PaymentStrategy instance = new PaymentStrategyImpl();
        boolean expResult = false;
        boolean result = instance.execute(cost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class PaymentStrategyImpl implements PaymentStrategy {

        public void checkUserAuthetication() {
        }

        public boolean execute(int cost) {
            return false;
        }
    }
    
}
