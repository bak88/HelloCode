package Java.lectures.lectures03;

public class Lec03_Object_Arr {
    public static void main(String[] args) {

        int[] a = new int[] {2, 6};

        for (int i : a) {
            System.out.printf("%d ", i);            
        }
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        System.out.println();

        for (int j : a) {
            System.out.printf("%d ", j);
        }
    }

    static int[] AddItem(int[] arr, int item){
        int len = arr.length;
        int[] temp = new int[len + 1];
        System.arraycopy(arr, 0, temp, 0, len);
        temp[len] = item;
        return temp;
        
        // System.arrayCopy(from, fromIndex, to, toIndex, count);
        // from - массив, который копируем
        // fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        // to - массив в которой копируем
        // toIndex - индекс в массиве to начиная с которого вставляем элементы
        // count - количество элементов которые берем из массива from и вставляем в массив to
        // Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
    }
}
