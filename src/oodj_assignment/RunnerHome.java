/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author Kristalle
 */
public class RunnerHome extends javax.swing.JFrame {

    private String username;
    
    
    public RunnerHome(String username) {
        initComponents();
        this.username = username;
        lblUsername.setText("Welcome, " + username + " (Runner)");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        bRevenue = new javax.swing.JButton();
        bCustomerReview = new javax.swing.JButton();
        bNotification = new javax.swing.JButton();
        bDeliveryTask = new javax.swing.JButton();
        bTaskHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Runner Home");

        bRevenue.setText("Revenue Dashboard");
        bRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRevenueActionPerformed(evt);
            }
        });

        bCustomerReview.setText("Customer Review");
        bCustomerReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCustomerReviewActionPerformed(evt);
            }
        });

        bNotification.setText("Notification");
        bNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNotificationActionPerformed(evt);
            }
        });

        bDeliveryTask.setText("Tasks");
        bDeliveryTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeliveryTaskActionPerformed(evt);
            }
        });

        bTaskHistory.setText("Tasks History");
        bTaskHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTaskHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bNotification)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(bDeliveryTask, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRevenue, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bCustomerReview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTaskHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bNotification))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeliveryTask, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(bTaskHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bCustomerReview)
                .addGap(29, 29, 29)
                .addComponent(bRevenue)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDeliveryTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeliveryTaskActionPerformed
        dispose();
        DelTask dt = new DelTask(username);
        dt.setVisible(true);
    }//GEN-LAST:event_bDeliveryTaskActionPerformed

    private void bCustomerReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCustomerReviewActionPerformed
        // TODO add your handling code here:
        dispose();
        DeliveryReview dr = new DeliveryReview(username);
        dr.setVisible(true);
    }//GEN-LAST:event_bCustomerReviewActionPerformed

    private void bNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNotificationActionPerformed
        // TODO add your handling code here:
        dispose();
        DRunnerNotification drn = new DRunnerNotification(username);
        drn.setVisible(true);
    }//GEN-LAST:event_bNotificationActionPerformed

    private void bRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRevenueActionPerformed
        // TODO add your handling code here:
        dispose();
        DRunnerRevenue drr = new DRunnerRevenue(username);
        drr.setVisible(true);
    }//GEN-LAST:event_bRevenueActionPerformed

    private void bTaskHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTaskHistoryActionPerformed
        // TODO add your handling code here:
        dispose();
        DeliveryHistory dh = new DeliveryHistory(username);
        dh.setVisible(true);
    }//GEN-LAST:event_bTaskHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCustomerReview;
    private javax.swing.JButton bDeliveryTask;
    private javax.swing.JButton bNotification;
    private javax.swing.JButton bRevenue;
    private javax.swing.JButton bTaskHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
