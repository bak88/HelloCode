package Java.OOP.Seminars.Seminars05.controller;


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

    public void createStudent(String fName, String lName, String sName) {
        dataService.create(fName, lName, sName, Type.STUDENT);
    }

    public void createTeacher(String fName, String lName, String sName) {
        dataService.create(fName, lName, sName, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for(User user : userList){
            studentView.printOmConsole(user);
        }
    }

    public List<User> getListStudent() {
        return dataService.getAllStudent();
    }


    public void createStudyGroup(Teacher teacher, List<User> students) {
        dataStudyGroupService.createStudyGroup(teacher, students);
    }

}
