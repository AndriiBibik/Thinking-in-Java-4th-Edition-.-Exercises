/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex11;

import com.sun.media.sound.SoftAbstractResampler;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Werification {

    public static void main(String[] args) {
        String phrase = "agata zjadła osiem ananasów i ostrzygę, a Anita obyła się smakiem";
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b.*");
        Matcher m = p.matcher(phrase);
        System.out.println(m.matches());
    }
}
