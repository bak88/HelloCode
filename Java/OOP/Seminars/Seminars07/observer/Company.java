package Java.OOP.Seminars.Seminars07.observer;

import java.util.Random;

public class Company {
    Publisher jobAgency;
    String nameCompany;
    int maxSalary;
    Random random;

    public Company(Publisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        random = new Random();
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }


}
