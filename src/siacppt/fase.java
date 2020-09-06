/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;

import conector.baseDatos;
import java.net.ConnectException;
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
public class fase extends javax.swing.JFrame {

    /**
     * Creates new form fase
     */
    public fase() {
        initComponents();
        this.listarOpera();
        listarMaquina();
        lisprenda();
    }
    
    void insert(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String a,b,c,d,e,sql;
        a=this.codigo.getText();
        b=this.fase_operacio.getText();
        c=this.oparacion.getText();
        d=this.maquina.getText();
        e=this.ti_prenda.getText();
        sql="insert into fase_operacion values(?,?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);
            ps.setString(3, c);
            ps.setString(4, e);
            ps.setString(5, d);
           int n=ps.executeUpdate();
           if(n>0){
               this.codigo.setText("");
               this.fase_operacio.setText("");
               this.oparacion.setText("");
               this.maquina.setText("");
               this.ti_prenda.setText("");
             JOptionPane.showMessageDialog(null,"datos guardados");
             prin v=new prin();
             v.setVisible(true);
             this.dispose();
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    void inserprenda(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)prenda.getSelectedItem();
        String sql="select *from tipo_prenda where nombre_prenda=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("nombre_prenda");
                ti_prenda.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    void lisprenda(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nombre_prenda from tipo_prenda";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_prenda");
                prenda.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

   void listarOpera(){
       baseDatos bd=new baseDatos();
       Connection cn=bd.Conectar();
       String sql="select nombre_opera from operacion";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_opera");
                fase_operacion.addItem(nn);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
   }
   void addlis(){
       baseDatos bd=new baseDatos();
       Connection cn=bd.Conectar();
       String pt=(String)fase_operacion.getSelectedItem();
       String sql="select *from operacion where nombre_opera=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_operacion");
                oparacion.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
   }
    
   void listarMaquina(){
       baseDatos bd=new baseDatos();
       Connection cn=bd.Conectar();
       String sql="select nombre_maquina from maquina ";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_maquina");
                fase_maquina.addItem(nn);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
   }
   
   void llenarMaquina(){
       baseDatos bd=new baseDatos();
       Connection cn=bd.Conectar();
       String pt=(String)fase_maquina.getSelectedItem();
       String sql="select *from maquina where nombre_maquina=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("nombre_maquina");
                maquina.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
               
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panelaguja = new org.edisoncor.gui.panel.PanelCurves();
        jLabel53 = new javax.swing.JLabel();
        fase_operacio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel54 = new javax.swing.JLabel();
        codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        maquina = new org.edisoncor.gui.textField.TextFieldRectBackground();
        fase_operacion = new javax.swing.JComboBox();
        fase_maquina = new javax.swing.JComboBox();
        oparacion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        ti_prenda = new org.edisoncor.gui.textField.TextFieldRectBackground();
        prenda = new javax.swing.JComboBox();
        guardar1 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel53.setText("fase de operacion");
        jLabel53.setFocusCycleRoot(true);
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel53.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        fase_operacio.setDescripcion("uauario");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel54.setText("codigo de la fase");
        jLabel54.setFocusCycleRoot(true);
        jLabel54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        codigo.setDescripcion("uauario");

        maquina.setDescripcion("uauario");

        fase_operacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "operacion" }));
        fase_operacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                fase_operacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        fase_maquina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "maquina" }));
        fase_maquina.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                fase_maquinaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        oparacion.setDescripcion("uauario");

        ti_prenda.setDescripcion("uauario");

        prenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "prenda" }));
        prenda.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                prendaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout panelagujaLayout = new javax.swing.GroupLayout(panelaguja);
        panelaguja.setLayout(panelagujaLayout);
        panelagujaLayout.setHorizontalGroup(
            panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagujaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fase_operacio, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(panelagujaLayout.createSequentialGroup()
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelagujaLayout.createSequentialGroup()
                                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addComponent(ti_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)))
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fase_operacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fase_maquina, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelagujaLayout.setVerticalGroup(
            panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagujaLayout.createSequentialGroup()
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(fase_operacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53)))
                .addGap(10, 10, 10)
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagujaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fase_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelagujaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fase_maquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelagujaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ti_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        guardar1.setText("cancelar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        guardar.setText("guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelaguja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(guardar1)
                .addGap(18, 18, 18)
                .addComponent(guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelaguja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar1)
                    .addComponent(guardar))
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

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
                 this.insert();
    }//GEN-LAST:event_guardarActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
       operaciones v=new operaciones();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_guardar1ActionPerformed

    private void fase_operacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_fase_operacionPopupMenuWillBecomeInvisible
       this.addlis();
    }//GEN-LAST:event_fase_operacionPopupMenuWillBecomeInvisible

    private void fase_maquinaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_fase_maquinaPopupMenuWillBecomeInvisible
         llenarMaquina();
    }//GEN-LAST:event_fase_maquinaPopupMenuWillBecomeInvisible

    private void prendaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_prendaPopupMenuWillBecomeInvisible
         this.inserprenda();
    }//GEN-LAST:event_prendaPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(fase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fase().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRectBackground codigo;
    private javax.swing.JComboBox fase_maquina;
    private org.edisoncor.gui.textField.TextFieldRectBackground fase_operacio;
    private javax.swing.JComboBox fase_operacion;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private org.edisoncor.gui.textField.TextFieldRectBackground maquina;
    private org.edisoncor.gui.textField.TextFieldRectBackground oparacion;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelaguja;
    private javax.swing.JComboBox prenda;
    private org.edisoncor.gui.textField.TextFieldRectBackground ti_prenda;
    // End of variables declaration//GEN-END:variables
}
