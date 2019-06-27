/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex12;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Fujitsu V6505
 */
public class Groups {
    public static void main(String[] args) {
        
        String verse = "Over hill, over dale, \n" +
            "Thorough bush, thorough brier, \n" +
            "Over park, over pale, \n" +
            "Thorough flood, thorough fire! \n" +
            "I do wander everywhere, \n" +
            "Swifter than the moon's sphere; \n" +
            "And I serve the Fairy Queen, \n" +
            "To dew her orbs upon the green;";
        
        Matcher m = Pattern.compile("(\\b\\p{Ll}+?)(\\s|\\.|\\,|\\;)").matcher(verse);
        
        Set<String> uniqueWords = new HashSet<>();
        
        while(m.find()) {
            System.out.print(m.group(1)); System.out.print(": "); System.out.println(uniqueWords.add(m.group(1)));
        }
           
        
        System.out.println(uniqueWords.size());
        
        
    }
}
