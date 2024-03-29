/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Patient;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chait
 */
public class AppointmentSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAnAppointment
     */
    JPanel bottomPanel;
    Models.Systems rootDataObj;
     
    public AppointmentSelectionPanel(JPanel bottomPanel, Models.Systems rootDataObj) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.rootDataObj = rootDataObj;
        System.out.println("-----2" + this.rootDataObj.getRootCityDirectory());
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
        appointmentButton = new javax.swing.JButton();

        jLabel1.setText("WELCOME TO GENERAL MULTISPECIALTY HOSPITAL HUB");

        appointmentButton.setText("BOOK AN APPOINTMENT WITH DOCTOR");
        appointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(appointmentButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(appointmentButton)
                .addContainerGap(504, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentButtonActionPerformed
        // TODO add your handling code here:
        
        LocationPanel locationPanel = new LocationPanel(bottomPanel, rootDataObj);
        bottomPanel.add(locationPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_appointmentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
