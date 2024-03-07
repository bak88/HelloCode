package Java.OOP.Seminars.Seminars01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new BottleOfWater("zxc", 4,12);
        Product product2 = new BottleOfWater("adafd", 4,12);
        Product product3 = new BottleOfWater("qwe", 4,12);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        VendingMachineBottleOfWater vendingMachine = new VendingMachineBottleOfWater();
        vendingMachine.initProducts(productList);
        System.out.println(vendingMachine.getProduct("zxc", 12));


    }
}




