package Java.OOP.Seminars.Seminars04.view;

import Java.OOP.Seminars.Seminars04.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
