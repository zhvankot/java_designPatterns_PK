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
public class ObserverTest {
    
    public ObserverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of update method, of class Observer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observer instance = new ObserverImpl();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class ObserverImpl extends Observer {

        public void update() {
        }
    }
    
}
