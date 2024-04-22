package Java.OOP.Seminars.Seminars06.ISP;

//Interface Segregation Principle - принцип разделения интерфейсов.
//Данный принцип обозначает, что не нужно заставлять клиента (класс)
//реализовывать интерфейс, который не имеет к нему отношения.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cube cube = new Cube(3);
        circle.perimetr();
        cube.perimetr();
        System.out.println(circle);
        System.out.println(cube);
    }
}
