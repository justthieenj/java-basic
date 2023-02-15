package homework;

import java.util.List;
import java.util.Random;

public class Feb13 {
    public static void main(String[] args) {

    }

    // round a double to 2 decimal places using floor and ceil
    // public static double roundNumber(double num)

    // random an int between 1 and 99
    // public static double randomNumber()

    // find and count a specific string in a list of strings using forEach
    // public static int countString(List<String> list, String str)
    // Example: countString(List.of("abc", "def", "abc"), "abc") -> 2

    // Round up with 2 decimals
    public static double roundUpTwoDecimals(double num) {
        return Math.ceil(num * 100) / 100;
    }

    // Round down with 2 decimals
    public static double roundDownTwoDecimals(double num) {
        return Math.floor(num * 100) / 100;
    }

    // Random number from 1 to 99
    public static int randomNumber() {
        return (int) Math.floor(Math.random() * 99) + 1;
    }

    public static int randomNumber(int min, int max) {
        var r = new Random();
        return r.nextInt(min, max - 1);
    }

    // enhanced for loop
    public static int countString(List<String> list, String str) {
        int count = 0;
        for (String word : list) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
