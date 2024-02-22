/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.admin;

import Models.City;
import Models.Doctor;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yihan
 */
public class DoctorAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalModifyPanel
     */
    JPanel bottomPanel;
    
    public DoctorAdminPanel(JPanel bottomPanel) {
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

        addDoctorLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        cityLabel = new javax.swing.JLabel();
        yearofExperienceLabel = new javax.swing.JLabel();
        qualificationLabel = new javax.swing.JLabel();
        specialtyLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        specialtyTextField = new javax.swing.JTextField();
        yearofExperienceTextField = new javax.swing.JTextField();
        qualificationTextField = new javax.swing.JTextField();
        addDoctorButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        goToSystemAdminButton = new javax.swing.JButton();

        addDoctorLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addDoctorLabel.setText("Doctor");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("LastName");

        firstNameTextField.setPreferredSize(new java.awt.Dimension(100, 23));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 412));

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "City", "Specialty", "YoE", "Qualifications"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        doctorTable.setMinimumSize(new java.awt.Dimension(500, 80));
        doctorTable.setPreferredSize(new java.awt.Dimension(500, 80));
        doctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctorTable);
        if (doctorTable.getColumnModel().getColumnCount() > 0) {
            doctorTable.getColumnModel().getColumn(0).setResizable(false);
            doctorTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            doctorTable.getColumnModel().getColumn(1).setResizable(false);
            doctorTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            doctorTable.getColumnModel().getColumn(2).setResizable(false);
            doctorTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            doctorTable.getColumnModel().getColumn(3).setResizable(false);
            doctorTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            doctorTable.getColumnModel().getColumn(4).setResizable(false);
            doctorTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            doctorTable.getColumnModel().getColumn(5).setResizable(false);
            doctorTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        cityLabel.setText("City");

        yearofExperienceLabel.setText("Years of Experience");

        qualificationLabel.setText("Qualifications");

        specialtyLabel.setText("Specialty");

        yearofExperienceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearofExperienceTextFieldKeyPressed(evt);
            }
        });

        addDoctorButton.setText("ADD NEW DOCTOR DETAILS");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        viewButton.setText("VIEW DOCTOR DETAILS");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE DOCTOR DETAILS");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE DOCTOR DETAILS");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        goToSystemAdminButton.setText("GO BACK");
        goToSystemAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToSystemAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(goToSystemAdminButton)
                        .addGap(255, 255, 255)
                        .addComponent(addDoctorLabel)))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewButton)
                        .addGap(138, 138, 138)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(cityLabel))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(232, 232, 232)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(specialtyLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(specialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearofExperienceLabel)
                                            .addComponent(qualificationLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qualificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(yearofExperienceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(addDoctorButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDoctorLabel)
                    .addComponent(goToSystemAdminButton))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel)
                    .addComponent(specialtyLabel)
                    .addComponent(specialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameLabel)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearofExperienceLabel))
                    .addComponent(yearofExperienceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qualificationLabel)
                        .addComponent(cityLabel)
                        .addComponent(qualificationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addGap(69, 69, 69)
                .addComponent(addDoctorButton)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(viewButton))
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:

        Doctor doctor = new Doctor();
        
        City city =  new City("","");
       

        doctor.setFirstName(firstNameTextField.getText());
        doctor.setLastName(lastNameTextField.getText());
        city.setCityName(cityTextField.getText());
        doctor.setSpecialty(specialtyTextField.getText());
        doctor.setYearsOfExperiencce(Integer.parseInt(yearofExperienceTextField.getText()));
        doctor.setQualifications(qualificationTextField.getText());
        doctor.setCity(city);

        populateDoctorDetails(doctor);

        firstNameTextField.setText("");
        lastNameTextField.setText("");
        cityTextField.setText("");
        specialtyTextField.setText("");
        yearofExperienceTextField.setText("");
        qualificationTextField.setText("");
        
        

        JOptionPane.showMessageDialog(this, "Doctor Details Added Successfully");
    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:

        ViewDoctorDetails viewDoctorDetails = new ViewDoctorDetails(doctorTable,bottomPanel);
        bottomPanel.add(viewDoctorDetails);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        try{
            int selectedRowIndex = doctorTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one patient details to delete");

            }
            else{

                DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();

                model.removeRow(selectedRowIndex);

                firstNameTextField.setText("");
                lastNameTextField.setText("");
                cityTextField.setText("");
                specialtyTextField.setText("");
                yearofExperienceTextField.setText("");
                qualificationTextField.setText("");

            }

        }
        catch (IllegalArgumentException e){

            JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        model.setValueAt(firstNameTextField.getText(),doctorTable.getSelectedRow(),0);
        model.setValueAt(lastNameTextField.getText(),doctorTable.getSelectedRow(),1);
        model.setValueAt(cityTextField.getText(),doctorTable.getSelectedRow(),2);
        model.setValueAt(specialtyTextField.getText(),doctorTable.getSelectedRow(),3);
        model.setValueAt(yearofExperienceTextField.getText(),doctorTable.getSelectedRow(),4);

        model.setValueAt(qualificationTextField.getText(),doctorTable.getSelectedRow(),5);

  

        firstNameTextField.setText("");
        lastNameTextField.setText("");
        cityTextField.setText("");
        specialtyTextField.setText("");
        yearofExperienceTextField.setText("");
        qualificationTextField.setText("");

        JOptionPane.showMessageDialog(this, "Doctor Details Updated Successfully");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void goToSystemAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToSystemAdminButtonActionPerformed
        // TODO add your handling code here:

        DoctorOptionPanel doctorOptionPanel = new DoctorOptionPanel(bottomPanel);
        bottomPanel.add(doctorOptionPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_goToSystemAdminButtonActionPerformed

    private void doctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorTableMouseClicked
        // TODO add your handling code here:
        
         try{
            int selectedRowIndex = doctorTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one doctor profile");
                
            }
            else{
                DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
                
                firstNameTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
                lastNameTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
                cityTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
                specialtyTextField.setText(model.getValueAt(selectedRowIndex, 3).toString());
                yearofExperienceTextField.setText(model.getValueAt(selectedRowIndex, 4).toString());
                qualificationTextField.setText(model.getValueAt(selectedRowIndex, 5).toString());

                
            }
           
            
        }
        catch (IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_doctorTableMouseClicked

    private void yearofExperienceTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearofExperienceTextFieldKeyPressed
        // TODO add your handling code here:
        try{
            int yoe = Integer.parseInt(yearofExperienceTextField.getText());
            
            yearofExperienceTextField.setForeground(Color.black);
        } 
        catch(Exception e){
            yearofExperienceTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_yearofExperienceTextFieldKeyPressed
    private void populateDoctorDetails(Doctor doctor){
        
        
        String data[] = {doctor.getFirstName(),doctor.getLastName(),doctor.getCity().getCityName(),doctor.getSpecialty(),String.valueOf(doctor.getYearsOfExperiencce()),doctor.getQualifications()};

        DefaultTableModel tblmodel = (DefaultTableModel) doctorTable.getModel();

        tblmodel.addRow(data);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JLabel addDoctorLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable doctorTable;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton goToSystemAdminButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel qualificationLabel;
    private javax.swing.JTextField qualificationTextField;
    private javax.swing.JLabel specialtyLabel;
    private javax.swing.JTextField specialtyTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel yearofExperienceLabel;
    private javax.swing.JTextField yearofExperienceTextField;
    // End of variables declaration//GEN-END:variables
}
