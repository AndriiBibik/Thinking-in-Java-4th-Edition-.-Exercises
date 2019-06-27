/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p346;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
class Fish extends Pet {
    Fish() { super("Fish"); }
}
class Snake extends Pet {
    Snake() { super("Snake"); }
}

public class SimpleIteration {
    
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>(Arrays.asList
        (
            new Bird(), 
            new Cat(), 
            new Dog(), 
            new Fish(), 
            new Snake()
        ));
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        for(Pet p: pets)
            System.out.println(p);
        System.out.println();
        it = pets.iterator();
        for(int i = 0; i < 2; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
