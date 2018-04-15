/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7_ex18;
import java.util.*;
/**
 *
 * @author Potato
 */
public class Bones {
    private static Random random = new Random(50);
    private static final int cheatResult = random.nextInt(6) + 1;
    private final int trueResult = random.nextInt(6) + 1;
    
    public static void main(String[] args){
        Bones bones1 = new Bones();
        System.out.println("cheating " + bones1.cheatResult);
        System.out.println("true " + bones1.trueResult);
        Bones bones2 = new Bones();
        System.out.println("cheating " + bones2.cheatResult);
        System.out.println("true " + bones2.trueResult);
    }
}
