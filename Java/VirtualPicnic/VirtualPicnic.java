package Java.VirtualPicnic;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class VirtualPicnic {

    public static void main(String[] args) throws IOException {

        String result = Files.readString(Path.of("Java/VirtualPicnic/VirtualPicnic.txt"));

        getWordsCount(getCountWords(result));
        findLongWord(getCountWords(result));
        System.out.println("Общий список: " + getCountWords(result));

    }

    public static void getWordsCount(Map<String, Integer> mapCountVegetables) {

        int countWord = 0;
        for (Map.Entry<String, Integer> item : mapCountVegetables.entrySet()) {
            countWord += item.getValue();
        }
        System.out.println("Количество слов: " + countWord);
    }


    public static void findLongWord(Map<String, Integer> mapCountVegetables) {

        int longWord = 0;
        String nameLongWord = "";

        for (Map.Entry<String, Integer> item : mapCountVegetables.entrySet()) {
            if (item.getKey().length() > longWord) {
                longWord = item.getKey().length();
                nameLongWord = item.getKey();
            }
        }
        System.out.println("Самое длинное слово: " + nameLongWord + "\nКоличество букв: " + longWord);
    }


    public static Map<String, Integer> getCountWords(String filename) {

        String[] array = filename.split(" ");

        List<String> listVegetables = new ArrayList<>(List.of(array));

        Map<String, Integer> mapCountVegetables = new HashMap<>();

        for (String str : listVegetables) {
            if (mapCountVegetables.keySet().contains(str)) {
                mapCountVegetables.put(str, mapCountVegetables.get(str) + 1);
            } else {
                mapCountVegetables.put(str, 1);
            }
        }
        mapCountVegetables.remove("");

        return mapCountVegetables;
    }
}
