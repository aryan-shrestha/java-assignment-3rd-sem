package Auth;

import DBL.AppendData;

public class DeliveryUser extends User {

    public DeliveryUser(String name, String username, String email, String phoneNo, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.post = "Managing";
    }

    public boolean login(String username, String password) {
        System.out.println("login");
        return true;
    }

    public void register() {
        AppendData appender = new AppendData();
        String data = this.name + "," + this.username + "," + this.email + ","
                + this.phoneNo + "," + this.password + "," + this.post + "\n";
        String file = "./src/saveData/users.txt";
        appender.appendStrToFile(file, data);
    }
    
    

}