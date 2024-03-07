package Java.OOP.Seminars.Seminars01;

import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<Product> productList;

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
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

    public Product getProduct(String name, double volume){
        for (Product product : productList){
            if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume){
                return product;
            }
        }
        return null;
    }
}
