package homework;

public class Feb17 {
    /*
     1. Create a Student class that has 2 fields name and major
     and an abstract methods call: getGrade() because we don't know that student takes what course.
     A normal method call: getPerformance() that returns a String
     - if the grade is 90 or above return "Excellent"
     - if the grade is 80 or above return "Good"
     - if the grade is 70 or above return "Average"
     - if the grade is 60 or above return "Poor"
     - if the grade is below 60 return "Fail"
     And printStudentInfo() that prints the student name, major, grade and performance
     Note: Student should be an abstract class

    2. Create a ComputerScience class that extends Student class
    and has fields: javaGrade, pythonGrade, databaseGrade
    and override the getGrade() method to return the average of the 3 grades above
    Create a constructor that takes name, major, javaGrade, pythonGrade, databaseGrade

    3. Create a Business class that extends Student class
    and has fields: accountingGrade, financeGrade, marketingGrade
    and override the getGrade() method to return the average of the 3 grades above
    Create a constructor that takes name, major, accountingGrade, financeGrade, marketingGrade

    4. Create a StudentManagement class that has a main method
    and create 2 ComputerScience and 2 Business objects and initialize them with your own data
    use a for loop to print the student info
    print students with "Good" performance
    sort the students by their grade and print them out
     */
}
