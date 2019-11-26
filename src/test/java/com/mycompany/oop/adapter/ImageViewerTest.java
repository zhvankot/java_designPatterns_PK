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
public class ImageViewerTest {
    
    public ImageViewerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of watchImage method, of class ImageViewer.
     */
    @Test
    public void testWatchImage() {
        System.out.println("watchImage");
        String title = "";
        String format = "";
        ImageViewer instance = new ImageViewerImpl();
        instance.watchImage(title, format);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ImageViewerImpl implements ImageViewer {

        public void watchImage(String title, String format) {
        }
    }
    
}
