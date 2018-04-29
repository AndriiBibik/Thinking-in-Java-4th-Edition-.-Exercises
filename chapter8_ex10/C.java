package chapter8_ex10;

public class C extends A {
    @Override
    public void b() { System.out.println("C.b()"); }
    
    public static void main(String[] args) {
        A c = new C();
        c.a();
    }
}
