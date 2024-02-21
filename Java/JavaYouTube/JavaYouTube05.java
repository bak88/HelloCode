package Java.JavaYouTube;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaYouTube05 {
    public static void main(String[] args) {

        // Массивы данных


        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length Array: ");

        int n = scan.nextInt();

        int[] array = new int[n];

        scan.close();

        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(array));

        // int min = Arrays.stream(array).min().getAsInt();
        System.out.println("min = " + Arrays.stream(array).min().getAsInt());

        
        // Многомерный массив данных


        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                { 5, 7 },
                { 7, 3 },
                { 2, 0 }
        };

        nums[1][1] = 88;
        System.out.println(nums[1][1]);

    }
}
