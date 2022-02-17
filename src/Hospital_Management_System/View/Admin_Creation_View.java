/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Management_System.View;

import Hospital_Management_System.Controller.Administrative_Staff_Member;
import Hospital_Management_System.Model.Admin_creation_Model;


/**
 *
 * @author Thisura
 */
public class Admin_Creation_View extends javax.swing.JFrame {

    /**
     * Creates new form Administrator_Creation_Interface
     */
    public Admin_Creation_View() {
       initComponents();
       Admin_creation_Model ac = new Admin_creation_Model(AdminTable_view, admin_id_label);
       ac.admin_table();
       ac.autoAID();
       //auto AID
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminTable_view = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fName_tBox = new javax.swing.JTextField();
        username_tBox = new javax.swing.JTextField();
        contractNo_tBox = new javax.swing.JTextField();
        lName_tBox = new javax.swing.JTextField();
        eMail_tBox = new javax.swing.JTextField();
        pass_pBox = new javax.swing.JPasswordField();
        reEnterPass_pBox = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admin_id_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminTable_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "First Name", "Last Name", "Username", "Password", "Contract Number", "Email"
            }
        ));
        AdminTable_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminTable_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AdminTable_view);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 167, 660, 474));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("First Name: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 199, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Last Name: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 246, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 295, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 344, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Re-En. Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 398, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Contract Number: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 445, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 499, -1, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 570, -1, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 570, -1, -1));

        jButton3.setText("Create");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 637, 67, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 637, 65, -1));

        fName_tBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName_tBoxActionPerformed(evt);
            }
        });
        jPanel1.add(fName_tBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 196, 137, -1));
        jPanel1.add(username_tBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 292, 137, -1));
        jPanel1.add(contractNo_tBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 442, 135, -1));
        jPanel1.add(lName_tBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 243, 137, -1));
        jPanel1.add(eMail_tBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 496, 135, -1));
        jPanel1.add(pass_pBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 341, 137, -1));

        reEnterPass_pBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reEnterPass_pBoxActionPerformed(evt);
            }
        });
        jPanel1.add(reEnterPass_pBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 395, 135, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Admin Creation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Admin ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 58, -1, 24));

        admin_id_label.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.add(admin_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 58, 99, 24));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/The-Must-Have-modules-of-a-Hospital-Management-System-1200x675.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fName_tBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName_tBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fName_tBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO pass var of feilds
        //"fName_tBox", "lName_tBox", "username_tBox", "pass_pBox", "reEnterPass_pBox", "contractNo_tBox", "eMail_tBox"
        // admin_id_label
        
        Administrative_Staff_Member ad1;
        ad1 = new Administrative_Staff_Member(fName_tBox, lName_tBox, username_tBox, contractNo_tBox, eMail_tBox, pass_pBox, reEnterPass_pBox, admin_id_label);
        ad1.insertToTable(AdminTable_view, admin_id_label);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reEnterPass_pBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEnterPass_pBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reEnterPass_pBoxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Main_View mI;
        mI = new Main_View();
        mI.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO update
        Administrative_Staff_Member ad2;
        ad2 = new Administrative_Staff_Member(fName_tBox, lName_tBox, username_tBox, contractNo_tBox, eMail_tBox, pass_pBox, reEnterPass_pBox, admin_id_label);
        ad2.updateTable(AdminTable_view, admin_id_label, jButton3); //pass  table and label
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AdminTable_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminTable_viewMouseClicked
        // TODO add your handling code here:
        
        Administrative_Staff_Member ad3;
        ad3 = new Administrative_Staff_Member(fName_tBox, lName_tBox, username_tBox, contractNo_tBox, eMail_tBox, pass_pBox, reEnterPass_pBox, admin_id_label);
        ad3.getSelectedValues(jButton3, AdminTable_view);
        
        
    }//GEN-LAST:event_AdminTable_viewMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:   
        Administrative_Staff_Member ad4;
        ad4 = new Administrative_Staff_Member(fName_tBox, lName_tBox, username_tBox, contractNo_tBox, eMail_tBox, pass_pBox, reEnterPass_pBox, admin_id_label);
        ad4.deleteItem(AdminTable_view, admin_id_label, jButton3);
        
        
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Creation_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Creation_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Creation_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Creation_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Creation_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdminTable_view;
    private javax.swing.JLabel admin_id_label;
    private javax.swing.JTextField contractNo_tBox;
    private javax.swing.JTextField eMail_tBox;
    private javax.swing.JTextField fName_tBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lName_tBox;
    private javax.swing.JPasswordField pass_pBox;
    private javax.swing.JPasswordField reEnterPass_pBox;
    private javax.swing.JTextField username_tBox;
    // End of variables declaration//GEN-END:variables
}
