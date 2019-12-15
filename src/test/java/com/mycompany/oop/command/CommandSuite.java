/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.command;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.command.SelectorTest.class, com.mycompany.oop.command.CatTest.class, com.mycompany.oop.command.SwitchOnCommandTest.class, com.mycompany.oop.command.SwitchOffCommandTest.class, com.mycompany.oop.command.CommandTest.class})
public class CommandSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
