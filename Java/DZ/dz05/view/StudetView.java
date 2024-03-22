package Java.DZ.dz05.view;

import Java.DZ.dz05.controller.Controller;
import Java.DZ.dz05.data.Student;

public class StudetView {

    private Controller controller = new Controller();

    public void createStudent(Student stud) {

        controller.createUser(stud, stud.getDirection());
        System.out.println("Студент создан успешно!");
    }

    public void readStudent() {

        System.out.println("Список студентов:");
        controller.read("Студент");
    }
}
