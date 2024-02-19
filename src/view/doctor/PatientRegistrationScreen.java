/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import javax.swing.JPanel;

/**
 *
 * @author A
 */
public class PatientRegistrationScreen extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistrationScreen
     */
    JPanel bottomPanel;
    
    public PatientRegistrationScreen(JPanel bottomPanel) {
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

        patientTypeTitleLable = new javax.swing.JLabel();
        existingPatientButton1 = new javax.swing.JButton();
        newPatientButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        patientTypeTitleLable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        patientTypeTitleLable.setText("Select Patient Type");

        existingPatientButton1.setText("Existing Patient");
        existingPatientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingPatientButton1ActionPerformed(evt);
            }
        });

        newPatientButton2.setText("NewPatient");
        newPatientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(patientTypeTitleLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(existingPatientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(newPatientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientTypeTitleLable)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existingPatientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPatientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(500, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newPatientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPatientButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void existingPatientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingPatientButton1ActionPerformed
        // TODO add your handling code here:
//        ExistingPatient existingPatientSelection = new ExistigPatient(bottomPanel);
    }//GEN-LAST:event_existingPatientButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton existingPatientButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton newPatientButton2;
    private javax.swing.JLabel patientTypeTitleLable;
    // End of variables declaration//GEN-END:variables
}
