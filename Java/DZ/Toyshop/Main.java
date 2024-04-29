package Java.DZ.Toyshop;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ListToy listToy = new ListToy();

        Toy toy1 = new Toy(1, "Конструктор", 2, 20);
        Toy toy2 = new Toy(2, "Робот", 2, 20);
        Toy toy3 = new Toy(3,"Кукла", 6, 60);

        listToy.addToy(toy1);
        listToy.addToy(toy2);
        listToy.addToy(toy3);

        listToy.writeFile();
        listToy.writeFile();
        listToy.writeFile();
        listToy.writeFile();
        listToy.writeFile();

    }
}
