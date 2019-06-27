/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex5;
import java.util.Date;
/**
 *
 * @author Fujitsu V6505
 */
public class WhileWithTry {
    static int[] arr = {1,2,3,4,5};
    static boolean isThereException = true;
    static long millsToStopProgram = new Date().getTime() + 5000;
    
    public static void main(String[] args) {
        while(isThereException) {
            try {
                isThereException = false;
                int index = 10;
                if(millsToStopProgram < new Date().getTime()) {
                    index = 3;
                }
                System.out.println("index = " + index + " value = " + arr[index]);
            } catch(ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                isThereException = true;
            }
        }
    }
}
