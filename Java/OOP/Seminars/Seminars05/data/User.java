package Java.OOP.Seminars.Seminars05.data;

public abstract class User {

    private String fName;
    private String lName;
    private String sName;

    public User(String fName, String lName, String sName) {
        this.fName = fName;
        this.lName = lName;
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return " User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
