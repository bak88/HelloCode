package Java.OOP.Seminars.Seminars07.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, int salsry);
}
