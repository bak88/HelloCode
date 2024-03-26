package Java.DZ.dz04;

import java.util.ArrayList;
import java.util.Arrays;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Integer[] arr = {-2, -1, 0, 123, 9, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
        int res = 0;


        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (max < arr[i]){
                max = arr[i];
            } else if ( min > arr[i]) {
                min = arr[i];
            }
        }
        double aver = 1.0 * res / arr.length;

        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
        System.out.printf("Minimum is %d\n", min);
        System.out.printf("Maximum is %d\n", max);
        System.out.printf("Average is = %.1f\n", aver);




    }
}
