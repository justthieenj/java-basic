package homework;

import java.util.ArrayList;
import java.util.List;

abstract class Student {
    String name;
    String major;
    public static List<Student> studentList = new ArrayList<>();

    abstract double getGrade();

    public String getPerformance() {
        if (getGrade() >= 90) {
            return "Excellent";
        } else if (getGrade() >= 80) {
            return "Good";
        } else if (getGrade() >= 70) {
            return "Average";
        } else if (getGrade() >= 60) {
            return "Poor";
        } else {
            return "Fail";
        }
    }

    public void printStudentInfo() {
        System.out.println("Name:" + name);
        System.out.println("Major:" + major);
        System.out.println("Average grade: " + getGrade());
        System.out.println("Performance: " + getPerformance() + "\n");
    }
}
