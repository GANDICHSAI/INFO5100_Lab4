/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Patient;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Models.City;
import Models.Community;

/**
 *
 * @author chait
 */
public class LocationPanel extends javax.swing.JPanel {

    /**
     * Creates new form Doctors
     */
    JPanel bottomPanel;
    Models.Systems rootDataObj;

    public LocationPanel(JPanel bottomPanel, Models.Systems rootDataObj) {
        initComponents();
        this.rootDataObj = rootDataObj;
        this.bottomPanel = bottomPanel;
        populateCityValues();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cityDropDown = new javax.swing.JComboBox<>();
        communityDropDown = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        goBackToPatientPanel = new javax.swing.JButton();

        jLabel1.setText("SELECT LOCATION ");

        jLabel2.setText("CITY");

        jLabel3.setText("COMMUNITY");

        cityDropDown.setToolTipText("SELECT CITY");
        cityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDropDownActionPerformed(evt);
            }
        });

        communityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityDropDownActionPerformed(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        goBackToPatientPanel.setText("GO BACK");
        goBackToPatientPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToPatientPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(goBackToPatientPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(259, 259, 259))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(goBackToPatientPanel))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(communityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(submitButton)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        cityDropDown.getAccessibleContext().setAccessibleName("SLECT CITY");
    }// </editor-fold>//GEN-END:initComponents

        private void populateCityValues() {
        for(City cityObj: rootDataObj.getRootCityDirectory()){
            cityDropDown.addItem(cityObj.getCityName());
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        City selectedCity = rootDataObj.getRootCityDirectory().get(cityDropDown.getSelectedIndex());
        Community selectedCommunity = selectedCity.getCommunityDirectory().get(communityDropDown.getSelectedIndex());

        AppointmentPanel appointmentPanel = new AppointmentPanel(bottomPanel, rootDataObj, selectedCity, selectedCommunity);
        bottomPanel.add(appointmentPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void goBackToPatientPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackToPatientPanelActionPerformed
        // TODO add your handling code here:

        AppointmentSelectionPanel appointmentSelectionPanel = new AppointmentSelectionPanel(bottomPanel, rootDataObj);
        bottomPanel.add(appointmentSelectionPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_goBackToPatientPanelActionPerformed

    private void communityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityDropDownActionPerformed

    private void cityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDropDownActionPerformed
        // TODO add your handling code here:
        City selectedCity = rootDataObj.getRootCityDirectory().get(cityDropDown.getSelectedIndex());
        communityDropDown.removeAllItems();
        for(Community comObj: selectedCity.getCommunityDirectory()){
            communityDropDown.addItem(comObj.getCommunityName());
        }
        communityDropDown.setSelectedItem(null);
    }//GEN-LAST:event_cityDropDownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityDropDown;
    private javax.swing.JComboBox<String> communityDropDown;
    private javax.swing.JButton goBackToPatientPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
