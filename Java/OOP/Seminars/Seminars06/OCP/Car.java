package Java.OOP.Seminars.Seminars06.OCP;

public class Car extends Vehilce{

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.8;
    }
}
