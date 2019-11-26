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
public class PictureViewer implements ImageViewer {
    @Override
    public void watchImage(String title, String format){
        switch(format){
            case(".png"):
                System.out.println("Watching " + title + ".png");
                break;
            case(".jpeg"):
                System.out.println("Watching " + title + ".jpeg");
                break;
            case(".bmp"):
                System.out.println("Watching " + title + ".bmp");
                break;   
            case(".gif"):
                ImageAdapter imageAdapter = new ImageAdapter(format);
                imageAdapter.watchImage(title, format);
                //System.out.println("Watching " + title + ".gif");
                break;
            default:
                System.out.println("Format " + format + " not suppoted!");
                
        }
    }
}
