package Java.DZ.Laptop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asus", 15.6, "Windows 11", 16, 512);
        Laptop laptop2 = new Laptop("Asus", 15.6, "Windows 11", 16, 512);
        Laptop laptop3 = new Laptop("Samsung", 17, "Windows 11", 32, 1000);
        Laptop laptop4 = new Laptop("Samsung", 17, "Windows 11", 32, 1000);
        Laptop laptop5 = new Laptop("Acer", 14, "Без ОС", 8, 256);
        Laptop laptop6 = new Laptop("Acer", 15.6, "Без ОС", 16, 512);
        Laptop laptop7 = new Laptop("Honor", 14, "Linux", 8, 512);

        Set<Laptop> laptopSet = new HashSet<>(Arrays.asList());
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);

        for (var laptop : laptopSet){
            System.out.println(laptop);
        }
    }
}
