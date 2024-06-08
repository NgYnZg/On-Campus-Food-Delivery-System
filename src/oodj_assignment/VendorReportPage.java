package oodj_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VendorReportPage extends javax.swing.JFrame {

    private String reportType;
    private String vendorId;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {""};
    private int row = -1;
    private List<Object> reportList = new ArrayList<>();
    
    VendorReport reports = new VendorReport();
    
    public VendorReportPage(){
        initComponents();}
    
    public VendorReportPage(String vendorId){
        initComponents();
        this.vendorId = vendorId;
        model.setColumnIdentifiers(columnName);
    }

    private void displayRevenue() {
        model.setRowCount(0);
        List<Object> Revenue = reports.getRenevue(vendorId);
        
        for (Object obj : Revenue) {
            VendorReport revenue = (VendorReport) obj;
            String[] rowData = {
                revenue.getReportType(),
            };
            System.out.println(Arrays.toString(rowData));
            model.addRow(rowData);
        }
    }
    
    private void displayHistory() {
        model.setRowCount(0);

        List<Object> orderHistory = reports.getOrderHistory(vendorId);
        
        for (Object obj : orderHistory) {
            VendorReport history = (VendorReport) obj;
            String[] rowData = {
                history.getReportType(),
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblUsername = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        order = new javax.swing.JButton();
        report = new javax.swing.JButton();
        review = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        showType = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbReport = new javax.swing.JTable();

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

        showType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order History", "Revenue" }));

        search.setBackground(new java.awt.Color(255, 204, 204));
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        tbReport.setModel(model);
        jScrollPane4.setViewportView(tbReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(search)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

        String typeOfReport  =(String)showType.getSelectedItem();
        
        if("Order History".equals(typeOfReport)){
            displayHistory();
        }
        else if ("Revenue".equals(typeOfReport)){
            displayRevenue();
            
        }
    }//GEN-LAST:event_searchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generate;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JButton report;
    private javax.swing.JButton review;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> showType;
    private javax.swing.JTable tbReport;
    // End of variables declaration//GEN-END:variables
}
