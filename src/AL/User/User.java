package AL.User;

import DBL.HandleFile;
import javax.swing.table.DefaultTableModel;

abstract class User {

    protected String post;
    protected String fileUrl = "src/saveData/users.txt";

    abstract boolean login(String username, String password);

    abstract void create(String name, String username, String email,
            String phoneNo, String password, DefaultTableModel table);

    public void update(DefaultTableModel table) {

        HandleFile file = new HandleFile(this.fileUrl);

        file.deleteData();

        for (int i = 0; i < table.getRowCount(); i++) {
            String name = (String) table.getValueAt(i, 0);
            String username = (String) table.getValueAt(i, 1);
            String email = (String) table.getValueAt(i, 2);
            String phoneNo = (String) table.getValueAt(i, 3);
            String password = (String) table.getValueAt(i, 4);
            String position = (String) table.getValueAt(i, 5);

            String data = name + "," + username + "," + email + ","
                    + phoneNo + "," + password + "," + position + "\n";
            file.appendStrToFile(data);

        }
        String arr[][] = file.readFile();
        file.populateTable(table, arr);

    }
    
    public void delete(DefaultTableModel table){
        this.update(table);
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
