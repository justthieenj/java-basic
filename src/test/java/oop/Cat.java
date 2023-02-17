package oop;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public void talk() {
        System.out.println("I am a cat");
    }
}
