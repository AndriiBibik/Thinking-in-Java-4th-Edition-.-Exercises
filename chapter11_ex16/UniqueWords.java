/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex16;

import com.thinkinginjava.util.Words;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Fujitsu V6505
 */
public class UniqueWords {
    public static void main(String[] args) {
        
        String string = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
        
        Words w = new Words(string);
        
        String[] words = w.getWords();
        
        String vowels = "aeiouyAEIOUY";
        
        int totalCount = 0;
        
        for(int i = 0; i < words.length; i++) {
            
            String[] letters = words[i].split("");
            int wordCounter = 0;
            for(int j = 0; j < words[i].length(); j++) {
                
                if(vowels.contains(letters[j])) {
                    wordCounter++;
                    totalCount++;
                }
            }
            System.out.print(wordCounter + "; ");
        }
        
        System.out.println("");
        System.out.println(totalCount);
    }
}
