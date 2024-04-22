package Java.OOP.Lectures.Lectures04.Ex001;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new AdditionModel(), new View());
        Presenter a = new Presenter(new SubtractionModel(), new View());

        p.buttonClick();
    }
}
