package Java.OOP.Lectures.Lectures04.Ex001;

public class DivisionModel extends CalcModel {

    public DivisionModel() {

    }

    @Override
    public double result() {
        if (y == 0){
            return -1;
        } else {
            return x / y;
        }
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
