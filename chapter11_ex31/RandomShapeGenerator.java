//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package chapter11_ex31;
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{
    
  private Random rand = new Random();
  private Shape[] shapes;
  
  public RandomShapeGenerator(int count) {
      shapes = new Shape[count];
      for(int i = 0; i < count; i++) {
          shapes[i] = next();
      }
  }
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }
            
        };
    }
    
    public static void main(String[] args) {
        RandomShapeGenerator rs = new RandomShapeGenerator(5);
        for(Shape s: rs) {
            s.draw();
        }
    }
} ///:~
