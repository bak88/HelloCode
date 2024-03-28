package Java.OOP.Seminars.Seminars06.OCP;

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(100);
        Car car = new Car(100);
        Vehilce ship = new Vehilce(100, "Ship");

        print(bus);
        print(car);
        print(ship);
    }
    public static void print(Vehilce vehilce) {
        System.out.println(vehilce);
    }
}
