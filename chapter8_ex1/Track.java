package chapter8_ex1;

public class Track {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
