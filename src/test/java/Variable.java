public class Variable {
    static String a = "abc";
    public static void main(String[] args) {
        // method variables
        String name; // 1. declare a variable (default value is null)
        name = "John"; // 2. assign a value to the variable
        String name2 = "John"; // 3. initialize a variable (1&2)
        name2 = "John2"; // 4. reassign a value to the variable (a constant cannot be reassigned)


        System.out.println(name);
        System.out.println(name2);
        System.out.println(a);
    }
}
