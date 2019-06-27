
package chapter13_ex10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Fujitsu V6505
 */
public class TestMatches {
    private static Pattern[] patterns = {null, null, null, null, null, null, null, null, null};
    public static void main(String[] args) {
        String phrase = "Java już obsługuje wyrażenia regularne.";
        // patterns
        patterns[0] = Pattern.compile("^Java.*");
        patterns[1] = Pattern.compile(".*\\Breg.*");
        patterns[2] = Pattern.compile(".*u.e\\s+w(y|i)r.*");
        patterns[3] = Pattern.compile(".*s?.*");
        patterns[4] = Pattern.compile(".*s*.*");
        patterns[5] = Pattern.compile(".*s+.*");
        patterns[6] = Pattern.compile(".*s{1}.*");
        patterns[7] = Pattern.compile(".*s{1,}.*");
        patterns[8] = Pattern.compile(".*s{0,3}.*");
        
        for(int i = 0; i < patterns.length; i++) {
            Matcher m = patterns[i].matcher(phrase);
            System.out.println("Wyrażenie: " + patterns[i].pattern() + " " 
                    + (m.matches()?"pasuje":"nie pasuje") + " do tekstu.");
        }
    }
}
