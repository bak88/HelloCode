package Java.OOP.Seminars.Seminars05.controller;


import Java.OOP.Seminars.Seminars05.data.*;
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

    public List getAllStudent() {
        List<Student> userList = dataService.getAllStudent();
        for(User user : userList){
            studentView.printOmConsole(user);
        }
        return userList;
    }

    public void getAllTeacher() {
        List<Teacher> userList = dataService.getAllTeacher();
        for(User user : userList){
            studentView.printOmConsole(user);
        }
    }

    public Teacher getTeacher(){
        List<Teacher> userList = dataService.getAllTeacher();
        for(User user : userList){
            studentView.printOmConsole(user);
            break;
        }
        return dataService.getTeacher();
    }

    public StudyGroup createStudyGroup() {
        return dataStudyGroupService.createStudyGroup(getTeacher(), getAllStudent());

    }

}
