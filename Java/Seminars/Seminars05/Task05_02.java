package Java.Seminars.Seminars05;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
//и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//некоторую букву во втором слове, при этом
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//порядка следования. (Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true
public class Task05_02 {
    public static void main(String[] args) {

        String one = "paper";
        String two = "title";

        System.out.println(isIsomorphic(one, two));

    }

    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();

        for (int i = 0; i < str1.length(); i++) {
            char charStr1 = str1.charAt(i);
            char charStr2 = str2.charAt(i);
            if (map.containsKey(charStr1)) {
                if (map.get(charStr1) != charStr2) {
                    return false;
                }

            } else {
                map.put(charStr1, charStr2);
            }
        }
        return true;
    }
}
