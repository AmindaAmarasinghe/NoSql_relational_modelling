/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library_app.frontend;

/**
 *
 * @author wasu
 */
public class Main_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Main_GUI
     */
    public Main_GUI() {
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

        btnmainborrow = new javax.swing.JButton();
        btnbookhist = new javax.swing.JButton();
        btnmainfinereport = new javax.swing.JButton();
        btnmainclose = new javax.swing.JButton();
        btnmainpay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmainborrow.setBackground(new java.awt.Color(102, 255, 255));
        btnmainborrow.setText("Borrow/Return Book");
        btnmainborrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainborrowActionPerformed(evt);
            }
        });

        btnbookhist.setBackground(new java.awt.Color(153, 255, 153));
        btnbookhist.setText("See Book Loan History");
        btnbookhist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookhistActionPerformed(evt);
            }
        });

        btnmainfinereport.setBackground(new java.awt.Color(255, 255, 153));
        btnmainfinereport.setText("See Fine Report");
        btnmainfinereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainfinereportActionPerformed(evt);
            }
        });

        btnmainclose.setBackground(new java.awt.Color(102, 255, 255));
        btnmainclose.setText("close");
        btnmainclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaincloseActionPerformed(evt);
            }
        });

        btnmainpay.setBackground(new java.awt.Color(255, 204, 255));
        btnmainpay.setText("Pay fine");
        btnmainpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainpayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmainpay, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmainborrow, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbookhist, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmainfinereport, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnmainclose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnmainborrow)
                .addGap(31, 31, 31)
                .addComponent(btnmainpay)
                .addGap(35, 35, 35)
                .addComponent(btnbookhist)
                .addGap(27, 27, 27)
                .addComponent(btnmainfinereport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnmainclose)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmainborrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainborrowActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Borrow_Return br = new Borrow_Return();
        br.setVisible(true);
    }//GEN-LAST:event_btnmainborrowActionPerformed

    private void btnbookhistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookhistActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Monthly_History_Loan hl = new Monthly_History_Loan();
        hl.setVisible(true);
    }//GEN-LAST:event_btnbookhistActionPerformed

    private void btnmainfinereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainfinereportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Monthly_History_fine hf=new Monthly_History_fine();
        hf.setVisible(true);
    }//GEN-LAST:event_btnmainfinereportActionPerformed

    private void btnmaincloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaincloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnmaincloseActionPerformed

    private void btnmainpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainpayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Pay_Fine payform = new Pay_Fine();
        payform.setVisible(true);
    }//GEN-LAST:event_btnmainpayActionPerformed

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
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbookhist;
    private javax.swing.JButton btnmainborrow;
    private javax.swing.JButton btnmainclose;
    private javax.swing.JButton btnmainfinereport;
    private javax.swing.JButton btnmainpay;
    // End of variables declaration//GEN-END:variables
}
