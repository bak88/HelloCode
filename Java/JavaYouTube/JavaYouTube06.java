package Java.JavaYouTube;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaYouTube06 {
    public static void main(String[] args) {
        
        // Коллекции в  ArrayList лучше для добавления и работы с эл-ми

        ArrayList<Byte> numbers = new ArrayList<>();
        numbers.add((byte) 5); // Функция add добавляет число в массив, надо прописывать тип данных если это не Integer
        numbers.add((byte) 50);
        numbers.add(1, (byte) 30); // Функция add добавляет число в массив, 1 индекс 30 число

        // System.out.println(numbers.size()); // Функция size указывает длинну коллекции
        System.out.println(numbers.get(1)); // Функция get Выводит эл-нт по индексу
        numbers.remove(1); // Функция remove удаляет эл-нт по индексу
        // numbers.clear(); // Функция clear полностью удаляет весь список


        for(Byte num : numbers){ //  num, el, i - можно указать любое название
            System.out.println(num);
        }


        // Коллекции в  LinkedList лучше для частого удаления или вставления эл-та


        LinkedList<Float> element = new LinkedList<>();
        element.add(5.6f);
        element.add(12.6f);
        element.add(518.6f);

        for(Float el : element){
            System.out.println(el);
        }


    }
}
