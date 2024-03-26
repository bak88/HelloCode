package Java.OOP.Seminars.Seminars05.data;

public class Student extends User {

    private int studentId;

    public Student(String fName, String lName, String sName, int studentId) {
        super(fName, lName, sName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student { " +
                " studentId=" + studentId +
                super.toString() +
                '}';
    }
}
