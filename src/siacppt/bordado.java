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
public class bordado extends javax.swing.JFrame {

    /**
     * Creates new form bordado
     */
    public bordado() {
        initComponents();
        try {
            this.como();
           this.bordado_hilo.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(bordado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//no sirve todavia
  
   private void como() throws SQLException{
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
       // java.sql.PreparedStatement ps=null;
        String sSQL="select nom_hilo from hilo";
       
   try{
        PreparedStatement ps=cn.prepareStatement(sSQL);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            String nme = rs.getString("nom_hilo");
            bordados_hilos.addItem(nme);
           
        }
    }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
        } 
    
    

    void insertBordado(){
     baseDatos bd=new baseDatos();
     Connection cn=bd.Conectar();
      String a,b,c,sSQL;
      a=this.bordado_codigo.getText();
      b=this.bordado_ubicacion.getText();
      c=this.bordado_hilo.getText();
      sSQL="insert into bordado values(?,?,?)";
        try {
             prin v=new prin();
                v.setVisible(true);
                this.dispose();
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,c);
            int n=ps.executeUpdate();
            if(n>0){
                this.bordado_codigo.setText("");
                this.bordado_ubicacion.setText("");
                JOptionPane.showMessageDialog(null,"sus datos se insertaron cerrectamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
     }
 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panelbordado = new org.edisoncor.gui.panel.PanelCurves();
        jLabel55 = new javax.swing.JLabel();
        bordado_codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel56 = new javax.swing.JLabel();
        bordado_ubicacion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        guardar1 = new javax.swing.JButton();
        bordados_hilos = new javax.swing.JComboBox();
        bordado_hilo = new javax.swing.JTextField();
        guardar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel55.setText("codigo del bordado");
        jLabel55.setFocusCycleRoot(true);
        jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel55.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        bordado_codigo.setDescripcion("uauario");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel56.setText("Ubicación ");
        jLabel56.setFocusCycleRoot(true);
        jLabel56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel56.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        bordado_ubicacion.setDescripcion("uauario");

        guardar1.setText("guardar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        bordados_hilos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hilo" }));
        bordados_hilos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                bordados_hilosPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bordados_hilosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                bordados_hilosPopupMenuWillBecomeVisible(evt);
            }
        });

        guardar4.setText("cancelar");
        guardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbordadoLayout = new javax.swing.GroupLayout(panelbordado);
        panelbordado.setLayout(panelbordadoLayout);
        panelbordadoLayout.setHorizontalGroup(
            panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbordadoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbordadoLayout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bordado_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(panelbordadoLayout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bordado_ubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbordadoLayout.createSequentialGroup()
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbordadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bordado_hilo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbordadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar4)
                        .addGap(18, 18, 18)))
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar1)
                    .addComponent(bordados_hilos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelbordadoLayout.setVerticalGroup(
            panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbordadoLayout.createSequentialGroup()
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbordadoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bordado_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelbordadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel55)))
                .addGap(10, 10, 10)
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bordado_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bordados_hilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bordado_hilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelbordadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar1)
                    .addComponent(guardar4))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelbordado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbordado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
          this.insertBordado();
    }//GEN-LAST:event_guardar1ActionPerformed

    private void bordados_hilosPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bordados_hilosPopupMenuCanceled
        
        
    }//GEN-LAST:event_bordados_hilosPopupMenuCanceled

    private void bordados_hilosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bordados_hilosPopupMenuWillBecomeVisible
                 
    }//GEN-LAST:event_bordados_hilosPopupMenuWillBecomeVisible

    private void bordados_hilosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bordados_hilosPopupMenuWillBecomeInvisible
        
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String tmp=(String)bordados_hilos.getSelectedItem();
            String sSQL="select *from hilo where nom_hilo=?";
            try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1, tmp);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_hilo");
                bordado_hilo.setText(add);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_bordados_hilosPopupMenuWillBecomeInvisible

    private void guardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar4ActionPerformed
         registro_or_confeccio v=new registro_or_confeccio();
            v.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_guardar4ActionPerformed

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
            java.util.logging.Logger.getLogger(bordado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bordado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bordado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bordado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bordado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRectBackground bordado_codigo;
    private javax.swing.JTextField bordado_hilo;
    private org.edisoncor.gui.textField.TextFieldRectBackground bordado_ubicacion;
    private javax.swing.JComboBox bordados_hilos;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar2;
    private javax.swing.JButton guardar3;
    private javax.swing.JButton guardar4;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelbordado;
    // End of variables declaration//GEN-END:variables
}
