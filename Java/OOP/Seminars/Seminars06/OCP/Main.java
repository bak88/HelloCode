package Java.OOP.Seminars.Seminars06.OCP;

//Open closed Principle - принцип открытости-закрытости.
//Классы должны быть открыты для расширения, но закрыты для изменения.

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(100);
        Car car = new Car(100);
        Vehilce ship = new Vehilce(100, "Ship");

        System.out.println(bus);
        System.out.println(car);
        System.out.println(ship);
    }

}
