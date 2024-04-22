package Java.OOP.Seminars.Seminars06.DIP;

//Dependency Inversion Principle - принцип инверсии зависимостей.
//Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
//И те, и другие должны зависеть от абстракции.
//Абстракции не должны зависеть от деталей.
//Детали должны зависеть от абстракций.

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.start();
        Car car1 = new Car(new PetrolEngine());
        car1.start();
    }
}
