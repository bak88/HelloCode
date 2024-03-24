package Java.DZ.dz05;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {

    public Deque<Double> resStack = new ArrayDeque<>();
    public double prevResult;

    // меняйте тип на double, в тесте стоит int
    public double calculate(char op, int a, int b) {
        if (op == '<') {
            if (resStack.size() >= 2) {
                prevResult = resStack.getLast();
            }
            return prevResult;
        } else {
            double result = performOperation(op, a, b);
            resStack.push(result);
            prevResult = result;
            return result;
        }
    }

    private double performOperation(char op, int a, int b) {

        double res = 0;

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        return res;
    }

}


public class PrinterCalculator {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b); // меняйте тип на double, в тесте стоит int
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d); // меняйте тип на double, в тесте стоит int
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0); // меняйте тип на double, в тесте стоит int
        System.out.println(prevResult);


    }
}