package Java.Seminars.Seminars06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainCat {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 6, "Черный");
        Cat cat4 = new Cat("Барсик", 6, "Черный");
        Cat cat2 = new Cat("Марсик", 4, "Белый");
        Cat cat5 = new Cat("Марсик", 4, "Белый");
        Cat cat3 = new Cat("Мурка", 2, "Серый");

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3));
        cats.add(cat4);
        cats.add(cat5);

        for(var cat : cats){
            System.out.println(cat);
        }

    }


}
