package Java.OOP.Lectures.Lectures04.Ex001;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(double data, String title){
        System.out.printf("%s %.2f\n", title, data);
    }
}
