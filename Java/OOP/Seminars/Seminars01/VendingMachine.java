package Java.OOP.Seminars.Seminars01;

import java.util.List;

public interface VendingMachine {



    void initProducts(List<Product> listProduct) ;

    Product getProduct(String name);

}
