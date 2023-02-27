package datatype;

import oop.Person;

import java.util.*;

public class ListSetMap {
    public static void main(String[] args) {
        var matthew = new Person("Matthew", 23, "male");
        var lucy = new Person("Lucy", 19, "female");
        var tony = new Person("Tony", 22, "female");
        // Map
        Map<String, Person> map = new HashMap<>(); // empty map
        map.put("person1", matthew);
        map.put("person2", lucy);
        map.put("person3", tony);

//        Person p3 = map.get("person3"); // tony
//        for (Map.Entry<String, Person> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue().getName());
//        }

//        for (String k : map.keySet()) {
//            System.out.println(k + " : " + map.get(k).getName());
//        }

//        Map<String,String> map2; // null
//        System.out.println(map2.isEmpty());

//        testList(List.of(matthew, lucy, tony, matthew));
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(1);
//        testSet(numbers);
    }

    private static void testList(List<Person> list) {
        list.forEach(person -> System.out.println(person.getName()));
        boolean isCorrect = list.stream()
                .filter(p -> p.getAge() > 20)
                .filter(p -> p.getGender().equals("male"))
                .allMatch(p -> p.getName().startsWith("M"));
    }

    private static void testSet(Set<Integer> set) {
        set.forEach(System.out::println);
    }
}
