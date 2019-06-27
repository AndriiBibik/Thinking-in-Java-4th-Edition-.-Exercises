/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p349;

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
    Bird() { super("noname"); }
    Bird(String name) { super(name); }
}
class Cat extends Pet {
    Cat() { super("noname"); }
    Cat(String name) { super(name); }
}
class Dog extends Pet {
    Dog() { super("noname"); }
    Dog(String name) { super(name); }
}
class Fish extends Pet {
    Fish() { super("noname"); }
    Fish(String name) { super(name); }
}
class Snake extends Pet {
    Snake() { super("noname"); }
    Snake(String name) { super(name); }
}
public class Pets {
    public Pet[] getPets() {
        Pet[] pets = {new Bird(), new Cat(), new Dog(), new Fish(), new Snake()};
        return pets;
    }
}
