package Java.DZ.Toyshop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ListToy {

    private List<Toy> toyList;

    public ListToy() {
        toyList = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toyList.add(toy);
    }


    public void writeFile() {

        Random random = new Random();

        try (FileWriter fileWriter = new FileWriter("toy.txt", true)) {
            for (int i = 0; i < 1; i++) {

                int rand = random.nextInt(1, 101);

                if (rand <= 20) {
                    for (Toy toy : toyList) {
                        if (toy.getId() == 1) {
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }
                } else if (rand > 21 && rand <= 40) {
                    for (Toy toy : toyList) {
                        if (toy.getId() == 2) {
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }
                } else {
                    for (Toy toy : toyList) {
                        if (toy.getId() == 3) {
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }
                }
                fileWriter.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ListToy "+ toyList;
    }
}


