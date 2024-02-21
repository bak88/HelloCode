package Java.Seminars.Seminar01;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
    

        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести
        // эти элементы в конец массива.
        // Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны от заданного, а остальные - равны ему.

        int[] arr = { 3, 2, 2, 3, 4, 6, 76, 3, 6, -13 };
        int val = 6;
        moveToEndElem(arr, val);
        System.out.println(Arrays.toString(arr));

    }

    private static void moveToEndElem(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        while (arr[right] == val) {
            right--;
        }

        while (left < right) {
            if (arr[left] == val) {
                arr[left] = arr[right];
                arr[right] = val;
                right--;

            }
            left++;
        }
    }
}