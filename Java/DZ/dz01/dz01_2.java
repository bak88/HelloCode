package Java.DZ.dz01;

public class dz01_2 {
    public static void main(String[] args) {
        
        // Напишите прграмму которая выведет на экран все простые числа 
        // в промежутке от 1 до 100, каждое на новой строке.
        
        int n = 100;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true; // Если число простое будет true
            for (int j = 2; j <= Math.sqrt(i); j++) { // 2ой цикл сравниваем j с квадратным корнем i
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
