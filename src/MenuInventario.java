/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import pantallas.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author sergio
 */
public class MenuInventario extends javax.swing.JFrame {

    /**
     * Creates new form MenuInventario
     */
    public MenuInventario() {
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

        Logo = new javax.swing.JLabel();
        BtLibro = new javax.swing.JButton();
        BtLocalizacion = new javax.swing.JButton();
        BtFecha = new javax.swing.JButton();
        BtVenta = new javax.swing.JButton();
        BtNumero = new javax.swing.JButton();
        BtBack = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/output-onlinepngtools.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        BtLibro.setBackground(new java.awt.Color(255, 255, 255));
        BtLibro.setText("Libro");
        BtLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtLibroMouseClicked(evt);
            }
        });
        getContentPane().add(BtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        BtLocalizacion.setBackground(new java.awt.Color(255, 255, 255));
        BtLocalizacion.setText("Localizaci??n");
        BtLocalizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtLocalizacionMouseClicked(evt);
            }
        });
        getContentPane().add(BtLocalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, 90));

        BtFecha.setBackground(new java.awt.Color(255, 255, 255));
        BtFecha.setText("Fecha");
        BtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtFechaMouseClicked(evt);
            }
        });
        BtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(BtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 160, 90));

        BtVenta.setBackground(new java.awt.Color(255, 255, 255));
        BtVenta.setText("Venta");
        BtVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtVentaMouseClicked(evt);
            }
        });
        getContentPane().add(BtVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 150, 90));

        BtNumero.setBackground(new java.awt.Color(255, 255, 255));
        BtNumero.setText("N??mero de serie");
        BtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtNumeroMouseClicked(evt);
            }
        });
        getContentPane().add(BtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 160, 90));

        BtBack.setBackground(new java.awt.Color(255, 255, 255));
        BtBack.setText("Regresar");
        BtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBackActionPerformed(evt);
            }
        });
        getContentPane().add(BtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 120, 60));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon("/Users/sergio/Downloads/im??genes/trees3/trees3.001.png")); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -90, 830, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBackActionPerformed
        this.hide();
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();

    }//GEN-LAST:event_BtBackActionPerformed

    private void BtLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtLibroMouseClicked
        // TODO add your handling code here:
        InLibros il = new InLibros();
        il.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BtLibroMouseClicked

    private void BtLocalizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtLocalizacionMouseClicked
        // TODO add your handling code here:
        InLocalizacion iloc = new InLocalizacion();
        iloc.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtLocalizacionMouseClicked

    private void BtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtFechaActionPerformed

    private void BtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtFechaMouseClicked
        // TODO add your handling code here:
        InFecha ife = new InFecha();
        ife.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtFechaMouseClicked

    private void BtVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtVentaMouseClicked
        // TODO add your handling code here:
        InVenta iv = new InVenta();
        iv.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtVentaMouseClicked

    private void BtNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtNumeroMouseClicked
        // TODO add your handling code here:
        InNumSerie ins = new InNumSerie();
        ins.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtNumeroMouseClicked

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
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBack;
    private javax.swing.JButton BtFecha;
    private javax.swing.JButton BtLibro;
    private javax.swing.JButton BtLocalizacion;
    private javax.swing.JButton BtNumero;
    private javax.swing.JButton BtVenta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    // End of variables declaration//GEN-END:variables
}
