/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p349;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Fujitsu V6505
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        Pet[] pets = new Pets().getPets();
        LinkedList<Pet> petsList = new LinkedList<>(Arrays.asList(pets));
        System.out.println(petsList);
        //identyczne
        System.out.println(petsList.getFirst());
        System.out.println(petsList.element());
        //różnią się zachowaniem w obliczu braku elementów
        System.out.println("petsList.peek(): " + petsList.peek());
        System.out.println("petsList.remove(): " + petsList.remove());
        System.out.println("petsList.removeFirst(): " + petsList.removeFirst());
        System.out.println(petsList.poll());
        System.out.println("I na nowo...");
        System.out.println(petsList);
        petsList.addFirst(pets[0]);
        System.out.println(petsList);
        Random r = new Random();
        System.out.println(".offer()");
        petsList.offer(pets[r.nextInt(5)]);
        System.out.println(petsList);
        System.out.println(".add()");
        petsList.add(pets[r.nextInt(5)]);
        System.out.println(petsList);
        System.out.println(".addLast()");
        petsList.addLast(pets[r.nextInt(5)]);
        System.out.println(petsList);
        System.out.println("removeLast()");
        petsList.removeLast();
        System.out.println(petsList);
        
    }
}
