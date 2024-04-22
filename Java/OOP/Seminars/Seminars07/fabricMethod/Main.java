package Java.OOP.Seminars.Seminars07.fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemGen> gens = new ArrayList<>();
        gens.add(new GoldGen());
        gens.add(new GemGen());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            IGameItem item = gens.get(Math.abs(random.nextInt() % gens.size())).createItem();
            item.open();
        }
    }
}
