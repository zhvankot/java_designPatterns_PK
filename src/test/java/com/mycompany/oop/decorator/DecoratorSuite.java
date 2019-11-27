/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.decorator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.decorator.PizzaDecoratorTest.class, com.mycompany.oop.decorator.PizzaTest.class, com.mycompany.oop.decorator.PizzaWithSausagesTest.class, com.mycompany.oop.decorator.SimplePizzaTest.class, com.mycompany.oop.decorator.PizzaWithMushroomsTest.class})
public class DecoratorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
