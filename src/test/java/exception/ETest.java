package exception;

import java.util.List;

public class ETest {
    public static void main(String[] args) throws Exception {
        generalException();
        throw new CustomException();
    }

    public static void generalException() {
        try {
            System.out.println("Hello World".charAt(100)); // StringIndexOutOfBoundsException
            var list = List.of("apple", "orange", "banana");
            for (int i = 0; i <= list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            System.out.println("error occurred");
        }
    }
}
