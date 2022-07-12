package AL.User;

import DBL.HandleFile;
import javax.swing.table.DefaultTableModel;

public class DeliveryUser extends User {

    public DeliveryUser() {
       
        this.post = "Delivery";
    }

    public boolean login(String username, String password) {
        System.out.println("login");
        return true;
    }

    public void create(String name, String username, String email, 
            String phoneNo, String password, DefaultTableModel table) {
        HandleFile file = new HandleFile(this.fileUrl);
        String data = name + "," + username + "," + email + ","
                + phoneNo + "," + password + "," + post + "\n";
        file.appendStrToFile(data);
        String arr[][] = file.readFile();
        file.populateTable(table, arr);
    }
}
