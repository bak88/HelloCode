package Java.OOP.Seminars.Seminars01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new HotDrink("Вода", 1,12, 20);
        Product product2 = new HotDrink("Газировка", 2,12, 25);
        Product product3 = new HotDrink("Минералка", 2.1,12, 23);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        hotDrinkMachine.initProducts(productList);
        System.out.println(hotDrinkMachine.getProduct("Вода", 12, 20));


    }
}




