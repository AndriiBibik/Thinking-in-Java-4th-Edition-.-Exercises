/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex22;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fujitsu V6505
 */
class ConstructionException extends Exception {
    public  String toString() { return "ConstructionException"; }
}

class FailedConstructor {
    private Room room1;
    private Room room2;
    public FailedConstructor() throws ConstructionException {
        room1 = new Room();
        try {
          //throw new ConstructionException();  
        } finally {
          room2 = new Room();  
        }
        
        
    }
    public void dispose() {
        System.out.println("dispose()");
    }
}
class Room {
    private boolean isCleanUp = true;
    public void timeJump() { isCleanUp = false; }
    public void cleanUp() { isCleanUp = true; }
    public void dispose() { cleanUp(); }
    public String toString() { return isCleanUp?"posprzątane":"nie posprzątane"; } 
}
public class ex22 {
    public static void main(String[] args) {
        try {
            FailedConstructor fc = null;
            try {
               fc = new FailedConstructor();
                
            } finally {
                fc.dispose(); 
            }
            
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}
