package Исключения_в_программировании_и_их_обработка.seminars.seminar01;

public class Ex_04 {
    public static void main(String[] args) {
        Integer[] arr = {12, -23, 56, 2, null, 0, null, -1};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null)
                System.out.println("Найден элемент null на индекске " + i);
        }
    }
}
