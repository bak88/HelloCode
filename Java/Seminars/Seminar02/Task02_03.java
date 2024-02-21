package Java.Seminars.Seminar02;

public class Task02_03 {
    public static void main(String[] args) {

        // Напишите метод, который принимает на вход строку (String) и
        // определяет является ли строка палиндромом (возвращает
        // boolean значение).

        String str = "qwertrewq";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i -1)){
                return false;
            }
        }
        return true;
    }
}
