/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import static org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model;

/**
 *
 * @author sergio
 */
public class InLocalizacion extends javax.swing.JFrame {
    
    private static DefaultTableModel model = new DefaultTableModel();


    /**
     * Creates new form blabla
     */
    public InLocalizacion() {
        initComponents();
        Tabla.setModel(model);

    }
    
    private void ImportarExcel (){
        File archivoExcel = new File ("/Users/sergio/eclipse-workspace/InventarioAtrsalante/excel.xls");
        try {
            Workbook excel = Workbook.getWorkbook(archivoExcel);
            Sheet hoja = excel.getSheet(1);
            int columnas = hoja.getColumns();
            int filas = hoja.getRows();
            Object datos[] = new Object[columnas];
            
            for(int fila = 0; fila<filas; fila++){
                for(int columna = 0; columna<columnas; columna++){
                    
                    if (fila == 0){
                        model.addColumn(hoja.getCell(columna, fila).getContents());
                    }
                    
                    if (fila>=1){
                        datos[columna] = hoja.getCell(columna, fila).getContents();
                    }
                }
                model.addRow(datos);
                
            }
            model.removeRow(0);

            
            
            

            
        } catch (IOException | BiffException ex) {
            Logger.getLogger(InLibros.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Bodega = new javax.swing.JButton();
        Consignación = new javax.swing.JButton();
        FeriaLibro = new javax.swing.JButton();
        Donativos = new javax.swing.JButton();
        Prensa = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtRegresar.setFont(new java.awt.Font("Nanum Gothic", 0, 13)); // NOI18N
        BtRegresar.setText("Regresar");
        BtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtRegresarMouseClicked(evt);
            }
        });
        BtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 120, 50));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Localización");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        Bodega.setBackground(new java.awt.Color(255, 255, 255));
        Bodega.setText("Consignación");
        getContentPane().add(Bodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 50));

        Consignación.setBackground(new java.awt.Color(255, 255, 255));
        Consignación.setText("Feria del libro");
        getContentPane().add(Consignación, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 50));

        FeriaLibro.setBackground(new java.awt.Color(255, 255, 255));
        FeriaLibro.setText("Donativos");
        FeriaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeriaLibroActionPerformed(evt);
            }
        });
        getContentPane().add(FeriaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 50));

        Donativos.setBackground(new java.awt.Color(255, 255, 255));
        Donativos.setText("Prensa");
        getContentPane().add(Donativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 50));

        Prensa.setBackground(new java.awt.Color(255, 255, 255));
        Prensa.setText("Bodega");
        Prensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrensaActionPerformed(evt);
            }
        });
        getContentPane().add(Prensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 50));

        Fondo1.setBackground(new java.awt.Color(255, 255, 255));
        Fondo1.setIcon(new javax.swing.ImageIcon("/Users/sergio/Downloads/imágenes/trees3/trees3.001.png")); // NOI18N
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -90, 830, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarActionPerformed
        
    }//GEN-LAST:event_BtRegresarActionPerformed

    private void BtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtRegresarMouseClicked
        // TODO add your handling code here:
        MenuInventario mi = new MenuInventario();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtRegresarMouseClicked

    private void FeriaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeriaLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeriaLibroActionPerformed

    private void PrensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrensaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrensaActionPerformed

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
            java.util.logging.Logger.getLogger(InLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new InLocalizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bodega;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JButton Consignación;
    private javax.swing.JButton Donativos;
    private javax.swing.JButton FeriaLibro;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JButton Prensa;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
