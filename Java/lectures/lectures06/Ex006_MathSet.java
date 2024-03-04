package Java.lectures.lectures06;

import java.util.Arrays;
import java.util.HashSet;

public class Ex006_MathSet {
    public static void main(String[] args) {

        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 6, 11, 13, 17));

        var unionOfSets = new HashSet<Integer>(a);
        unionOfSets.addAll(b); // объединение множеств
        System.out.println(unionOfSets);

        var intersectionSets = new HashSet<Integer>(a);
        intersectionSets.retainAll(b); // пересечение множеств
        System.out.println(intersectionSets);

        var differenceSets = new HashSet<Integer>(a);
        differenceSets.removeAll(b); // разность множеств
        System.out.println(differenceSets);
    }
}
