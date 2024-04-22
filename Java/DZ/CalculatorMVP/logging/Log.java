package Java.DZ.CalculatorMVP.logging;

public interface Log {

    void writeFile(String expression, String nameFile);

    String getExpression(double x, double y, double result, String operation);
}
