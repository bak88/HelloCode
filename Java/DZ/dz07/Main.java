package Java.DZ.dz07;

import Java.DZ.dz07.data.Student;
import Java.DZ.dz07.data.Teacher;
import Java.DZ.dz07.view.StudetView;
import Java.DZ.dz07.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Иван", 18, "Информатика");
        Student stud2 = new Student("Петр", 19, "Разработчик");

        Teacher teacher1 = new Teacher("Ирина Николаевна", 45, "Математика");
        Teacher teacher2 = new Teacher("Кирилл Кириллович", 48, "Статистика");

        StudetView stView = new StudetView();
        TeacherView teachView = new TeacherView();
        stView.createStudent(stud1);
        stView.createStudent(stud2);
        stView.readStudent();

        teachView.createTeacher(teacher1);
        teachView.createTeacher(teacher2);
        teachView.readTeacher();
    }
}
