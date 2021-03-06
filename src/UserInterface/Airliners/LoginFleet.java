/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;

import Business.Airline;
import Business.AirlineDirectory;
import Business.Airliner;
import Business.Fleet;
import Business.FleetDirectory;
import Business.FlightDetailsDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Girija Dhawale
 */
public class LoginFleet extends javax.swing.JPanel {
 private JPanel CardSequenceJPanel;
    private AirlineDirectory airlineDirectory;
    private Airliner airliner;
    private FleetDirectory fleetDirectory;
    private Fleet fleet;
    private FlightDetailsDirectory flightDetailsDirectory;
   
    LoginFleet(JPanel CardSequenceJPanel, AirlineDirectory airDuct, Airliner airliner, FleetDirectory fleetDirectory,FlightDetailsDirectory flightDetailsDirectory) {
        initComponents();
        
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.airliner=airliner;
        this.airlineDirectory=airDuct;
        this.fleetDirectory=fleetDirectory;
        this.flightDetailsDirectory = flightDetailsDirectory;
        
        
        fleetComboBox.removeAllItems();
        
       for(Airline f : airlineDirectory.getAirlineDirectory()) {
            if(airliner.getAirlineName().equalsIgnoreCase(f.getAirlinerName()))
            {
           fleetComboBox.addItem(f.getAirlineName());
            }
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

        fleetComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnGo1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 255, 255));

        fleetComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fleetComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        fleetComboBox.setBorder(new javax.swing.border.MatteBorder(null));
        fleetComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fleetComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Airplane Name");

        btnGo1.setBackground(new java.awt.Color(255, 255, 255));
        btnGo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnGo1.setText("GO");
        btnGo1.setBorder(new javax.swing.border.MatteBorder(null));
        btnGo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fleetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(896, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fleetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addComponent(btnGo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fleetComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fleetComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fleetComboBoxActionPerformed

    private void btnGo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGo1ActionPerformed
        // TODO add your handling code here:
        String airlinename = (String)fleetComboBox.getSelectedItem();
        Airline airline = airlineDirectory.getAirlineName(airlinename, airliner.getAirlineName());
        AirlinerTableDetails atd = new AirlinerTableDetails(CardSequenceJPanel, airliner, airlineDirectory, airline, fleetDirectory, flightDetailsDirectory);
        CardSequenceJPanel.add("AirlinerTableDetails",atd);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnGo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo1;
    private javax.swing.JComboBox fleetComboBox;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
