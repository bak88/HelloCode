package Java.Seminars.Seminars05;
//Написать метод, который переведет число из римского формата записи в арабский.
//Например, MMXXIV = 2024
//'I', 1
//'V', 5
//'X', 10
//'L', 50
//'C', 100
//'D', 500
//'M', 1000


import java.util.HashMap;
import java.util.Map;

public class Task05_04 {
    public static void main(String[] args) {

        String inputData = "MMXXIV";
        System.out.println(convetToArabic(inputData));
    }

    public static Map<Character, Integer> getRomanArabicMap() {
        Map<Character, Integer> dictRomNum = new HashMap<Character, Integer>();
        dictRomNum.put('I', 1);
        dictRomNum.put('V', 5);
        dictRomNum.put('X', 10);
        dictRomNum.put('L', 50);
        dictRomNum.put('C', 100);
        dictRomNum.put('D', 500);
        dictRomNum.put('M', 1000);
        return dictRomNum;
    }

    public static int convetToArabic(String strNum) {

        Map<Character, Integer> dictRom = getRomanArabicMap();

        int resArabian = dictRom.get(strNum.charAt(strNum.length()-1));
        int prev = resArabian;

        for (int i = strNum.length()-2; i >=0 ; i--) {
            int curValue = dictRom.get(strNum.charAt(i));

            if (curValue < prev) {
                resArabian -= curValue;
            } else {
                resArabian += curValue;
            }
            prev = curValue;
        }
        return resArabian;
    }
}
