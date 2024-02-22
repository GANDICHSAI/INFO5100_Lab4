/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Patient;

import javax.swing.JOptionPane;

/**
 *
 * @author chait
 */
public class AppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentPanel
     */
    public AppointmentPanel() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("SELECT DOCTORS TO BOOK AN APPOINTMENT");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 412));

        doctorsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        doctorsTable.setMinimumSize(new java.awt.Dimension(500, 80));
        doctorsTable.setPreferredSize(new java.awt.Dimension(500, 80));
        doctorsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctorsTable);

        jButton1.setText("CONFIRM APPOINTMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(491, 491, 491))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorsTableMouseClicked
        // TODO add your handling code here:

        try{
            int selectedRowIndex = doctorsTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one doctor profile");

            }
            else{
//                DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
//
//                firstNameTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
//                lastNameTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
//                cityTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
//                specialtyTextField.setText(model.getValueAt(selectedRowIndex, 3).toString());
//                yearofExperienceTextField.setText(model.getValueAt(selectedRowIndex, 4).toString());
//                qualificationTextField.setText(model.getValueAt(selectedRowIndex, 5).toString());

            }

        }
        catch (IllegalArgumentException e){

            JOptionPane.showMessageDialog(this, e.getMessage(),"Selection Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_doctorsTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doctorsTable;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
