package chapter13_ex20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class VariablesInString {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;
    
    public VariablesInString(String s) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(s));
        i = Integer.valueOf(br.readLine());
        l = Long.valueOf(br.readLine());
        f = Float.valueOf(br.readLine());
        d = Double.valueOf(br.readLine());
        this.s = br.readLine();
    }
    
    @Override
    public String toString() {
        return "int: " + i + "; long: " + l + "; float: " + f + "; double: " + d +
                " String: "  + s;
    }
    
    public static void main(String[] args) throws IOException {
        String input = "23545\n2342332234\n2.33223f\n324.2342\nThis bird is Parrot";
        
        VariablesInString vs = new VariablesInString(input);
        
        System.out.println(vs);
    }
}
