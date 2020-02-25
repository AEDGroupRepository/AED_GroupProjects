/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

/**
 *
 * @author Girija Dhawale
 */

import Business.AirlineDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.FlightDetails;
import Business.Seats;
import com.sun.glass.events.KeyEvent;



import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FlightFilterData extends javax.swing.JPanel {

    /**
     * Creates new form FlightFilterData
     */
    JPanel CardSequenceJPanel;
ArrayList<FlightDetails> customerSearch;
 private CustomerDirectory custDict;
 String p;
 private AirlineDirectory airlineDirectory;
 private Seats seats;

   

    FlightFilterData(JPanel CardSequenceJPanel, ArrayList<FlightDetails> customerSearch, CustomerDirectory custDict, Seats seats) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.customerSearch=customerSearch;
        this.custDict=custDict;
        this.airlineDirectory=airlineDirectory;
        this.seats = seats;
        //seats.setSeats();
        populate10();
        
        
        tableFlightClassification.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,34));
    }
    
    
    public void populate10(){
    
        int rowCount = tableFlightClassification.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)tableFlightClassification.getModel();
        dtm.setRowCount(0);
        //Collections.sort(customerSearch);
        for(FlightDetails fdd : customerSearch){
        Object[] row = new Object[dtm.getColumnCount()];
        row[0]=fdd.getFlightNumber();
        row[1] = fdd.getAirlineName();
        row[2]=fdd.getDeparture();
        row[3]=fdd.getArrival();
        row[4]=fdd.getDepartureDate().toLocalDate()+" "+ fdd.getDepartureDate().toLocalTime();
        row[5]=fdd.getPrice();
        row[6]=fdd.getSeats();
        dtm.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFlightClassification = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassportNumber = new javax.swing.JTextField();
        btnConfirmBooking = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        seatsComboBox = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(220, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 40));

        tableFlightClassification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Airliner", "Departure", "Arrival", "Date", "Price", "Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFlightClassification);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 820, 280));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });
        add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 220, 42));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Phone:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 220, 42));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Passport No:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));
        add(txtPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 220, 42));

        btnConfirmBooking.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmBooking.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnConfirmBooking.setText("Confirm Booking");
        btnConfirmBooking.setBorder(new javax.swing.border.MatteBorder(null));
        btnConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookingActionPerformed(evt);
            }
        });
        add(btnConfirmBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 210, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Seat:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        seatsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        seatsComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatsComboBoxMouseClicked(evt);
            }
        });
        seatsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsComboBoxActionPerformed(evt);
            }
        });
        add(seatsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Email:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        customerSearch.clear();
        CardSequenceJPanel.remove(this);//points to the current object
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBookingActionPerformed
        // TODO add your handling code here:
        int selectedrow = tableFlightClassification.getSelectedRow();
        String name = txtCustomerName.getText().trim();
        String seatNo = (String) seatsComboBox.getSelectedItem();
        if (seatNo == "--Select--" || emailTextField.getText().isEmpty() || txtCustomerName.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || txtPassportNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter all the fields");
        } else {

            if (selectedrow >= 0 && !name.isEmpty()) {

                String phoneno = txtPhoneNumber.getText().trim();

                String passport = txtPassportNumber.getText().trim();

                
                
                String email = emailTextField.getText().trim();
                if (!phonePatternCorrect()) {
                    JOptionPane.showMessageDialog(CardSequenceJPanel, "Enter valid phone number");
                } else if(!emailCorrect()){
                    JOptionPane.showMessageDialog(CardSequenceJPanel, "Enter valid email address");
                }
                else {
                    Random rand = new Random();
                    Customer c = custDict.addCustomer();
                    c.setName(name);
                    c.setPhoneNumber(phoneno);
                    c.setPassportNumber(passport);
                    c.setSetSeatNo(seatNo);
        //c.setCustflight(custflight);
                    String flightNo=(String) tableFlightClassification.getValueAt(selectedrow, 0);
                    c.setFlightNumer(flightNo);
                    c.setBookingId(rand.nextInt(1000000));
                    c.setEmail(email);
//                    int value = 0;
//                    //value=fd.getSeats();
//                    if (value > 0) {
//                        value--;
//                        //fd.setSeats(value);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Seats not available");
//                    }
//        c.setFightNumber(fd.getFlightNumber());
//        c.setDeparture(fd.getDeparture());
//        c.setArrival(fd.getArrival());
                    //c.setPrice(fd.getPrice());
                    //c.setDate(fd.getDate());

                    JOptionPane.showMessageDialog(null, "Successfully Booked!!");
                    seats.bookSeats(Integer.parseInt(seatNo));
                    populate10();

                    txtCustomerName.setText("");
                    txtPhoneNumber.setText("");
                    txtPassportNumber.setText("");
                    emailTextField.setText("");
                    seatsComboBox.removeAllItems();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Book. Select flight first.");
            }
        }
                                                    
        
    
    }//GEN-LAST:event_btnConfirmBookingActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
//       int key=evt.getKeyCode();
//        if((key>=evt.VK_0 && key<=evt.VK_9)|| key==KeyEvent.VK_BACKSPACE)
//        {
//        txtPhone.setEditable(true);
//        }
//        else{
//        txtPhone.setEditable(false);
//        }
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void seatsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_seatsComboBoxActionPerformed

    private void seatsComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seatsComboBoxMouseClicked
        // TODO add your handling code here:
        int selectedrow=tableFlightClassification.getSelectedRow();
        if(selectedrow>=0){
            seatsComboBox.removeAllItems();
            int seatCount=(int) tableFlightClassification.getValueAt(selectedrow, 6);
            seats.setTotalSeats(seatCount);
            ArrayList<Integer> availableSeats = seats.getAvailableSeats();
            for(int i =0; i<availableSeats.size(); i++){
                seatsComboBox.addItem(""+availableSeats.get(i)+"");
            }
        }
    }//GEN-LAST:event_seatsComboBoxMouseClicked

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

  boolean phonePatternCorrect()  {
        Pattern p= Pattern.compile("^[0-9]{10}+$");
        Matcher m = p.matcher(txtPhoneNumber.getText());
        return m.matches();
    }
  boolean emailCorrect(){
      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        return pat.matcher(emailTextField.getText()).matches(); 
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmBooking;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seatsComboBox;
    private javax.swing.JTable tableFlightClassification;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
