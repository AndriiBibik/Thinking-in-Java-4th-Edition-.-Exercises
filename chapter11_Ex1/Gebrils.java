/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_Ex1;

import java.util.ArrayList;

/**
 *
 * @author Fujitsu V6505
 */
class Gabril {
    private int gabrilNumber;
    Gabril(int gabrilNumber) {
        this.gabrilNumber = gabrilNumber;
    }
    void hop() {
        System.out.println(gabrilNumber + " skok!");
    }
}

public class Gebrils {
    public static void main(String[] args) {
        ArrayList<Gabril> gabrils = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            gabrils.add(new Gabril(i + 1));
        }
        for(Gabril g: gabrils) {
            g.hop();
        }
    }
}
