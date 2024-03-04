package Java.lectures.lectures06;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("fn: %s, ls: %s, s: %d, id: %d", firstName, lastName, salary, id);
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
