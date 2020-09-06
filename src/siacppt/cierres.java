/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;

import conector.baseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class cierres extends javax.swing.JFrame {

    /**
     * Creates new form cierres
     */
    public cierres() {
        initComponents();
    }

     void insertCierre(){
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String a,b,sSQL;
            a=this.cierre_codigo.getText();
            b=this.cierre.getText();
            sSQL="insert into xierre values(?,?)";
           
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                this.cierre_codigo.setText("");
                this.cierre.setText("");
                JOptionPane.showMessageDialog(null,"datos guardados");
                  prin v=new prin();
                v.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panelCirre = new org.edisoncor.gui.panel.PanelCurves();
        jLabel65 = new javax.swing.JLabel();
        cierre_codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel66 = new javax.swing.JLabel();
        cierre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        guardar6 = new javax.swing.JButton();
        guardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setText("codigo del cierre");
        jLabel65.setFocusCycleRoot(true);
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel65.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cierre_codigo.setDescripcion("uauario");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel66.setText("cierre");
        jLabel66.setFocusCycleRoot(true);
        jLabel66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel66.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cierre.setDescripcion("uauario");

        guardar6.setText("guardar");
        guardar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar6ActionPerformed(evt);
            }
        });

        guardar1.setText("cancelar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCirreLayout = new javax.swing.GroupLayout(panelCirre);
        panelCirre.setLayout(panelCirreLayout);
        panelCirreLayout.setHorizontalGroup(
            panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirreLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirreLayout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cierre_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelCirreLayout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCirreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar1)
                .addGap(36, 36, 36)
                .addComponent(guardar6)
                .addContainerGap())
        );
        panelCirreLayout.setVerticalGroup(
            panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirreLayout.createSequentialGroup()
                .addGroup(panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCirreLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cierre_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCirreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel65)))
                .addGap(10, 10, 10)
                .addGroup(panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCirreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar6)
                    .addComponent(guardar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCirre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCirre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar6ActionPerformed
        this.insertCierre();
    }//GEN-LAST:event_guardar6ActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        registro_or_confeccio v=new registro_or_confeccio();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_guardar1ActionPerformed

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
            java.util.logging.Logger.getLogger(cierres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cierres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cierres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cierres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cierres().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRectBackground cierre;
    private org.edisoncor.gui.textField.TextFieldRectBackground cierre_codigo;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCirre;
    // End of variables declaration//GEN-END:variables
}
