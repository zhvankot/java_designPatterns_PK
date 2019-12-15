/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.iterator;

/**
 *
 * @author Admin
 */
public class Database implements Container {
    private String[] content = {"Roger Stewart. Web-designer", "Andrew Scott. Android developer", "Nicolad Smith. IOS developer"};
    
    @Override
    public Iterator getIterator() {
        return new DatabaseIterator();
    }
    
    private class DatabaseIterator implements Iterator {
        private int index;
        
        @Override
        public boolean hasNext() {
            return index < content.length;
        }
        
        @Override
        public Object next()
        {
            if(this.hasNext()) return content[index++];
            return null;
        }}
}
