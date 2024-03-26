package Java.OOP.Seminars.Seminars05;

import Java.OOP.Seminars.Seminars05.controller.Controller;
import Java.OOP.Seminars.Seminars05.data.Student;
import Java.OOP.Seminars.Seminars05.data.StudyGroup;
import Java.OOP.Seminars.Seminars05.data.Teacher;
import Java.OOP.Seminars.Seminars05.data.User;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        List<User> studentList = new ArrayList<>();

        controller.createStudent("Иванов", "Иван", "Иванович");
        controller.createStudent("Gtnhjd", "Иван", "Иванович");
        controller.createStudent("afegagf", "Иван", "Иванович");
        controller.createTeacher("1", "2", "3");
        controller.createStudyGroup(new Teacher("1", "1", "1", 1), studentList);
//        StudyGroup studyGroup = new StudyGroup(new Teacher("1", "1", "1", 1), studentList);
//        controller.createStudyGroup(new Teacher("1", "1", "1", 1), studentList);
//        System.out.println(studyGroup);


    }
}
