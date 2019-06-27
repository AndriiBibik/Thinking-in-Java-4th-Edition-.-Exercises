/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex2;

class SimpleObject {
    void s() {
        System.out.println("Greetings from s()");
    }
}
public class ExceptionCatchTest {
    static SimpleObject so = null;
    public static void main(String[] args) {
        try {
            so.s();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
