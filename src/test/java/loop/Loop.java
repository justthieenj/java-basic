package loop;

import java.util.Arrays;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        introduction();
        doWhile();
    }

    public static void forEachExample() {
        String[] names = {"John", "Jane", "James", "Jill"};
        // convert to list
        List<String> list = Arrays.asList(names);

        // enhanced for loop
        for (String name : list) {
            System.out.println(name);
        }

        // forEach method (arrow function, lambda expression)
        list.forEach(name -> System.out.println(name));
        list.forEach(System.out::println);
    }

    public static void introduction() {
        String str = "Selenium";
        // i++ -> i = i + 1
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " " + str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(i + " " + str.charAt(i));
        }

        // while
        int i = 0;
        while (i < str.length()) {
            System.out.println(i + " " + str.charAt(i));
            i++;
        }
    }

    public static void doWhile() {
        String str = "Naruto";
        int i = 0;
        do {
            System.out.println(i + " " + str.charAt(i));
            i++;
        } while (i < str.length());
    }
}
