package Java.OOP.Seminars.Seminars04.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {

    List<T> getAll(); // нарушение принципа разделения интерфейсов(ISP)

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
