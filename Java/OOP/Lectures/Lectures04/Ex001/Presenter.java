package Java.OOP.Lectures.Lectures04.Ex001;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClick(){
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        view.print(result, "Sum: ");
    }
}
