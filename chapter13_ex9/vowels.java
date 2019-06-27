/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Fujitsu V6505
 */
public class vowels {
    public static void main(String[] args) {
        String verse = "Moje nogi na tobie. Oto dłonie śpiące w płomieniu. Tęsknię" +
            "za rybą twojej tylko melancholii, stertą książek o wybawianiu" +
            "plamy z księżyca. Niosę tobie w podbrzuszu.";
        Pattern p = Pattern.compile("[aąeęiouy]", Pattern.CASE_INSENSITIVE);
        String newString = p.matcher(verse).replaceAll("_");
        System.out.println(newString);
    }
}
