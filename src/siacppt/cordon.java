/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;

import conector.baseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class cordon extends javax.swing.JFrame {

    /**
     * Creates new form cordon
     */
    public cordon() {
        initComponents();
        this.cor_color.setVisible(false);
      this.combo();   
    }
    private void combo(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sSQL="select nom_color from color";
        try {
            
            
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nm=rs.getString("nom_color");
                cordon_color.addItem(nm);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    void insertCordon(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String a,b,c,sSQL;
        a=this.cordon_codigo.getText();
        b=this.cordon.getText();
        c=this.cor_color.getText();
        sSQL="insert into cordon values(?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,c);
            int n=ps.executeUpdate();
            if(n>0){
                this.cordon_codigo.setText("");
                this.cordon.setText("");
                this.cor_color.setText("");
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
        panelCordon = new org.edisoncor.gui.panel.PanelCurves();
        jLabel63 = new javax.swing.JLabel();
        cordon_codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel64 = new javax.swing.JLabel();
        cordon = new org.edisoncor.gui.textField.TextFieldRectBackground();
        guardar5 = new javax.swing.JButton();
        cordon_color = new javax.swing.JComboBox();
        cor_color = new javax.swing.JTextField();
        guardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel63.setText("codigo del cordon");
        jLabel63.setFocusCycleRoot(true);
        jLabel63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel63.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cordon_codigo.setDescripcion("uauario");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setText("cordon");
        jLabel64.setFocusCycleRoot(true);
        jLabel64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel64.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cordon.setDescripcion("uauario");

        guardar5.setText("guardar");
        guardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar5ActionPerformed(evt);
            }
        });

        cordon_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "color" }));
        cordon_color.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cordon_colorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        guardar1.setText("cancelar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCordonLayout = new javax.swing.GroupLayout(panelCordon);
        panelCordon.setLayout(panelCordonLayout);
        panelCordonLayout.setHorizontalGroup(
            panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCordonLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCordonLayout.createSequentialGroup()
                        .addComponent(cor_color, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cordon_color, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(panelCordonLayout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cordon_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelCordonLayout.createSequentialGroup()
                        .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cordon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCordonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar1)
                .addGap(18, 18, 18)
                .addComponent(guardar5)
                .addGap(55, 55, 55))
        );
        panelCordonLayout.setVerticalGroup(
            panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCordonLayout.createSequentialGroup()
                .addGroup(panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCordonLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cordon_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCordonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel63)))
                .addGap(10, 10, 10)
                .addGroup(panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cordon_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCordonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar5)
                    .addComponent(guardar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void guardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar5ActionPerformed
        this.insertCordon();
    }//GEN-LAST:event_guardar5ActionPerformed

    private void cordon_colorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cordon_colorPopupMenuWillBecomeInvisible
         baseDatos bd=new baseDatos();
         Connection cn=bd.Conectar();
         String tpm=(String)cordon_color.getSelectedItem();
         String sSQL="select *from color where nom_color=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,tpm);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_color");
                cor_color.setText(add);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_cordon_colorPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(cordon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cordon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cordon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cordon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cordon().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cor_color;
    private org.edisoncor.gui.textField.TextFieldRectBackground cordon;
    private org.edisoncor.gui.textField.TextFieldRectBackground cordon_codigo;
    private javax.swing.JComboBox cordon_color;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar5;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCordon;
    // End of variables declaration//GEN-END:variables
}
