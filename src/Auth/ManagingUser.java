package Auth;

import DBL.AppendData;
import DBL.ReadFile;

public class ManagingUser extends User {

    public ManagingUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ManagingUser(String name, String username, String email, String phoneNo, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.post = "Managing";
    }

    public boolean login(String username, String password) {

        ReadFile reader = new ReadFile();

        String[][] data = reader.readFile("./src/saveData/users.txt");
        System.out.println(data.length);

        for (int i = 0; i <= data.length; i++) {
            String savedUsername = data[i][1];
            String savedPassword = data[i][4];
            System.out.println("Username:" + savedUsername);
            System.out.println("Password:" + savedPassword);

            if (username.equals(savedUsername) && password.equals(savedPassword)) {
                return true;
            }
        }

        System.out.println("login");
        return false;
    }

    public void register() {
        AppendData appender = new AppendData();
        String data = this.name + "," + this.username + "," + this.email + ","
                + this.phoneNo + "," + this.password + "," + this.post + "\n";
        String file = "./src/saveData/users.txt";
        appender.appendStrToFile(file, data);
    }

    public void addOrder(String orderId) {

    }

    public void deleteDeliveryUser(String deliverUsername) {
        System.out.println("Delivery User deleted");
    }

}
