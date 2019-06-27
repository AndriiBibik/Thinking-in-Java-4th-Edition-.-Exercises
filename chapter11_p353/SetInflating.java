/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p353;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Fujitsu V6505
 */
public class SetInflating {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for(int i = 0; i < 10000; i++) {
            set.add(random.nextInt(30) + 1);
        }
        System.out.println(set);
    }
}
