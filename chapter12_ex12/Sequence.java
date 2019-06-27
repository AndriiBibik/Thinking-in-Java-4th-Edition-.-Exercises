package chapter12_ex12;
// Holds a sequence of Objects.

import java.util.logging.Level;
import java.util.logging.Logger;


interface Selector {
  boolean end();
  Object current();
  void next();
}	

class TooMuchElements extends Exception {}

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) throws TooMuchElements {
    if(next < items.length)
      items[next++] = x;
    else
        throw new TooMuchElements();
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 11; i++)
        try {
            sequence.add(Integer.toString(i));
        } catch (TooMuchElements ex) {
            ex.printStackTrace(System.out);
        }
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
