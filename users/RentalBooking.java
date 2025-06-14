/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vehicle.rental.management.system.users;

import java.awt.Image;
import vehicle.rental.management.system.users.component.ModelItem;

import javax.swing.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import vehicle.rental.management.system.users.component.invoice;
import vehicle.rental.management.system.users.component.item;

/**
 *
 * @author joker
 */
public class RentalBooking extends javax.swing.JFrame {

     private ModelItem selectedVehicle;
     
    
    /**
     * Creates new form RentalBooking
     */
    public RentalBooking(ModelItem vehicle) {
        initComponents();
        this.selectedVehicle = vehicle;
        populateVehicleDetails();
        updateCombo();
        pice();
    }


    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        carName = new javax.swing.JLabel();
        plateNumber = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        RentBTN5 = new javax.swing.JButton();
        driverName = new javax.swing.JLabel();
        driverLicense = new javax.swing.JLabel();
        driverContact = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Drivername = new javax.swing.JComboBox<>();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HomeBTN = new javax.swing.JButton();
        LogoutBTN = new javax.swing.JButton();
        GaraggeBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        carName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carName.setText("Selectes Car:");

        plateNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plateNumber.setText("Plate Number:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Start Date");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("End Date");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Select a driver");

        RentBTN5.setText("RENT NOW");
        RentBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentBTN5RentBTNActionPerformed(evt);
            }
        });

        driverName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        driverLicense.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        driverContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Price.setText("price");

        Drivername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Drivername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RentBTN5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(driverContact, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(6, 6, 6)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(Drivername, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plateNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(driverName, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(carName)
                        .addGap(18, 18, 18)
                        .addComponent(plateNumber)
                        .addGap(18, 18, 18)
                        .addComponent(Price)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(Drivername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(driverName)
                .addGap(18, 18, 18)
                .addComponent(driverLicense)
                .addGap(18, 18, 18)
                .addComponent(driverContact)
                .addGap(38, 38, 38)
                .addComponent(RentBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 830, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/rental/management/system/assets/l__3_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, 50));

        HomeBTN.setText("Home");
        HomeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBTNActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 30));

        LogoutBTN.setText("Log out");
        LogoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, 30));

        GaraggeBTN.setText("Garagge");
        GaraggeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaraggeBTNActionPerformed(evt);
            }
        });
        getContentPane().add(GaraggeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle/rental/management/system/assets/Screenshot 2024-12-04 165915 (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RentBTN5RentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentBTN5RentBTNActionPerformed
         if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please select both start and end dates.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (jDateChooser2.getDate().before(jDateChooser1.getDate())) {
        JOptionPane.showMessageDialog(this, "End date cannot be before start date.", "Invalid Dates", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String query = "INSERT INTO bookings (customer_id, vehicle_id, driver_id, start_date, end_date, total_price) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/vehiclerental?zeroDateTimeBehavior=CONVERT_TO_NULL",
        "root",
        "password")) {

        // Get the driver_id
        String selectedDriverName = Drivername.getSelectedItem().toString();
        if (selectedDriverName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a driver.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int driverId;
        String driverQuery = "SELECT driver_id FROM drivers WHERE full_name = ?";
        try (PreparedStatement driverStmt = conn.prepareStatement(driverQuery)) {
            driverStmt.setString(1, selectedDriverName);
            ResultSet driverRs = driverStmt.executeQuery();
            if (driverRs.next()) {
                driverId = driverRs.getInt("driver_id");
            } else {
                JOptionPane.showMessageDialog(this, "Driver not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Now insert the booking
        try (PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, Login.loggedInCustomerId);  // Replace with actual customer ID
            pstmt.setInt(2, selectedVehicle.getVehicle_id());
            pstmt.setInt(3, driverId);
            pstmt.setDate(4, new java.sql.Date(jDateChooser1.getDate().getTime()));
            pstmt.setDate(5, new java.sql.Date(jDateChooser2.getDate().getTime()));
            pstmt.setDouble(6, calculateTotalPrice());

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                // Retrieve generated booking ID
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int bookingId = generatedKeys.getInt(1);
                    JOptionPane.showMessageDialog(this, "Booking Confirmed!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    createAndShowInvoice(bookingId, 1, calculateTotalPrice());
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Booking failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving booking: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RentBTN5RentBTNActionPerformed
    
    private void createAndShowInvoice(int bookingId, int customerid, double totalPrice) {
        // Create an invoice object
        invoice invoiceData = new invoice(
            bookingId,
            selectedVehicle.getBrand(),
            selectedVehicle.getModel(),
            selectedVehicle.getRegistration_number(),
            selectedVehicle.getPrice_per_day(),
            jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
            jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
            totalPrice
        );
        Invoice invoiceFrame = new Invoice(invoiceData);
        invoiceFrame.setVisible(true);
    }
    
    private void HomeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBTNActionPerformed
        // TODO add your handling code here:
        dispose();
        new VehicleBrowser().setVisible(true);
    }//GEN-LAST:event_HomeBTNActionPerformed

    private void LogoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTNActionPerformed
        // TODO add your handling code here:
         dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutBTNActionPerformed

    private void GaraggeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaraggeBTNActionPerformed
        // TODO add your handling code here:
        dispose();
       new RentalHistory().setVisible(true);
    }//GEN-LAST:event_GaraggeBTNActionPerformed

    private void updateCombo(){
        String sql = "SELECT * FROM drivers";
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/vehiclerental?zeroDateTimeBehavior=CONVERT_TO_NULL",
            "root",
            "password"
        );
        
        PreparedStatement pst = conn.prepareStatement(sql);
        var rs = pst.executeQuery();
        
        // Clear previous entries in combo box
        Drivername.removeAllItems();
        
        // Add a default "Select a driver" option
        Drivername.addItem(" ");
        
        // Add all driver names to the combo box
        while (rs.next()) {
            Drivername.addItem(rs.getString("full_name"));
        }
        
        // Add action listener to the combo box
        Drivername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverSelected(evt);
            }
        });

    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void driverSelected(java.awt.event.ActionEvent evt) {
    // Get the selected driver name from the combo box
    String selectedDriverName = Drivername.getSelectedItem().toString();
    
    if (selectedDriverName.equals("Select a driver")) {
        // Do nothing or clear the labels if no driver is selected
        driverName.setText("");
        driverLicense.setText("");
        driverContact.setText("");
        return;
    }

    // Fetch the driver's details from the database based on the selected driver name
    String sql = "SELECT * FROM drivers WHERE full_name = ?";
    
    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/vehiclerental?zeroDateTimeBehavior=CONVERT_TO_NULL",
            "root",
            "password"
        );
        
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, selectedDriverName);
        
        ResultSet rs = pst.executeQuery();
        
        // Update the labels with the driver's details
        if (rs.next()) {
            driverName.setText("Name: " + rs.getString("full_name"));
            driverLicense.setText("License: " + rs.getString("license_number"));
            driverContact.setText("Contact: " + rs.getString("phone_number"));
        } else {
            // Handle the case where the driver is not found
            JOptionPane.showMessageDialog(this, "Driver details not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching driver details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    private void populateVehicleDetails() {
    if (selectedVehicle != null) {
        // Get the original image (handle case if it's an ImageIcon)
        Image originalImage = null;
        if (selectedVehicle.getImage() instanceof ImageIcon) {
            originalImage = ((ImageIcon) selectedVehicle.getImage()).getImage();
        } else if (selectedVehicle.getImage() instanceof Image) {
            originalImage = (Image) selectedVehicle.getImage();
        }

        if (originalImage != null) {
            // Define the new width and height for the resized image
            int width = 257;  // Example width
            int height = 145; // Example height

            // Resize the image
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Create an ImageIcon from the resized image
            ImageIcon icon = new ImageIcon(resizedImage);

            // Set the resized image icon
            image.setIcon(icon);
        }

        // Set other vehicle details
        carName.setText(selectedVehicle.getFullName());
        plateNumber.setText("Plate Number: " + selectedVehicle.getRegistration_number());
        
        // Format the price
        DecimalFormat df = new DecimalFormat("Price: ₱#,##0.00");
        Price.setText(df.format(selectedVehicle.getPrice_per_day()));
    } else {
        JOptionPane.showMessageDialog(this, "No vehicle selected.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    private void pice() {
    // Other components setup
    
    // Add listeners to the date pickers to auto-calculate price when dates are selected
    jDateChooser1.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            updateTotalPrice();
        }
    });
    
    jDateChooser2.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            updateTotalPrice();
        }
    });
}
    

    private void updateTotalPrice() {
        // Check if both start and end dates are selected
        if (jDateChooser1.getDate() != null && jDateChooser2.getDate() != null) {
            // Validate if the end date is after the start date
            if (jDateChooser2.getDate().before(jDateChooser1.getDate())) {
                JOptionPane.showMessageDialog(this, "End date cannot be before start date.", "Invalid Dates", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Calculate the total price
            int totalPrice = calculateTotalPrice();

            // Update the total price label
            if (totalPrice > 0) {
                DecimalFormat df = new DecimalFormat("₱#,##0.00");
                Price.setText("Total Price: " + df.format(totalPrice));
            } else {
                Price.setText("Total Price: ₱0.00");
            }
        } else {
            Price.setText("Total Price: ₱0.00");
        }
    }

    private int calculateTotalPrice() {
        // Ensure that the selectedVehicle is not null
        if (selectedVehicle == null || jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            return 0; // Return 0 if no vehicle or dates are selected
        }

        // Ensure that the end date is after the start date
        if (jDateChooser2.getDate().before(jDateChooser1.getDate())) {
            JOptionPane.showMessageDialog(this, "End date cannot be before the start date.", "Invalid Dates", JOptionPane.WARNING_MESSAGE);
            return 0; // Return 0 for invalid date range
        }

        // Calculate the difference in days
        long diffInMillies = Math.abs(jDateChooser2.getDate().getTime() - jDateChooser1.getDate().getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        // Calculate the total price based on price per day
        double totalPrice = diffInDays * selectedVehicle.getPrice_per_day();

        // Return the total price as an integer (rounded down)
        return (int) totalPrice;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RentalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        ModelItem vehicle = new ModelItem("Tesla Model 3", "123ABC");
        RentalBooking rentalBooking = new RentalBooking(vehicle); 
        rentalBooking.setVisible(true);
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Drivername;
    private javax.swing.JButton GaraggeBTN;
    private javax.swing.JButton HomeBTN;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JLabel Price;
    private javax.swing.JButton RentBTN5;
    private javax.swing.JLabel carName;
    private javax.swing.JLabel driverContact;
    private javax.swing.JLabel driverLicense;
    private javax.swing.JLabel driverName;
    private javax.swing.JLabel image;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel plateNumber;
    // End of variables declaration//GEN-END:variables
}
