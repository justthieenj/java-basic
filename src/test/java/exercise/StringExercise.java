package exercise;

public class StringExercise {
    public static boolean compareTwoStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // 1. Write a function to capitalize an input string
    // Example: abc -> Abc
    public static String capitalizeFirstLetter(String str) {
        return str.toUpperCase().charAt(0) + str.substring(1);
    }

    // 2. Write a function to check if given string contains another string
    // Example: Walter White, White -> true

    public static boolean checkStringContainsAnotherString(String str1, String str2) {
        return str1.contains(str2);
    }
}
