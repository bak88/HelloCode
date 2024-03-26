package Java.DZ.Stream;

import Java.OOP.Seminars.Seminars03.Student;
import Java.OOP.Seminars.Seminars03.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup  {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(this);
//    }
}
