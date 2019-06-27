/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_p327;

/**
 *
 * @author Fujitsu V6505
 */
interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        //lokalna klasa wewnętrzna
        class LocalCounter implements Counter {
            public LocalCounter() { System.out.println("LocalCounter()");}

            @Override
            public int next() {
                System.out.print(name + " ");
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name) {
        return new Counter() {
            
            {
                System.out.println("Counter() anonimowy");
            }
            @Override
            public int next() {
                System.out.print(name + " ");
                return count++;
            }
            
        };
    }
    
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Localny obiekt wewnętrzny"),
                c2 = lic.getCounter2("Anonimowy obiekt wewnętrzny");
        
        while(lic.count < 5) {
            System.out.println(c1.next());
        }
        int i = 0; while(i < 5) {
            System.out.println(c2.next()); i++;
        }
    }
}
