package Java.OOP.Seminars.Seminars06.SRP;

public class EmpoyeeSalaryCalc {
    private int baseSalary;

    public EmpoyeeSalaryCalc(int badeSalary) {
        this.baseSalary = badeSalary;
    }

    public double salatyCalc(){
        return baseSalary * 1.5;
    }
}
