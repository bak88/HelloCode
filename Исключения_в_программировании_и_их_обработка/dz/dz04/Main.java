package Исключения_в_программировании_и_их_обработка.dz.dz04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите: Фамилия_Имя_Отчество дата_рождения номер_телефона пол");
        String userData = scan.nextLine();
        String[] arrUser = userData.split(" ");
        if (arrUser.length > 6) {
            throw new UserDataSizeException();
        }
        if (arrUser.length < 6) {
            throw new UserDataSizeException(arrUser.length);
        }

        System.out.println(Arrays.toString(arrUser));

        String userName = arrUser[0] + arrUser[1] + arrUser[2];
        String dateOfBirt = arrUser[3];
        String phone = arrUser[4];
        String gender = arrUser[5];

        fullNameVerification(userName);
        checkBirthday(dateOfBirt);
        checkPhone(phone);
        checkGender(gender);

        try (FileWriter writer = new FileWriter(arrUser[0], true)) {

            System.out.println("Файл записан");
            writer.write(userData + "\n");

        } catch (IOException ex) {
            System.out.println("Ошибка записи");
            System.out.println(ex.getMessage());
        }
    }

    public static void fullNameVerification(String name) {
        char[] charUser = name.toCharArray();

        for (int i = 0; i < charUser.length; i++) {
            if (!Character.isLetter(charUser[i])) {
                System.out.println("Не корректные данные");
                throw new NumberFormatException("В ФИО содержаться не допустимый символ: " + charUser[i]);
            }
        }
    }

    public static void checkBirthday(String date) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            dateFormat.setLenient(false);
            Date date1 = dateFormat.parse(date);
        } catch (Exception e) {
            System.out.println("Не корректная дата рождения");
            throw new Exception(date);

        }


    }

    public static void checkPhone(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            try {
                Integer.parseInt(String.valueOf(phone.charAt(i)));
            } catch (RuntimeException e) {
                System.out.println("Не корректный номер телефона");
                throw new NumberFormatException("Не допустимы знак " + "\"" + String.valueOf(phone.charAt(i)) + "\"");
            }
        }


    }

    public static void checkGender(String gender) {

        if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
            System.out.println("Не корректный пол");
            throw new RuntimeException();
        }

    }
}




