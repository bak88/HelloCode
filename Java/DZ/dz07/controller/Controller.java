package Java.DZ.dz07.controller;

import Java.DZ.dz07.data.User;
import Java.DZ.dz07.service.DataService;

public class Controller {

    private DataService datServ = new DataService();

    public void createUser(User user, String discript) {
        datServ.createUser(user, discript);
    }

    public void read(String type) {
        System.out.println(datServ.read(type));
    }

}
