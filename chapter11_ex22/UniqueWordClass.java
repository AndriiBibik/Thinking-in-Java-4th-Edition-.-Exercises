/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex22;

import com.thinkinginjava.util.Words;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Fujitsu V6505
 */

class WordCounter {
    
    private int quantity = 1;
    private String word;
    
    WordCounter(String word) {
        this.word = word;
    }
    void increate() { quantity++; } 
    int getQuantity() { return quantity; }
    public String toString() { return word + "=" + quantity; }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.word);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WordCounter other = (WordCounter) obj;
        if (!Objects.equals(this.word, other.word)) {
            return false;
        }
        return true;
    }
    
}

public class UniqueWordClass {
    
    public static void main(String[] args) {
        
        String string = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
        
        Words w = new Words(string);
        
        String[] words = w.getWords();
        
        //to lower case
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        
        Set<WordCounter> uniqueWords = new HashSet<>();
        
        for(String word: words) {
            WordCounter wc = new WordCounter(word);
            boolean ifAdded = uniqueWords.add(wc);
            if(!ifAdded) {
                for(WordCounter wCounter: uniqueWords) {
                    if (wCounter.equals(wc)) {
                        wCounter.increate();
                    }
                }
            }
        }
        System.out.println(uniqueWords);
                
    }
}
