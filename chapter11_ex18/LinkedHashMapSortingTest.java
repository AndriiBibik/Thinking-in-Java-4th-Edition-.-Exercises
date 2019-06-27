/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Fujitsu V6505
 */

class Animal {
    
    private String name;
    
    Animal(String name) {
        this.name = name;
    }
    String getName() { return name; }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

public class LinkedHashMapSortingTest {
    public static void main(String[] args) {
        Animal a1 = new Animal("Duck");
        Animal a2 = new Animal("Tiger");
        Animal a3 = new Animal("Wild cat");
        Animal a4 = new Animal("Elephant");
        Animal a5 = new Animal("Fox");
        Map<String,Animal> animals = new HashMap<>();
        animals.put(a1.getName(), a1);
        animals.put(a4.getName(), a4);
        animals.put(a5.getName(), a5);
        animals.put(a2.getName(), a2);
        animals.put(a3.getName(), a3);
        System.out.println(animals);
        
        Map<String,Animal> animals2 = new LinkedHashMap<>();
        animals2.put(a1.getName(), a1);
        animals2.put(a4.getName(), a4);
        animals2.put(a5.getName(), a5);
        animals2.put(a2.getName(), a2);
        animals2.put(a3.getName(), a3);
        System.out.println("...");
        System.out.println(animals2);
        
        //ex19
        Animal[] animalsArr = {a1, a4, a5, a2, a3};
        Set<Animal> animalsSet = new HashSet<>();
        Collections.addAll(animalsSet, animalsArr);
        System.out.println(animalsSet);
        
        Set<Animal> animalsLinkedSet = new LinkedHashSet<>();
        Collections.addAll(animalsLinkedSet, animalsArr);
        System.out.println("...");
        System.out.println(animalsLinkedSet);
    }
    
}
