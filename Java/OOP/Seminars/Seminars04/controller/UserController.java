package Java.OOP.Seminars.Seminars04.controller;

import Java.OOP.Seminars.Seminars04.data.User;

import java.time.LocalDate;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
