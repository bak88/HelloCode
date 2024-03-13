package Java.OOP.Lectures.Lectures03.Ex002.ExBeverage;

public abstract class Ingredient {

    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
