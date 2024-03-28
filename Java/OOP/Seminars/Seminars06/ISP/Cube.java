package Java.OOP.Seminars.Seminars06.ISP;

public class Cube implements Shape, Shape3D{

    private int len;

    @Override
    public double perimetr() {
        return len * 6;
    }

    @Override
    public double volume() {
        return len * 3;
    }
}
