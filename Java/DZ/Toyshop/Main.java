package Java.DZ.Toyshop;

public class Main {
    public static void main(String[] args) {
        PriorityToyQueue priorityToyQueue = new PriorityToyQueue();

        priorityToyQueue.addToy(new Toy(1, "Конструктор", 2));
        priorityToyQueue.addToy(new Toy(2, "Робот", 2));
        priorityToyQueue.addToy(new Toy(3,"Кукла", 6));

        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
        priorityToyQueue.writeFile();
    }
}
