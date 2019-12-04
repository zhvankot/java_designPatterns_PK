/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.facade;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.facade.GraphTest.class, com.mycompany.oop.facade.LineTest.class, com.mycompany.oop.facade.ElementTest.class, com.mycompany.oop.facade.PointTest.class, com.mycompany.oop.facade.AxisTest.class, com.mycompany.oop.facade.DescriptionTest.class})
public class FacadeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
