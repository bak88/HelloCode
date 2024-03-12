package Java.OOP.Trainig.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 8);
        circle.printInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle("Green", 4, 4);
        rectangle.printInfo();
    }
}
