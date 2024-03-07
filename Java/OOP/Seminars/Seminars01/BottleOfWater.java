package Java.OOP.Seminars.Seminars01;

public class BottleOfWater extends Product{

    private double volume;

    public BottleOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name=%s, cost=%.0f, volume=%.0f", super.getName(), super.getCost(), volume);
    }
}
