/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

/**
 *
 * @author A
 */
public class NewPatient extends javax.swing.JPanel {

    /**
     * Creates new form NewPatient
     */
    public NewPatient() {
        initComponents();
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
        fnLabel2 = new javax.swing.JLabel();
        lnLabel3 = new javax.swing.JLabel();
        IDLabel4 = new javax.swing.JLabel();
        ageLabel5 = new javax.swing.JLabel();
        pnLabel6 = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        houseLabel3 = new javax.swing.JLabel();
        cityLabel4 = new javax.swing.JLabel();
        communityLabel7 = new javax.swing.JLabel();
        patientFnTextField = new javax.swing.JTextField();
        patientLnTextField = new javax.swing.JTextField();
        patientIDTextField1 = new javax.swing.JTextField();
        patientPnTextField2 = new javax.swing.JTextField();
        patientAgeTextField3 = new javax.swing.JTextField();
        patientEmailTextField1 = new javax.swing.JTextField();
        patientHouseTextField2 = new javax.swing.JTextField();
        patientCityextField3 = new javax.swing.JTextField();
        communityComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Creat New Patient Entry");

        fnLabel2.setText("First Name");

        lnLabel3.setText("Last Name");

        IDLabel4.setText("ID");

        ageLabel5.setText("Age");

        pnLabel6.setText("Phone Number");

        emailLabel2.setText("Email");

        houseLabel3.setText("House");

        cityLabel4.setText("City");

        communityLabel7.setText("Community");

        patientFnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientFnTextFieldActionPerformed(evt);
            }
        });

        patientEmailTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientEmailTextField1ActionPerformed(evt);
            }
        });

        patientHouseTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientHouseTextField2ActionPerformed(evt);
            }
        });

        patientCityextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCityextField3ActionPerformed(evt);
            }
        });

        communityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        saveButton.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(houseLabel3)
                                .addGap(98, 98, 98)
                                .addComponent(patientHouseTextField2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnLabel2)
                                    .addComponent(lnLabel3)
                                    .addComponent(IDLabel4)
                                    .addComponent(ageLabel5)
                                    .addComponent(pnLabel6)
                                    .addComponent(emailLabel2))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientPnTextField2)
                                    .addComponent(patientIDTextField1)
                                    .addComponent(patientLnTextField)
                                    .addComponent(patientFnTextField)
                                    .addComponent(patientAgeTextField3)
                                    .addComponent(patientEmailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityLabel4)
                                    .addComponent(communityLabel7))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientCityextField3)
                                        .addComponent(communityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fnLabel2)
                    .addComponent(patientFnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnLabel3)
                    .addComponent(patientLnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel4)
                    .addComponent(patientIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel5)
                    .addComponent(patientAgeTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnLabel6)
                    .addComponent(patientPnTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel2)
                    .addComponent(patientEmailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseLabel3)
                    .addComponent(patientHouseTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel4)
                    .addComponent(patientCityextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communityLabel7)
                    .addComponent(communityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(saveButton)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientFnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientFnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientFnTextFieldActionPerformed

    private void patientEmailTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientEmailTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientEmailTextField1ActionPerformed

    private void patientHouseTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientHouseTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientHouseTextField2ActionPerformed

    private void patientCityextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCityextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientCityextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel4;
    private javax.swing.JLabel ageLabel5;
    private javax.swing.JLabel cityLabel4;
    private javax.swing.JComboBox<String> communityComboBox;
    private javax.swing.JLabel communityLabel7;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel fnLabel2;
    private javax.swing.JLabel houseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lnLabel3;
    private javax.swing.JTextField patientAgeTextField3;
    private javax.swing.JTextField patientCityextField3;
    private javax.swing.JTextField patientEmailTextField1;
    private javax.swing.JTextField patientFnTextField;
    private javax.swing.JTextField patientHouseTextField2;
    private javax.swing.JTextField patientIDTextField1;
    private javax.swing.JTextField patientLnTextField;
    private javax.swing.JTextField patientPnTextField2;
    private javax.swing.JLabel pnLabel6;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
