package chapter8_ex2;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random(47);
    public Shape next() {
        switch (random.nextInt(3)) {
            default: return null;
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
