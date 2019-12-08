/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.proxy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PageTest {
    
    public PageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayPage method, of class Page.
     */
    @Test
    public void testDisplayPage() {
        System.out.println("displayPage");
        Page instance = new PageImpl();
        instance.displayPage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PageImpl implements Page {

        public void displayPage() {
        }
    }
    
}
