/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_page359;

import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
/**
 *
 * @author Fujitsu V6505
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Random r = new Random();
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < 15; i++) {
            queue.offer(r.nextInt(20) + 1);
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for(char c: "Eoraptor".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
