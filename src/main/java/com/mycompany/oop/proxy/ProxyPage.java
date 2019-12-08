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
public class ProxyPage implements Page {
     private RealPage realPage;
     private String url;
     
     public ProxyPage(String url) {
     this.url = url;
     }
     
     @Override
     public void displayPage() {
         if(realPage == null) {
             realPage = new RealPage(url);
         }
         
         realPage.displayPage();
     }
}
