public class Variable2 {
    public static void main(String[] args) {
        // String
        String name = "John";
        String ageStr = "30";

        // camelCase, PascalCase
        // Integer
        int age = 30; // primitive type
        Integer age3 = 30; // wrapper class, it has more methods than primitive type
        int result = Integer.parseInt(ageStr); // convert String to Integer
        Integer age4 = null;
        System.out.println(age == age3);
        System.out.println(age4);

        // Double
        double price = 10.99;
        double doubleAge = 30;
        System.out.println(age);
        System.out.println(doubleAge);
        System.out.println(age == doubleAge);

        // data type casting
        double doubleAge2 = age;
        int age2 = (int) doubleAge2; // 30
        int price2 = (int) price; // 10.99 -> 10
        System.out.println(age2);
        System.out.println(price2);

        // null

        final String FIRST_NAME = "John"; // constant
        var lastName = "Doe"; // Java 10
        var number = 10.0; // Java 10
    }
}
