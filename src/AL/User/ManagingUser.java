package AL.User;

import DBL.HandleFile;
import javax.swing.table.DefaultTableModel;

public class ManagingUser extends User {

    public ManagingUser() {
        this.post = "Managing";
    }

    @Override
    public boolean login(String username, String password) {

        HandleFile file = new HandleFile(this.fileUrl);

        String[][] data = file.readFile();
        for (int i = 0; i <= data.length; i++) {
            String savedUsername = data[i][1];
            String savedPassword = data[i][4];

            if (username.equals(savedUsername) && password.equals(savedPassword)) {
                return true;
            }
        }

        System.out.println("login");
        return false;
    }

    @Override
    public void create(String name, String username, String email,
            String phoneNo, String password, DefaultTableModel table) {

        HandleFile file = new HandleFile(this.fileUrl);

        String data = name + "," + username + "," + email + ","
                + phoneNo + "," + password + "," + this.post + "\n";
        file.appendStrToFile(data);

        String arr[][] = file.readFile();
        file.populateTable(table, arr);
    }
}
