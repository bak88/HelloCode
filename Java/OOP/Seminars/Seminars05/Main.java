package Java.OOP.Seminars.Seminars05;

import Java.OOP.Seminars.Seminars05.controller.Controller;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createStudent("Иванов", "Иван", "Иванович");
        controller.createStudent("Петров", "Петр", "Петрович");
        controller.createStudent("Денисов", "Денис", "Денисович");
        controller.createTeacher("Гадя", "Петрович", "Хренова");

//        controller.createTeacher("Гадя", "Петрович", "Хренова");
        controller.getAllStudent();
        System.out.println("__________");
        controller.createStudyGroup();



    }
}
