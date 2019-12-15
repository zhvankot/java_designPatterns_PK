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
public class ContainerTest {
    
    public ContainerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIterator method, of class Container.
     */
    @Test
    public void testGetIterator() {
        System.out.println("getIterator");
        Container instance = new ContainerImpl();
        Iterator expResult = null;
        Iterator result = instance.getIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class ContainerImpl implements Container {

        public Iterator getIterator() {
            return null;
        }
    }
    
}
