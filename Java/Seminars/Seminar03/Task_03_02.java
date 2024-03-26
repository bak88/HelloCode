package Java.Seminars.Seminar03;
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() класса Collections и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_03_02 {

    public static void main(String[] args) {
        int size = 10;
        int max = 20;
        ArrayList<Integer> arrayList = randomArrayList(size, max);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> randomArrayList(int size, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arrayList.add(rand.nextInt(max));
        }
        return arrayList;
    }
}
