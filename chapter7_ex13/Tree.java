/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7_ex13;

/**
 *
 * @author Potato
 */
public class Tree extends Root{
    public void show(double d){
        System.out.println("double d");
    }
    
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.show(3.0D);
        tree.show(1.0f);
        tree.show("String");
        tree.show(1);
    }
}
