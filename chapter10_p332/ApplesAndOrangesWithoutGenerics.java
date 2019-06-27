/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_p332;

import java.util.ArrayList;
/**
 *
 * @author Fujitsu V6505
 */

class Apple {
    private static int count;
    private final int id = count++;
    int getId() { return id; }
}
class Orange {}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int i = 0; while(i < 3) {
            al.add(new Apple());
            i++;
        }
        al.add(new Orange());
        for(i = 0; i < al.size(); i++) {
            System.out.println("Apples id: " + ((Apple)al.get(i)).getId());
        }
    }
}
