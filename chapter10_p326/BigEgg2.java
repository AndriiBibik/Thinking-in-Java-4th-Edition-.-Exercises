/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_p326;

/**
 *
 * @author Fujitsu V6505
 */

class Egg2 {
    protected class Yolk {
        public Yolk() {System.out.println("Egg2.Yolk()");}
        public void f() {System.out.println("Egg2.Yolk.f()");}
    }
    private Yolk y = new Yolk();
    public Egg2() { System.out.println("Egg2()"); }
    public void insertYolk(Yolk y) {
        this.y = y;
    }
    public void g() { y.f(); }; 
}
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() { System.out.println("BigEgg2.Yolk()"); }
        public void f() { System.out.println("BiggEgg2.Yolk.f()/");}     
    }
    public BigEgg2() { insertYolk(new Yolk()); }
    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}
