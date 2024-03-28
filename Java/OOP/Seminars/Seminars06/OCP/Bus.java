package Java.OOP.Seminars.Seminars06.OCP;

public class Bus extends Vehilce {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.6;
    }
}
