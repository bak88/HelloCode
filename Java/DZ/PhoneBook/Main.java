package Java.DZ.PhoneBook;

import java.util.*;
import java.util.stream.Collectors;

class PhoneBook {

    private static Map<String, ArrayList<Integer>> phoneBook = new TreeMap<>();

    public void addPhone(String name, Integer phoneNum) {
        ArrayList<Integer> phoneList = new ArrayList<Integer>();

        if (phoneBook.containsKey(name)) {
            phoneList = phoneBook.get(name);
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        } else {
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }

    }

    public static Map<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public void sortPrint(){
        var values = phoneBook.values();
        System.out.println(values);

    }

    public void creatNewMap(){
        Map<String, Integer> newMap= new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for(Map.Entry user : phoneBook.entrySet()){
            newList = (ArrayList<Integer>) user.getValue();
            newMap.put((String) user.getKey(), newList.size());
        }
        Map<String, Integer> sortedMap = newMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                LinkedHashMap::new));
        System.out.println(newMap);
        System.out.println(sortedMap);
    }

    @Override
    public String toString() {
        return  phoneBook + "";
    }
}
public class Main {
    public static void main(String[] args) {
        String name1 = "Bob";
        String name2 = "Jack";
        String name3 = "Andy";

        int phone1 = 123124314;
        int phone2 = 124343;
        int phone3 = 125;

        PhoneBook mainBook = new PhoneBook();

        mainBook.addPhone(name3, phone1);
        mainBook.addPhone(name3, phone2);
        mainBook.addPhone(name2, phone3);
        mainBook.addPhone(name2, phone2);
        mainBook.addPhone(name3, phone3);
        mainBook.addPhone(name1, phone1);
        mainBook.addPhone(name1, phone2);
        mainBook.addPhone(name1, phone3);
        ;

        System.out.println(mainBook);
        mainBook.sortPrint();
        mainBook.creatNewMap();


    }
}

