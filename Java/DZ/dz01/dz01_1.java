package Java.DZ.dz01;

import java.util.Scanner;

public class dz01_1 {
    public static void main(String[] args) {

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle,
// который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        System.out.println(countNTriangle(n));
        scan.close();
    }

    public static int countNTriangle(int n) {

        int res = 0;
        if (n < 1)
            return -1;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }
}
