package Java.DZ.CalculatorMVP.presenter;

import Java.DZ.CalculatorMVP.data.Model;
import Java.DZ.CalculatorMVP.data.Operation;
import Java.DZ.CalculatorMVP.logging.Log;
import Java.DZ.CalculatorMVP.logging.Logger;
import Java.DZ.CalculatorMVP.view.View;

public class Presenter {
    View view;
    Model model;
    Operation operation;

    public Presenter() {
        model = model;
        this.view = new View();
        this.operation = new Operation();
    }

    public void buttonClick() {

        Log log = new Logger();
        String text = "";
        String str = "";

        double a = view.getValue("Первое число -> ");
        double b = view.getValue("Второе число -> ");
        model = null;
        while (model == null) {
            str = view.getOperacion("Операция -> ");
            model = operation.Operation(str);
        }
        model.setX(a);
        model.setY(b);
        double result = model.result();
        text = log.getExpression(a, b, result, str);
        log.writeFile(text, "logging/file.txt");
        view.print(result, "Результат -> ");
    }
}
