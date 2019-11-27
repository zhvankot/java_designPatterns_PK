/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.adapter;

/**
 *
 * @author Admin
 */
public class GifViewer implements AnimatedImageViewer {
    @Override
    public void watchGif(String title){
        System.out.println("Watching " + title + ".gif");
    }
}
