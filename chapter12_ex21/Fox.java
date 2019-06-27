/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex21;

class AnimalException extends Exception {}

class Animal {
    private String name;
    public Animal(String name) throws AnimalException {
        this.name = name;
    }
}
public class Fox extends Animal {
    public Fox(String name) throws AnimalException {
        super(name);
    }
}
