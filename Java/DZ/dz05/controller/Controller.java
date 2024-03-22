package Java.DZ.dz05.controller;

import Java.DZ.dz05.data.User;
import Java.DZ.dz05.service.DataService;

public class Controller {

    private DataService datServ = new DataService();

    public void createUser(User user, String discript) {
        datServ.createUser(user, discript);
    }

    public void read(String type) {
        System.out.println(datServ.read(type));
    }

}
