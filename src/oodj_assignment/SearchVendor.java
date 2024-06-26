/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YnZhong
 */
public class SearchVendor extends javax.swing.JFrame {

    private CustomerClass customer;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] column = {"Vendorid", "Vendor Name", "Status"};
    
    /**
     * Creates new form SearchVendor
     */
    public SearchVendor(CustomerClass customer) {
        initComponents();
        this.customer = customer;
        initialize();
        showAll();
    }
    
    private void initialize(){
        lblName.setText(customer.getName());
        lblCreditBalance.setText(customer.getCreditBalance() + "");
        
    }
    
    private void showAll(){
        tableVendor.setModel(model);
        model.setColumnIdentifiers(column);
        for(UserClass user : new UserClass().getAllUser()){
            if(user.getRole().equals("Vendor")){
                VendorClass vc = (VendorClass) user;
                String[] rowData = {vc.getUsername(), vc.getName(), vc.getBusinessStatus()};
                model.addRow(rowData);
            }
        }
        tableVendor.removeColumn(tableVendor.getColumnModel().getColumn(0));
    }
    
    private void showSearch(List<VendorClass> vList){
        tableVendor.setModel(model);
        model.setColumnIdentifiers(column);
        for(VendorClass vendor : vList){
            String[] rowData = {vendor.getUsername(), vendor.getName(), vendor.getBusinessStatus()};
            model.addRow(rowData);
        }
        tableVendor.removeColumn(tableVendor.getColumnModel().getColumn(0));
    }
    
    private void search(){
        List<VendorClass> vList = new ArrayList<>();
        tableVendor.setModel(model);
        model.setRowCount(0);
        String search = txtVendorName.getText().toLowerCase();
        for(UserClass user : new UserClass().getAllUser()){
            if(user.getRole().equals("Vendor") && user.getName().toLowerCase().contains(search)){
                VendorClass vendor = (VendorClass) user;
                vList.add(vendor);
            }
        }
        showSearch(vList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVendorName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendor = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblCreditBalance = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tableVendor.setModel(model);
        tableVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableVendorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableVendor);

        lblName.setText("Name");

        lblName1.setText("Credit: RM");

        lblCreditBalance.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search Vendor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCreditBalance)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(lblCreditBalance)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVendorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new CustomerHome(customer).setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableVendorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVendorMouseReleased
        int column = 0;
        int row = tableVendor.getSelectedRow();
        String value = model.getValueAt(row, column).toString();
        MenuPage mp = new MenuPage(customer, new VendorClass(value), this);
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tableVendorMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreditBalance;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tableVendor;
    private javax.swing.JTextField txtVendorName;
    // End of variables declaration//GEN-END:variables
}
