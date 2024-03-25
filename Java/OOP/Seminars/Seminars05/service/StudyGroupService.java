package Java.OOP.Seminars.Seminars05.service;

import Java.OOP.Seminars.Seminars05.data.Student;
import Java.OOP.Seminars.Seminars05.data.StudyGroup;
import Java.OOP.Seminars.Seminars05.data.Teacher;
import Java.OOP.Seminars.Seminars05.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<User> students) {
        List<User> userList = new ArrayList<>();
        userList.add(teacher);

        for (User user : students) {
            if (user instanceof Student) {
                userList.add(user);
            }

        }
        return (StudyGroup) userList;
    }
}