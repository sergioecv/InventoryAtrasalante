/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pantallas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class ReVenta extends javax.swing.JFrame {

    /**
     * Creates new form blabla
     */
    public ReVenta() {
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

        jLabel3 = new javax.swing.JLabel();
        BtSalir = new javax.swing.JButton();
        LblTitulo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        BtSalir1 = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Libro:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtSalir.setFont(new java.awt.Font("Nanum Gothic", 0, 13)); // NOI18N
        BtSalir.setText("Confirmar");
        BtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSalirMouseClicked(evt);
            }
        });
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, 50));

        LblTitulo.setBackground(new java.awt.Color(255, 51, 51));
        LblTitulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("Nueva venta");
        LblTitulo.setToolTipText("");
        getContentPane().add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prensa", "Donaci??n", "Consignaci??n", "FIL", "Bodega" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 230, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Libro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 230, -1));

        BtSalir1.setBackground(new java.awt.Color(255, 255, 255));
        BtSalir1.setFont(new java.awt.Font("Nanum Gothic", 0, 13)); // NOI18N
        BtSalir1.setText("Regresar");
        BtSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSalir1MouseClicked(evt);
            }
        });
        BtSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 120, 50));

        Fondo1.setBackground(new java.awt.Color(255, 255, 255));
        Fondo1.setIcon(new javax.swing.ImageIcon("/Users/sergio/Downloads/im??genes/trees3/trees3.001.png")); // NOI18N
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -90, 830, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSalirMouseClicked
        // TODO add your handling code here:
        MenuRegistro mr = new MenuRegistro();
        mr.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtSalirMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void BtSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSalir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSalir1MouseClicked

    private void BtSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSalir;
    private javax.swing.JButton BtSalir1;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
