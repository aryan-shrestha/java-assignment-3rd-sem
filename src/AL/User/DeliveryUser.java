package AL.User;

import DBL.HandleFile;

public class DeliveryUser extends User {

    public DeliveryUser(String name, String username, String email, String phoneNo, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.post = "Delivery";
    }

    public boolean login(String username, String password) {
        System.out.println("login");
        return true;
    }

    public void register() {
        HandleFile api = new HandleFile("./src/saveData/users.txt");
        String data = this.name + "," + this.username + "," + this.email + ","
                + this.phoneNo + "," + this.password + "," + this.post + "\n";
        api.appendStrToFile(data);
    }
}
