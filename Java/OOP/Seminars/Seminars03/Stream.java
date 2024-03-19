package Java.OOP.Seminars.Seminars03;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Comparable<StudentGroup> {
    private List<StudentGroup> groupList;

    public Stream() {
        groupList = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup group) {
        groupList.add(group);
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }


    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }
}
