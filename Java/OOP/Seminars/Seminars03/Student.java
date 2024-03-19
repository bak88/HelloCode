package Java.OOP.Seminars.Seminars03;

public class Student implements Comparable<Student>{
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String toString(){
        return String.format("id = %d, name = %s", studentId, studentName);
    }

    @Override
    public int compareTo(Student o) {
        if(studentId > o.getStudentId()) {
            return 1;
        } else if (studentId < o.getStudentId()) {
            return -1;
        }
        return 0;
    }
}
