package View;

import Auth.DeliveryUser;
import Auth.ManagingUser;
import DBL.Api;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aryan
 */
public class ManagingUserHome extends javax.swing.JFrame {

    // validate each fields if its empty
    private boolean validator() {

        if (nameField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter name");
            nameField.grabFocus();
            return false;
        }

        if (usernameField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter username");
            usernameField.grabFocus();
            return false;
        }

        if (emailField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter email");
            emailField.grabFocus();
            return false;
        }

        if (phoneNoField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter phone number");
            phoneNoField.grabFocus();
            return false;
        }
        if (passwordField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter password");
            passwordField.grabFocus();
            return false;
        }
        return true;
    }

    // reset all the input fields 
    private void clearFields() {
        nameField.setText("name");
        usernameField.setText("username");
        emailField.setText("email");
        phoneNoField.setText("phone no");
        passwordField.setText("password");
    }

    // inserts data into the table
    private void populateTable() {

        Api api = new Api("./src/saveData/users.txt");

        String[][] data = api.readFile();

        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                String name = data[i][0];
                String username = data[i][1];
                String email = data[i][2];
                String phoneNo = data[i][3];
                String password = data[i][4];
                String position = data[i][5];
                model.insertRow(userTable.getRowCount(), new Object[]{
                    name, username, email, phoneNo, password, position
                });

            }
        }

    }

    private final String username;
    /**
     * Creates new form FrameMain
     *
     * @param username
     */

    DefaultTableModel model;

    public ManagingUserHome(String username) {
        initComponents();
        this.username = username;
        this.welcomeUserLbl.setText("Hello " + this.username);
        model = (DefaultTableModel) userTable.getModel();
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeUserLbl = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        usersTab = new javax.swing.JPanel();
        buttonContainer = new javax.swing.JPanel();
        addUserBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        userDetailContainer = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        userFormContainer = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        phoneNoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        ordersTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        feedbackTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reportTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        welcomeUserLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        welcomeUserLbl.setText("Welcome");

        addUserBtn.setText("Add User");
        addUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserBtnMouseClicked(evt);
            }
        });
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        updateUserBtn.setText("Save changes");
        updateUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateUserBtnMouseClicked(evt);
            }
        });
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });

        deleteUserBtn.setText("Delete");
        deleteUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserBtnMouseClicked(evt);
            }
        });
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonContainerLayout = new javax.swing.GroupLayout(buttonContainer);
        buttonContainer.setLayout(buttonContainerLayout);
        buttonContainerLayout.setHorizontalGroup(
            buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonContainerLayout.createSequentialGroup()
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonContainerLayout.setVerticalGroup(
            buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setText("Users");

        userTable.setAutoCreateRowSorter(true);
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Email", "Phone No.", "Password", "Position"
            }
        ));
        userDetailContainer.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(4).setResizable(false);
            userTable.getColumnModel().getColumn(5).setResizable(false);
        }

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        phoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel5.setText("Username");

        jLabel6.setText("Email");

        jLabel7.setText("Phone No.");

        jLabel8.setText("Password");

        jLabel9.setText("Position");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery User", "Managing User" }));

        javax.swing.GroupLayout userFormContainerLayout = new javax.swing.GroupLayout(userFormContainer);
        userFormContainer.setLayout(userFormContainerLayout);
        userFormContainerLayout.setHorizontalGroup(
            userFormContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userFormContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(phoneNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(positionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userFormContainerLayout.setVerticalGroup(
            userFormContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout usersTabLayout = new javax.swing.GroupLayout(usersTab);
        usersTab.setLayout(usersTabLayout);
        usersTabLayout.setHorizontalGroup(
            usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userFormContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersTabLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(userDetailContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)))
        );
        usersTabLayout.setVerticalGroup(
            usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersTabLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userDetailContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usersTabLayout.createSequentialGroup()
                        .addComponent(userFormContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(buttonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Users", usersTab);

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout ordersTabLayout = new javax.swing.GroupLayout(ordersTab);
        ordersTab.setLayout(ordersTabLayout);
        ordersTabLayout.setHorizontalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(708, Short.MAX_VALUE))
        );
        ordersTabLayout.setVerticalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Orders", ordersTab);

        jLabel3.setText("Feed");

        javax.swing.GroupLayout feedbackTabLayout = new javax.swing.GroupLayout(feedbackTab);
        feedbackTab.setLayout(feedbackTabLayout);
        feedbackTabLayout.setHorizontalGroup(
            feedbackTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackTabLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(545, Short.MAX_VALUE))
        );
        feedbackTabLayout.setVerticalGroup(
            feedbackTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Feedbacks", feedbackTab);

        jLabel4.setText("Reports");

        javax.swing.GroupLayout reportTabLayout = new javax.swing.GroupLayout(reportTab);
        reportTab.setLayout(reportTabLayout);
        reportTabLayout.setHorizontalGroup(
            reportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportTabLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(728, Short.MAX_VALUE))
        );
        reportTabLayout.setVerticalGroup(
            reportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportTabLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(454, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reports", reportTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeUserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoFieldActionPerformed

    private void addUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserBtnMouseClicked

        String name, username, email, phoneNo, password;
        int position;

        if (validator()) {
            name = nameField.getText();
            username = usernameField.getText();
            email = emailField.getText();
            phoneNo = phoneNoField.getText();
            password = passwordField.getText();
            position = positionComboBox.getSelectedIndex();

            System.out.println(position);

            if (position == 0) {
                DeliveryUser user = new DeliveryUser(name, username, email,
                        phoneNo, password);
                user.register();
            }

            if (position == 1) {
                ManagingUser user = new ManagingUser(name, username, email,
                        phoneNo, password);
                user.register();
            }
            model.setRowCount(0);
            populateTable();
            JOptionPane.showMessageDialog(ManagingUserHome.this, position);

            clearFields();
        }
    }//GEN-LAST:event_addUserBtnMouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        userTable.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void deleteUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserBtnMouseClicked
        // TODO add your handling code here:

        // checking if user has selected any row
        if (userTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Select a row");
            return;
        }

        // removing row in user side
        model.removeRow(userTable.getSelectedRow());

        // creating Api object
        Api api = new Api("./src/saveData/users.txt");

        // calling deleteData method to delete the existing file and creating 
        // a new file with the same name
        api.deleteData();

        // looping through the table and appending each row data in the new
        // file
        for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
            String username = (String) model.getValueAt(i, 1);
            String email = (String) model.getValueAt(i, 2);
            String phoneNo = (String) model.getValueAt(i, 3);
            String password = (String) model.getValueAt(i, 4);
            String position = (String) model.getValueAt(i, 5);

            String data = name + "," + username + "," + email + ","
                    + phoneNo + "," + password + "," + position + "\n";

            api.appendStrToFile(data);
        }

        // resetting table and populating the table again by reading the newly
        // created and appended file
        model.setRowCount(0);
        populateTable();

        JOptionPane.showMessageDialog(ManagingUserHome.this, "User Deleted");
    }//GEN-LAST:event_deleteUserBtnMouseClicked

    private void updateUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserBtnMouseClicked
        
        // creating an Api object
        Api api = new Api("./src/saveData/users.txt");
        
        // calling deleteData method to delete the exisitng file and creating 
        // a new file with the same name
        api.deleteData();
        
        // looping throuth the table and appending each row data in the new 
        // file
        for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
            String username = (String) model.getValueAt(i, 1);
            String email = (String) model.getValueAt(i, 2);
            String phoneNo = (String) model.getValueAt(i, 3);
            String password = (String) model.getValueAt(i, 4);
            String position = (String) model.getValueAt(i, 5);

            String data = name + "," + username + "," + email + ","
                    + phoneNo + "," + password + "," + position + "\n";

            api.appendStrToFile(data);

        }
        
        // resetting table and populating the table again by reading the newly
        // created and appended file
        model.setRowCount(0);
        populateTable();
        JOptionPane.showMessageDialog(ManagingUserHome.this, "Table Updated");
    }//GEN-LAST:event_updateUserBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JPanel buttonContainer;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JPanel feedbackTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel ordersTab;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JPanel reportTab;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JScrollPane userDetailContainer;
    private javax.swing.JPanel userFormContainer;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JPanel usersTab;
    private javax.swing.JLabel welcomeUserLbl;
    // End of variables declaration//GEN-END:variables
}
