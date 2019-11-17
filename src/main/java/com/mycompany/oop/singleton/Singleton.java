/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.singleton;

/**
 *
 * @author Admin
 */

//NON THREAD-SAFE SINGLETON

public class Singleton {
    private static Singleton instance;
    private String value;
    private Singleton(String value) {
        this.value = value;
    }
    
    public static Singleton getInstance(String contex) {
        if( instance == null ){
            instance = new Singleton(contex);
        }
    return instance;
    }
    
    public String getValue(){
        return value;
    }
    
}
