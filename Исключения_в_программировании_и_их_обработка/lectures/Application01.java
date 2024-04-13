package Исключения_в_программировании_и_их_обработка.lectures;

import java.io.File;

public class Application01 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("C:\\Users\\dimba\\IdeaProjects\\HelloCode\\notes.json")));

        System.out.println(divide(-10, 0));
    }

    public static int divide(int a, int b) {
        if( b == 0){
            throw new RuntimeException("Divede by zero not premited ");
        }
        return a / b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
