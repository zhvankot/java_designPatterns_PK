/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

import com.mycompany.oop.abstractfactory.adidas.AdidasProduct;
import com.mycompany.oop.abstractfactory.nike.NikeProduct;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAdidasProduct method, of class AbstractFactory.
     */
    @Test
    public void testGetAdidasProduct() {
        System.out.println("getAdidasProduct");
        String product = "";
        AbstractFactory instance = new AbstractFactoryImpl();
        AdidasProduct expResult = null;
        AdidasProduct result = instance.getAdidasProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNikeProduct method, of class AbstractFactory.
     */
    @Test
    public void testGetNikeProduct() {
        System.out.println("getNikeProduct");
        String product = "";
        AbstractFactory instance = new AbstractFactoryImpl();
        NikeProduct expResult = null;
        NikeProduct result = instance.getNikeProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractFactoryImpl extends AbstractFactory {

        public AdidasProduct getAdidasProduct(String product) {
            return null;
        }

        public NikeProduct getNikeProduct(String product) {
            return null;
        }
    }
    
}
