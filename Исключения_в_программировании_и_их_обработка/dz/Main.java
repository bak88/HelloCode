package Исключения_в_программировании_и_их_обработка.dz;

//    Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//    Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//    детализировать какие строки со столбцами не требуется.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[2][4];

        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(3);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        getMatrix(matrix);
    }


    public static void getMatrix(int[][] matrix) {

        int countRows = 0;
        int countColumns = 0;

        for (int k = 0; k < matrix.length ; k++) {

            if (matrix[k][k] != 0) {
//                System.out.print(matrix[k][k] + " ");

                for (int i = 0; i < matrix.length ; i++) {
                    if (matrix[i][k] != 0) {
//                        System.out.print(matrix[i][k] + " ");
                        countRows++;
                    }
                }

                for (int j = 0; j < matrix[k].length; j++) {
                    if (matrix[k][j] != 0) {
//                        System.out.print(matrix[k][j] + " ");
                        countColumns++;
                    }
                }

                if (countRows == countColumns) {
                    System.out.println(k);
                }
                countRows = 0;
                countColumns=0;
            }

        }
    }


}
