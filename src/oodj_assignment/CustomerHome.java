/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kristalle
 */
public class CustomerHome extends javax.swing.JFrame {
    
    private CustomerClass customer;
    public CustomerHome(CustomerClass customer) {
        initComponents();
        this.customer = customer;
        unavailable();
        initialize();
    }
    
    private void initialize(){
        lblName.setText(customer.getName());
        lblCreditBalance.setText(customer.getCreditBalance() + "");
        
    }
    private void unavailable(){
        String[] options ={"Dine In", "Take Away", "Cancel Order"};
        NotificationList nl = new NotificationList(customer.getUsername());
        List<Notification> newNList = new ArrayList<>();
        for(Notification noti : nl.get()){
            if(noti.getSender().getName().equals("System")){
                Notification cnoti = (Notification) noti;
                if(cnoti.getMessage() == null){
                    CustomerNotification customerNoti = (CustomerNotification) cnoti;
                    int option = JOptionPane.showOptionDialog(
                    null,
                    "Oops, seems like there is no available runner around.",
                    "No delivery",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    options,
                    options[0]);
                    DeliveryOrder deliOrder = customerNoti.getOrder();
                    OrderTransaction cc = new OrderTransaction(customer.getUsername(), deliOrder);
                    cc.cancelOrder();
                    deliOrder.cancel();
                    System.out.println(deliOrder.getTotalPrice());
                    if(option == 0){
                        DineInOrder dineIn = new DineInOrder(deliOrder.getCart());
                        dineIn.setTotalPrice(deliOrder.getTotalPrice() - deliOrder.getDeliveryFee());
                        dineIn.place();
                        cc = new OrderTransaction(customer.getUsername(), dineIn);
                        cc.setOrder();
                    }else if(option == 1){
                        TakeAwayOrder takeAway = new TakeAwayOrder(deliOrder.getCart());
                        takeAway.setTotalPrice(deliOrder.getTotalPrice() - deliOrder.getDeliveryFee());
                        takeAway.place();
                        cc = new OrderTransaction(customer.getUsername(), takeAway);
                        cc.setOrder();
                    }else{}
                }
            }else
                newNList.add(noti);
        }
        nl.set(newNList);
        this.customer = new CustomerClass(customer.getUsername());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCreditBalance = new javax.swing.JLabel();
        btnSearchVendor = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        btnTransactionHistory = new javax.swing.JButton();
        btnReviewHistory = new javax.swing.JButton();
        btnCartPage = new javax.swing.JButton();
        btnTrackOrder = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        btnProvideReview = new javax.swing.JToggleButton();
        btnNotification = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setText("Customer Home");

        lblName2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName2.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Credit :RM");

        lblCreditBalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCreditBalance.setText("Credit");

        btnSearchVendor.setText("Search Vendor");
        btnSearchVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVendorActionPerformed(evt);
            }
        });

        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        btnTransactionHistory.setText("Transaction History");
        btnTransactionHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionHistoryActionPerformed(evt);
            }
        });

        btnReviewHistory.setText("Review History");
        btnReviewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewHistoryActionPerformed(evt);
            }
        });

        btnCartPage.setText("Cart");
        btnCartPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartPageActionPerformed(evt);
            }
        });

        btnTrackOrder.setText("Track Order");
        btnTrackOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackOrderActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName1.setText("Welcome");

        btnProvideReview.setText("Provide Review");
        btnProvideReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideReviewActionPerformed(evt);
            }
        });

        btnNotification.setText("Notification");
        btnNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblName2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProvideReview))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTrackOrder)
                                    .addComponent(btnCartPage)
                                    .addComponent(btnNotification))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCreditBalance)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSearchVendor)
                                .addComponent(btnOrderHistory)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTransactionHistory)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(btnReviewHistory)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblName)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblName2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSearchVendor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(lblName))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblCreditBalance))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrderHistory)
                        .addGap(20, 20, 20)
                        .addComponent(btnTransactionHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnReviewHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnNotification)
                        .addGap(18, 18, 18)
                        .addComponent(btnCartPage)
                        .addGap(18, 18, 18)
                        .addComponent(btnTrackOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProvideReview)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVendorActionPerformed
        SearchVendor sv = new SearchVendor(customer);
        this.setVisible(false);
        sv.setVisible(true);
    }//GEN-LAST:event_btnSearchVendorActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        OrderHistory oh = new OrderHistory(customer);
        oh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void btnTransactionHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionHistoryActionPerformed
        TransactionHistory th = new TransactionHistory(customer);
        th.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTransactionHistoryActionPerformed

    private void btnReviewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewHistoryActionPerformed
        ReviewHistory rh = new ReviewHistory(customer);
        rh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReviewHistoryActionPerformed

    private void btnCartPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartPageActionPerformed
        CartPage cp = new CartPage(customer);
        cp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCartPageActionPerformed

    private void btnTrackOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackOrderActionPerformed
        TrackOrder to = new TrackOrder(customer);
        to.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrackOrderActionPerformed

    private void btnProvideReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideReviewActionPerformed
        ProvideReview pr = new ProvideReview(customer);
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProvideReviewActionPerformed

    private void btnNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationActionPerformed
        NotificationPage np = new NotificationPage(customer);
        np.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNotificationActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartPage;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JToggleButton btnProvideReview;
    private javax.swing.JButton btnReviewHistory;
    private javax.swing.JButton btnSearchVendor;
    private javax.swing.JButton btnTrackOrder;
    private javax.swing.JButton btnTransactionHistory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCreditBalance;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    // End of variables declaration//GEN-END:variables
}
