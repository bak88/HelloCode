package Java.OOP.Seminars.Seminars06.ISP;

public class Cube implements Shape, Shape3D{

    private int len;

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double perimetr() {
        return Math.pow(len, 6);
    }

    @Override
    public double volume() {
        return Math.pow(len, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "perimetr=" + perimetr() +
                " volume=" + volume() +
                '}';
    }
}
