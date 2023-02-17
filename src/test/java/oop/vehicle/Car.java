package oop.vehicle;

public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Chiuu");
    }

    @Override
    void go(String destination) {
        System.out.println("Car go to " + destination);
    }
}
