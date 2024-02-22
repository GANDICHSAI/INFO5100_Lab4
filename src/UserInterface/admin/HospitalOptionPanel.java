/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.admin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chait
 */
public class HospitalOptionPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel bottomPanel;
    public HospitalOptionPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
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
        hospitalDetails = new javax.swing.JButton();
        systemAdmin = new javax.swing.JButton();

        jLabel1.setText("SELECT ONE OPTION FROM BELOW");

        hospitalDetails.setText("GO TO HOSPITAL DETAILS");
        hospitalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalDetailsActionPerformed(evt);
            }
        });

        systemAdmin.setText("GO TO LOGIN ");
        systemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(systemAdmin)
                .addGap(122, 122, 122)
                .addComponent(hospitalDetails)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalDetails)
                    .addComponent(systemAdmin))
                .addContainerGap(481, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalDetailsActionPerformed
        // TODO add your handling code here:
        
        HospitalAdminPanel hospitalAdminPanel = new HospitalAdminPanel(bottomPanel);
        
        bottomPanel.add(hospitalAdminPanel);
        
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        
        layout.next(bottomPanel);
    }//GEN-LAST:event_hospitalDetailsActionPerformed

    private void systemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemAdminActionPerformed
        // TODO add your handling code here:

        AdminPanel adminPanel = new AdminPanel(bottomPanel);
        bottomPanel.add(adminPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_systemAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hospitalDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton systemAdmin;
    // End of variables declaration//GEN-END:variables
}
