package Java.OOP.Seminars.Seminars07.decorator;

public class PeperoniDecorator extends  PizzaDecorator{

    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , пепперони ";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
