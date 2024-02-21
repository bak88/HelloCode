package Java.lectures.lectures03;

import java.util.ArrayList;

public class Lec03_ArrayList {
    public static void main(String[] args) {

// Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2356);

        for (int el : list) {
            System.out.println(el);
            
        }
    }
}
