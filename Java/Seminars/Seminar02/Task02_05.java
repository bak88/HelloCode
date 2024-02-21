package Java.Seminars.Seminar02;

import java.io.File;
import java.io.FileWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.FileHandler;

public class Task02_05 {
    
    private static Logger logger = Logger.getLogger(ContentFolder.class.getName());
    
    public static void main(String[] args) {
        configLogger();
        String[] contentFolder = getContentFolder(".");        
        writeToFile(contentFolder, ".");
        
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
            Logger.log(Level.INFO, "Данные успешно записаны в файл");


        } catch (Exception e) {
            logger.warning("Ошибка записи файла");            
        }        
    } 
    
    public static void configLogger() {
       try {
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

       } catch (Exception e) {
        e.printStackTrace();
       }
       
    }
}
