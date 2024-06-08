package oodj_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VendorOrderPage extends javax.swing.JFrame {

    private String vendorId;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"Order ID","Detail","Status"};
    private int row = -1;
    private List<Object> orderList = new ArrayList<>();
    
    VendorOrder orders = new VendorOrder();
    
    public VendorOrderPage(){
        initComponents();}
    
    public VendorOrderPage(String vendorId){
        initComponents();
        this.vendorId = vendorId;
        model.setColumnIdentifiers(columnName);
        displayAllOrder();
    }
    
    private void displayAllOrder(){
        model.setRowCount(0);

        List<Object> allOrder = orders.getAllOrder(vendorId);

        for (Object obj : allOrder) {
            VendorOrder order = (VendorOrder) obj;
            String[] rowData = {
                order.getOrderId(),
                order.getDetail(),
                order.getStatus()

            };
            System.out.println(Arrays.toString(rowData));
            model.addRow(rowData);
        }
        
    }
    
    private void displaySearched(String orderId){
        
        model.setRowCount(0);

        List<Object> Order = orders.getAllOrder(vendorId);

        List<Object> filterItem = Order.stream()
                .filter(obj -> {
                    if (obj instanceof VendorOrder) {
                        VendorOrder orders = (VendorOrder) obj;
                        return orders.getOrderId().equals(orderId);
                    }
                    return false;
                })
                .collect(Collectors.toList());

        for (Object obj : filterItem) {
            VendorOrder order = (VendorOrder) obj;
            String[] rowData = {
                order.getOrderId(),
                order.getDetail(),
                order.getStatus()
            };
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
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jButton4 = new javax.swing.JButton();
        showID = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        order = new javax.swing.JButton();
        report = new javax.swing.JButton();
        review = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        orderStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        decline = new javax.swing.JButton();
        updateStatus = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        detail = new javax.swing.JLabel();
        showId = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbOrder = new javax.swing.JTable();
        showStatus = new javax.swing.JLabel();
        showDetail = new javax.swing.JLabel();
        showAll = new javax.swing.JButton();

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

        jFormattedTextField1.setText("jFormattedTextField1");

        jButton4.setText("jButton4");

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

        orderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waiting processing", "Accept", "Decline", "Wait for take", " " }));

        jLabel2.setText("Order Status : ");

        enter.setBackground(new java.awt.Color(255, 204, 204));
        enter.setText("Enter");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
        });

        accept.setBackground(new java.awt.Color(153, 204, 0));
        accept.setText("Accept");
        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptMouseClicked(evt);
            }
        });

        decline.setBackground(new java.awt.Color(255, 102, 102));
        decline.setText("Decline");
        decline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineMouseClicked(evt);
            }
        });

        updateStatus.setBackground(new java.awt.Color(255, 204, 51));
        updateStatus.setText("Update Status");
        updateStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateStatusMouseClicked(evt);
            }
        });

        ID.setText("ID : ");

        jLabel6.setText("Status : ");

        detail.setText("Detail :");

        tbOrder.setModel(model);
        tbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbOrderMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbOrder);

        showAll.setBackground(new java.awt.Color(255, 204, 204));
        showAll.setText("Display All");
        showAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAllMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accept)
                        .addGap(18, 18, 18)
                        .addComponent(decline)
                        .addGap(18, 18, 18)
                        .addComponent(updateStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(showId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(orderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(menu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(showAll)))))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(order)
                    .addComponent(review)
                    .addComponent(menu)
                    .addComponent(report))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(enter)
                    .addComponent(showAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ID)
                            .addComponent(showId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(showDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateStatus)
                            .addComponent(decline)
                            .addComponent(accept))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24))))
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

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked

        String status = (String)orderStatus.getSelectedItem();
        displaySearched(status);
        System.out.println("Searching for: " + status);
        System.out.println("Search result: " + model.getRowCount() + " rows found.");

    }//GEN-LAST:event_enterMouseClicked

    private void acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseClicked
        try{
            if("Waitng processing".equals(showStatus.getText())){
                String orderId = showId.getText();
                String orderStatus = showStatus.getText();
                String orderDetail = showDetail.getText();

                orders.acceptStatus(orderId);

               String[] values = {vendorId, orderId, orderDetail, "Preparing"};
                model.removeRow(row);
                model.insertRow(row, values);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error input!");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update failed");
            }

    }//GEN-LAST:event_acceptMouseClicked

    private void declineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseClicked
        try{
            if("Waitng processing".equals(showStatus.getText())){
                String orderId = showId.getText();
                String orderStatus = showStatus.getText();
                String orderDetail = showDetail.getText();

                orders.acceptStatus(orderId);

               String[] values = {vendorId, orderId, orderDetail, "Decline"}; 
                model.removeRow(row);
                model.insertRow(row, values);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error input!");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update failed");
            }
        
        
        
    }//GEN-LAST:event_declineMouseClicked

    private void updateStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStatusMouseClicked
        
        try{
            if("Accept".equals(showStatus.getText())){
                String orderId = showId.getText();
                String orderStatus = showStatus.getText();
                String orderDetail = showDetail.getText();

                orders.acceptStatus(orderId);

               String[] values = {vendorId, orderId, orderDetail, "Wait for take"}; 
                model.removeRow(row);
                model.insertRow(row, values);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error input!");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update failed");
            }
    }//GEN-LAST:event_updateStatusMouseClicked

    private void tbOrderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrderMouseReleased
        row = tbOrder.getSelectedRow();
        String orderId = String.valueOf(model.getValueAt(row, 0));
        String orderDetail = String.valueOf(model.getValueAt(row, 1));
        String orderStatus = String.valueOf(model.getValueAt(row, 2));
        showID.setText(orderId);
        showDetail.setText(orderDetail);
        showStatus.setText(orderStatus);
    }//GEN-LAST:event_tbOrderMouseReleased

    private void showAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAllMouseClicked
        displayAllOrder();
    }//GEN-LAST:event_showAllMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton accept;
    private javax.swing.JButton decline;
    private javax.swing.JLabel detail;
    private javax.swing.JButton enter;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JComboBox<String> orderStatus;
    private javax.swing.JButton report;
    private javax.swing.JButton review;
    private javax.swing.JButton showAll;
    private javax.swing.JLabel showDetail;
    private javax.swing.JLabel showID;
    private javax.swing.JLabel showId;
    private javax.swing.JLabel showStatus;
    private javax.swing.JTable tbOrder;
    private javax.swing.JButton updateStatus;
    // End of variables declaration//GEN-END:variables
}
