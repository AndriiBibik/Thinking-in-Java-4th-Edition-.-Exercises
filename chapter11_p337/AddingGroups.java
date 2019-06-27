/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p337;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fujitsu V6505
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> c = Arrays.asList(1,2,3,4,5);
        c = new ArrayList<Integer>(c);
        Integer[] moreInts = {6,7,8,9,10};
        c.addAll(Arrays.asList(moreInts));
        Collections.addAll(c, 11,12,13,14);
        Collections.addAll(c, moreInts);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1, 99);
        for(Integer i: c) {
            System.out.println(i);
        }
        
    }
}
