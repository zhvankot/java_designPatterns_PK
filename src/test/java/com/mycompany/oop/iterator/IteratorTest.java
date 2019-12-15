/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class IteratorTest {
    
    public IteratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of hasNext method, of class Iterator.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        Iterator instance = new IteratorImpl();
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Iterator.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        Iterator instance = new IteratorImpl();
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class IteratorImpl implements Iterator {

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }
    }
    
}
