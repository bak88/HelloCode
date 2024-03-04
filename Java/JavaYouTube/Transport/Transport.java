package Java.JavaYouTube.Transport;

public abstract class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){

        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);


    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;

    }

    public abstract void moveObject(float speed);

    protected void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }

    class Engine{

        private boolean isReady;
        private int km;

        public Engine(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

    }

}
