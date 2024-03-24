package Java.DZ.dz07.view;

import Java.DZ.dz07.controller.Controller;
import Java.DZ.dz07.data.Teacher;

public class TeacherView {

    private Controller controller = new Controller();

    public void createTeacher(Teacher techer) {

        controller.createUser(techer, techer.getDiscipline());
        System.out.println("Учитель создан успешно!");
    }

    public void readTeacher() {

        System.out.println("Список учителей:");
        controller.read("Учитель");
    }
}
