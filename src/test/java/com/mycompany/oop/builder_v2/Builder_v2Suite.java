/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder_v2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.builder_v2.QueryTest.class, com.mycompany.oop.builder_v2.ChoiceTest.class, com.mycompany.oop.builder_v2.ClientTest.class, com.mycompany.oop.builder_v2.PizzaTest.class})
public class Builder_v2Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
