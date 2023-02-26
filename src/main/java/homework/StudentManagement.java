package homework;

import java.util.Comparator;

public class StudentManagement {
    public static void main(String[] args) {

        ComputerScience pete = new ComputerScience("Pete", "Computer Science", 90.5, 80.25, 90.75);
        ComputerScience sara = new ComputerScience("Sara", "Computer Science", 46.25, 80.25, 86.5);
        Business frank = new Business("Frank", "Business", 70, 80.25, 70.75);
        Business lily = new Business("Lily", "Business", 99, 50.5, 33.5);

        for (Student student : Student.studentList) {
            student.printStudentInfo();
        }

        System.out.println("Students with Good performance: ");
        for (Student student : Student.studentList) {
            if (student.getPerformance().equals("Good")) {
                System.out.println(student.name);
            }
        }
        System.out.println();

        System.out.println("Sort the students by their grade:");

        Student.studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : Student.studentList) {
            System.out.println("Name: " + student.name);
            System.out.println("Grade: " + student.getGrade() + "\n");
        }
    }
}