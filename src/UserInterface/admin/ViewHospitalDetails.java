/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chait
 */
public class ViewHospitalDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalDetails
     */
    JTable hospitalTable;
    JPanel bottomPanel;
    public ViewHospitalDetails(JTable hospitalTable,JPanel bottomPanel) {
        initComponents();
        this.hospitalTable = hospitalTable;
        this.bottomPanel = bottomPanel;
        populateHospitalDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        communityLabel1 = new javax.swing.JLabel();
        cityLabel1 = new javax.swing.JLabel();
        phoneLabel1 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        communityTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        hospitalNameTextField = new javax.swing.JTextField();
        hospitalNameLabel1 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        communityLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        communityLabel1.setForeground(new java.awt.Color(255, 255, 255));
        communityLabel1.setText("Community");

        cityLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cityLabel1.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel1.setText("City");

        phoneLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phoneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel1.setText("Phone No.");

        phoneTextField.setPreferredSize(new java.awt.Dimension(100, 23));

        hospitalNameLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hospitalNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        hospitalNameLabel1.setText("Hospital Name");

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(goBackButton)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cityTextField)
                        .addComponent(communityTextField)
                        .addComponent(hospitalNameTextField)
                        .addComponent(hospitalNameLabel1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(communityLabel1)
                        .addComponent(cityLabel1)
                        .addComponent(phoneLabel1)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(hospitalNameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(communityLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:

        HospitalAdminPanel hospitalAdminPanel = new HospitalAdminPanel(bottomPanel);
        bottomPanel.add(hospitalAdminPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void populateHospitalDetails()
        {
            try{
                int selectedRowIndex = hospitalTable.getSelectedRow();
                if(selectedRowIndex < 0 ){

                    throw new IllegalArgumentException("Select any one hospital details to view");

                }
                else{
                    DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();

                    hospitalNameTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
                    cityTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
                    communityTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
                    phoneTextField.setText(model.getValueAt(selectedRowIndex, 3).toString());

                    hospitalNameTextField.setEditable(false);
                    phoneTextField.setEditable(false);
                    cityTextField.setEditable(false);
                    communityTextField.setEditable(false);

                }

            }catch (IllegalArgumentException e){
                 JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel communityLabel1;
    private javax.swing.JTextField communityTextField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel hospitalNameLabel1;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables
}
