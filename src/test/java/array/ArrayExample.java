package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 67, 8, 11};
        var result = getMax(arr);
        System.out.println(result);
    }

    // Write a method that takes an array of integers and return the maximum value
    public static int getMax(int[] arr) {
        int max = 0;
        for (int element : arr) {
            max = Math.max(max, element);
        }
        return max;
    }

    public static void list2() {
        List<Integer> list = List.of(10, 20, 30); // immutable list
//        List<Integer> list = Arrays.asList(10, 20, 30);
        list.add(40); // UnsupportedOperationException
        System.out.println(list);
    }

    public static void list1() {
        List<Integer> list = new ArrayList<>(); // empty list
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }

    public static void array() {
        int[] age = new int[3]; // 2. initialize an array
        age[0] = 10; // 3. assign a value to the array
        age[2] = 20;
        age[1] = 50;
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
