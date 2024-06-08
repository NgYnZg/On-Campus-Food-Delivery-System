/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YnZhong
 */
public class ProvideReview extends javax.swing.JFrame {

    private CustomerClass customer;
    private List<Order> orderList;
    private List<VendorClass> vendorList;
    private List<RunnerClass> runnerList;
    private List<Review> reviewList;
    
    /**
     * Creates new form ProvideReview
     */
    public ProvideReview(CustomerClass customer) {
        initComponents();
        this.customer = customer;
        initialize();
    }
    
    private void initialize(){
        lblName.setText(customer.getName());
        lblCreditBalance.setText(customer.getCreditBalance() + "");
        orderList = new OrderList(customer.getUsername()).get();
        reviewList = new ReviewList(customer.getUsername()).get();
    }
    
    private void showRunner(){
        cboxName.removeAllItems();
        runnerList = new ArrayList<>();
        for(Order o : orderList){
            boolean reviewed = false;
            if(o.getOrderType().equals("Delivery")){
                DeliveryOrder delOrder = (DeliveryOrder) o;
                for(Review r : reviewList){
                    if(delOrder.getRunnerid().equals(r.getReceiverid()))
                        reviewed = true;
                }
                if(!reviewed){
                    RunnerClass runner = new RunnerClass(delOrder.getRunnerid());
                    cboxName.addItem(runner.getName());
                    runnerList.add(runner);
                }
            }
        }
    }
    
    private void showVendor(){
        cboxName.removeAllItems();
        vendorList = new ArrayList<>();
        for(Order o : orderList){
            boolean reviewed = false;
            for(Review r : reviewList){
                if (o.getVendorid().equals(r.getReceiverid()))
                    reviewed = true;
            }
            if (!reviewed){
                VendorClass vendor = new VendorClass(o.getVendorid());
                cboxName.addItem(vendor.getName());
                vendorList.add(vendor);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCreditBalance = new javax.swing.JLabel();
        cboxRole = new javax.swing.JComboBox<>();
        txtReview = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        cboxName = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Provide Review");

        lblName.setText("Name");

        jLabel3.setText("Credit: RM");

        lblCreditBalance.setText("123");

        cboxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendor", "Runner" }));
        cboxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxRoleActionPerformed(evt);
            }
        });

        txtReview.setText("Please put you review here :)");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreditBalance)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblCreditBalance))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSubmit)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String userid;
        boolean vendorcbox = false;
        if(cboxRole.getSelectedIndex() == 0){
            userid = vendorList.get(cboxName.getSelectedIndex()).getUsername();
            vendorcbox = true;
        }
        else
            userid = runnerList.get(cboxName.getSelectedIndex()).getUsername();
        Review r = new Review(customer.getUsername(), userid);
        r.add(txtReview.getText());
        txtReview.setText("");
        if(vendorcbox)
            showVendor();
        else
            showRunner();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cboxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxRoleActionPerformed
        if(cboxRole.getSelectedIndex() == 0)
            showVendor();
        else
            showRunner();
    }//GEN-LAST:event_cboxRoleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new CustomerHome(customer).setVisible(true);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboxName;
    private javax.swing.JComboBox<String> cboxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCreditBalance;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtReview;
    // End of variables declaration//GEN-END:variables
}