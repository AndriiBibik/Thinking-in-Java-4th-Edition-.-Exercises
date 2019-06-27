/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex29;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        ObjectExtended[] oeArr = { new ObjectExtended(), new ObjectExtended() };
        PriorityQueue<ObjectExtended> pq = new PriorityQueue<ObjectExtended>();
        for(ObjectExtended oe: oeArr) {
            pq.offer(oe);
        }
    }
}
