package exercise.oop;

public class Employee {
    private String id;
    private String name;
    private Department department;
    private double salary = 10.5;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printBonus() {
        if (salary > 15) {
            System.out.println("Bonus: 1000");
        } else {
            System.out.println("Bonus: 500");
        }
    }
}
