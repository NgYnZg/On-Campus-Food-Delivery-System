/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author Kristalle
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModifyUserForm extends javax.swing.JFrame implements Displayer{

    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"Username","Name", "Role", "Password","Email","Phone no.","DOB"};
    private int row = -1;
    private List<Object> userList = new ArrayList<>();
    private static String adminID;
    
    AdminClass admin = new AdminClass(adminID);


    
    public ModifyUserForm(String adminID) {
        initComponents();
        this.adminID = adminID;
        model.setColumnIdentifiers(columnName);
        displayAll();
    }

    
    
    @Override
    public void displayAll(){
        model.setRowCount(0);
        List<Object> allUsers = admin.getAllUserList();
        for (Object obj : allUsers) {
            UserClass user = (UserClass) obj;
            String[] rowData = {
                user.getUsername(),
                user.getName(),
                user.getRole(),
                user.getPassword(),
                user.getEmail(),
                user.getPhone(),
                user.getDob()
            };
            model.addRow(rowData);
        }
    }
    
    
    @Override
    public void displaySearched(String username){
        model.setRowCount(0);
        List<Object> users = admin.getUser(username);
        List<Object> filteredUsers = users.stream()
                .filter(obj -> {
                    if (obj instanceof UserClass) {
                        UserClass user = (UserClass) obj;
                        return user.getUsername().equals(username);
                    }
                    return false;
                })
                .collect(Collectors.toList());

        for (Object obj : filteredUsers) {
            UserClass user = (UserClass) obj;
            String[] rowData = {
                user.getUsername(),
                user.getName(),
                user.getRole(),
                user.getPassword(),
                user.getEmail(),
                user.getPhone(),
                user.getDob()
            };
            model.addRow(rowData);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tfUsername = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfDOB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRecord = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblDOB1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox<>();
        btnView = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblPage = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbRecord.setModel(model);
        tbRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbRecordMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbRecord);

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 204, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblRole.setText("Role:");

        btnAdd.setBackground(new java.awt.Color(153, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        lblUsername.setText("Username:");

        lblDOB.setText("DoB:");

        lblDOB1.setText("Password:");

        lblEmail.setText("Email:");

        lblPhone.setText("Phone Num:");

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Vendor", "Runner", "Administrator" }));

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View All");
        btnView.setBorder(null);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear All");
        btnClear.setBorder(null);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
        btnHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblPage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblPage.setText("User Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(106, 106, 106))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(lblPage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPage))
                        .addGap(34, 34, 34)
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lblRole)
                        .addGap(21, 21, 21)
                        .addComponent(lblDOB1)
                        .addGap(24, 24, 24)
                        .addComponent(lblEmail)
                        .addGap(19, 19, 19)
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDOB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearTextField(){
        tfUsername.setText("");
        tfName.setText("");
        //tfRole.setText("");
        cmbRole.setSelectedItem(null);
        tfPassword.setText("");
        tfEmail.setText("");
        tfPhone.setText("");
        tfDOB.setText("");
    }
    
    private void tbRecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRecordMouseReleased

        row = tbRecord.getSelectedRow();

        String username =  String.valueOf(model.getValueAt(row, 0));
        String name = String.valueOf(model.getValueAt(row, 1));
        String role =  String.valueOf(model.getValueAt(row, 2));
        
        String password =  String.valueOf(model.getValueAt(row, 3));
        String email =  String.valueOf(model.getValueAt(row, 4));
        String phone = String.valueOf(model.getValueAt(row, 5));
        String dob = String.valueOf(model.getValueAt(row, 6));

        tfUsername.setText(username);
        tfName.setText(name);
        cmbRole.setSelectedItem(role);
        tfPassword.setText(password);
        tfEmail.setText(email);
        tfPhone.setText(phone);
        tfDOB.setText(dob);
    }//GEN-LAST:event_tbRecordMouseReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String username = tfUsername.getText();
        displaySearched(username);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        String username =  tfUsername.getText();
        String name = tfName.getText();
        String role = (String) cmbRole.getSelectedItem();
        String password =  tfPassword.getText();
        String email =  tfEmail.getText();
        String phone = tfPhone.getText();
        String dob = tfDOB.getText();

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        if (!isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(this, "Invalid phone number. Please enter a valid 10 or 11 digit phone number.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        // Format the phone number before adding
        phone = formatPhoneNumber(phone);
        
        if (!isValidDate(dob)) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please enter a date in yyyy-MM-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        UserClass editedUser = new UserClass(username,name,role,password,email,phone,dob);
        admin.editUser(editedUser);
        
        String[]values = {username,name,role,password,email,phone,dob};

        model.removeRow(row);
        model.insertRow(row, values);

        clearTextField();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String role = (String) cmbRole.getSelectedItem();
        String username = admin.generateUsername(role);
        String name = tfName.getText();
        
        String password =  "123";
        String email =  tfEmail.getText();
        String phone = tfPhone.getText();
        String dob = tfDOB.getText();

        
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        if (!isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(this, "Invalid phone number. Please enter a valid 10 or 11 digit phone number.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        // Format the phone number before adding
        phone = formatPhoneNumber(phone);
        
        if (!isValidDate(dob)) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please enter a date in yyyy-MM-dd format.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        

        String[]values = {username,name,role,password,email,phone,dob};
        System.out.println(Arrays.toString(values));
        model.addRow(values);
        
        if ("Customer".equals((String) cmbRole.getSelectedItem())){
            CustomerClass newCus = new CustomerClass(username,name,role,password,email,phone,dob);
            admin.addNewCus(newCus);
        }else{
            UserClass newUser = new UserClass(username,name,role,password,email,phone,dob);
            admin.addUser(newUser);
        }
        
        System.out.println("Added by "+ adminID);
        
        clearTextField();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        } else {
            String username = String.valueOf(model.getValueAt(row, 0));

            admin.deleteUser(username);

            model.removeRow(row);

            clearTextField();
            row = -1;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        displayAll();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearTextField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    
    
    //VALIDATION
    private boolean isValidPhoneNumber(String phoneNumber) {
        //plain digits or the format xxx-xxxxxxx or xxx-xxxxxxxx
        String phoneRegex = "^(\\d{10,11}|\\d{3}-\\d{7,8}|\\d{3}-\\d{6,7})$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
    private String formatPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{3}-\\d{7,8}|\\d{3}-\\d{6,7}")) {
            // Format to xxx-xxxxxxx or xxx-xxxxxxxx
            return phoneNumber.replaceAll("(\\d{3})(\\d{7,8})", "$1-$2");
        }
        return phoneNumber;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+(com|my)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private boolean isValidDate(String dob) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        try {
            Date parsedDate = dateFormat.parse(dob);

            String formattedDate = dateFormat.format(parsedDate);
            return dob.equals(formattedDate);
        } catch (ParseException e) {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOB1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tbRecord;
    private javax.swing.JTextField tfDOB;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
