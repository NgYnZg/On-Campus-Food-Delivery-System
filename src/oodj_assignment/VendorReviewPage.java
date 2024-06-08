package oodj_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VendorReviewPage extends javax.swing.JFrame {

    private String vendorId;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {};
    private int row = -1;
    private List<Object> reviewList = new ArrayList<>();
    
    VendorReview Review = new VendorReview();
    
    public VendorReviewPage(){
        initComponents();
    }
    
    public VendorReviewPage(String vendorId){
        
        initComponents();
        this.vendorId = vendorId;
        model.setColumnIdentifiers(columnName);
        displayReview();
        
    }
    
     private void displayReview() {
        model.setRowCount(0);

        List<Object> reviews = Review.getReview(vendorId);

        for (Object obj : reviews) {
            VendorReview review = (VendorReview) obj;
            String[] rowData = {
                review.getReviews()
            };
            System.out.println(Arrays.toString(rowData));
            model.addRow(rowData);
        }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        order = new javax.swing.JButton();
        report = new javax.swing.JButton();
        review = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbReview = new javax.swing.JTable();

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

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

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

        tbReview.setModel(model);
        jScrollPane4.setViewportView(tbReview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menu)
                        .addGap(0, 136, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
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
        this.dispose();
        VendorMenuPage menu = new VendorMenuPage(vendorId);
        menu.setVisible(true);
    }//GEN-LAST:event_menuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JButton report;
    private javax.swing.JButton review;
    private javax.swing.JTable tbReview;
    // End of variables declaration//GEN-END:variables
}
