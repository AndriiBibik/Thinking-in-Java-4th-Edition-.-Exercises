/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p361;

import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.Random;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Fujitsu V6505
 */
public class PriorityQueueTest {
    public static void printQ(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.remove() + " / ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            pq1.offer(r.nextInt(20) + 1);
        }
        printQ(pq1);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        
        //inserting into priority queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(ints);
        printQ(pq2);
        
        //reverse order
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        pq3.addAll(ints);
        printQ(pq3);
        
        String phrase = "NIGDY NIE ŻAŁUJ TEGO CO SPRAWIŁO, ŻE CHOĆ PRZEZ CHWILĘ BYŁEŚ SZCZĘŚLIWY";
        String[] letters = phrase.split("");
        PriorityQueue<String> pq4 = new PriorityQueue<>(Arrays.asList(letters));
        printQ(pq4);
        
        //and reverse order
        PriorityQueue<String> pq5 = new PriorityQueue<>(letters.length, Collections.reverseOrder());
        pq5.addAll(Arrays.asList(letters));
        printQ(pq5);
        
        //with Set
        Set<String> ls = new HashSet<>();
        for(String s: letters) {
            ls.add(s);
        }
        PriorityQueue<String> pq6 = new PriorityQueue<>();
        for(String s: ls) {
            pq6.add(s);
        }
        printQ(pq6);
        
    }
}
