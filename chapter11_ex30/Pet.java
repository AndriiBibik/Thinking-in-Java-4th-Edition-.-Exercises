/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex30;


/**
 *
 * @author Fujitsu V6505
 */
public class Pet {
    private String name;
    Pet(String name) { this.name = name; }
    String getName() { return name; }
    @Override 
    public String toString() { return "Pet name is: " + name + "; "; }
}
