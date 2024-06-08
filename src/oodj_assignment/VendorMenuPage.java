package oodj_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VendorMenuPage extends javax.swing.JFrame{

    private String vendorId;
    private String name;
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"ID","Name","Price","Describe","Status"};
    private int row = -1;
    private List<Object> menuList = new ArrayList<>();

    VendorMenu item = new VendorMenu();
    
    public VendorMenuPage(){
        initComponents();
    }
    
    public VendorMenuPage(String vendorId){
        initComponents();
        this.vendorId = vendorId;
        showVendor.setText(vendorId);
        model.setColumnIdentifiers(columnName);
        displayAllMenu();
    }
    
    private void displayAllMenu() {
        model.setRowCount(0);

        List<Object> allMenu = item.getAllMenu(vendorId);

        for (Object obj : allMenu) {
            VendorMenu menu = (VendorMenu) obj;
            String[] rowData = {
                menu.getId(),
                menu.getName(),
                String.valueOf(menu.getPrice()), 
                menu.getDescribe(),
                menu.getStatus()
            };
            System.out.println(Arrays.toString(rowData));
            model.addRow(rowData);
        }
    }
    
    private void displaySearched(String name){
        
        model.setRowCount(0);

        List<Object> Menu = item.getAllMenu(vendorId);

        List<Object> filterItem = Menu.stream()
                .filter(obj -> {
                    if (obj instanceof VendorMenu) {
                        VendorMenu menu = (VendorMenu) obj;
                        return menu.getName().equals(name);
                    }
                    return false;
                })
                .collect(Collectors.toList());

        for (Object obj : filterItem) {
            VendorMenu menu = (VendorMenu) obj;
            String[] rowData = {
                menu.getId(),
                menu.getName(),
                String.valueOf(menu.getPrice()), 
                menu.getDescribe(),
                menu.getStatus()
            };
            model.addRow(rowData);
        }
    }
    
        public void clearTextField(){
        showID.setText("");
        showName.setText("");
        findName.setText("");
        showPrice.setText("");
        showDescribe.setText("");
    }
        
    private void updateIDs() {
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt("I" + (i + 1), i, 0);
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        showPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        showStatus = new javax.swing.JComboBox<>();
        ID = new javax.swing.JLabel();
        showName = new javax.swing.JTextField();
        showID = new javax.swing.JLabel();
        describe = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        showDescribe = new javax.swing.JTextArea();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        lbname = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMenu = new javax.swing.JTable();
        order = new javax.swing.JButton();
        report = new javax.swing.JButton();
        review = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        findName = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        showVendor = new javax.swing.JLabel();
        lbname1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Price : ");

        jLabel6.setText("Status : ");

        showStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "out of stock", "on stock" }));

        ID.setText("ID : ");

        describe.setText("Describe : ");

        add.setBackground(new java.awt.Color(102, 204, 0));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        showDescribe.setColumns(20);
        showDescribe.setRows(5);
        jScrollPane3.setViewportView(showDescribe);

        delete.setBackground(new java.awt.Color(255, 102, 102));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 204, 102));
        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        lbname.setText("Name :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showName)
                                    .addComponent(showPrice))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(describe, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addGap(30, 30, 30)
                                        .addComponent(edit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete))
                                    .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(describe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(delete)
                    .addComponent(edit))
                .addContainerGap())
        );

        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        tbMenu.setModel(model);
        tbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbMenuMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tbMenu);

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

        search.setBackground(new java.awt.Color(255, 204, 204));
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        lbname1.setText("Name :");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbname1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(findName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(search)
                                        .addGap(18, 18, 18)
                                        .addComponent(showAll)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(menu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(home)
                            .addComponent(order)
                            .addComponent(report)
                            .addComponent(review)
                            .addComponent(menu))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search)
                            .addComponent(lbname1)
                            .addComponent(showAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try{
        String lastID = "";
        int rowCount = model.getRowCount();
        if (rowCount > 0) {
            lastID = String.valueOf(model.getValueAt(rowCount - 1, 0));
        }

        int lastNumber = 0;
        if (lastID.matches("I\\d+")) {
            lastNumber = Integer.parseInt(lastID.substring(1));
        }
        
        String newID = "I" + (lastNumber + 1);
        
            String name = showName.getText();
            double price = Double.parseDouble(showPrice.getText());
            String describe = showDescribe.getText();
            String status = (String) showStatus.getSelectedItem();

            String[] values = {newID, name, String.valueOf(price), describe, status};
            System.out.println(Arrays.toString(values));
            model.addRow(values);

            VendorMenu newMenu = new VendorMenu(vendorId, newID, name, price, describe, status);
            item.addMenu(newMenu);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Add failed");
        }
        clearTextField();

    }//GEN-LAST:event_addActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

        if (row == -1 ){
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
        else {
            String id = String.valueOf(model.getValueAt(row, 0));

            item.deleteMenu(id,vendorId);

            model.removeRow(row);

            clearTextField();
            
            row = -1;
            
            updateIDs();
                       
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

        if (row != -1) {
        String id = String.valueOf(model.getValueAt(row, 0));
        String name = showName.getText();
        double price = Double.parseDouble(showPrice.getText());
        String describe = showDescribe.getText();
        String status = (String) showStatus.getSelectedItem();

        VendorMenu editedMenu = new VendorMenu(vendorId, id, name, price, describe, status);

        try {
            item.editMenu(editedMenu);

            model.setValueAt(id, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(price, row, 2);
            model.setValueAt(describe, row, 3);
            model.setValueAt(status, row, 4);

            model.fireTableDataChanged();

            clearTextField();
            } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edit failed");
            }
        } 
        else {
        JOptionPane.showMessageDialog(null, "Please select a row to edit");
        }
    }//GEN-LAST:event_editMouseClicked

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

        String name = findName.getText();

        displaySearched(name);
        System.out.println("Searching for: " + name);
        System.out.println("Search result: " + model.getRowCount() + " rows found.");

    }//GEN-LAST:event_searchMouseClicked

    private void tbMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMenuMouseReleased


        row = tbMenu.getSelectedRow();
        String id = String.valueOf(model.getValueAt(row, 0));
        String name = String.valueOf(model.getValueAt(row, 1));

        showID.setText(id);
        showName.setText(name);
        showPrice.setText(String.valueOf(model.getValueAt(row, 2)));
        showDescribe.setText(String.valueOf(model.getValueAt(row, 3)));
        showStatus.setSelectedItem(String.valueOf(model.getValueAt(row, 4)));
        
    }//GEN-LAST:event_tbMenuMouseReleased

    private void showAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAllMouseClicked
        clearTextField();
        displayAllMenu();
    }//GEN-LAST:event_showAllMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JLabel describe;
    private javax.swing.JButton edit;
    private javax.swing.JTextField findName;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbname1;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JButton report;
    private javax.swing.JButton review;
    private javax.swing.JButton search;
    private javax.swing.JButton showAll;
    private javax.swing.JTextArea showDescribe;
    private javax.swing.JLabel showID;
    private javax.swing.JTextField showName;
    private javax.swing.JTextField showPrice;
    private javax.swing.JComboBox<String> showStatus;
    private javax.swing.JLabel showVendor;
    private javax.swing.JTable tbMenu;
    // End of variables declaration//GEN-END:variables
}
