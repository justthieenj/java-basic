package exercise;

import java.util.Random;

public class MathUtils {
    // static
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    // overload
    public static int randomNumber(int max) {
        var r = new Random();
        return r.nextInt(1, max - 1);
    }

    public static int randomNumber(String max) {
        return 0;
    }

    public static int randomNumber(int min, int max) {
        var r = new Random();
        return r.nextInt(min, max - 1);
    }

    public static void main(String[] args) {
        var r1 = randomNumber(5);
        var r2 = randomNumber(0, 5);
        System.out.println(r1);
        System.out.println(r2);
    }
}
