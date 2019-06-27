/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex6;

/**
 *
 * @author Fujitsu V6505
 */
public class StringFormat {
    private int i = 5;
    private long l = 8787879879784896864L;
    private float f = 3.53947f;
    private double d = 4.23323;
    public String toString() {
        return String.format("int i: %d / long l: %d / float f: %f / double d: %f", i, l, f, d);
    }
    public static void main(String[] args) {
        System.out.println(new StringFormat());
    }
}
