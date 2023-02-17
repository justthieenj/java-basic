package oop.vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        // abstract class cannot be instantiated, but they can be inherited
        // abstract method are declared without an implementation
        Car car = new Car();
        car.go();
        car.go("Ho Chi Minh");
        System.out.println("=====================================");

        Bike bike = new Bike();
        bike.go();
        bike.go("Da Nang");
        System.out.println("=====================================");

        // abstract class and interface class can be used as a type
        Vehicle bike1 = new Bike();
        bike1.go("Ha Noi");
    }
}
