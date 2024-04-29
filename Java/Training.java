package Java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Training {

    public static void main(String[] args) throws FileNotFoundException {

        getWordCount("Java/VirtualPicnic/VirtualPicnic.txt");


    }

    public static void getWordCount(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
        }

        System.out.println("Number of words: " + words);
        scanner.close();
    }
}











