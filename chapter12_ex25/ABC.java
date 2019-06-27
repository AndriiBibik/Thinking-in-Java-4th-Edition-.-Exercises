/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex25;

import java.util.logging.Level;
import java.util.logging.Logger;

class AException extends Exception { public String toString() { return "A exc"; } }
class BException extends AException { public String toString() { return "B exc"; } }
class CException extends BException { public String toString() { return "C exc"; } }

class A {
    public void abc() throws AException { throw new AException(); }
}
class B extends A {
    public void abc() throws BException { throw new BException(); }
}
class C extends B {
    public void abc() throws CException { throw new CException(); }
}

public class ABC {
    public static void main(String[] args) {
        A c = new C();
        try {
            c.abc();  
        } catch (AException ex) {
            System.out.println(ex);
        }
        
    }
}
