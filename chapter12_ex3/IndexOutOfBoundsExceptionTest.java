/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex3;

import java.util.logging.*;
import java.io.*;
/**
 *
 * @author Fujitsu V6505
 */
public class IndexOutOfBoundsExceptionTest {
    
    static Logger logger = Logger.getLogger("Ex3Logger");
    
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        try {
            System.out.println(arr[size]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
            throw new RuntimeException(e);
        }
    }
}
