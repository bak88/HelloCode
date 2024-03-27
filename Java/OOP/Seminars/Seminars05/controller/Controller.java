package Java.OOP.Seminars.Seminars05.controller;


import Java.OOP.Seminars.Seminars05.data.Student;
import Java.OOP.Seminars.Seminars05.data.Teacher;
import Java.OOP.Seminars.Seminars05.data.Type;
import Java.OOP.Seminars.Seminars05.data.User;
import Java.OOP.Seminars.Seminars05.service.DataService;
import Java.OOP.Seminars.Seminars05.service.StudyGroupService;
import Java.OOP.Seminars.Seminars05.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudyGroupService dataStudyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();

    private List<Teacher> allTeacher = dataService.getAllTeacher();
    private List<Student> allStudent = dataService.getAllStudent();

    public void createStudent(String fName, String lName, String sName) {
        dataService.create(fName, lName, sName, Type.STUDENT);
    }

    public void createTeacher(String fName, String lName, String sName) {
        dataService.create(fName, lName, sName, Type.TEACHER);
    }

    public void getAllStudent() {
        List<Student> userList = dataService.getAllStudent();
        for(User user : userList){
            studentView.printOmConsole(user);
        }
    }

    public void getAllTeacher() {
        List<Teacher> userList = dataService.getAllTeacher();
        for(User user : userList){
            studentView.printOmConsole(user);
        }
    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        dataStudyGroupService.createStudyGroup(teacher, students);

    }

}
