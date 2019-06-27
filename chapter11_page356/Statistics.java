/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_page356;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Fujitsu V6505
 */
public class Statistics {
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < 100000; i++) {
            Integer number = r.nextInt(30) + 1;
            Integer freq = map.get(number);
            map.put(number, freq == null?1:(freq+1));
        }
        System.out.println(map);
    }
}
