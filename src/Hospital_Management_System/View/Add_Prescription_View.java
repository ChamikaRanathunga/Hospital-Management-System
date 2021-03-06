package Hospital_Management_System.View;


import Hospital_Management_System.Controller.Prescription;
import Hospital_Management_System.Model.Prescription_creation_Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randunu Manoramya
 */
public class Add_Prescription_View extends javax.swing.JFrame {
    
    public Add_Prescription_View() {
        initComponents();
        Prescription_creation_Model ac = new Prescription_creation_Model(pTable, pres_id_label);
        ac.prescription_table();
        ac.autoAID();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        pAge = new javax.swing.JTextField();
        pdesease = new javax.swing.JTextField();
        dName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pres_id_label = new javax.swing.JLabel();
        pGender = new javax.swing.JComboBox<String>();
        pClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prescription", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Desease Type:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Doctor Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 442, -1, -1));

        pName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pName.setToolTipText("Enter patient name");
        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });
        jPanel1.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 107, 356, -1));

        pAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pAge.setToolTipText("Enter patient age");
        pAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAgeActionPerformed(evt);
            }
        });
        jPanel1.add(pAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 153, 65, -1));

        pdesease.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pdesease, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 247, 355, -1));

        dName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dName.setToolTipText("Enter your name");
        jPanel1.add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 439, 233, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Description:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 301, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prescription No.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, -1, -1));

        pres_id_label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        pres_id_label.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(pres_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 49, 156, 29));

        pGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        jPanel1.add(pGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 199, 155, 29));

        pClear.setBackground(new java.awt.Color(51, 51, 255));
        pClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pClear.setText("Clear");
        pClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pClearActionPerformed(evt);
            }
        });
        jPanel1.add(pClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 518, 87, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Insert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 511, 92, 47));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 511, 94, 47));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 511, 92, 47));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 511, 98, 47));

        pDescription.setColumns(20);
        pDescription.setRows(5);
        jScrollPane2.setViewportView(pDescription);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 548, 610));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescription Number", "Patient Name", "Age", "Gender", "Disease", "Description", "Doctor name"
            }
        ));
        pTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTableMouseClicked(evt);
            }
        });
        pTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(pTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 693, 488));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Patient Name Here"));

        searchbox.setToolTipText("Patient name");
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 210, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/The-Must-Have-modules-of-a-Hospital-Management-System-1200x675.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 0, 1200, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 0, 713, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAgeActionPerformed

    private void pTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTableMouseClicked
        Prescription ad3;
        ad3 = new Prescription(pName, pAge, pGender, pdesease, pDescription, dName, pres_id_label);
        ad3.getSelectedValues(jButton3, pTable);
        
       
    }//GEN-LAST:event_pTableMouseClicked

    private void pTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pTableKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pTableKeyReleased

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        // TODO add your handling code here:
        Prescription_creation_Model ob = new Prescription_creation_Model();
        ob.search(searchbox, pTable);
    }//GEN-LAST:event_searchboxKeyReleased

    private void pClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pClearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pClearActionPerformed

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Prescription ad1;
         
         ad1 = new Prescription(pName, pAge, pGender, pdesease, pDescription, dName, pres_id_label);  
         ad1.insertToTable(pTable, pres_id_label);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
        Doctor_View ob = new Doctor_View();
        ob.setVisible(true); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Prescription ad2;
        ad2 = new Prescription(pName, pAge, pGender, pdesease, pDescription, dName, pres_id_label);     
        ad2.updateTable(pTable, pres_id_label, jButton3); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Prescription ad4;
        ad4 = new Prescription(pName, pAge, pGender, pdesease, pDescription, dName, pres_id_label);     
        ad4.deleteItem(pTable, pres_id_label, jButton3);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Prescription_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Prescription_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Prescription_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Prescription_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Prescription_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dName;
    private javax.swing.JButton jButton10;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pAge;
    private javax.swing.JButton pClear;
    private javax.swing.JTextArea pDescription;
    private javax.swing.JComboBox<String> pGender;
    private javax.swing.JTextField pName;
    private javax.swing.JTable pTable;
    private javax.swing.JTextField pdesease;
    private javax.swing.JLabel pres_id_label;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
