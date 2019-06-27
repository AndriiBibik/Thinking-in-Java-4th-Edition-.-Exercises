/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex2;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Fujitsu V6505
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> sc = new HashSet<>();
        for(int i = 0; i < 4; i++) {
            sc.add(i);
        }
        for(Integer i: sc) {
            System.out.print(i + ", ");
        }
    }
}
