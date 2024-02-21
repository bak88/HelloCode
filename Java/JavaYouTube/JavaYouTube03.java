package Java.JavaYouTube;

import java.util.Scanner;

public class JavaYouTube03 {
    public static void main(String[] args) {

        //  Данные от пользователя. Математические действия

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1 number: ");
        float num1 = scan.nextFloat();
        System.out.println("Enter 2 number: ");
        float num2 = scan.nextFloat();
        scan.close();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Result: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + '\n' + res4);
    }
}
