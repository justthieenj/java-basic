import java.util.*;

public class RunTest {
    public static void main(String[] args) {
        List<Integer> unmodifiableList = List.of(6, 4, 2, 71, 54);
        List<Integer> list = new ArrayList<>(unmodifiableList);
        list.sort(Comparator.reverseOrder());
        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
