/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Fujitsu V6505
 */
public class JLiterals {
    
        public static String readFile(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); 
        try {
            //read text and adppend it to StringBuilder
            StringBuilder sb = new StringBuilder();
        
            String line = null;
            while((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
        
    public static void main(String[] args) throws Exception {
        
        if(args.length < 1) {
            System.out.println("You have to enter arguments: 1. FilePath;");
            System.exit(0);
        }
        
        String program = readFile(args[0]);
        
        String regex = "(?s)\\w+";
        Matcher m = Pattern.compile(regex).matcher(program);
        
//        if(flag.equalsIgnoreCase("Pattern.CASE_INSENSITIVE")) {
//            m = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE).matcher(program);
//        } else if(flag.equalsIgnoreCase("Pattern.MULTILINE")) {
//            m = Pattern.compile(args[1], Pattern.MULTILINE).matcher(program);
//        } else if(flag.equalsIgnoreCase("Pattern.DOTALL")) {
//            m = Pattern.compile(args[1], Pattern.DOTALL).matcher(program);
//        }
        
        int i = 0;
        
        while(m.find()) {
            System.out.println(++i + ". Found: " + m.group() + " starts at " + m.start());
            
            System.out.println("Literals: " + Arrays.toString(Pattern.compile("").split(m.group())));
        }
        
        // ex 20
        Matcher m2 = Pattern.compile("(?s)(class|new)\\s+(\\p{Lu}+\\w*)").matcher(program);
        while(m2.find()) {
            System.out.println("class name: " + m2.group(2));
        }
    }
}
