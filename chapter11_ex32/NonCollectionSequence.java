/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex32;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class PetSequence {
    protected Pet[] pets = {new Pet("Dog"), new Pet("Duck"), new Pet("Cat"), new Pet("Frog")};
}
public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            
        };
    }
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length-1;
                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }           
                };
            }
            
        };
    }
    
    public Iterable<Pet> shuffled() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }    
        };
    }
    
    public static void main(String[] args) {
        NonCollectionSequence ncs = new NonCollectionSequence();
        for(Pet p: ncs.reversed()) {
            System.out.print(p);
        }
        System.out.println("");
        for(Pet p: ncs.shuffled()) {
            System.out.print(p);
        }
        System.out.println("");
        for(Pet p: ncs) {
            System.out.print(p);
        }
    }
}
