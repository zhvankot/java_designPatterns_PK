/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory.adidas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class AdidasOuterwearTest {
    
    public AdidasOuterwearTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of makeAdidasProduct method, of class AdidasOuterwear.
     */
    @Test
    public void testMakeAdidasProduct() {
        System.out.println("makeAdidasProduct");
        AdidasOuterwear instance = new AdidasOuterwear();
        instance.makeAdidasProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
