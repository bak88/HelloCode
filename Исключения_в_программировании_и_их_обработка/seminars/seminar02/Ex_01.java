package Исключения_в_программировании_и_их_обработка.seminars.seminar02;

//Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и
//обоснуйте свое решение.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Input index: ");
        int index = 0;
        // while (index > 9 || index < 0)
        try{
            index = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Вы ввели не целое число!");
        }
        try{
            arr[index] = 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива!");
        }
    }
}
