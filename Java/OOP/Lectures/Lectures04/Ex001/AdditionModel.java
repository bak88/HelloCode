package Java.OOP.Lectures.Lectures04.Ex001;

public class AdditionModel extends CalcModel {

    public AdditionModel() {

    }

    @Override
    public double result() {
        return x + y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
}
