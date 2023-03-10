package homework;

import java.util.Arrays;

public class Feb26 {
    /*
    Currently result2 is not valid because the inputArray() method only accepts 5 elements.
    1. handle the exception and print "Please input 5 elements" if the number of elements is not 5
    2. fix the inputArray() method to accept any number of elements
    */
    public static void main(String[] args) {

        // Handle the exception and print "Please input 5 elements" if the number of elements is not 5
        try {
            System.out.println("Input elements of array:");
            int[] result = inputArray(54, 2, 78, 1, 5); // valid
            int[] result2 = inputArray(4, 25, 74, 1, -5, 6, 2, 17); // error
            System.out.println("The result array: " + Arrays.toString(result2));
            System.out.println("The result sorted ascending array: " + sortAscending(result2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please input 5 elements");
        }

        // Using fixed inputArray() method to accept any number of elements
        System.out.println();
        System.out.println("Input elements of array:");
        int[] result3 = inputArrayNew(7, 90, 23, 47, 22, 95, 34, 74, 23);
        System.out.println("The result array: " + Arrays.toString(result3));
        System.out.println("The result sorted ascending array: " + sortAscending(result3));
    }

    private static int[] inputArray(int... elements) {
        int[] array = new int[5];
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        return array;
    }

    // New Input Array method that accept any number of elements
    private static int[] inputArrayNew(int... elements) {
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        return array;
    }

    private static String sortAscending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }
}
