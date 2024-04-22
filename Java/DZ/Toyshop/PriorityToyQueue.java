package Java.DZ.Toyshop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityToyQueue {

    private Queue<Toy> toyPriorityQueue;

    public PriorityToyQueue() {
        toyPriorityQueue = new PriorityQueue<>((a, b) -> b.getFrequency() - a.getFrequency());
    }

    public void addToy(Toy toy) {
        toyPriorityQueue.add(toy);
    }

    public void writeFile() {
        Random random = new Random();

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\DZ\\Toyshop\\toy.txt", true);

            for (int i = 0; i < 1; i++) {

                int rand = random.nextInt(100);
                Toy randToy = null;

                if (rand < 20) {
                    for (Toy toy : toyPriorityQueue) {
                        if (toy.getId() == 1) {
                            randToy = toy;
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }
                } else if (rand < 40) {
                    for (Toy toy : toyPriorityQueue) {
                        if (toy.getId() == 2) {
                            randToy = toy;
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }

                } else {
                    for (Toy toy : toyPriorityQueue) {
                        if (toy.getId() == 3) {
                            randToy = toy;
                            fileWriter.write("Id: " + toy.getId() + ", Name: " + toy.getName() + ", Frequency: " + toy.getFrequency() + ", Random: " + rand);
                            break;
                        }
                    }
                }
                fileWriter.append("\n");
                fileWriter.close();
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

}
