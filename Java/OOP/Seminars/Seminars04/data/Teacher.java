package Java.OOP.Seminars.Seminars04.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator { // Вынести в отдельный класс нарушения принципа единственной ответственности (SRP)
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
