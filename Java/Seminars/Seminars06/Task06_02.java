package Java.Seminars.Seminars06;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными
//цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
//помощью Set вычислите процент уникальных значений в данном массиве и
//верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее
//количество чисел в массиве.

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task06_02 {
    public static void main(String[] args) {
        int size = 1000;
        int maxValue = 500;
        int[] array = fillArray(size, maxValue);
        double res = calculateUnicPersent(array);
        System.out.println(res);
    }

    public static int[] fillArray(int size, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max);
        }
        return arr;
    }

    public static double calculateUnicPersent(int[] arr) {
        Set<Integer> setUnic = new HashSet<>();
        for (int elem : arr) {
            setUnic.add(elem);
        }
        return (double) setUnic.size() * 100 / arr.length;
    }
}
