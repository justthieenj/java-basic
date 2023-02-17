package oop.vehicle;

public class Bike extends Vehicle {
    @Override
    void go() {
        System.out.println("Vroom vroom");
    }

    @Override
    void go(String destination) {
        System.out.println("Bike go to " + destination);
    }
}
