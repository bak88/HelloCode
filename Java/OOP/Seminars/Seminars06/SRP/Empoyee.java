package Java.OOP.Seminars.Seminars06.SRP;

public class Empoyee {
    private String name;
    private String dol;
    private  int stav;

    public Empoyee(String name, String dol, int stav) {
        this.name = name;
        this.dol = dol;
        this.stav = stav;
    }

    public String getName() {
        return name;
    }
}
