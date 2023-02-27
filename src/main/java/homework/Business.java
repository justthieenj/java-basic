package homework;

public class Business extends Student {
    private double accountingGrade;
    private double financeGrade;
    private double marketingGrade;

    public Business(String name, String major, double accountingGrade, double financeGrade, double marketingGrade) {
        this.name = name;
        this.major = major;
        this.accountingGrade = accountingGrade;
        this.financeGrade = financeGrade;
        this.marketingGrade = marketingGrade;
        studentList.add(this);
    }

    @Override
    double getGrade() {
        return Math.floor(((accountingGrade + financeGrade + marketingGrade) / 3) * 100) / 100;
    }
}

