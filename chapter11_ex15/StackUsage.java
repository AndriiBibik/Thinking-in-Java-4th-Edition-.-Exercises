/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex15;

import com.thinkinginjava.util.Stack;
/**
 *
 * @author Fujitsu V6505
 */
public class StackUsage {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        String[] s = string.split("");
        
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("+")) {
                stack.push(s[i+1]);
            } else if(s[i].equals("-")) {
                System.out.print(stack.pop());
            }
        }
    }
    
}
