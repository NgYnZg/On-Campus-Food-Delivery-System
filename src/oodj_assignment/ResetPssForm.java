/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author Kristalle
 */
public class ResetPssForm extends javax.swing.JFrame {


    private Authentication authentication;

    public ResetPssForm() {
        initComponents();
        authentication = new Authentication();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResetPss = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblNewPss = new javax.swing.JLabel();
        lblConfirmPss = new javax.swing.JLabel();
        lblResetPss = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfNewPss = new javax.swing.JPasswordField();
        pfConfirmPss = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnResetPss.setBackground(new java.awt.Color(0, 153, 102));
        btnResetPss.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnResetPss.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPss.setText("Reset Password");
        btnResetPss.setBorder(null);
        btnResetPss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPssActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblEmail.setText("Email:");

        lblNewPss.setText("New Password:");

        lblConfirmPss.setText("Confirm Password:");

        lblResetPss.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblResetPss.setText("Reset Password");

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUsername)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResetPss, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirmPss, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfConfirmPss, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pfNewPss, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNewPss, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(lblResetPss, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblResetPss)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblNewPss)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfNewPss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblConfirmPss)
                    .addComponent(pfConfirmPss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetPssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPssActionPerformed
        
        String enteredUsername = tfUsername.getText();
        String enteredEmail = tfEmail.getText();
        char[] newPss = pfNewPss.getPassword();
        char[] confirmPss = pfConfirmPss.getPassword();

        String newPassword = new String(newPss);
        String confirmPassword = new String(confirmPss);

        if (newPassword.equals(confirmPassword)) {
            if (authentication.resetPassword(enteredUsername, enteredEmail, newPassword)) {
                JOptionPane.showMessageDialog(this, "Password reset successful.");
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to reset password. Please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "New password and confirm password do not match.");
        }
   
    }//GEN-LAST:event_btnResetPssActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnResetPss;
    private javax.swing.JLabel lblConfirmPss;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNewPss;
    private javax.swing.JLabel lblResetPss;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pfConfirmPss;
    private javax.swing.JPasswordField pfNewPss;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
