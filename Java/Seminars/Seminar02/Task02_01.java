package Java.Seminars.Seminar02;

public class Task02_01 {
    public static void main(String[] args) {

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
        
        int n = 100;
        char c1 = 'a';
        char c2 = 'b';

        // ababababab
        long start = System.currentTimeMillis();
        getAlternatingCharsString(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getAlternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String getAlternatingCharsString(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String getAlternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }

}