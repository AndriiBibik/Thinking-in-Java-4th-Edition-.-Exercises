/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_p351;

import java.util.LinkedList;
/**
 *
 * @author Fujitsu V6505
 */
public class Stack<E> {
    private LinkedList<E> list = new LinkedList<>();
    public void push(E e) { list.addFirst(e); }
    public E peek() { return list.getFirst(); }
    public E pop() { return list.removeFirst(); }
    public boolean isEmpty() { return list.isEmpty(); }
    @Override
    public String toString() { return list.toString(); }
}
