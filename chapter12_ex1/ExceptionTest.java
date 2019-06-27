/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12_ex1;

/**
 *
 * @author Fujitsu V6505
 */
public class ExceptionTest {
    public static void a() throws Exception {
        throw new Exception("message from a()");
    }
    public static void main(String[] args) {
        try {
            a();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("2+2=" + (2+3));
        }
    }
}
