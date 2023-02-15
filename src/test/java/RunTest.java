import oop.Cat;
import oop.Person;

public class RunTest {
    public static void main(String[] args) {
        Person peter = new Person("Peter", 20); // 1. create an object

        Cat cat = new Cat("Tom", "white");
        cat.meow();
    }
}
