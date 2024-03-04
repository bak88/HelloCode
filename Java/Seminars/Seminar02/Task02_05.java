package Java.Seminars.Seminar02;

import java.io.File;
import java.io.FileWriter;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


//📌 Напишите метод, который вернет содержимое текущей папки в виде
//массива строк.
//📌 Напишите метод, который запишет массив, возвращенный предыдущим
//методом в файл.
//📌 Обработайте ошибки с помощью try-catch конструкции. В случае
//    возникновения исключения, оно должно записаться в лог-файл.
public class Task02_05 {
    private static Logger logger = Logger.getLogger(Task02_05.class.getName());
    public static void main(String[] args) {
        configLogger();
        String[] contentFolder = getContentFolder(".");
        writeToFile(contentFolder, "C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\Seminars\\Seminar02\\text1.txt");

    }

    public static String[] getContentFolder(String folderName) {

        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeToFile(String[] strs, String fileName){

        try (FileWriter fw = new FileWriter(fileName)) {
            for (String str : strs) {
                fw.write(str);
                fw.write(System.lineSeparator());

            }
            logger.log(Level.INFO, "Данные успешно записаны в файл");


        } catch (Exception e) {
            logger.warning("Ошибка записи файла");
        }
    }

    public static void configLogger() {
        try {
            FileHandler fh = new FileHandler("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\Java\\Seminars\\Seminar02\\log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
