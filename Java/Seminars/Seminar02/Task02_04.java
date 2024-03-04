package Java.Seminars.Seminar02;


import java.io.FileWriter;

public class Task02_04 {
    public static void main(String[] args) {

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

        int repeat = 100;
        String word = "Hi";
        String str = repeatWord(word, repeat);
        writeToFile(str, "C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\Seminars\\Seminar02\\text.txt");
    }

    public static String repeatWord(String word, int repeat) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(i).append(word).append(" ");
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
            System.out.println("Данные успешно записаны в файл");
        } catch (Exception e) {
            System.err.println("Ошибка записи файла");
        }

    }
}
