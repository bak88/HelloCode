package Java.DZ.dz07.service;

import Java.DZ.dz07.data.Student;
import Java.DZ.dz07.data.Teacher;
import Java.DZ.dz07.data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> studentList = new ArrayList<>();
    private List<User> teacherList = new ArrayList<>();

    public void createUser(User user, String discript) {
        if (user instanceof Student) {
            studentList.add(new Student(user.getName(), user.getAge(), discript));
        } else {
            teacherList.add(new Teacher(user.getName(), user.getAge(), discript));
        }
    }

    public List<User> read(String type) {
        if (type.equalsIgnoreCase("студент")) {
            return studentList;
        } else if (type.equalsIgnoreCase("учитель")) {
            return teacherList;
        }
        System.out.println("Такого списка нет!");
        return null;
    }
}
