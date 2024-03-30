package Java.OOP.Seminars.Seminars06.ISP;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimetr=" + perimetr() +
                '}';
    }
}
