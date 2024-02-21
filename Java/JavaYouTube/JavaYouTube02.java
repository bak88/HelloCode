package Java.JavaYouTube;

public class JavaYouTube02 {
    public static void main(String[] args) {
        
        // Переменные и типы данных

        int age = 21; // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        System.out.println("Возраст: " + age);
        
        byte c = 127; // хранит целое число от -128 до 127 и занимает 1 байт
        System.out.println(c);

        short num = 128; // хранит целое число от -32768 до 32767 и занимает 2 байта
        System.out.println(num);

        long num3 = 1231; // хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        System.out.println(num3);

        float num1 = 14.88f; // хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        System.out.println(num1);

        double num2 = 16.66; // хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        System.out.println(num2);

        char ch = 'a'; // хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        System.out.println( ch);

        String userName = "Adolf";
        System.out.println(userName);

        boolean isHappy = true; // хранит значение true или false
        System.out.println(isHappy);


    }
}
