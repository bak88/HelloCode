package Java.OOP.Seminars.Seminars06.SRP;

// Single Responsibility Principle - принцип единственной ответственности.
// Каждый класс должен иметь только одну зону ответственности.

public class Main {
    public static void main(String[] args) {

        Empoyee empoyee = new Empoyee("Jack", "master", 2);
        EmpoyeeSalaryCalc empoyeeSalaryCalc = new EmpoyeeSalaryCalc(5);
        empoyeeSalaryCalc.salatyCalc();
        System.out.println(empoyeeSalaryCalc);
    }
}
