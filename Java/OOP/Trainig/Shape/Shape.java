package Java.OOP.Trainig.Shape;

abstract class Shape {

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    public void printInfo(){
        System.out.printf("Цвет = %s, Площадь = %.1f, Периметр = %.1f",
                        color, getArea(), getPerimeter());
    }
}
