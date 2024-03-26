package Java.Seminars.Seminar01;

public class Task02 {
    public static void main(String[] args) {
        /*
         * Задача 2
         * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
         * максимальное количество подряд идущих 1.
         */

        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0 };

        int max = getRepeatOnes(arr);
        System.out.println(max);

    }

    private static int getRepeatOnes(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);

            } else {
                count = 0;
            }
        }
        return max;
    }
}