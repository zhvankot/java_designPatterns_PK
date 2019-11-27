/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.adapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.adapter.ImageAdapterTest.class, com.mycompany.oop.adapter.ImageViewerTest.class, com.mycompany.oop.adapter.GifViewerTest.class, com.mycompany.oop.adapter.PictureViewerTest.class, com.mycompany.oop.adapter.AnimatedImageViewerTest.class})
public class AdapterSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
