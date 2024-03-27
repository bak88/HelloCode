package Java.OOP.Seminars.Seminars05.service;



import Java.OOP.Seminars.Seminars05.data.Student;
import Java.OOP.Seminars.Seminars05.data.StudyGroup;
import Java.OOP.Seminars.Seminars05.data.Teacher;



import java.util.List;

public class StudyGroupService {


    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }


}