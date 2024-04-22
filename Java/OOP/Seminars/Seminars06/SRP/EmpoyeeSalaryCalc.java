package Java.OOP.Seminars.Seminars06.SRP;

public class EmpoyeeSalaryCalc {

    private double baseSalary;

    public EmpoyeeSalaryCalc(int badeSalary) {
        this.baseSalary = badeSalary;
    }

    public double salatyCalc(){
        return baseSalary * 1.5;
    }

    @Override
    public String toString() {
        return "EmpoyeeSalaryCalc{" +
                "baseSalary=" + salatyCalc() +
                '}';
    }
}
