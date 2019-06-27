package chapter8_ex2;

public class Shapes {
    private static Shape[] shapes = new Shape[9];
    private static RandomShapeGenerator rsg = new RandomShapeGenerator();
    
    public static void main(String[] args) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = rsg.next();
        }
        for (Shape s: shapes) {
            s.draw();
        }
    }
}
