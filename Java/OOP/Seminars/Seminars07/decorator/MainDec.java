package Java.OOP.Seminars.Seminars07.decorator;

//Структурный паттерн, расширяет объект новой
//функциональностью не используя наследование

public class MainDec {

    public static void main(String[] args) {
        Pizza pizza = new PeperoniDecorator(new CheeseDecorator(new PizzaDough()));
        printPizza(pizza);
    }
    public static void printPizza(Pizza pizza) {
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }
}
