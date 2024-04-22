package Java.DZ.CalculatorMVP.data;

public class Operation {

    public Model Operation(String symbol){
        switch (symbol){
            case "+":
                return new AdditionModel();
            case "-":
                return new SubtractionModel();
            case "/":
                return new DivisionModel();
            case "*":
                return new MultiplicationModel();
        }
        return null;
    }

}
