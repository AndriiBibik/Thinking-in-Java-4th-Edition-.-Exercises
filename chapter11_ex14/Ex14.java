/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Fujitsu V6505
 */
public class Ex14 {
    public static void main(String[] args) {
        
        List<Integer> il = new ArrayList<>();
        
        for(int i = 1; i <=10; i++) {
            il.add(i);
        }
        ListIterator<Integer> listIt = il.listIterator();
        
        List<Integer> destinationLL = new LinkedList<>();
        
        while(listIt.hasNext()) {
            destinationLL.add(destinationLL.size()/2, listIt.next());
        }
        
        System.out.println(il);
        
        System.out.println(destinationLL);
        
    }
}
