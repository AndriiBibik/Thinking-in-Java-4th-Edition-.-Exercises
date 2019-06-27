/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p364;

import chapter11_p362.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println("");
    }
    public static void display(Collection<Pet> c) {
        for(Pet p: c) {
            System.out.print(p);
        }
        System.out.println("");
    }
    public static void main(String[] a) {
        Pet[] pets = { new Pet("Fox"), new Pet("Wolf"), new Pet("Fish"), new Pet("Duck")};
        
        List<Pet> petsList = Arrays.asList(pets);
        Set<Pet> petsSet = new HashSet<>();
        petsSet.addAll(petsList);
        Map<String,Pet> petsMap = new HashMap<>();
        for(int i = 0; i < pets.length; i++) {
            petsMap.put(pets[i].getName(), pets[i]);
        }
        display(petsList);
        display(petsSet);
        display(petsList.iterator());
        display(petsSet.iterator());
        System.out.println(petsMap);
        System.out.println(petsMap.keySet());
        display(petsMap.values());
        display(petsMap.values().iterator());
        
    }
}
