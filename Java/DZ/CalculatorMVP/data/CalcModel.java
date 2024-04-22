package Java.DZ.CalculatorMVP.data;

public abstract class CalcModel implements Model {
    double x, y;

    @Override
    public String toString() {
        return "CalcModel{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
