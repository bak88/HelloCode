package Java.DZ.dz03;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Java.DZ.dz03.Loger.sort;

public class Loger {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        log = new File("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\DZ\\dz03", "file.txt");

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\DZ\\dz03\\file.txt", false)) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buf;

                    }
                }
                fileWriter.write(formater.format(date) + " " + Arrays.toString(mas) + "\n");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 8, 1, 6, 10};

        sort(arr);

    }
}
