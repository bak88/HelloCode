package Java.Seminars.Seminar02;

public class Task02_02 {
    public static void main(String[] args) {
        
        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd.
        // результат a4b3c1d2.

        String str = "aaaabbbcdd";

        System.out.println(compressString(str));

    }

    public static String compressString(String str){

        StringBuilder res = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == currentChar){
                count++;
            } else {
                res.append(currentChar).append(count);
                count = 1;
                currentChar = str.charAt(i);

            }
            
        } res.append(currentChar).append(count);
        return res.toString();

    } 
}
