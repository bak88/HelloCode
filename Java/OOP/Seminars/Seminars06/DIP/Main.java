package Java.OOP.Seminars.Seminars06.DIP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.start();
        Car car1 = new Car(new PetrolEngine());
        car1.start();
    }
}
