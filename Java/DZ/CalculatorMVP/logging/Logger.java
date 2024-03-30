package Java.DZ.CalculatorMVP.logging;

import Java.DZ.CalculatorMVP.data.AdditionModel;
import Java.DZ.CalculatorMVP.data.DivisionModel;
import Java.DZ.CalculatorMVP.data.MultiplicationModel;
import Java.DZ.CalculatorMVP.data.SubtractionModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Log{
    private File log;
    private FileWriter fw;

    @Override
    public void writeFile(String expression, String nameFile) {
        log = new File("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\DZ\\CalculatorMVP\\logging", "file.txt");
        try (FileWriter fw = new FileWriter("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\DZ\\CalculatorMVP\\logging\\file.txt", true)) {
            fw.write(expression + ";");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String getExpression(double x, double y, double result, String operation) {
        return String.format("%s %s %s = %s", x, operation, y, result);
    }
}
