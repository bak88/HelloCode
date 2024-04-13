package Исключения_в_программировании_и_их_обработка.seminars.seminar01;

//Задание №1
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//например:
//1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
//качестве кода ошибки.
//2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//3. если вместо массива пришел null, метод вернет -3
//4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//коды ошибок.
//Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
//метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
//значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.*;

public class Ex_02 {
    public static void main(String[] args) {
        userInterface();
    }

    public static int getLength(int[] arr, int min, int findNum) {
        int index = 0;
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        boolean isFind = false;


        for (int i = 0; i < arr.length; i++) {

            if (findNum == arr[i]) {
                index = i;
                isFind = true;
                break;
            }
        }
        if (!isFind){
            return -2;
        } else {
            return index;
        }

    }

    public static void userInterface() {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Введите минимальную длину массива");
        int min = scanner.nextInt();

        System.out.println(Arrays.toString(arr));
        int findNumber = rand.nextInt(11, 19);
        System.out.println("Искомое значение: " + findNumber);

        int findNum = getLength(arr, min, findNumber);

        if (findNum == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (findNum == -3) {
            System.out.println("Массива нет");
        } else if (findNum == -1) {
            System.out.println("Массив меньше указанной длины");
        } else {
            System.out.println("Индекс: " + findNum);
        }

    }
}
