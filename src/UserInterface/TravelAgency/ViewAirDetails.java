/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.AirlineDirectory;
import Business.Airliner;
import Business.FlightDetails;
import Business.FlightDetailsDirectory;
import com.sun.org.apache.xml.internal.dtm.DTM;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Girija Dhawale
 */
public class ViewAirDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirDetails
     */
    private JPanel CardSequenceJPanel;
    private Airliner a;
    private FlightDetailsDirectory flightDetailsDirectory;
    private AirlineDirectory airDict;
    public ViewAirDetails(JPanel CardSequenceJPanel, Airliner a, FlightDetailsDirectory flightDetailsDirectory) {
        initComponents();
        this.a=a;
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.flightDetailsDirectory = flightDetailsDirectory;
        //this.airDict = airDict;
        populate();
        
        txtAirlineName.setText(a.getAirlineName());
        
        
    }

    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tableAirlinerDetails.getModel();
        dtm.setRowCount(0);
        for(FlightDetails fd : flightDetailsDirectory.getFlightDetailsDir()){
        if(fd.getAirlineName().equalsIgnoreCase(a.getAirlineName())){
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = fd.getFlightNumber();
            row[1] = fd.getDeparture();
            row[2] = fd.getArrival();
            row[3] = fd.getSeats();
            row[4] = fd.getPrice();
            row[5] = fd.getDepartureDate().toLocalDate()+" "+ fd.getDepartureDate().toLocalTime();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAirlinerDetails = new javax.swing.JTable();
        airlinernamelbl = new javax.swing.JLabel();
        txtAirlineName = new javax.swing.JTextField();
        airlinerheading = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAirlinerDetails.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        tableAirlinerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Source", "Destination", "Seats", "Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAirlinerDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 1070, 230));

        airlinernamelbl.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        airlinernamelbl.setText("Airliner Name");
        add(airlinernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 160, 40));

        txtAirlineName.setEnabled(false);
        txtAirlineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlineNameActionPerformed(evt);
            }
        });
        add(txtAirlineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 300, 40));

        airlinerheading.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        airlinerheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        airlinerheading.setText("Airliner Details");
        add(airlinerheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 240, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("<Back");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAirlineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlineNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerheading;
    private javax.swing.JLabel airlinernamelbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAirlinerDetails;
    private javax.swing.JTextField txtAirlineName;
    // End of variables declaration//GEN-END:variables
}
