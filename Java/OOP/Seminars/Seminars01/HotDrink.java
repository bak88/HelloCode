package Java.OOP.Seminars.Seminars01;

public class HotDrink extends BottleOfWater {

    private int temperature;

    public HotDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("name=%s, cost=%.0f, volume=%.0f, temperature=%d",
                super.getName(), super.getCost(), super.getVolume(), temperature);
    }
}
