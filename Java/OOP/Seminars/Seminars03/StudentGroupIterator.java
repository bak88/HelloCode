package Java.OOP.Seminars.Seminars03;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int count = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        studentList = studentGroup.getStudentList();
    }

    public boolean hasNext() {
        return count < studentList.size();
    }

    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentList.get(count++);
    }

    public void remove() {
        studentList.remove(count);
    }
}
