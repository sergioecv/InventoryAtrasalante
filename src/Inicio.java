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
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form blabla
     */
    public Inicio() {
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

        BtSalir = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        BtIS = new javax.swing.JButton();
        TxtContraseña = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtSalir.setFont(new java.awt.Font("Nanum Gothic", 0, 13)); // NOI18N
        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 120, 50));

        TxtUsuario.setText("Usuario:");
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtUsuarioMouseClicked(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 260, 50));

        Logo.setIcon(new javax.swing.ImageIcon("/Users/sergio/eclipse-workspace/InventarioAtrsalante/src/imagenes/output-onlinepngtools.png")); // NOI18N
        Logo.setToolTipText("");
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        BtIS.setBackground(new java.awt.Color(255, 255, 255));
        BtIS.setFont(new java.awt.Font("Nanum Gothic", 0, 13)); // NOI18N
        BtIS.setText("Iniciar sesión");
        BtIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtISMouseClicked(evt);
            }
        });
        BtIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtISActionPerformed(evt);
            }
        });
        getContentPane().add(BtIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 140, 50));

        TxtContraseña.setText("jPasswordField1");
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtContraseñaMouseClicked(evt);
            }
        });
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 260, 50));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon("/Users/sergio/eclipse-workspace/InventarioAtrsalante/src/imagenes/trees3.001.png")); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -90, 830, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtSalirActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtISActionPerformed

    private void BtISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtISMouseClicked
        // TODO add your handling code here:
        String Usuario = "ivan";
        String Contraseña = "123";
        
        String User = new String (TxtUsuario.getText());
        String Password = new String (TxtContraseña.getPassword());
        
        if (User.equals(Usuario) && Password.equals(Contraseña) ) {
            MenuPrincipal m = new MenuPrincipal();
            m.setVisible(true);
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrecta");
            
        }
    }//GEN-LAST:event_BtISMouseClicked

    private void TxtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMouseClicked
        // TODO add your handling code here:
        TxtContraseña.setText("");
    }//GEN-LAST:event_TxtContraseñaMouseClicked

    private void TxtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMouseClicked
        // TODO add your handling code here:
        TxtUsuario.setText("");
    }//GEN-LAST:event_TxtUsuarioMouseClicked

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void TxtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtContraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtIS;
    private javax.swing.JButton BtSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
