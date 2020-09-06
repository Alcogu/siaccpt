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
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class maquina extends javax.swing.JFrame {

    /**
     * Creates new form maquina
     */
    public maquina() {
        initComponents();
    }

    void insert(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String a,b,sql;
        a=this.codigo.getText();
        b=this.maquina.getText();
        sql="insert into maquina values(?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"datos guardados");
                
                this.codigo.setText("");
                this.maquina.setText("");
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
        panelaguja = new org.edisoncor.gui.panel.PanelCurves();
        jLabel53 = new javax.swing.JLabel();
        maquina = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel54 = new javax.swing.JLabel();
        codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        guardar = new javax.swing.JButton();
        guardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel53.setText("nombre de la maquina");
        jLabel53.setFocusCycleRoot(true);
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel53.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        maquina.setDescripcion("uauario");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel54.setText("codigo de la maquina");
        jLabel54.setFocusCycleRoot(true);
        jLabel54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        codigo.setDescripcion("uauario");

        guardar.setText("guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        guardar1.setText("cancelar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelagujaLayout = new javax.swing.GroupLayout(panelaguja);
        panelaguja.setLayout(panelagujaLayout);
        panelagujaLayout.setHorizontalGroup(
            panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagujaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(maquina, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelagujaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardar)
                .addGap(71, 71, 71))
        );
        panelagujaLayout.setVerticalGroup(
            panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagujaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(maquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(guardar1))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelaguja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelaguja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
              this.insert();        
    }//GEN-LAST:event_guardarActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
         operaciones v=new operaciones();
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
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maquina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRectBackground codigo;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private org.edisoncor.gui.textField.TextFieldRectBackground maquina;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelaguja;
    // End of variables declaration//GEN-END:variables
}
