/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.observer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    private void notifyAllObservers() {
        for(Observer eachObserver : observers ) {
            eachObserver.update();
        }
    }
    
}
