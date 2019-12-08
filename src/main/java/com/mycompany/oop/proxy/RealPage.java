/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.proxy;

/**
 *
 * @author Admin
 */
public class RealPage implements Page {
    private String url;
    
    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }
    
    private void downloadPage() {
        System.out.printf("Downloading page '%s'%n", url);
    }
    
    @Override
    public void displayPage() {
        System.out.printf("Display page '%s'%n", url);
    }
}
