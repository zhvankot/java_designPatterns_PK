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
public class NikeProductTest {
    
    public NikeProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of makeNikeProduct method, of class NikeProduct.
     */
    @Test
    public void testMakeNikeProduct() {
        System.out.println("makeNikeProduct");
        NikeProduct instance = new NikeProductImpl();
        instance.makeNikeProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NikeProductImpl implements NikeProduct {

        public void makeNikeProduct() {
        }
    }
    
}
