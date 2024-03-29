/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.admin;

import Models.City;
import Models.Community;
import Models.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chait
 */
public class ExistingCommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminPanel
     */
    JPanel bottomPanel;
    public ExistingCommunityAdminPanel(JPanel bottomPanel){
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityTable = new javax.swing.JTable();
        viewCommunityButton = new javax.swing.JButton();
        deleteCommunityButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateCommunityButton = new javax.swing.JButton();
        communityNameTextField = new javax.swing.JTextField();
        cityNameTextField = new javax.swing.JTextField();
        postalCodeTextField = new javax.swing.JTextField();
        addCommunityButton = new javax.swing.JButton();
        goToSystemAdminButton = new javax.swing.JButton();

        jLabel3.setText("COMMUNITY");

        communityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Commmunity Name", "City Name", "Postal Code"
            }
        ));
        communityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                communityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(communityTable);

        viewCommunityButton.setText("VIEW COMMUNITY DETAILS");
        viewCommunityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCommunityButtonActionPerformed(evt);
            }
        });

        deleteCommunityButton.setText("DELETE COMMUNITY DETAILS");
        deleteCommunityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCommunityButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Community Name");

        jLabel2.setText("City Name");

        jLabel4.setText("Postal Code");

        updateCommunityButton.setText("UPDATE COMMUNITY DETAILS");
        updateCommunityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCommunityButtonActionPerformed(evt);
            }
        });

        addCommunityButton.setText("ADD COMMUNITY DETAILS");
        addCommunityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCommunityButtonActionPerformed(evt);
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
                        .addGap(20, 20, 20)
                        .addComponent(goToSystemAdminButton)
                        .addGap(222, 222, 222)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewCommunityButton)
                                .addGap(26, 26, 26)
                                .addComponent(updateCommunityButton)
                                .addGap(32, 32, 32)
                                .addComponent(deleteCommunityButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(communityNameTextField)
                            .addComponent(cityNameTextField)
                            .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(addCommunityButton)))
                .addContainerGap(630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(goToSystemAdminButton))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(communityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(addCommunityButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCommunityButton)
                    .addComponent(deleteCommunityButton)
                    .addComponent(updateCommunityButton))
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCommunityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCommunityButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            int selectedRowIndex = communityTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one community details to delete");
                
            }
            else{
                DefaultTableModel model = (DefaultTableModel) communityTable.getModel();
                
                model.removeRow(selectedRowIndex);
                
                communityNameTextField.setText("");
                cityNameTextField.setText("");
                postalCodeTextField.setText("");
             
            }
           
            
        }
        catch (IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_deleteCommunityButtonActionPerformed

    private void viewCommunityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCommunityButtonActionPerformed
        // TODO add your handling code here:
        
        ViewCommunityDetails viewCommunityDetails = new ViewCommunityDetails(communityTable,bottomPanel);
        bottomPanel.add(viewCommunityDetails);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewCommunityButtonActionPerformed

    
    private void updateCommunityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCommunityButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) communityTable.getModel();
        model.setValueAt(communityNameTextField.getText(),communityTable.getSelectedRow(),0);
        model.setValueAt(cityNameTextField.getText(),communityTable.getSelectedRow(),1);
        model.setValueAt(postalCodeTextField.getText(),communityTable.getSelectedRow(),2);

        communityNameTextField.setText("");
        cityNameTextField.setText("");
        postalCodeTextField.setText("");
        
        JOptionPane.showMessageDialog(this, "Community Details Updated Successfully");
       
    }//GEN-LAST:event_updateCommunityButtonActionPerformed
                                                   
   

    private void communityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_communityTableMouseClicked
        // TODO add your handling code here:
        
        try{
            int selectedRowIndex = communityTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one community details");
                
            }
            else{
                DefaultTableModel model = (DefaultTableModel) communityTable.getModel();

                cityNameTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
                postalCodeTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
                communityNameTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
            }
           
            
        }
        catch (IllegalArgumentException e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_communityTableMouseClicked

    private void addCommunityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCommunityButtonActionPerformed
        // TODO add your handling code here:
        
        Person person = new Person();
        Community community = new Community();
        City city = new City("","");
        
        community.setCommunityName(communityNameTextField.getText());
        person.setCommunity(community);
        city.setCityName(cityNameTextField.getText());
        city.setPostalCode(postalCodeTextField.getText());
        person.setCity(city);

        populateCommunityDetails(person);
        
        communityNameTextField.setText("");
        cityNameTextField.setText("");
        postalCodeTextField.setText("");
        
        JOptionPane.showMessageDialog(this, "Community Details Added Successfully");
    
    }//GEN-LAST:event_addCommunityButtonActionPerformed

    private void goToSystemAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToSystemAdminButtonActionPerformed
        // TODO add your handling code here:

        CommunityOptionPanel communityOptionPanel = new CommunityOptionPanel(bottomPanel);
        bottomPanel.add(communityOptionPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_goToSystemAdminButtonActionPerformed
    private void populateCommunityDetails(Person person){

        String data[] = {person.getCommunity().getCommunityName(),person.getCity().getCityName(),person.getCity().getPostalCode()};

        DefaultTableModel tblmodel = (DefaultTableModel) communityTable.getModel();

        tblmodel.addRow(data);
        
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCommunityButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField communityNameTextField;
    private javax.swing.JTable communityTable;
    private javax.swing.JButton deleteCommunityButton;
    private javax.swing.JButton goToSystemAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField postalCodeTextField;
    private javax.swing.JButton updateCommunityButton;
    private javax.swing.JButton viewCommunityButton;
    // End of variables declaration//GEN-END:variables
}
