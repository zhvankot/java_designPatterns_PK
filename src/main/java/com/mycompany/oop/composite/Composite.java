/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class Composite implements Component {
    
    private List<Component> composite = new ArrayList<>();
    @Override
    public void show() {
       for(Component component : composite ) {
           component.show();
       }
    }
}
