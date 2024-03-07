package Java.OOP.Lectures.Lectures01.Ex002;

public class Program {

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(10);
        System.out.println(b);




    }
}
