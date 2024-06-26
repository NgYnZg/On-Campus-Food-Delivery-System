/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
//import com.toedter.calendar.JDateChooser;
//import org.jdatepicker.JDatePicker;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desiree Tan
 */
public class DRunnerRevenue extends javax.swing.JFrame {
    private String runnerID; 
    private DefaultTableModel model = new DefaultTableModel();
    private String[] columnName = {"a","b","c","d","e","f"};
    private String selectedDate;

    /**
     * Creates new form DRunnerRevenue
     */
    public DRunnerRevenue() {
        initComponents();
    }
    
    public DRunnerRevenue(String username) {
        initComponents();
        this.runnerID = username;
        lblUsername.setText("Welcome to your Revenue Dashboard username " + username+ "You may choose which spedicific date or type of revenue");
        model.setColumnIdentifiers(columnName);
        
        initializeComboBoxListeners();
    }
    
    private void initializeComboBoxListeners() {
        cbDate.addActionListener((ActionEvent e) -> {
            updateSelectedDate();
        });

        cbMonth.addActionListener((ActionEvent e) -> {
            updateSelectedDate();
        });

        cbYear.addActionListener((ActionEvent e) -> {
            updateSelectedDate();
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbRunnerRevenue = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bHome = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lDisplayRevenue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lRevenue = new javax.swing.JLabel();
        bDaily = new javax.swing.JButton();
        bYearly = new javax.swing.JButton();
        bMonthly = new javax.swing.JButton();
        cbDate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbRunnerRevenue.setModel(model);
        jScrollPane2.setViewportView(tbRunnerRevenue);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Revenue Dashboard");

        bHome.setText("Home");
        bHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHomeActionPerformed(evt);
            }
        });

        lDisplayRevenue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lDisplayRevenue.setForeground(new java.awt.Color(51, 153, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Total Revenue:");

        lRevenue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lRevenue.setText("Revenue:");

        bDaily.setText("Daily");
        bDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDailyActionPerformed(evt);
            }
        });

        bYearly.setText("Yearly");
        bYearly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bYearlyActionPerformed(evt);
            }
        });

        bMonthly.setText("Monthly:");
        bMonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMonthlyActionPerformed(evt);
            }
        });

        cbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("Choose Date:");

        jLabel4.setText("Choose Year:");

        jLabel5.setText("Choose Month:");

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lRevenue)
                        .addGap(121, 121, 121)
                        .addComponent(bDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bMonthly, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bYearly, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bHome)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lDisplayRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDaily)
                    .addComponent(bMonthly, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lRevenue)
                    .addComponent(bYearly))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(bHome))
                            .addComponent(lDisplayRevenue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHomeActionPerformed
        dispose(); // Close the current frame
        RunnerHome rh = new RunnerHome(runnerID);
        rh.setVisible(true);
    }//GEN-LAST:event_bHomeActionPerformed

    private void bDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDailyActionPerformed
        updateSelectedDate();
        List<Object[]> dailyRevenueData = fetchDailyRevenueData(selectedDate);
        if (!dailyRevenueData.isEmpty()) {
            populateRevenueTable(dailyRevenueData);
        } else {
            displayErrorMessage("No data found for the selected date!");
        }
    }//GEN-LAST:event_bDailyActionPerformed

    private void bMonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMonthlyActionPerformed
        displayMonthlyRevenue();
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        int monthNumber = getMonthNumber(month);

        if (monthNumber != -1) {
            List<Object[]> monthlyRevenueData = fetchMonthlyRevenueData(year, monthNumber);
            if (!monthlyRevenueData.isEmpty()) {
                populateRevenueTable(monthlyRevenueData);
            } else {
                displayErrorMessage("No data found for the selected month!");
            }
        } else {
            displayErrorMessage("Invalid month selected!");
        }
    }//GEN-LAST:event_bMonthlyActionPerformed

    private void bYearlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bYearlyActionPerformed
        String year = (String) cbYear.getSelectedItem();
        List<Object[]> yearlyRevenueData = fetchYearlyRevenueData(year);
        if (!yearlyRevenueData.isEmpty()) {
            populateRevenueTable(yearlyRevenueData);
        } else {
            displayErrorMessage("No data found for the selected year!");
        }
    }//GEN-LAST:event_bYearlyActionPerformed
    
    // Method to populate the table with revenue data
    private void populateRevenueTable(List<Object[]> data) {
        model.setRowCount(0);

        // Populate the table with new data
        for (Object[] rowData : data) {
            model.addRow(rowData);
        }
    }
    
    // Method to update the selected date based on JComboBox values
    private void updateSelectedDate() {
        String day = (String) cbDate.getSelectedItem();
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        int monthNumber = getMonthNumber(month);//convert to int

        try {
            // Attempt to create a date object with the selected values
            selectedDate = String.format("%s/%02d/%s", year, monthNumber, day);
            java.time.LocalDate.parse(selectedDate, java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            fetchAndDisplayDailyRevenue(selectedDate);
        } catch (java.time.DateTimeException e) {
            displayErrorMessage("The selected date does not exist!");
            //javax.swing.JOptionPane.showMessageDialog(this, "The date selected does not exist!", "Invalid Date", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private int getMonthNumber(String monthName) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }
        return -1; // If monthName doesn't match any month
    }
    
    private void fetchAndDisplayDailyRevenue(String selectedDate) {
        model.setRowCount(0);
        
        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();

        displayDailyRevenue(allTasks, selectedDate);
    }


    private void displayDailyRevenue(List<DeliveryTask> tasks, String selectedDate) {
        double dailyRevenue = 0;

        for (DeliveryTask task : tasks) {
            if (task.getTaskStatus().equals("Accept") && task.getRunnerid().equals(runnerID)) {
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime(); // Assuming getDateTime() returns order's date in "yyyy/MM/dd" format

                if (orderDate.equals(selectedDate)) {
                    dailyRevenue += order.getDeliveryFee();
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "Date Selected not exist", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Display or store the daily revenue value
        lDisplayRevenue.setText(String.valueOf(dailyRevenue));
    }
    
     private void displayMonthlyRevenue() {
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        int monthNumber = getMonthNumber(month); 

        if (monthNumber != -1) {
            String selectedMonth = String.format("%s/%02d", year, monthNumber);
            fetchAndDisplayMonthlyRevenue(selectedMonth);
        } else {
            displayErrorMessage("Invalid Month!");
        }
    }
     
     private void fetchAndDisplayMonthlyRevenue(String selectedMonth) {
        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();//get all

        List<DeliveryTask> filteredTasks = filterTasksByMonth(allTasks, selectedMonth);

        // Calculate the monthly revenue based on the filtered tasks
        double monthlyRevenue = calculateMonthlyRevenue(filteredTasks);

        displayMonthlyRevenue(monthlyRevenue);
    }

    // Method to filter tasks by the selected month
    private List<DeliveryTask> filterTasksByMonth(List<DeliveryTask> tasks, String selectedMonth) {
        List<DeliveryTask> filteredTasks = new ArrayList<>();

        for (DeliveryTask task : tasks) {
            if (task.getRunnerid().equals(runnerID)) { // Check if runnerID matches
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime(); // Assuming getDateTime() returns order's date in "uuuu/MM/dd/HH-mm:ss" format

                //String[] splitDate = orderDate.split("/");
                String[] splitDate = orderDate.split("[/\\-:]");
                String orderMonthYear = String.format("%s/%s", splitDate[0], splitDate[1]);

                if (orderMonthYear.equals(selectedMonth)) {
                    filteredTasks.add(task);
                }else{
                    displayErrorMessage("Month selected not found");
                }
            }else{
                displayErrorMessage("Username not found");
            }
        }

        return filteredTasks;
    }

    // Method to calculate monthly revenue based on filtered tasks
    private double calculateMonthlyRevenue(List<DeliveryTask> tasks) {
        double monthlyRevenue = 0;

        for (DeliveryTask task : tasks) {
            DeliveryOrder order = task.getDeliOrder();
            monthlyRevenue += order.getDeliveryFee();
        }

        return monthlyRevenue;
    }
    
    private void displayMonthlyRevenue(double monthlyRevenue) {
        lDisplayRevenue.setText(String.valueOf(monthlyRevenue));
    }
    
    //////////////////////////
    private void displayYearlyRevenue(List<Order> orders) {
        String year = (String) cbYear.getSelectedItem();

        fetchAndDisplayYearlyRevenue(year);
    }
    
    private void fetchAndDisplayYearlyRevenue(String selectedYear) {
        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();

        List<DeliveryTask> filteredTasks = filterTasksByYear(allTasks, selectedYear);

        // Calculate the yearly revenue based on the filtered tasks
        double yearlyRevenue = calculateYearlyRevenue(filteredTasks);

        displayYearlyRevenue(yearlyRevenue);
    }
    
    private List<DeliveryTask> filterTasksByYear(List<DeliveryTask> tasks, String selectedYear) {
        List<DeliveryTask> filteredTasks = new ArrayList<>();

        for (DeliveryTask task : tasks) {
            if (task.getRunnerid().equals(runnerID)) {
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime(); // Assuming getDateTime() returns order's date in "uuuu/MM/dd/HH-mm:ss" format

                // Extract the year from the order's date
                String[] splitDate = orderDate.split("[/\\-:]");
                String orderYear = splitDate[0];

                if (orderYear.equals(selectedYear)) {
                    filteredTasks.add(task);
                }
            }
        }

        return filteredTasks;
    }
    
    private double calculateYearlyRevenue(List<DeliveryTask> tasks) {
        double yearlyRevenue = 0;

        for (DeliveryTask task : tasks) {
            DeliveryOrder order = task.getDeliOrder();
            yearlyRevenue += order.getDeliveryFee();
        }

        return yearlyRevenue;
    }
    
    private void displayYearlyRevenue(double yearlyRevenue) {
        lDisplayRevenue.setText(String.valueOf(yearlyRevenue));
    }
    
    private void displayErrorMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    // Method to fetch daily revenue data
    private List<Object[]> fetchDailyRevenueData(String selectedDate) {
        List<Object[]> dailyRevenueData = new ArrayList<>();

        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();

        double dailyRevenue = calculateDailyRevenue(allTasks, selectedDate);

        // Adding the daily revenue data to the list
        Object[] rowData = {"Daily", selectedDate, String.valueOf(dailyRevenue)};
        dailyRevenueData.add(rowData);

        return dailyRevenueData;
    }
    
        // Method to calculate daily revenue
    private double calculateDailyRevenue(List<DeliveryTask> tasks, String selectedDate) {
        double dailyRevenue = 0;

        for (DeliveryTask task : tasks) {
            if (task.getTaskStatus().equals("Accept") && task.getRunnerid().equals(runnerID)) {
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime();

                if (orderDate.equals(selectedDate)) {
                    dailyRevenue += order.getDeliveryFee();
                }
            }
        }

        return dailyRevenue;
    }

    // Method to fetch monthly revenue data
    private List<Object[]> fetchMonthlyRevenueData(String year, int monthNumber) {
        List<Object[]> monthlyRevenueData = new ArrayList<>();

        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();

        double monthlyRevenue = calculateMonthlyRevenue(allTasks, year, monthNumber);

        // Adding the monthly revenue data to the list
        Object[] rowData = {"Monthly", year + "/" + String.format("%02d", monthNumber), String.valueOf(monthlyRevenue)};
        monthlyRevenueData.add(rowData);

        return monthlyRevenueData;
    }

    // Method to calculate monthly revenue
    private double calculateMonthlyRevenue(List<DeliveryTask> tasks, String year, int monthNumber) {
        double monthlyRevenue = 0;

        for (DeliveryTask task : tasks) {
            if (task.getRunnerid().equals(runnerID)) {
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime();

                String[] splitDate = orderDate.split("[/\\-:]");
                int orderYear = Integer.parseInt(splitDate[0]);
                int orderMonth = Integer.parseInt(splitDate[1]);

                if (orderYear == Integer.parseInt(year) && orderMonth == monthNumber) {
                    monthlyRevenue += order.getDeliveryFee();
                }
            }
        }

        return monthlyRevenue;
    }

    // Method to fetch yearly revenue data
    private List<Object[]> fetchYearlyRevenueData(String year) {
        List<Object[]> yearlyRevenueData = new ArrayList<>();

        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> allTasks = dtl.getAll();

        double yearlyRevenue = calculateYearlyRevenue(allTasks, year);

        // Adding the yearly revenue data to the list
        Object[] rowData = {"Yearly", year, String.valueOf(yearlyRevenue)};
        yearlyRevenueData.add(rowData);

        return yearlyRevenueData;
    }

    // Method to calculate yearly revenue
    private double calculateYearlyRevenue(List<DeliveryTask> tasks, String year) {
        double yearlyRevenue = 0;

        for (DeliveryTask task : tasks) {
            if (task.getRunnerid().equals(runnerID)) {
                DeliveryOrder order = task.getDeliOrder();
                String orderDate = order.getDateTime();

                int orderYear = Integer.parseInt(orderDate.split("[/\\-:]")[0]);

                if (orderYear == Integer.parseInt(year)) {
                    yearlyRevenue += order.getDeliveryFee();
                }
            }
        }

        return yearlyRevenue;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDaily;
    private javax.swing.JButton bHome;
    private javax.swing.JButton bMonthly;
    private javax.swing.JButton bYearly;
    private javax.swing.JComboBox<String> cbDate;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lDisplayRevenue;
    private javax.swing.JLabel lRevenue;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tbRunnerRevenue;
    // End of variables declaration//GEN-END:variables
}
