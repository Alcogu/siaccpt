/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;

import conector.baseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class talla extends javax.swing.JFrame {

    /**
     * Creates new form talla
     */
    public talla() {
        initComponents();
    }

    void insertTallas(){
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String a,b,sSQL;
            a=this.talla_codigo.getText();
            b=this.talla.getText();
            sSQL="insert into tallas values(?,?)";
        try {
             prin v=new prin();
                v.setVisible(true);
                this.dispose();
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                this.talla_codigo.setText("");
                this.talla.setText("");
                JOptionPane.showMessageDialog(null,"datos guardados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panelTallas = new org.edisoncor.gui.panel.PanelCurves();
        jLabel67 = new javax.swing.JLabel();
        talla_codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel68 = new javax.swing.JLabel();
        talla = new org.edisoncor.gui.textField.TextFieldRectBackground();
        guardar1 = new javax.swing.JButton();
        guardar7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("codigo de la talla");
        jLabel67.setFocusCycleRoot(true);
        jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel67.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        talla_codigo.setDescripcion("uauario");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setText("talla");
        jLabel68.setFocusCycleRoot(true);
        jLabel68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel68.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        talla.setDescripcion("uauario");

        javax.swing.GroupLayout panelTallasLayout = new javax.swing.GroupLayout(panelTallas);
        panelTallas.setLayout(panelTallasLayout);
        panelTallasLayout.setHorizontalGroup(
            panelTallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTallasLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelTallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTallasLayout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(talla_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelTallasLayout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(talla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelTallasLayout.setVerticalGroup(
            panelTallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTallasLayout.createSequentialGroup()
                .addGroup(panelTallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTallasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(talla_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTallasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel67)))
                .addGap(10, 10, 10)
                .addGroup(panelTallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        guardar1.setText("cancelar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        guardar7.setText("guardar");
        guardar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelTallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(guardar1)
                .addGap(38, 38, 38)
                .addComponent(guardar7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelTallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar1)
                    .addComponent(guardar7))
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
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar7ActionPerformed
        this.insertTallas();
    }//GEN-LAST:event_guardar7ActionPerformed

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
            java.util.logging.Logger.getLogger(talla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(talla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(talla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(talla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new talla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar7;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelTallas;
    private org.edisoncor.gui.textField.TextFieldRectBackground talla;
    private org.edisoncor.gui.textField.TextFieldRectBackground talla_codigo;
    // End of variables declaration//GEN-END:variables
}
