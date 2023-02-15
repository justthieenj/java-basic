package oop;

public class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greeting() {
        System.out.println("Hello, my name is " + name);
    }

    public void talk() {
        System.out.println("I am " + age + " years old");
    }
}
