/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.observer.HexadecimalObserverTest.class, com.mycompany.oop.observer.ObserverTest.class, com.mycompany.oop.observer.SubjectTest.class, com.mycompany.oop.observer.BinaryObserverTest.class, com.mycompany.oop.observer.OctalObserverTest.class})
public class ObserverSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
