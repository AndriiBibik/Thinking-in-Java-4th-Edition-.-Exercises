/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fujitsu V6505
 */

class Pet {
    private String name;
    Pet(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
}
class Bird extends Pet {
    Bird() { super("Bird"); }
}
class Cat extends Pet {
    Cat() { super("Cat"); }
}
class Dog extends Pet {
    Dog() { super("Dog"); }
}

public class PetsList {
    
    List<Pet> petsList(List<Pet> list) {
        list.add(new Bird());
        list.add(new Cat());
        list.add(new Dog());
        return list;
    }
    public static void main(String[] args) {
        PetsList petsList = new PetsList();
        List<Pet> pets = petsList.petsList(new ArrayList<Pet>());
        List<Pet> sub = pets.subList(0, 2);
        System.out.println(pets);
        System.out.println(sub);
        pets.removeAll(sub);
        System.out.println(pets);
        
    }
}
