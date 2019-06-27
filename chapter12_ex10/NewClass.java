/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fujitsu V6505
 */
class NewException extends Exception {}

class NewException2 extends Exception {}

public class NewClass {
    public void f() throws NewException2 {
        try {
            g();
        } catch(NewException ne) {
            throw new RuntimeException(ne);
        }
    }
    public void g() throws NewException {
        throw new NewException();
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        try {
            nc.f();
        } catch (NewException2 e2) {
            e2.printStackTrace(System.out);
        }
    }
    
}
