/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7_ex14;

class Engine {
    public void start(){};
    public void rev(){};
    public void stop(){};
    public void service(){ System.out.println("Engine is under service"); };
}

class Wheel {
    public void inflate(int i){};
}

class Window {
    public void rollup(){};
    public void rolldown(){};
}

class Door {
    public Window window = new Window();
    public void open(){};
    public void close(){};
}

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door();
    
    public Car(){
       for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel();
       } 
    }
    
    public static void main(String[] args){
        Car car = new Car();
        car.engine.service();
    }
}
