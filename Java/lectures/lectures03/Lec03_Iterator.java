package Java.lectures.lectures03;

import java.util.Iterator;
import java.util.List;



public class Lec03_Iterator {
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1, 23, 321, 456,234234);

        // for (int item : list) {
        //     System.out.println(item);
        // }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
            
        }

    }
}
