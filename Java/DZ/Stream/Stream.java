package Java.DZ.Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> groupList;

    public Stream(){
        groupList = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup group) {
        groupList.add(group);
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groupList.iterator();
    }
}
