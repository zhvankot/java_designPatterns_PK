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
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setChoice method, of class Client.
     */
    @Test
    public void testSetChoice() {
        System.out.println("setChoice");
        Choice choice = null;
        Client instance = new Client();
        instance.setChoice(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acceptQuery method, of class Client.
     */
    @Test
    public void testAcceptQuery() {
        System.out.println("acceptQuery");
        Client instance = new Client();
        Query expResult = null;
        Query result = instance.acceptQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPizza method, of class Client.
     */
    @Test
    public void testBuildPizza() {
        System.out.println("buildPizza");
        Client instance = new Client();
        instance.buildPizza();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
