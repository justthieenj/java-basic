package oop.vehicle;

public abstract class Vehicle {
    abstract void go(); // abstract method

    abstract void go(String destination);

    public void stop() {
        System.out.println("Stop");
    }
}
