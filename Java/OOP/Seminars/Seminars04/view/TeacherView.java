package Java.OOP.Seminars.Seminars04.view;


import Java.OOP.Seminars.Seminars04.data.StudentGroup;
import Java.OOP.Seminars.Seminars04.data.Teacher;

import java.util.List;
import java.util.logging.Logger;


public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup) {
        logger.info(studentGroup.toString());
    }

}
