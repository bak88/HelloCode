package Исключения_в_программировании_и_их_обработка.seminars.seminar01;

//Задание №0
//Реализуйте метод, принимающий в качестве аргумента
//целочисленный массив.
//Если длина массива меньше некоторого заданного минимума,
//метод возвращает -1, в качестве кода ошибки, иначе - длину
//массива.

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите минимальную длину массива");
        int min = scanner.nextInt();

        System.out.println(getLength(arr, min));

    }

    public static int getLength(int[] arr, int min){
        if( arr.length < min){
            return -1;
        }
        return arr.length;
    }
}
