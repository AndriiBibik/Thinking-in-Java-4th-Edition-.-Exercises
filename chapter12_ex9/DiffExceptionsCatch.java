/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex9;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class BearException extends Exception {
    BearException() {}
    BearException(String message) { super(message); }
    
}
class FoxException extends Exception {
    FoxException() {}
    FoxException(String message) { super(message); }
    
}
class WolfException extends Exception {
    WolfException() {}
    WolfException(String message) { super(message); }
    
}
public class DiffExceptionsCatch {
    public static void allExceptions() throws BearException, FoxException, WolfException {
        Random r = new Random();
        int k = r.nextInt(3);
        switch(k) {
            case 0:
                throw new BearException("BearException");
            case 1:
                throw new FoxException("FoxException");
            default:
                throw new WolfException("WolfException");
        }
    }
    public static void main(String[] args) {
        try {
               allExceptions();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
