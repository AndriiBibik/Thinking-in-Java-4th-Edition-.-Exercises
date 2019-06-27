/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14_ex8;

import java.util.Arrays;

/**
 *
 * @author Fujitsu V6505
 */
class Creature { int age; }
class Animal extends Creature { private String variery; }
class Cat extends Animal { private String color; }
public class ClassHierarchy {
    public static void printHierarcy(Class c) {
        System.out.println(c.getSimpleName() + " declared fields: " + Arrays.toString(c.getDeclaredFields()));
        Class up = c.getSuperclass();
        if(up != null) {
            System.out.println(" |");
            System.out.println("\\ /");
            printHierarcy(up);
        }
    }
    public static void main(String[] args) {
        ClassHierarchy ch = new ClassHierarchy();
        //ch.printHierarcy(ch.getClass());
        ch.printHierarcy(new Cat().getClass());
    }
}
