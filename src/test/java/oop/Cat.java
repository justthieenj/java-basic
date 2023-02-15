package oop;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    public void meow() {
        talk();
        System.out.println("Meow");
    }
}
