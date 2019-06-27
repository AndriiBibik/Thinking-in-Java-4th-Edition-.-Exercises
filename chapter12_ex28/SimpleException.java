/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex28;

/**
 *
 * @author Fujitsu V6505
 */

class MyException extends RuntimeException {
    MyException() {}
    MyException(String message) { super(message); }
}
public class SimpleException{
    static void test(String message) throws MyException {
        throw new MyException(message);
    }
    public static void main(String[] args) {
            test("SMS Exception");
    }
} 
