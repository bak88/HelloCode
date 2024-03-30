package Java.OOP.Seminars.Seminars06.LSP;

public class Square extends QuadRangle{

    private int len;

    public Square(int len) {
        this.len = len;
    }

    @Override
    double area() {
        return len * len;
    }

    @Override
    public String toString() {
        return "Square {" +
                "len=" + area() +
                '}';
    }
}
