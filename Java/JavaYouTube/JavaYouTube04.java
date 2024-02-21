package Java.JavaYouTube;

import java.util.Scanner;

public class JavaYouTube04 {
    public static void main(String[] args) {

        // Условные конструкции (if-else, switch-case)

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Введите роль: ");
        // String role = scan.nextLine();
        // System.out.print("Введите пароль: ");
        // String pass = scan.nextLine();
        // if (role.equals("Admin") && pass.equals("12345")) { // метод equals проверяет
        // строку на заданное значение
        // System.out.println("Все пользователи");
        // } else {
        // System.out.println("Привет, как вас зовут?");
        // String name = scan.nextLine();
        // }
        // scan.close();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter is number 1: ");
        int num1 = scan.nextInt();

        System.out.println("Action: ");
        String action = scan.nextLine();
        action = scan.nextLine();

        System.out.println("Enter is number 2: ");
        int num2 = scan.nextInt();

        double res;
        


        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                    break;
                }
        }
        scan.close();
        
    }
}

