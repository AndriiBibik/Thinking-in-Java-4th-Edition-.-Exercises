/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex8;

import java.util.Arrays;

/**
 *
 * @author Fujitsu V6505
 */
public class Splitting {
    static String verse = "Moje nogi na tobie. Oto dłonie śpiące w płomieniu. Tęsknię" +
    "za rybą twojej tylko melancholii, stertą książek o wybawianiu" +
    "plamy z księżyca. Niosę tobie w podbrzuszu.";
    static String regex = "w|za";
    public static void main(String[] args) {
        System.out.println(Arrays.toString(verse.split(regex)));
    }
}
