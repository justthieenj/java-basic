package oop.inteface;

public class Orange implements Fruit {
    @Override
    public void peel() {
        System.out.println("Peel orange");
    }

    @Override
    public void eat() {
        System.out.println("Eat orange");
    }
}
