package Java.OOP.Seminars.Seminars04.controller;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
