package Java.lectures.lectures06;

import java.util.HashSet;
import java.util.Set;

public class Ex006_HashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(21);
        set.add(14);
        set.add(123);
        set.add(88);
        set.add(88);
        System.out.println(set.contains(14));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(21);

        for (var el : set){ // Используем var т.к. есть значение null
            System.out.println(el);
        }

        set.clear();
        System.out.println(set);


    }
}
