package chapter8_ex1;

public class ServiceCenter {
    public static void repair(Cycle c) {
        System.out.println("Cycle repaired. Time for test ride.");
        c.ride();
    }
    
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        
        repair(unicycle);
        repair(bicycle);
        repair(tricycle);
    }
}
