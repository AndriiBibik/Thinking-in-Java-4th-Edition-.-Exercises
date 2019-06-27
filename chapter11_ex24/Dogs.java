/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Dog {

    private String name;

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.name);
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
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() { return name; }

}

public class Dogs {

    public static void main(String[] args) {
        Dog[] dogs = {
            new Dog("Buddy"),
            new Dog("Goomer"),
            new Dog("Nick"),
            new Dog("Boomer")
        };
        Set<String> sorted = new TreeSet<>();
        Map<String, Dog> dMap = new HashMap<String, Dog>();
        for (Dog d: dogs) {
            dMap.put(d.getName(), d);
        }
        for(Dog d: dogs) {
            sorted.add(d.getName());
        }
        Map<String,Dog> sortedMap = new LinkedHashMap<>();
        for(String name: sorted) {
            Dog d = dMap.get(name);
            sortedMap.put(name, d);
        }
        System.out.println(sortedMap);
        
        
        
    }

}
