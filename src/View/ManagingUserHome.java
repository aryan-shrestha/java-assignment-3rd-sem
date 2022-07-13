package View;

import AL.Order.Order;
import AL.User.DeliveryUser;
import AL.User.ManagingUser;
import DBL.HandleFile;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aryan
 */
public class ManagingUserHome extends javax.swing.JFrame {

    // validates all fields returns false if any txt fields are empty
    private boolean validateForm(JTextField[] textFields){
        for(JTextField textField : textFields){
            if(textField.getText().trim().isEmpty()){
                return false;
            }
        }
        return true;
    }

    // reset all the input fields     
    private void clearForm(JTextField[] textFields){
        for(JTextField textField : textFields){
            textField.setText("");
        }
    }

    private final String username;
    /**
     * Creates new form FrameMain
     *
     * @param username
     */

    DefaultTableModel userTableModel, orderTableModel;

    public ManagingUserHome(String username) {
        initComponents();
        this.username = username;
        this.welcomeUserLbl.setText("Hello " + this.username);
        userTableModel = (DefaultTableModel) userTable.getModel();
        orderTableModel = (DefaultTableModel) orderTable.getModel();
        
        HandleFile userFile = new HandleFile("./src/saveData/users.txt");
        String[][] userData = userFile.readFile();
        userFile.populateTable(userTableModel, userData);

        HandleFile orderFile = new HandleFile("./src/saveData/orders.txt");
        String[][] orderData = orderFile.readFile();
        orderFile.populateTable(orderTableModel, orderData);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        orderIdTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        customerNameTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        paymentComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        addOrderBtn = new javax.swing.JButton();
        saveOrderChangesBtn = new javax.swing.JButton();
        deleteOrderBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
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
                    .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buttonContainerLayout.createSequentialGroup()
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userFormContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(usernameField)
                    .addComponent(emailField)
                    .addComponent(phoneNoField)
                    .addComponent(passwordField)
                    .addComponent(positionComboBox, 0, 225, Short.MAX_VALUE)
                    .addComponent(nameField))
                .addGap(35, 35, 35))
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
                    .addComponent(userFormContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersTabLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(userDetailContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)))
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

        jLabel2.setText("Order ID");

        jLabel11.setText("Customer Name");

        jLabel12.setText("Total");

        jLabel13.setText("Payment");

        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "completed" }));

        jLabel14.setText("Delivery Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "On Process", "Delivered" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        addOrderBtn.setText("Add Order");
        addOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderBtnMouseClicked(evt);
            }
        });

        saveOrderChangesBtn.setText("Save Changes");
        saveOrderChangesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveOrderChangesBtnMouseClicked(evt);
            }
        });

        deleteOrderBtn.setText("Delete");
        deleteOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOrderBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteOrderBtnMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderIdTxt)
                    .addComponent(totalTxt)
                    .addComponent(customerNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveOrderChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveOrderChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Orders");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer Name", "Total", "Payment", "Status"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ordersTabLayout = new javax.swing.GroupLayout(ordersTab);
        ordersTab.setLayout(ordersTabLayout);
        ordersTabLayout.setHorizontalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ordersTabLayout.setVerticalGroup(
            ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ordersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addContainerGap(457, Short.MAX_VALUE))
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
                .addContainerGap(460, Short.MAX_VALUE))
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

    // ***************************** User CRUD Funtions **********************
    // adds new user
    private void addUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserBtnMouseClicked

        String name, username, email, phoneNo, password;
        int position;
        JTextField[] textFields = {nameField, usernameField, emailField, 
            phoneNoField, passwordField
        };
        
        if (validateForm(textFields)) {
            name = nameField.getText();
            username = usernameField.getText();
            email = emailField.getText();
            phoneNo = phoneNoField.getText();
            password = passwordField.getText();
            position = positionComboBox.getSelectedIndex();

            if (position == 0) {
                DeliveryUser user = new DeliveryUser();
                user.create(name, username, email,phoneNo, password, 
                        userTableModel);
            }

            if (position == 1) {
                ManagingUser user = new ManagingUser();
                user.create(name, username, email, phoneNo, password, 
                        userTableModel);
            }
                    
            clearForm(textFields);
            JOptionPane.showMessageDialog(ManagingUserHome.this, "User Added");
        } else {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Input data in"
                    + " the input fields");
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

    // deletes selected user 
    private void deleteUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserBtnMouseClicked
        // TODO add your handling code here:

        // checking if user has selected any row
        if (userTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Select a row");
            return;
        }
        
        int rowIndex = userTable.getSelectedRow();
        String role = userTable.getValueAt(rowIndex, 5).toString();
        
        // removing row in user side
        userTableModel.removeRow(rowIndex);
        
        if(role.equalsIgnoreCase("Delivery")){
            DeliveryUser user = new DeliveryUser();
            user.delete(userTableModel);
        }
        if(role.equalsIgnoreCase("Managing")) {
            ManagingUser user = new ManagingUser();
            user.delete(userTableModel);
        }

        JOptionPane.showMessageDialog(ManagingUserHome.this, "User Deleted");
    }//GEN-LAST:event_deleteUserBtnMouseClicked

    private void updateUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserBtnMouseClicked

     
        JOptionPane.showMessageDialog(ManagingUserHome.this, "Table Updated");
    }//GEN-LAST:event_updateUserBtnMouseClicked

    // *********************** USER CRUD funtions end *************************

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed

    // ********************** Order CRUD funtions Start *********************
    private void addOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderBtnMouseClicked
        JTextField[] textFields = {orderIdTxt, customerNameTxt, totalTxt};
        if (validateForm(textFields)) {
            
            String orderId = orderIdTxt.getText();
            String customerName = customerNameTxt.getText();
            String totalAmt = totalTxt.getText();
            String payment = paymentComboBox.getSelectedItem().toString();
            String status = statusComboBox.getSelectedItem().toString();
            
            Order newOrder = new Order();
            newOrder.create(orderId, customerName, totalAmt, payment, status,
                        orderTableModel);
  
            clearForm(textFields);
            JOptionPane.showMessageDialog(ManagingUserHome.this, "order added");
        } else {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Enter data "
                    + "in the input fields");
        }

    }//GEN-LAST:event_addOrderBtnMouseClicked

    private void deleteOrderBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOrderBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOrderBtnMouseEntered

    private void deleteOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOrderBtnMouseClicked

        // checking if user has selected any row
        if (orderTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(ManagingUserHome.this, "Select a row");
            return;
        }

        // removing row in user view
        orderTableModel.removeRow(orderTable.getSelectedRow());

        Order order = new Order();  
        order.delete(orderTableModel);

        JOptionPane.showMessageDialog(ManagingUserHome.this, "Order deleted");
    }//GEN-LAST:event_deleteOrderBtnMouseClicked

    private void saveOrderChangesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveOrderChangesBtnMouseClicked

        Order order = new Order();
        order.update(orderTableModel);
        JOptionPane.showMessageDialog(ManagingUserHome.this, "Order saved");

    }//GEN-LAST:event_saveOrderChangesBtnMouseClicked

    // ****************** Order CRUD funtions end ******************
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
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JPanel buttonContainer;
    private javax.swing.JTextField customerNameTxt;
    private javax.swing.JButton deleteOrderBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JPanel feedbackTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField orderIdTxt;
    private javax.swing.JTable orderTable;
    private javax.swing.JPanel ordersTab;
    private javax.swing.JTextField passwordField;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JPanel reportTab;
    private javax.swing.JButton saveOrderChangesBtn;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel title;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JScrollPane userDetailContainer;
    private javax.swing.JPanel userFormContainer;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JPanel usersTab;
    private javax.swing.JLabel welcomeUserLbl;
    // End of variables declaration//GEN-END:variables
}
