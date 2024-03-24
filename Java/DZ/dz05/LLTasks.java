package Java.DZ.dz05;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLTasks {
    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<>(Arrays.asList(1, "One", 2, "Two", 3));
        LinkedList<Object> reversLL = new LinkedList<>();
        System.out.println(ll);

        for (var i = ll.size() -1; i >= 0 ; i--) {
            reversLL.add(ll.get(i));
        }
        System.out.println(reversLL);
//        return reversLL;


        // Напишите свое решение ниже
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - i - 1));
            ll.set(size - i - 1, temp);
        }
    }
}
