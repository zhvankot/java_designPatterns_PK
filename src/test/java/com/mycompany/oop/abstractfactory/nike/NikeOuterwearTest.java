/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory.nike;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class NikeOuterwearTest {
    
    public NikeOuterwearTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of makeNikeProduct method, of class NikeOuterwear.
     */
    @Test
    public void testMakeNikeProduct() {
        System.out.println("makeNikeProduct");
        NikeOuterwear instance = new NikeOuterwear();
        instance.makeNikeProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
