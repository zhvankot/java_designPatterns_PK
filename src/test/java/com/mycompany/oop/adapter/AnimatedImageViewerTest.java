/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.adapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class AnimatedImageViewerTest {
    
    public AnimatedImageViewerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of watchGif method, of class AnimatedImageViewer.
     */
    @Test
    public void testWatchGif() {
        System.out.println("watchGif");
        String title = "";
        AnimatedImageViewer instance = new AnimatedImageViewerImpl();
        instance.watchGif(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AnimatedImageViewerImpl implements AnimatedImageViewer {

        public void watchGif(String title) {
        }
    }
    
}
