package homework;

public class ComputerScience extends Student {

    private double javaGrade;
    private double pythonGrade;
    private double databaseGrade;

    public ComputerScience(String name, String major, double javaGrade, double pythonGrad, double databaseGrade) {
        this.name = name;
        this.major = major;
        this.javaGrade = javaGrade;
        this.pythonGrade = pythonGrad;
        this.databaseGrade = databaseGrade;
        studentList.add(this);
    }

    @Override
    double getGrade() {
        return Math.floor(((javaGrade + pythonGrade + databaseGrade) / 3) * 100) / 100;
    }
}
