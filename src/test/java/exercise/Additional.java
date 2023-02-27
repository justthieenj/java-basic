package exercise;

public class Additional {
    public static void main(String[] args) {
        printString("hello", "good bye", "phone");
        printString2(new String[]{"hello", "good bye", "phone"});
    }

    /**
     * Varargs argument are always the last parameter in the method signature.
     */
    private static void printString(String... strings) {
        for (var str : strings) {
            System.out.println(str);
        }
    }

    private static void printString2(String[] strings) {
        for (var str : strings) {
            System.out.println(str);
        }
    }
}
