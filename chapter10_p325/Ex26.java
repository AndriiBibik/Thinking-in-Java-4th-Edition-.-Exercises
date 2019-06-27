/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_p325;

/**
 *
 * @author Fujitsu V6505
 */

class Pruszkow {
    class Centrum {
        private int numOfParks;
        Centrum(int numOfParks) {
            this.numOfParks = numOfParks;
        }
        public int getNumOfParks() { return numOfParks; }
    }
}
public class Ex26 extends Pruszkow.Centrum {
    Ex26(Pruszkow pruszkow, int numOfParks) {
        pruszkow.super(numOfParks);
    }
    public static void main(String[] args) {
        Pruszkow pruszkow = new Pruszkow();
        Ex26 ex26 = new Ex26(pruszkow, 5);
        System.out.println(ex26.getNumOfParks());
    }
}
