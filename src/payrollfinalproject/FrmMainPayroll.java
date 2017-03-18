/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollfinalproject;

import java.awt.Component;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Phantom
 */
public class FrmMainPayroll extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    
    Connection myConn = null;
    PreparedStatement myStmt = null;
    ResultSet myRs = null;
    
    public FrmMainPayroll() {
        initComponents();
        setResizable(false);
        setSize(1600, 900);
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
        main = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        btnEmployee = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        employee = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        transaction = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        createTransaction1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createTransaction2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNameTransaction = new javax.swing.JLabel();
        lblDepartmentTransaction = new javax.swing.JLabel();
        lblPositionTransaction = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        viewTransaction = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        empty = new javax.swing.JPanel();
        bank = new javax.swing.JPanel();
        department = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnDepartment = new javax.swing.JButton();
        btnBank = new javax.swing.JButton();
        btnTransaction = new javax.swing.JButton();
        user = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.CardLayout());

        main.setOpaque(false);
        main.setLayout(null);

        txtID.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        main.add(txtID);
        txtID.setBounds(990, 410, 390, 50);

        btnVerify.setBorder(null);
        btnVerify.setContentAreaFilled(false);
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        main.add(btnVerify);
        btnVerify.setBounds(1053, 560, 285, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payroll3.jpg"))); // NOI18N
        main.add(jLabel15);
        jLabel15.setBounds(0, 0, 1600, 900);

        jPanel1.add(main, "card4");

        admin.setOpaque(false);
        admin.setLayout(null);

        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        admin.add(btnEmployee);
        btnEmployee.setBounds(80, 400, 90, 23);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        employee.setLayout(null);

        jButton2.setText("Register new employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        employee.add(jButton2);
        jButton2.setBounds(30, 50, 160, 23);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);
        employee.add(jPanel3);
        jPanel3.setBounds(0, 150, 1350, 750);

        jButton10.setText("Edit employee data");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        employee.add(jButton10);
        jButton10.setBounds(260, 50, 130, 23);

        jButton11.setText("delete Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        employee.add(jButton11);
        jButton11.setBounds(460, 50, 160, 23);

        jPanel2.add(employee);
        employee.setBounds(0, 0, 1350, 900);

        transaction.setLayout(null);

        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel5.setText("Employee ID");

        javax.swing.GroupLayout createTransaction1Layout = new javax.swing.GroupLayout(createTransaction1);
        createTransaction1.setLayout(createTransaction1Layout);
        createTransaction1Layout.setHorizontalGroup(
            createTransaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTransaction1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(763, Short.MAX_VALUE))
        );
        createTransaction1Layout.setVerticalGroup(
            createTransaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTransaction1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addGroup(createTransaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        jPanel4.add(createTransaction1, "card2");

        jLabel6.setText("Name:");

        jLabel7.setText("Department:");

        jLabel8.setText("Position:");

        lblNameTransaction.setText("jLabel9");

        lblDepartmentTransaction.setText("jLabel10");

        lblPositionTransaction.setText("jLabel11");

        jLabel9.setText("Total Absent");

        jLabel10.setText("Gross salary:");

        jLabel11.setText("Allowance:");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("Deduction");

        javax.swing.GroupLayout createTransaction2Layout = new javax.swing.GroupLayout(createTransaction2);
        createTransaction2.setLayout(createTransaction2Layout);
        createTransaction2Layout.setHorizontalGroup(
            createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTransaction2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createTransaction2Layout.createSequentialGroup()
                        .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameTransaction, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartmentTransaction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPositionTransaction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(244, 244, 244)
                        .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(53, 53, 53)
                        .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(724, Short.MAX_VALUE))
        );
        createTransaction2Layout.setVerticalGroup(
            createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTransaction2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNameTransaction)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDepartmentTransaction)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblPositionTransaction))
                .addGap(124, 124, 124)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(createTransaction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jPanel4.add(createTransaction2, "card4");

        javax.swing.GroupLayout viewTransactionLayout = new javax.swing.GroupLayout(viewTransaction);
        viewTransaction.setLayout(viewTransactionLayout);
        viewTransactionLayout.setHorizontalGroup(
            viewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        viewTransactionLayout.setVerticalGroup(
            viewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel4.add(viewTransaction, "card3");

        transaction.add(jPanel4);
        jPanel4.setBounds(0, 150, 1350, 750);

        jButton9.setText("new Transaction");
        transaction.add(jButton9);
        jButton9.setBounds(130, 80, 130, 23);

        jButton1.setText("view transaction");
        transaction.add(jButton1);
        jButton1.setBounds(400, 80, 150, 23);

        jPanel2.add(transaction);
        transaction.setBounds(0, 0, 1350, 900);

        empty.setLayout(null);
        jPanel2.add(empty);
        empty.setBounds(0, 0, 1350, 900);

        javax.swing.GroupLayout bankLayout = new javax.swing.GroupLayout(bank);
        bank.setLayout(bankLayout);
        bankLayout.setHorizontalGroup(
            bankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        bankLayout.setVerticalGroup(
            bankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jPanel2.add(bank);
        bank.setBounds(0, 0, 1350, 900);

        department.setLayout(null);

        jButton8.setText("new department");
        department.add(jButton8);
        jButton8.setBounds(30, 50, 120, 23);

        jPanel2.add(department);
        department.setBounds(0, 0, 1350, 900);

        admin.add(jPanel2);
        jPanel2.setBounds(250, 0, 1350, 900);

        jButton7.setText("back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        admin.add(jButton7);
        jButton7.setBounds(80, 830, 73, 23);

        btnDepartment.setText("Department");
        btnDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentActionPerformed(evt);
            }
        });
        admin.add(btnDepartment);
        btnDepartment.setBounds(80, 460, 89, 23);

        btnBank.setText("Bank");
        btnBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBankActionPerformed(evt);
            }
        });
        admin.add(btnBank);
        btnBank.setBounds(80, 520, 90, 23);

        btnTransaction.setText("Transaction");
        btnTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionActionPerformed(evt);
            }
        });
        admin.add(btnTransaction);
        btnTransaction.setBounds(80, 340, 89, 23);

        jPanel1.add(admin, "card3");

        user.setOpaque(false);

        jButton5.setText("date");

        jLabel1.setText("user page");

        jButton6.setText("back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton5))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton6)))
                .addContainerGap(1387, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 726, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(48, 48, 48))
        );

        jPanel1.add(user, "card2");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        if (txtID.getText().equals("exit")) {
            System.exit(0);
        }
        if (txtID.getText().equals("admin")) {
            changeMainLayout(admin);
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        changeMainLayout(main);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        changeMainLayout(main);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentActionPerformed
        changeMainSubLayout(department);
    }//GEN-LAST:event_btnDepartmentActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        changeMainSubLayout(employee);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBankActionPerformed

    private void btnTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionActionPerformed
        changeMainLayout(transaction);
    }//GEN-LAST:event_btnTransactionActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainPayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainPayroll().setVisible(true);
            }
        });
    }
    private void changeMainLayout(Component comp) {
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(comp);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    private void changeMainSubLayout(Component comp) {
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(comp);
        jPanel2.repaint();
        jPanel2.revalidate();
    }
    
    private void changeEmployeeLayout(Component comp) {
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        jPanel3.add(comp);
        jPanel3.repaint();
        jPanel3.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin;
    private javax.swing.JPanel bank;
    private javax.swing.JButton btnBank;
    private javax.swing.JButton btnDepartment;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnTransaction;
    private javax.swing.JButton btnVerify;
    private javax.swing.JPanel createTransaction1;
    private javax.swing.JPanel createTransaction2;
    private javax.swing.JPanel department;
    private javax.swing.JPanel employee;
    private javax.swing.JPanel empty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblDepartmentTransaction;
    private javax.swing.JLabel lblNameTransaction;
    private javax.swing.JLabel lblPositionTransaction;
    private javax.swing.JPanel main;
    private javax.swing.JPanel transaction;
    private javax.swing.JTextField txtID;
    private javax.swing.JPanel user;
    private javax.swing.JPanel viewTransaction;
    // End of variables declaration//GEN-END:variables
}
