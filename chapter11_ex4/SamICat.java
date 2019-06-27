/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Fujitsu V6505
 */
public class SamICat {
    
    private Collection<String> collection;
    private Iterator<String> iterator;
    
    void fill(Collection<String> collection) {
        collection.add("Sam Puckett");
        collection.add("Cate Valentine");
        collection.add("Dice");
        collection.add("Nona");
        collection.add("Goomer");
        this.collection = collection;
        iterator = collection.iterator();
    }
    
    String next() {
        if(iterator.hasNext())
            return iterator.next();
        iterator = collection.iterator();
        return iterator.next();
    }
    
    public Collection<String> getCollection() {
        return collection;
    }
    
    public static void main(String[] args) {
        SamICat SamICat = new SamICat();
        SamICat.fill(new ArrayList<>());
        SamICat.fill(new ArrayList<>());
        System.out.println(Arrays.asList(SamICat.getCollection()));
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        System.out.println(SamICat.next());
        
        SamICat.fill(new LinkedList<>());
        System.out.println(Arrays.asList(SamICat.getCollection()));
        
        SamICat.fill(new HashSet<>());
        System.out.println(Arrays.asList(SamICat.getCollection()));
        
        SamICat.fill(new LinkedHashSet<>());
        System.out.println(Arrays.asList(SamICat.getCollection()));
        
        SamICat.fill(new TreeSet<>());
        System.out.println(Arrays.asList(SamICat.getCollection()));
        
        
    }
}
