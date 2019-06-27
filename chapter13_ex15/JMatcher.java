/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_ex15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Fujitsu V6505
 */
public class JMatcher {
    
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
        
        if(args.length < 3) {
            System.out.println("You have to enter 3 arguments: 1. FilePath; 2: regEx; 3: flags");
            System.exit(0);
        }
        
        String program = readFile(args[0]);
        
        Matcher m = Pattern.compile(args[1]).matcher(program);
        
        String flag = args[2];
        
        if(flag.equalsIgnoreCase("Pattern.CASE_INSENSITIVE")) {
            m = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE).matcher(program);
        } else if(flag.equalsIgnoreCase("Pattern.MULTILINE")) {
            m = Pattern.compile(args[1], Pattern.MULTILINE).matcher(program);
        } else if(flag.equalsIgnoreCase("Pattern.DOTALL")) {
            m = Pattern.compile(args[1], Pattern.DOTALL).matcher(program);
        }
        
        int i = 0;
        while(m.find()) {
            System.out.println(++i + ". Found: " + m.group() + " starts at " + m.start());
        }
        
        
    }
}
