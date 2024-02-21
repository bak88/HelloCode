package Java.JavaYouTube;

public class JavaYouTube07 {
    public static void main(String[] args) {
        
        // Функция или метод

        // String str = "Hi";
        // info(str);

        short num = 7;
        int result = summa((short)5, num);
        info(String.valueOf(result));

        short num2 = 2;
        int result2 = summa((short)8, num2);
        info(String.valueOf(result2));
    }
    
    public static int summa(short a, short b){
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word){
        System.out.print(word);
        System.err.println("!");

    }


}
