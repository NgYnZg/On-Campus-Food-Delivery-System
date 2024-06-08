/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kristalle
 */
public class ReloadCreditPage extends javax.swing.JFrame implements Displayer{

    private CustomerCredit customerCredit;
    private CustomerCreditList ccList;
    private CustomerClass customer;
    private Notification noti;
    
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"Reload Date", "Type","Reload Amount","Balance"};
    private int row = -1;
    private static String adminID;
    
    public ReloadCreditPage(String adminID) {
        initComponents();
        model.setColumnIdentifiers(columnName);
        this.adminID = adminID;
        customerCredit = new CustomerCredit();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReload = new javax.swing.JButton();
        tfCusID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        tfBalance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCusName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCredit = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReload.setBackground(new java.awt.Color(255, 204, 51));
        btnReload.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnReload.setText("Reload");
        btnReload.setBorderPainted(false);
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        jLabel1.setText("Customer ID:");

        lblAmount.setText("Reload Amount:");

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tfBalance.setEditable(false);

        jLabel2.setText("Balance:");

        jLabel3.setText("Customer Name:");

        tfCusName.setEditable(false);

        tbCredit.setModel(model);
        jScrollPane2.setViewportView(tbCredit);

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
        btnHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Customer Credit");

        btnReceipt.setBackground(new java.awt.Color(153, 153, 153));
        btnReceipt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnReceipt.setText("Generate Receipt");
        btnReceipt.setBorderPainted(false);
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfCusID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfCusName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmount)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReceipt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(btnHome))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void displayAll(){
        model.setRowCount(0);
    }
    
    @Override
    public void displaySearched(String customerID){
        model.setRowCount(0);
        List<CustomerCredit> cusList = ccList.get();
        List<CustomerCredit> filteredCus = cusList.stream()
                .filter(cc -> cc.getUsername().equals(customerID))
                .collect(Collectors.toList());
        if (!filteredCus.isEmpty()) {
            tfCusID.setText(filteredCus.get(0).getUsername());
            tfCusName.setText(filteredCus.get(0).getCustomerName());
            for (CustomerCredit cc : filteredCus) {
                String[] rowData = {
                        cc.getReloadDate(),
                        cc.getType(),
                        String.valueOf(cc.getReloadAmount()),
                        String.valueOf(cc.getBalance())
                };
                model.addRow(rowData);
            }
            CustomerCredit cc = new CustomerCredit(customerID);
            tfBalance.setText(String.valueOf(cc.getBalance()));
        } else {
            JOptionPane.showMessageDialog(this, "No customer credit information "
                    + "found for customer ID: " + customerID);
        }
    }
    

    public void sendNotification(String customerID, double reloadAmount, String totalBal, String result){
        String senderid = "Admin - " + adminID;  
        String reloadMessage = String.format(
                "Reload successful. Customer ID: %s, Reload Date: %s, Reload Amount: %s, Total Balance: %s, From: %s",
                customerID,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss")),
                reloadAmount,
                totalBal,
                senderid
        );
        
        Notification reloadNotification = new Notification(senderid, customerID, reloadMessage);

        reloadNotification.send();
        System.out.println(reloadMessage);
    }
    
    public void sendReceipt(String customerID, String type, String reloadDate, String reloadAmount, String totalBal){
        String senderid = "Admin - " + adminID;  
        String reloadMessage = String.format(
                "This is your E-receipt. Customer ID: %s, Date: %s, Reload Amount: %s, Total Balance: %s, Receipt Generated by: %s",
                customerID,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss")),
                reloadAmount,
                totalBal,
                senderid
        );
        
        Notification reloadNotification = new Notification(senderid, customerID, reloadMessage);

        reloadNotification.send();
        System.out.println(reloadMessage);
    }
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String customerID = tfCusID.getText();
        if(!customerID.isEmpty()){
            try{
            ccList = new CustomerCreditList(customerID);
            customerCredit.getCustomer(); 
            displaySearched(customerID);
            }catch(IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Customer not found.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please enter Customer ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        
        String customerID = tfCusID.getText();
        double reloadAmount;
        
        ccList = new CustomerCreditList(customerID);
        customerCredit.getCustomer(); 

        if(!customerID.isEmpty()){
            try {
                reloadAmount = Double.parseDouble(tfAmount.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid reload amount", "Error", JOptionPane.ERROR_MESSAGE);
                return; //if the reload amount is invalid
            }

            //create an object of CreditTopUp with the specified customer ID
            CustomerCredit cusCredit = new CustomerCredit(customerID);

            //reload credit using the reloadCredit method
            String result = cusCredit.reloadCredit(reloadAmount);

            //display the result 
            JOptionPane.showMessageDialog(this, result);

            CustomerCredit cc = new CustomerCredit(customerID);
            tfBalance.setText(String.valueOf(cc.getBalance()));
            String totalBalance = tfBalance.getText();

            try{
            ccList = new CustomerCreditList(customerID);
            customerCredit.getCustomer(); 
            displaySearched(customerID);
            }catch(IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Customer not found.");
            }
            
            sendNotification(customerID, reloadAmount,totalBalance,result);
            
        }else{
            JOptionPane.showMessageDialog(this, "Please enter Customer ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        int selectedRowIndex = tbCredit.getSelectedRow();
        String customerID = tfCusID.getText();

        if (selectedRowIndex != -1) {
            String reloadDate = tbCredit.getValueAt(selectedRowIndex, 0).toString();
            String type = tbCredit.getValueAt(selectedRowIndex, 1).toString();
            String reloadAmount = tbCredit.getValueAt(selectedRowIndex, 2).toString();
            String balance = tbCredit.getValueAt(selectedRowIndex, 3).toString();

            sendReceipt(customerID, type, reloadDate, reloadAmount,balance);

            JOptionPane.showMessageDialog(this, "E-receipt sent successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to generate the e-receipt.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReceiptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JTable tbCredit;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfBalance;
    private javax.swing.JTextField tfCusID;
    private javax.swing.JTextField tfCusName;
    // End of variables declaration//GEN-END:variables
}
