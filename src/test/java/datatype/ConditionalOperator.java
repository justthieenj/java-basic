package datatype;

public class ConditionalOperator {
    public static void example1() {
        // compare operator: ==, !=, >, <, >=, <= (return a boolean value)
        // logical operator: &&, ||, !
        System.out.println(1 > 2); // false
        System.out.println(1 != 2); // true
        System.out.println(1 == 2); // false
        // true && true -> true
        // true && false -> false
        // false && true -> false
        // true || true -> true
        // true || false -> true
        // false || true -> true

        if (true) {
            // do something
        } else {
            // do something else
        }
    }
}
