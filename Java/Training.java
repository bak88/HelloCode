package Java;


import java.util.Arrays;

public class Training {

    public static void main(String[] args) {
        int[] array = {1, 5, 3};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        double res = sum / array.length;
        System.out.println(Arrays.stream(array).average().orElse(0));
    }


}






