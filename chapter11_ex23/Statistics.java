/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex23;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Fujitsu V6505
 */
public class Statistics {

    public HashMap<Integer, Integer> getMap() {
        Random r = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            Integer number = r.nextInt(30) + 1;
            Integer freq = map.get(number);
            map.put(number, freq == null ? 1 : (freq + 1));
        }
        return (HashMap<Integer, Integer>) map;
    }

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {

            Statistics stats = new Statistics();
            Map<Integer, Integer> totalAppearances = new HashMap<Integer, Integer>();
            for (int i = 0; i < 100; i++) {
                Map<Integer, Integer> map = stats.getMap();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    Integer key = entry.getKey();
                    if (totalAppearances.get(key) == null) {
                        totalAppearances.put(key, entry.getValue());
                    }
                    totalAppearances.put(key, (totalAppearances.get(key) + entry.getValue()));
                }
            }
            System.out.println(totalAppearances);

            Integer maxKey = 1;
            Integer maxValue = totalAppearances.get(maxKey);

            for (int i = 2; i < 30; i++) {
                if (totalAppearances.get(i) > maxValue) {
                    maxKey = i;
                    maxValue = totalAppearances.get(i);
                }
            }
            System.out.println(maxKey + "=" + maxValue);
        }
    }
}
