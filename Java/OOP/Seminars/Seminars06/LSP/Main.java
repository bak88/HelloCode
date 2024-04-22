package Java.OOP.Seminars.Seminars06.LSP;

//Liskov substitution Principle - принцип подстановки Барбары Лисков.
//Должна быть возможность вместо базового (родительского) типа (класса) подставить любой его подтип (класс-наследник),
//при этом работа программы не должна измениться.

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        square.area();
        System.out.println(square);
    }
}
