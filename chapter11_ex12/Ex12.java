/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Fujitsu V6505
 */
public class Ex12 {
    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> i2 = new ArrayList<>();
        ListIterator<Integer> li1 = i1.listIterator(i1.size());
        while(li1.hasPrevious()) {
            i2.add(li1.previous());
        }
        System.out.println(i2);
        li1 = i1.listIterator(i1.size());
        i2.removeAll(i2);
        int i = 0;
        while(i < i1.size()) {
            i2.add(li1.previous()); i++;
        }
        System.out.println(i2);
    }
}
