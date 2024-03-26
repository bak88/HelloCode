package Java.DZ.Laptop;


import java.util.*;

public class MainLaptop {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asus", 15.6, "Windows", 16, 512);
        Laptop laptop2 = new Laptop("Asus", 15.6, "Windows", 16, 512);
        Laptop laptop3 = new Laptop("Samsung", 17, "Windows", 32, 1000);
        Laptop laptop4 = new Laptop("Samsung", 17, "Windows", 32, 1000);
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

        for (var laptop : laptopSet) {
            System.out.println(laptop);
        }

        System.out.println();
        laptopSearch(laptopSet);
    }

    public static void laptopSearch(Set<Laptop> laptopSet) {
        Map<Integer, String> search = new HashMap<>();
        search.put(1, "ОЗУ");
        search.put(2, "Модель");
        search.put(3, "ОС");
        search.put(4, "Объем ЖД");
        search.put(5, "Диагональ экрана");

        Scanner scan = new Scanner(System.in);

        System.out.println("1: ОЗУ");
        System.out.println("2: Модель");
        System.out.println("3: ОС");
        System.out.println("4: Объем ЖД");
        System.out.println("5: Диагональ экрана");
        System.out.println();
        System.out.println("Выберите критерий сортировки: ");

        int enterNumber = 0;

        if (scan.hasNextInt()) {
            enterNumber = scan.nextInt();
            while (enterNumber < 1 || enterNumber > 5) {
                System.out.println("Некорректный ввод. Введите правильный критерий: ");
                enterNumber = scan.nextInt();
            }
        } else {
            System.out.println("Некорректный ввод. Перезапустите программу");
        }

        String str = search.get(enterNumber);

        switch (str) {
            case "ОЗУ":
                System.out.println("Выберите объём ОЗУ: ");
                int ram = scan.nextInt();

                for (Laptop el : laptopSet) {
                    if (el.getRam() >= ram) {
                        System.out.println(el);
                    }
                }
                break;

            case "Модель":
                System.out.println("Выберите модель: ");
                scan.nextLine();
                String model = scan.nextLine();

                for (Laptop el : laptopSet) {
                    if (el.getModelName().equalsIgnoreCase(model)) {
                        System.out.println(el);
                    }
                }
                break;

            case "ОС":
                System.out.println("Выберите ОС: ");
                scan.nextLine();
                String OS = scan.nextLine();

                for (Laptop el : laptopSet) {
                    if (el.getOperatingSystem().equalsIgnoreCase(OS)) {
                        System.out.println(el);
                    }
                }
                break;

            case "Объем ЖД":
                System.out.println("Выберите объём Ж.Д.: ");
                int volume = scan.nextInt();

                for (Laptop el : laptopSet) {
                    if (el.getStorageCapacity() >= volume) {
                        System.out.println(el);
                    }
                }
                break;

            case "Диагональ экрана":
                System.out.println("Выберите диагональ экрана: ");
                double diagonal = scan.nextDouble();

                for (Laptop el : laptopSet) {
                    if (el.getScreenDiagonal() >= diagonal) {
                        System.out.println(el);
                    }
                }
                break;

        }
    }
}



