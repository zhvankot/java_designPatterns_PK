/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.abstractfactory.adidas.AdidasSuite.class, com.mycompany.oop.abstractfactory.nike.NikeSuite.class, com.mycompany.oop.abstractfactory.AbstractFactoryTest.class, com.mycompany.oop.abstractfactory.NikeFactoryTest.class, com.mycompany.oop.abstractfactory.AdidasFactoryTest.class, com.mycompany.oop.abstractfactory.FactoryGeneratorTest.class})
public class AbstractfactorySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
