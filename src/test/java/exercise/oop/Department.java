package exercise.oop;

public class Department {
    private String name;
    private int numOfEmployee;
    private int floor;

    public Department(String name, int numOfEmployee, int floor) {
        this.name = name;
        this.numOfEmployee = numOfEmployee;
        this.floor = floor;
    }

    public Department() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(numOfEmployee);
        System.out.println(floor);
    }
}
