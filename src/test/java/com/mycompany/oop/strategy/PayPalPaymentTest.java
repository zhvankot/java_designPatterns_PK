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
public class PayPalPaymentTest {
    
    public PayPalPaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkUserAuthetication method, of class PayPalPayment.
     */
    @Test
    public void testCheckUserAuthetication() {
        System.out.println("checkUserAuthetication");
        PayPalPayment instance = new PayPalPayment();
        instance.checkUserAuthetication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class PayPalPayment.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        int cost = 0;
        PayPalPayment instance = new PayPalPayment();
        boolean expResult = false;
        boolean result = instance.execute(cost);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSignedIn method, of class PayPalPayment.
     */
    @Test
    public void testSetSignedIn() {
        System.out.println("setSignedIn");
        boolean signedIn = false;
        PayPalPayment instance = new PayPalPayment();
        instance.setSignedIn(signedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
