/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author Kristalle
 */
public class AdminHome extends javax.swing.JFrame {

    private String username;
    
    
    public AdminHome(String username) {
        initComponents();
        this.username = username;
        lblUsername.setText("Welcome, " + username);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        btnTopUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAdminHome = new javax.swing.JLabel();
        bthLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnTopUp.setBackground(new java.awt.Color(255, 204, 51));
        btnTopUp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnTopUp.setText("Top Up Credit");
        btnTopUp.setBorder(null);
        btnTopUp.setBorderPainted(false);
        btnTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUpActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Modify User");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAdminHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblAdminHome.setText("Admin Home");

        bthLogout.setBackground(new java.awt.Color(204, 204, 204));
        bthLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        bthLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodj_assignment/enter(1).png"))); // NOI18N
        bthLogout.setText("Logout");
        bthLogout.setBorder(null);
        bthLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bthLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdminHome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(btnTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAdminHome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(bthLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModifyUserForm muf = new ModifyUserForm(username);
        muf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUpActionPerformed
        ReloadCreditPage rc = new ReloadCreditPage(username);
        rc.setVisible(true);
        
    }//GEN-LAST:event_btnTopUpActionPerformed

    private void bthLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_bthLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthLogout;
    private javax.swing.JButton btnTopUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdminHome;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
