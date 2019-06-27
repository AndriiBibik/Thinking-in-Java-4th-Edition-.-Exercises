/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex7;
import java.util.regex.Pattern;
/**
 *
 * @author Fujitsu V6505
 */
public class RegexFirstBigLastDot {
    static String verse = "Moje nogi na tobie. Oto dłonie śpiące w płomieniu. Tęsknię" +
    "za rybą twojej tylko melancholii, stertą książek o wybawianiu" +
    "plamy z księżyca. Niosę tobie w podbrzuszu.";
    static String regex = "[A-Z].*\\.$";
    public static void main(String[] args) {
        boolean isMatches = Pattern.matches(regex, verse);
        System.out.println(isMatches);
    }
}
