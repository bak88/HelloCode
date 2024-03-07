package Java.OOP.Seminars.Seminars01;

import java.util.List;

public class HotDrinkMachine implements VendingMachine{

    private List<Product> productList;

    @Override
    public void initProducts(List<Product> hotProductList) {
        this.productList = hotProductList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }


    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList){
            if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume
            && ((HotDrink)product).getTemperature() == temperature){
                return product;
            }
        }
        return null;
    }
}
