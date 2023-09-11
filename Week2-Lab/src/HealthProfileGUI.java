
import java.awt.Color;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gb
 */
public class HealthProfileGUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthProfileGUI
     */
    public HealthProfileGUI() {
        initComponents();
        
        // center the form and change background color
        this.setLocationRelativeTo(null); 
        this.getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblFeet = new javax.swing.JLabel();
        txtFeet = new javax.swing.JTextField();
        lblInches = new javax.swing.JLabel();
        txtInches = new javax.swing.JTextField();
        lblBMI = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        lblMaxHR = new javax.swing.JLabel();
        txtMaxHR = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnDisplay1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Profile App");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName.setText("Name:");
        lblName.setToolTipText("");

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAge.setText("Age:");
        lblAge.setToolTipText("");

        txtAge.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblWeight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblWeight.setText("Weight:");
        lblWeight.setToolTipText("");

        txtWeight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblFeet.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFeet.setText("Height - Feet:");
        lblFeet.setToolTipText("");

        txtFeet.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblInches.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblInches.setText("Height-Inches:");
        lblInches.setToolTipText("");

        txtInches.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblBMI.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblBMI.setText("BMI:");
        lblBMI.setToolTipText("");

        txtBMI.setEditable(false);
        txtBMI.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblCategory.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCategory.setText("Category:");
        lblCategory.setToolTipText("");

        txtCategory.setEditable(false);
        txtCategory.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblMaxHR.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMaxHR.setText("Max Heart Rate:");
        lblMaxHR.setToolTipText("");

        txtMaxHR.setEditable(false);
        txtMaxHR.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnClear.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDisplay1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDisplay1.setText("Display");
        btnDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblInches, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtInches, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeet)
                    .addComponent(txtFeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInches)
                    .addComponent(txtInches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplay1)
                    .addComponent(btnClear))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBMI)
                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxHR)
                    .addComponent(txtMaxHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay1ActionPerformed
        // Verify the txtfileds
        
        if ( txtName.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Name is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocus();
            return;   // Stops the method from running 
        }
        
        if ( txtAge.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Age is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtAge.requestFocus();
            return;   // Stops the method from running 
        }
        
        if ( txtWeight.getText().equals("") ) {
           JOptionPane.showMessageDialog(this, "Weight is required.", "Error", JOptionPane.ERROR_MESSAGE);
           txtWeight.requestFocus();
           return;   // Stops the method from running 
        }
        
       if ( txtFeet.getText().equals("") ) {
           JOptionPane.showMessageDialog(this, "Height-Feet is required.", "Error", JOptionPane.ERROR_MESSAGE);
           txtFeet.requestFocus();
           return;   // Stops the method from running 
       }
        
       if ( txtInches.getText().equals("") ) {
          JOptionPane.showMessageDialog(this, "Height-Inches is required.", "Error", JOptionPane.ERROR_MESSAGE);
          txtInches.requestFocus();
          return;   // Stops the method from running 
        }
        
        //get data from txtfields
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText() );
        double weight = Double.parseDouble(txtWeight.getText() );
        int feet = Integer.parseInt(txtFeet.getText() );
        double inches = Double.parseDouble(txtInches.getText() ); 
        
        
        
        //create HealthProfile object
        
        HealthProfile profile = new HealthProfile(name, age, weight, feet, inches); 
        
        
        //show output
        double bmi = profile.calculateBMI();
        DecimalFormat fmt = new DecimalFormat("0.0"); 
        txtBMI.setText(fmt.format(bmi) );
        txtCategory.setText(profile.calculateCategory() ); 
        txtMaxHR.setText( "" + profile.calculateMAXHR() ); 
        
        
        
        
    }//GEN-LAST:event_btnDisplay1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // clear all fields
        
        txtName.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        txtFeet.setText("");
        txtInches.setText("");
        txtBMI.setText("");
        txtCategory.setText("");
        txtMaxHR.setText("");
        
        // move insertion point to name txt field
        txtName.requestFocus();
        
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplay1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblFeet;
    private javax.swing.JLabel lblInches;
    private javax.swing.JLabel lblMaxHR;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtFeet;
    private javax.swing.JTextField txtInches;
    private javax.swing.JTextField txtMaxHR;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
