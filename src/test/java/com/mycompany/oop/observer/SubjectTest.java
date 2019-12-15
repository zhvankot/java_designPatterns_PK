/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class SubjectTest {
    
    public SubjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getState method, of class Subject.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Subject instance = new Subject();
        int expResult = 0;
        int result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Subject.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        int state = 0;
        Subject instance = new Subject();
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of attach method, of class Subject.
     */
    @Test
    public void testAttach() {
        System.out.println("attach");
        Observer observer = null;
        Subject instance = new Subject();
        instance.attach(observer);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
