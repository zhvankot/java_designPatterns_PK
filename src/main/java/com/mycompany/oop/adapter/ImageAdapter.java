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
public class ImageAdapter {
    private AnimatedImageViewer animatedImageViewer;
    
    public ImageAdapter(String format){
        if(format.equalsIgnoreCase(".gif")){
            animatedImageViewer = new GifViewer();
        }
    }
    
    public void watchImage(String title, String format){
        if(format.equalsIgnoreCase(".gif")) {
            animatedImageViewer.watchGif(title);
        }
    }
}
