package Java.OOP.Seminars.Seminars05.data;

public class Teacher extends User{

    private int teacherId;

    public Teacher(String fName, String lName, String sName, int teacherId) {
        super(fName, lName, sName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "teacherId=" + teacherId +
                '}';
    }
}
