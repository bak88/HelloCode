package Java.Seminars.Seminars05;

import java.util.HashMap;
import java.util.Map;

//Создать структуру для хранения Номеров паспортов и Фамилий
//сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//📌 Вывести данные по сотрудникам с фамилией Иванов.
public class Task05_01 {
    public static void main(String[] args) {
        Map<Integer, String> passpotData = new HashMap<>();
        passpotData.put(123456, "Иванов");
        passpotData.put(321456, "Васильев");
        passpotData.put(234561, "Петрова");
        passpotData.put(234432, "Иванов");
        passpotData.put(654321, "Петрова");
        passpotData.put(345678, "Иванов");

        String targetName = "Иванов";

        for (Integer passportNum : passpotData.keySet()) {
            String name = passpotData.get(passportNum);
            if(name.equals(targetName)){
                System.out.println("Номер паспорта: " + passportNum + ", Фамилия: " + name);
            }
        }
    }
}
