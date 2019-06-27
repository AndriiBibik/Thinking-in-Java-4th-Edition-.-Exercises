/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex20;

import com.thinkinginjava.util.Words;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 *
 * @author Fujitsu V6505
 */

class Count {
    private int value = 0;
    void increate() { value++; } 
    int getValue() { return value; }
    public String toString() { return "" + value; }
    
    public int compareTo(Count c) {
    if(this.getValue() < c.getValue()) {
        return -1;
    } else if (this.getValue() > c.getValue()) {
        return 1;
    } else {
        return 0;
    }
}
}

public class UniqueWords {
    
    public static void main(String[] args) {
        
        String string = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
        
        Words w = new Words(string);
        
        String[] words = w.getWords();
        
        String vowels = "aeiouyAEIOUY";
        
        int totalCount = 0;
        
        String[] vowelsArr = vowels.split("");
        
        //to count every vowel number in the given text
        Map<String, Count> vowelsCountMap = new LinkedHashMap<>();
        for(String s: vowelsArr) {
            vowelsCountMap.put(s, new Count());
        }
        
        for(int i = 0; i < words.length; i++) {
            
            String[] letters = words[i].split("");
            int wordCounter = 0;
            for(int j = 0; j < words[i].length(); j++) {
                
                if(vowels.contains(letters[j])) {
                    wordCounter++;
                    totalCount++;
                    //increase{} count for key vowel
                    vowelsCountMap.get(letters[j]).increate();
                }
            }
            System.out.print(wordCounter + "; ");
        }
        
        System.out.println("");
        System.out.println(totalCount);
        
        System.out.println("///////");
        System.out.println(vowelsCountMap);
        
        //Ex21
        Map<String, Count> wordsCount = new HashMap<>();
        
        //words to small letters
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        for(String s: words) {
            if(wordsCount.get(s) == null) {
                Count c = new Count();
                c.increate();
                wordsCount.put(s, c);
            } else {
                wordsCount.get(s).increate();
            }
        }
        System.out.println("***********");
        System.out.println(wordsCount);
        
        Collections.sort(Arrays.asList(words));
        System.out.println(Arrays.asList(words));
        
        //new map for sorted keys
        Map<String,Count> sortedMap = new LinkedHashMap<>();
        
        for(String word: words) {
            sortedMap.put(word, wordsCount.get(word));
        }
        System.out.println("\\\\\\\\");
        System.out.println(sortedMap);
       
                
    }
}
