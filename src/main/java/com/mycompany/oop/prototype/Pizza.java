/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.prototype;

/**
 *
 * @author Admin
 */
public interface Pizza extends Cloneable {
    Pizza make() throws CloneNotSupportedException;
    
}
