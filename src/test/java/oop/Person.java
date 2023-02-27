package oop;

public class Person {
    private String name;
    private int age;
    private String gender;

    // constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void greeting() {
        System.out.println("Hello, my name is " + name);
    }

    public void talk() {
        System.out.println("I am " + age + " years old");
    }
}
