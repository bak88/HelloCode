package Java.DZ.CalculatorMVP;

import Java.DZ.CalculatorMVP.data.AdditionModel;
import Java.DZ.CalculatorMVP.data.SubtractionModel;
import Java.DZ.CalculatorMVP.presenter.Presenter;
import Java.DZ.CalculatorMVP.view.View;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter();
        p.buttonClick();
        p.buttonClick();
    }
}
