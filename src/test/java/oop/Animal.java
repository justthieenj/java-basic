package oop;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    protected void talk() {
        System.out.println("I am an animal");
    }
}
