package Java.JavaYouTube.Transport;

public class Car extends Transport {

    public Car(float _speed, int _weight, String _color, byte[] _coordinate) {
        super(_speed, _weight, _color, _coordinate);

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Скорость обьекта: " + speed);
    }
}
