package Java.DZ.dz04;


import java.util.ArrayList;
import java.util.Arrays;


public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Integer[] arr = {-2, -1, 0, 1, 2, 3, 4, 5};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> sortList = new ArrayList<>();


        for (int i = 0; i < arrList.size(); i++) {
            if (Math.abs(arrList.get(i)) % 2 == 1) {
                sortList.add(arrList.get(i));

            }
        }

        System.out.println(sortList);
    }
}
