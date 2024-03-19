package Java.OOP.Seminars.Seminars03;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(0, "Jack");
        Student student1 = new Student(1, "Parker");
        Student student2 = new Student(2, "Escobar");

        StudentGroup studentGroup = new StudentGroup();
//        studentGroup.addStudent(student);
//        studentGroup.addStudent(student2);
//        studentGroup.addStudent(student1);

        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup.addStudent(student);
        studentGroup.addStudent(student2);

        Stream stream1 = new Stream();
        stream1.addStudentGroup(studentGroup);

        Stream stream2 = new Stream();
        stream1.addStudentGroup(studentGroup1);

        StreamComparator sc = new StreamComparator();
        System.out.println(sc.compare(stream1, stream2));






//        for (Student stud : studentGroup) {
//            System.out.println(stud);
//
//        }
//        System.out.println();
//
//        for (Student stud : getSortedStudentGroup(studentGroup)) {
//            System.out.println(stud);
//        }
//        System.out.println();
//
//        for (Student stud : getSortedStudentGroupByName(studentGroup)) {
//            System.out.println(stud);
//
//        }
//
//    }
//
//    public static List<Student> getSortedStudentGroup(StudentGroup s) {
//        List<Student> studentList = new ArrayList<>(s.getStudentList());
//        Collections.sort(studentList);
//        return studentList;
//    }
//
//    public static List<Student> getSortedStudentGroupByName(StudentGroup s) {
//        List<Student> studentList = new ArrayList<>(s.getStudentList());
//        studentList.sort(new StudentComporator());
//        return studentList;
    }
}
