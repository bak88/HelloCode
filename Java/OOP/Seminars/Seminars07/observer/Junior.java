package Java.OOP.Seminars.Seminars07.observer;

import java.util.Random;

public class Junior implements Observer {

    String name;
    int salary;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.printf("Junior %s: I accept the offes! (company, salay) = %s, %d%n", name, nameCompany, salary);
        } else {
            System.out.printf("Junior %s: Ok. I don`t accept the offer! (company, salay) = %s, %d%n", name, nameCompany, salary);
        }
    }
}
