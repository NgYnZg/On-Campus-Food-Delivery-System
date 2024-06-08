/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    private Authentication authentication;
    private UserClass user;

    public LoginForm() {
        initComponents();
        authentication = new Authentication();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnForgetPss = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPss = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfPss = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLogin.setBackground(new java.awt.Color(255, 204, 51));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnForgetPss.setBackground(new java.awt.Color(204, 204, 204));
        btnForgetPss.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnForgetPss.setText("Reset Password");
        btnForgetPss.setBorder(null);
        btnForgetPss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetPssActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPss.setText("Password:");

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Tech University Food Ordering System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPss, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfPss, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnForgetPss, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPss))
                .addGap(39, 39, 39)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnForgetPss, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String enteredUsername = tfUsername.getText();
        char[] encryptPss = pfPss.getPassword();
        String enteredPassword = new String(encryptPss);

        String role = Authentication.getRole(enteredUsername);

        if (authentication.login(enteredUsername,enteredPassword)) {
            JOptionPane.showMessageDialog(this, "Login successful. Welcome, " + role + "!");
            navigateToHomePage(role, enteredUsername);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Authentication failed. Invalid username or password.");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnForgetPssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetPssActionPerformed
        ResetPssForm rp = new ResetPssForm();
        rp.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnForgetPssActionPerformed

    
        
    public void navigateToHomePage(String role, String username) {
        // navigate to the respective home page
        if (role.equals("Admin")) {
            AdminHome adminHome = new AdminHome(username);
            adminHome.setVisible(true);
        } else if (role.equals("Customer")) {
            CustomerClass customer = new CustomerClass(username);
            CustomerHome customerHome = new CustomerHome(customer);
            customerHome.setVisible(true);
        } else if (role.equals("Vendor")) {
            VendorHomePage vendorHomePage = new VendorHomePage(username);
            vendorHomePage.setVisible(true);
        } else if (role.equals("Runner")) {
            RunnerHome runnerHome = new RunnerHome(username);
            runnerHome.setVisible(true);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgetPss;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPss;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pfPss;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
