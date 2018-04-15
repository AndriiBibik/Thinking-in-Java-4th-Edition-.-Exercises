/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7_ex16;

public class Frog extends Amphibian{
    public void jump(){ System.out.println("Jumping"); }
    
    public static void main(String[] args){
        Frog frog = new Frog();
        frog.swim();
        frog.walk();
        frog.jump();
    }
}
