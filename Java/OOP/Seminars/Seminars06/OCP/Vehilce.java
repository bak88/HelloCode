package Java.OOP.Seminars.Seminars06.OCP;

public class Vehilce {
    private int maxSpeed;
    private String type;

    public Vehilce(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehilce{" +
                "maxSpeed=" + calculateAllowedSpeed() +
                ", type='" + type + '\'' +
                '}';
    }
}
