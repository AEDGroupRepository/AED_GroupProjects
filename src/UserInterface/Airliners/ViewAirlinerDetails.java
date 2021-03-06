/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;

import Business.Airline;
import Business.FlightDetails;
import static UserInterface.Airliners.CreateNewAirliner.parseDate;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class ViewAirlinerDetails extends javax.swing.JPanel {

    /**0
     * Creates new form ViewAirlinerDetails
     */
    JPanel CardSequenceJPanel;
    FlightDetails fd;
    Airline airline;
    public ViewAirlinerDetails(JPanel CardSequenceJPanel, FlightDetails fd, Airline airline) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.fd=fd;
        this.airline = airline;
        display();
        
        txtFlightNo.setEditable(false);
        txtSource.setEditable(false);
        txtDestination.setEditable(false);
        txtPrice.setEditable(false);
       
        txtSeats.setEditable(false);
        txtDepDate.setEditable(false);
        txtArrDate.setEditable(false);
    }
       public void display(){
        txtFlightNo.setText(String.valueOf(fd.getFlightNumber()));
        txtSource.setText(fd.getDeparture());
        txtDestination.setText(fd.getArrival());
        txtSeats.setText(String.valueOf(airline.getSeats()));
        txtDepDate.setText(fd.getDepartureDate().toLocalDate()+" "+ fd.getDepartureDate().toLocalTime());
        txtArrDate.setText(fd.getArrivalDate().toLocalDate()+" "+fd.getArrivalDate().toLocalTime());
        txtPrice.setText(String.valueOf(fd.getPrice()));
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDepDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtArrDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(220, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("View Airliner Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 320, 40));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Flight Number");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 150, 30));

        txtFlightNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtFlightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 300, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Departure City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        txtSource.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 300, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Arrival City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        txtSeats.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });
        add(txtSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 300, 30));

        txtDestination.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 300, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Seats");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Departure Date(yyyy-MM-dd HH:mm:ss)");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        txtDepDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtDepDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 300, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 300, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 110, 50));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.MatteBorder(null));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 100, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Arrival Date(yyyy-MM-dd HH:mm:ss)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        txtArrDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(txtArrDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 300, 30));
    }// </editor-fold>//GEN-END:initComponents
 private void backAction() {
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AirlinerTableDetails atd = (AirlinerTableDetails) component;
        atd.populate1();
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:;
        CardSequenceJPanel.remove(this);
        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
//        Component[] componentArray = CardSequenceJPanel.getComponents();
//        Component component = componentArray[componentArray.length-1];
//        AirlinerTableDetails AirlinerWorkAreaJPanel=(AirlinerTableDetails) component;
//        AirlinerWorkAreaJPanel.populate1();
//        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
//        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFlightNo.setEditable(true);
        txtSource.setEditable(true);
        txtDestination.setEditable(true);
        txtSeats.setEditable(true);
        txtDepDate.setEditable(true);
        txtArrDate.setEditable(true);
        txtPrice.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            
        
         String no= txtFlightNo.getText().trim();
        String src=txtSource.getText().trim();
        String dest=txtDestination.getText().trim();
        int s= Integer.parseInt(txtSeats.getText().trim());
        String d=txtDepDate.getText().trim();
        String ad=txtArrDate.getText().trim();
        int p=Integer.parseInt(txtPrice.getText().trim());
         if(!datePatternCorrect()) {
         JOptionPane.showMessageDialog(CardSequenceJPanel, "Please enter date in the mm-dd-yyyy format.");
        }else{       
             DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime depdate = LocalDateTime.parse(d, formatter);
                LocalDateTime dateArr = LocalDateTime.parse(ad, formatter);
        fd.setFlightNumber(no);
        fd.setDeparture(src);
        fd.setArrival(dest);
        fd.setSeats(s);
        fd.setDepartureDate(depdate);
        fd.setArrivalDate(dateArr);
        fd.setPrice(p);
        JOptionPane.showMessageDialog(null, "Airline Details Updated successfully");
}
        txtFlightNo.setEditable(false);
        txtSource.setEditable(false);
        txtDestination.setEditable(false);
        txtPrice.setEditable(false);
        txtDestination.setEditable(false);
        txtSeats.setEditable(false);
    }
        catch(HeadlessException | NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Data", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

boolean datePatternCorrect()  {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtArrDate;
    private javax.swing.JTextField txtDepDate;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
