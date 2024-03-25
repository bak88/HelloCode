package Java.OOP.Seminars.Seminars05.service;

import Java.OOP.Seminars.Seminars05.data.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> userList = new ArrayList<>();
//    private StudyGroup studyGroup;

    public void create(String fName, String lName, String sName, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(fName, lName, sName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(fName, lName, sName, id));
        }

    }

    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = (((Teacher) user).getTeacherId()) + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = (((Student) user).getStudentId()) + 1;
            }
        }
        return lastId;
    }

    public List<User> getAllStudent() {
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                result.add(user);
            }
        }
        return result;
    }

}
