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
public class PatientOptionPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientOptionPanel
     */
    JPanel bottomPanel;
    public PatientOptionPanel(JPanel bottomPanel) {
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
        systemAdmin = new javax.swing.JButton();
        patientDetails = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        jLabel1.setText("SELECT ONE OPTION FROM BELOW");

        systemAdmin.setText("GO TO SYSTEM ADMIN");
        systemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemAdminActionPerformed(evt);
            }
        });

        patientDetails.setText("GO TO PATIENT DETAILS");
        patientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsActionPerformed(evt);
            }
        });

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(goBackButton)
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(systemAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(patientDetails)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(goBackButton))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemAdmin)
                    .addComponent(patientDetails))
                .addContainerGap(485, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void systemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemAdminActionPerformed
        // TODO add your handling code here:
        AdminPanel adminPanel = new AdminPanel(bottomPanel);
        bottomPanel.add(adminPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.previous(bottomPanel);
        
    }//GEN-LAST:event_systemAdminActionPerformed

    private void patientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsActionPerformed
        // TODO add your handling code here:
        
        
        
        PatientAdminPanel patientAdminPanel = new PatientAdminPanel(bottomPanel);
        
        bottomPanel.add(patientAdminPanel);

        CardLayout layout = (CardLayout) bottomPanel.getLayout();

        layout.next(bottomPanel);
    }//GEN-LAST:event_patientDetailsActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:

        CommunityOptionPanel communityOptionPanel = new CommunityOptionPanel(bottomPanel);
        bottomPanel.add(communityOptionPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.previous(bottomPanel);
    }//GEN-LAST:event_goBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton patientDetails;
    private javax.swing.JButton systemAdmin;
    // End of variables declaration//GEN-END:variables
}
