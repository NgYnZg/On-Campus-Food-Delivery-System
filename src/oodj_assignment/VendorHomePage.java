package oodj_assignment;

import javax.swing.JOptionPane;

public class VendorHomePage extends javax.swing.JFrame {

    private String vendorId;
    
    public VendorHomePage(){
        initComponents();       
    }
    
    public VendorHomePage(String vendorId) {
        initComponents();
        this.vendorId = vendorId;
        lblUsername.setText("Welcome, " + vendorId + " (Vendor)");
        showID.setText(vendorId);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton5 = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        order = new javax.swing.JButton();
        report = new javax.swing.JButton();
        review = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        labelStart = new javax.swing.JLabel();
        status = new javax.swing.JButton();
        vendorID = new javax.swing.JLabel();
        showID = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        order.setText("Order");
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });

        report.setText("Report");
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });

        review.setText("Review");
        review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewMouseClicked(evt);
            }
        });

        menu.setText("Menu Management");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        labelStart.setBackground(new java.awt.Color(0, 204, 102));
        labelStart.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        labelStart.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        labelStart.setText("Ready To Open?");

        status.setBackground(new java.awt.Color(255, 204, 0));
        status.setText("Open");
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
        });

        vendorID.setText("Vendor ID :");

        showID.setText("show ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menu))
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorID)
                        .addGap(18, 18, 18)
                        .addComponent(showID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(order)
                    .addComponent(report)
                    .addComponent(review)
                    .addComponent(menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorID)
                    .addComponent(showID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelStart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

        this.dispose();
        VendorHomePage home = new VendorHomePage(vendorId);
        home.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked

        this.dispose();
        VendorOrderPage order = new VendorOrderPage(vendorId);
        order.setVisible(true);
    }//GEN-LAST:event_orderMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked

        this.dispose();
        VendorReportPage report = new VendorReportPage(vendorId);
        report.setVisible(true);
    }//GEN-LAST:event_reportMouseClicked

    private void reviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewMouseClicked

        this.dispose();
        VendorReviewPage review = new VendorReviewPage(vendorId);
        review.setVisible(true);
    }//GEN-LAST:event_reviewMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
        
        this.dispose();
        VendorMenuPage menu = new VendorMenuPage(vendorId);
        menu.setVisible(true);
    }//GEN-LAST:event_menuMouseClicked

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked

         if("Close".equals(status.getText())){
            try{
                labelStart.setText("Ready to Open?");
                status.setText("Open");
                VendorClass cS = new VendorClass();
                cS.setVendorId(vendorId);
                cS.setBusinessStatus("Close");
                cS.changeStatus(cS);
    //            System.out.println("Close");
                JOptionPane.showMessageDialog(null, "Your business status have turn to close!");        
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Fail to turn business status");
            }
         }
            else if("Open".equals(status.getText())){
                try{
                    labelStart.setText("Time to Close?");
                    status.setText("Close");
                    VendorClass cS = new VendorClass();
                    cS.setVendorId(vendorId);
                    cS.setBusinessStatus("Open");
                    cS.changeStatus(cS);
                    JOptionPane.showMessageDialog(null, "Your business status have turn to open!"); 
        //            System.out.println("Open");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Fail to turn business status");
                }
            }
            
            
            
        

        
    }//GEN-LAST:event_statusMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelStart;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JButton report;
    private javax.swing.JButton review;
    private javax.swing.JLabel showID;
    private javax.swing.JButton status;
    private javax.swing.JLabel vendorID;
    // End of variables declaration//GEN-END:variables
}
