package Java.OOP.Lectures.Lectures04.Ex001;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        Presenter a = new Presenter(new DiffModel(), new View());

        a.buttonClick();
    }
}
