/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.proxy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.proxy.PageTest.class, com.mycompany.oop.proxy.ProxyPageTest.class, com.mycompany.oop.proxy.RealPageTest.class})
public class ProxySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
