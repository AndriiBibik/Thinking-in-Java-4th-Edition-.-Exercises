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

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() { System.out.println("Egg.Yolk()");}
    }
    public Egg() {
        System.out.println("Nowy obiekt Egg()");
        y = new Yolk();
    }
}
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() { System.out.println("BigEgg.Yolk()"); }
    }
    public static void main(String[] args) {
        new BigEgg();
    }
}
