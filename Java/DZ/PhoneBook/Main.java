package Java.DZ.PhoneBook;

import java.util.*;


import static java.util.Map.Entry.comparingByValue;

class PhoneBook {

    private Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addPhone(String name, Integer phoneNum) {

        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phones = phoneBook.get(name);
            if (!phones.contains(phoneNum)) {
                phones.add(phoneNum);
            }
        } else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phoneNum);
            phoneBook.put(name, phones);
        }

    }

    public void sortBook() {
        List<Map.Entry<String, ArrayList<Integer>>> sorted = new ArrayList<>(phoneBook.entrySet());
        sorted.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, ArrayList<Integer>> entry : sorted) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public void printBook() {
        for (var item : phoneBook.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf(" %s: %s \n", item.getKey(), phones);
        }
    }


}

public class Main {
    public static void main(String[] args) {

        PhoneBook mainBook = new PhoneBook();

        mainBook.addPhone("Bob", 123124314);
        mainBook.addPhone("Bob", 124343);
        mainBook.addPhone("Bob", 125);
        mainBook.addPhone("Bob", 12132);
        mainBook.addPhone("Jack", 125);
        mainBook.addPhone("Jack", 124343);
        mainBook.addPhone("Andy", 123124314);
        mainBook.addPhone("Andy", 124343);
        mainBook.addPhone("Andy", 125);
        mainBook.addPhone("Andy", 12465);
        mainBook.addPhone("Andy", 12578637);


        mainBook.printBook();
        System.out.println("--------------");
        mainBook.sortBook();

    }
}

