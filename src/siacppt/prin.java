/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;


import conector.baseDatos;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sena
 */
public class prin extends javax.swing.JFrame {

    /**
     * Creates new form prin
     */
    public prin() {
        initComponents();
      // this.codigo_opera.setText("");
       this.panel3.setVisible(false);
       this.calidad_inspeccion.setVisible(false);
       this.historico_aprendiz.setVisible(false);
       //this.operaciones.setVisible(false);
       this.lisPrenda();
       this.lisTallas();
       this.lisAguja();
       this.lisHio();
       this.lisCierre();
       this.lisBoton();
       this.lisCordon();
       this.lisOPeracion();
       this.lisOPrenda();
    }
    
     public void lisOPrenda(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nombre_prenda from tipo_prenda";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_prenda");
                jprenda.addItem(nn);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
     }
    public void lisOPeracion(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nombre_opera from operacion";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_opera");
                calidad_operacion.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void lisCordon(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nom_cordon from cordon";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_cordon");
                confeccion_comb_cordon.addItem(nn);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void inserCordon(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_comb_cordon.getSelectedItem();
        String sql="select *from cordon where nom_cordon=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_cordon");
                cordon_orden.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void lisBoton(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nom_boton from boton";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_boton");
                confeccion_comb_boton.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void inserCierre(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_comb_boton.getSelectedItem();
        String sql="select *from boton where nom_boton=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_boton");
                botones_orden.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    void lisCierre(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nom_sierre from xierre";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_sierre");
                confeccion_comb_cierre.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    void inserCierres(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_comb_cierre.getSelectedItem();
        String sql="select *from xierre where nom_sierre=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_cierre");
                referenciacierre_orden.setText(add);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    void lisHio(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        
        String sql="select nom_hilo from hilo";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_hilo");
                confeccion_comb_hilo.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void insertHilo(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_comb_hilo.getSelectedItem();
        String sql="select *from hilo where nom_hilo=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String add=rs.getString("id_hilo");
                referenciahilo_orden.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
        
    }
    
    
    void lisAguja(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nom_aguja from aguja";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_aguja");
                confeccion_comb_aguja.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    void inserAguja(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_comb_aguja.getSelectedItem();
        String sql="select *from aguja where nom_aguja=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_aguja");
                referenciaguja_orden.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    void lisPrenda(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nombre_prenda from tipo_prenda";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nombre_prenda");
                confeccion_prenda.addItem(nn);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    void inserPrenda(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_prenda.getSelectedItem();
        String sql="select *from tipo_prenda where nombre_prenda=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_tipoprenda");
                prenda.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    
    void lisTallas(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String sql="select nom_tallas from tallas ";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String nn=rs.getString("nom_tallas");
                confeccion_talla.addItem(nn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
                
    }
    
    void inserTallas(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String pt=(String)confeccion_talla.getSelectedItem();
        String sql="select *from tallas where nom_tallas=?";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,pt);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String add=rs.getString("id_tallas");
                tallas.setText(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    
    
    
    
    /*
 public void inserOperacion(){
    baseDatos bd=new baseDatos();
    Connection cn=bd.Conectar();
    String a,b,c,d,e,f,g,h,i,sSQL;
    a=this.codigo_opera.getText();
    b=this.operacion_nom.getText();
    c=this.sam.getText();
    d=this.codigo_maquina.getText();
    e=this.maquina.getText();
    f=this.codigo_fase.getText();
    g=this.fase.getText();
    h=this.oper_codi_prenda.getText();
    i=this.oper_prenda.getText();
    sSQL="insert into operacion values(?,?,?)"; 
    String pr="insert into tipo_prenda values(?,?)";
    String s="insert into maquina values(?,?)";
    String sq="insert into fase_operacion values(?,?,?,?,?)";
    
  try {
            PreparedStatement ps=(PreparedStatement) cn.prepareStatement(sSQL);
            PreparedStatement z=(PreparedStatement) cn.prepareStatement(pr);
            PreparedStatement p=(PreparedStatement) cn.prepareStatement(s);
            PreparedStatement pt=(PreparedStatement) cn.prepareStatement(sq);
            ps.setString(1, a);
            ps.setString(2, b);
            ps.setString(3, c);
            z.setString(1, h);
            z.setString(2, i);
            p.setString(1, d);
            p.setString(2, e);
            pt.setString(1, f);
            pt.setString(2, g);
            pt.setString(3, a);
            pt.setString(4, h);
            pt.setString(5, d);
            int n=z.executeUpdate();
            if (n>0){
                this.operaciones.setVisible(false);
                this.codigo_opera.setText("");
                this.operacion_nom.setText("");
                this.sam.setText("");
                this.codigo_maquina.setText("");
                this.maquina.setText("");
                this.codigo_fase.setText("");
                this.fase.setText("");
                this.oper_codi_prenda.setText("");
                this.oper_prenda.setText("");
               JOptionPane.showMessageDialog(null,"sus datos se guardaron perfectamente");
              }
                   
          
        }
        
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); 
      
       }
         
       }
 
 /*
 public void insetAguja(){
     baseDatos bd=new baseDatos();
     Connection cn=bd.Conectar();
     String a,b,sSQL;
     a=this.aguja.getText();
     b=this.aguja_codigo.getText();
     sSQL="insert into aguja values(?,?)";
       
        try {
            PreparedStatement ps=(PreparedStatement) cn.prepareStatement(sSQL);
            ps.setString(1, b);
            ps.setString(2, a);
            int n=ps.executeUpdate();
            if(n>0){
                this.aguja.setText("");
                this.aguja_codigo.setText("");
                JOptionPane.showMessageDialog(null,"datos insertados");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
     
 }
 
 void insertBordado(){
     baseDatos bd=new baseDatos();
     Connection cn=bd.Conectar();
      String a,b,c,sSQL;
      a=this.bordado_codigo.getText();
      b=this.bordado_ubicacion.getText();
      sSQL="insert into bordado values(??) ";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
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
 
 void isertBoton(){
     baseDatos bd=new baseDatos();
     Connection cn=bd.Conectar();
     
     String a,b,sSQL;
     a=this.boton_codigo.getText();
     b=this.boton.getText();
     sSQL="insert into boton values(?;?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"sus datos se guardaron bien");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"mensajes guardados");
        }
 }
 
 void insetColor(){
     baseDatos bd=new baseDatos();
     Connection cn=bd.Conectar();
     String a,b,sSQL;
     a=this.color_codigo.getDescripcion();
     b=this.color.getText();
     sSQL="insert into color values (?,?";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"datos guardados");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
 }
        void insertCordon(){
        baseDatos bd=new baseDatos();
        Connection cn=bd.Conectar();
        String a,b,c,sSQL;
        a=this.cordon_codigo.getText();
        b=this.cordon.getText();
        sSQL="insert into cordon values(?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
              JOptionPane.showMessageDialog(null,"datos guardados");  
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
 }
        void insertHilo(){
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String a,b,sSQL;
           a=this.hilo_codigo.getText();
           b=this.hilo_nombre.getText();
           sSQL="insert into hilo values (?;?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
            int n=ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"datos guardados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"datos guardados");
        }
   }
        void insertTallas(){
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String a,b,sSQL;
            a=this.talla_codigo.getText();
            b=this.talla.getText();
            sSQL="insert into tallas values(?;?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
   }
        void insertCierre(){
            baseDatos bd=new baseDatos();
            Connection cn=bd.Conectar();
            String a,b,sSQL;
            a=this.cierre_codigo.getText();
            b=this.cierre.getText();
            sSQL="insert into xierre values(?;?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sSQL);
            ps.setString(1,a);
            ps.setString(2,b);
        } catch (SQLException ex) {
            Logger.getLogger(prin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
 */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        tabbedPaneVertical1 = new org.edisoncor.gui.tabbedPane.TabbedPaneVertical();
        tabbedSelector1 = new org.edisoncor.gui.tabbedPane.TabbedSelector();
        panel2 = new org.edisoncor.gui.panel.Panel();
        panel3 = new org.edisoncor.gui.panel.Panel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel9 = new javax.swing.JLabel();
        orden_puntada_pulgada = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        marquilla_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        botones_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        cordon_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        embodados_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        referenciaguja_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        referenciahilo_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        referenciacierre_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        resorteancho_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        resortecolor_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        confeccion_comb_aguja = new javax.swing.JComboBox();
        confeccion_comb_hilo = new javax.swing.JComboBox();
        confeccion_comb_cierre = new javax.swing.JComboBox();
        confeccion_comb_boton = new javax.swing.JComboBox();
        confeccion_comb_cordon = new javax.swing.JComboBox();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel6 = new javax.swing.JLabel();
        ubicacion_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        codigo_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hilo_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        cantidadtalla_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        n_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        confeccion_prenda = new javax.swing.JComboBox();
        confeccion_talla = new javax.swing.JComboBox();
        nuevo_registro = new javax.swing.JToggleButton();
        tallas = new javax.swing.JTextField();
        prenda = new javax.swing.JTextField();
        tabbedSelector3 = new org.edisoncor.gui.tabbedPane.TabbedSelector();
        panel8 = new org.edisoncor.gui.panel.Panel();
        panel9 = new org.edisoncor.gui.panel.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        tabbedSelector4 = new org.edisoncor.gui.tabbedPane.TabbedSelector();
        panel10 = new org.edisoncor.gui.panel.Panel();
        calidad_inspeccion = new org.edisoncor.gui.panel.PanelCurves();
        jLabel28 = new javax.swing.JLabel();
        calidad_prenda = new org.edisoncor.gui.textField.TextFieldRectBackground();
        calidad_fecha = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        calidad_unidad_n_conforme = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        textFieldRectBackground38 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        calidad_n_conformidad = new org.edisoncor.gui.textField.TextFieldRectBackground();
        calidad_n_orden = new org.edisoncor.gui.textField.TextFieldRectBackground();
        calidad_unidad_chequeadas = new org.edisoncor.gui.textField.TextFieldRectBackground();
        calidad_operacion = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jprenda = new javax.swing.JComboBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbInspeccion = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        tabbedSelector5 = new org.edisoncor.gui.tabbedPane.TabbedSelector();
        panel11 = new org.edisoncor.gui.panel.Panel();
        historico_aprendiz = new org.edisoncor.gui.panel.PanelCurves();
        jLabel35 = new javax.swing.JLabel();
        textFieldRectBackground40 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground44 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        textFieldRectBackground45 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel40 = new javax.swing.JLabel();
        textFieldRectBackground49 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground50 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jButton8 = new javax.swing.JButton();
        panelCurves6 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel47 = new javax.swing.JLabel();
        textFieldRectBackground54 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        textFieldRectBackground55 = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jLabel48 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panel12 = new org.edisoncor.gui.panel.Panel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        panel4 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        tfbuscar_operacion = new org.edisoncor.gui.textField.TextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setForeground(new java.awt.Color(255, 255, 255));
        panel2.setColorPrimario(new java.awt.Color(0, 0, 0));
        panel2.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        tabbedSelector1.addTab("orden", panel2);

        panel3.setForeground(new java.awt.Color(255, 255, 255));
        panel3.setColorPrimario(new java.awt.Color(255, 255, 255));

        jButton6.setText("Especificaciones ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("guardar");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Puntadas por Pulgadas ");
        jLabel9.setFocusCycleRoot(true);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        orden_puntada_pulgada.setDescripcion("uauario");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Tipo de Aguja  ");
        jLabel10.setFocusCycleRoot(true);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Tipo de Hilo ");
        jLabel11.setFocusCycleRoot(true);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Marquilla");
        jLabel12.setFocusCycleRoot(true);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        marquilla_orden.setDescripcion("uauario");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Cierres");
        jLabel13.setFocusCycleRoot(true);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Botones");
        jLabel14.setFocusCycleRoot(true);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Resorte");
        jLabel15.setFocusCycleRoot(true);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Cordón");
        jLabel16.setFocusCycleRoot(true);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Sesgo Embonado  ");
        jLabel17.setFocusCycleRoot(true);
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        botones_orden.setDescripcion("uauario");

        cordon_orden.setDescripcion("uauario");

        embodados_orden.setDescripcion("uauario");

        referenciaguja_orden.setDescripcion("uauario");

        referenciahilo_orden.setDescripcion("uauario");

        referenciacierre_orden.setDescripcion("uauario");

        resorteancho_orden.setDescripcion("uauario");

        resortecolor_orden.setDescripcion("uauario");

        confeccion_comb_aguja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aguja" }));
        confeccion_comb_aguja.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_comb_agujaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        confeccion_comb_hilo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hilo" }));
        confeccion_comb_hilo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_comb_hiloPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        confeccion_comb_cierre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cierre" }));
        confeccion_comb_cierre.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_comb_cierrePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        confeccion_comb_boton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "boton" }));
        confeccion_comb_boton.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_comb_botonPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        confeccion_comb_cordon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cordon" }));
        confeccion_comb_cordon.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_comb_cordonPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout panelCurves2Layout = new javax.swing.GroupLayout(panelCurves2);
        panelCurves2.setLayout(panelCurves2Layout);
        panelCurves2Layout.setHorizontalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCurves2Layout.createSequentialGroup()
                        .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(embodados_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confeccion_comb_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botones_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCurves2Layout.createSequentialGroup()
                                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resorteancho_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confeccion_comb_cordon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cordon_orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resortecolor_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelCurves2Layout.createSequentialGroup()
                        .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCurves2Layout.createSequentialGroup()
                                .addComponent(confeccion_comb_aguja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(referenciaguja_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                            .addComponent(orden_puntada_pulgada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCurves2Layout.createSequentialGroup()
                                .addComponent(confeccion_comb_hilo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(referenciahilo_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(marquilla_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCurves2Layout.createSequentialGroup()
                                .addComponent(confeccion_comb_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(referenciacierre_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        panelCurves2Layout.setVerticalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orden_puntada_pulgada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(referenciaguja_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confeccion_comb_aguja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(referenciahilo_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confeccion_comb_hilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marquilla_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(referenciacierre_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confeccion_comb_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botones_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confeccion_comb_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resorteancho_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resortecolor_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cordon_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confeccion_comb_cordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(embodados_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Ubicación  ");
        jLabel6.setFocusCycleRoot(true);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        ubicacion_orden.setDescripcion("uauario");

        codigo_orden.setDescripcion("uauario");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Código");
        jLabel7.setFocusCycleRoot(true);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Hilo ");
        jLabel8.setFocusCycleRoot(true);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        hilo_orden.setDescripcion("uauario");

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hilo_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubicacion_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ubicacion_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(hilo_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Orden");
        jLabel1.setFocusCycleRoot(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Cantidad Por Talla");
        jLabel4.setFocusCycleRoot(true);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cantidad");
        jLabel5.setFocusCycleRoot(true);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cantidad_orden.setDescripcion("uauario");

        cantidadtalla_orden.setDescripcion("uauario");

        n_orden.setDescripcion("uauario");

        confeccion_prenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "prenda" }));
        confeccion_prenda.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_prendaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        confeccion_talla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tallas" }));
        confeccion_talla.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                confeccion_tallaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        nuevo_registro.setText("nuevo registro");
        nuevo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevo_registro))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(jButton5)
                                .addGap(69, 69, 69)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(prenda, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tallas, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(29, 29, 29)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidad_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(cantidadtalla_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(n_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(confeccion_talla, javax.swing.GroupLayout.Alignment.TRAILING, 0, 149, Short.MAX_VALUE)
                                    .addComponent(confeccion_prenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCurves2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(nuevo_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confeccion_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confeccion_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadtalla_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        tabbedSelector1.addTab("ingresar", panel3);

        tabbedPaneVertical1.addTab("orden de confeccion", tabbedSelector1);

        panel8.setColorSecundario(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        tabbedSelector3.addTab("GRUPOS", panel8);

        panel9.setColorSecundario(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellido", "documento"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ficha", "nombre", "aprendices", "jornada"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        tabbedSelector3.addTab("CREAR GRUPO", panel9);

        tabbedPaneVertical1.addTab("GESTION DE APRENDIZ", tabbedSelector3);

        panel10.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Tipo de Prenda  ");
        jLabel28.setFocusCycleRoot(true);
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        calidad_prenda.setDescripcion("uauario");
        calidad_prenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calidad_prendaActionPerformed(evt);
            }
        });
        calidad_prenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                calidad_prendaFocusGained(evt);
            }
        });

        calidad_fecha.setDescripcion("uauario");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setText("Fecha ");
        jLabel29.setFocusCycleRoot(true);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Num orden de Confección ");
        jLabel30.setFocusCycleRoot(true);
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Unidades  No Conformes ");
        jLabel31.setFocusCycleRoot(true);
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        calidad_unidad_n_conforme.setDescripcion("uauario");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Unidades  Chequeadas ");
        jLabel32.setFocusCycleRoot(true);
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText("Operación  ");
        jLabel33.setFocusCycleRoot(true);
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setText("No Conformidad ");
        jLabel34.setFocusCycleRoot(true);
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setFocusCycleRoot(true);
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textFieldRectBackground38.setDescripcion("uauario");

        calidad_n_conformidad.setDescripcion("uauario");

        calidad_n_orden.setDescripcion("uauario");

        calidad_unidad_chequeadas.setDescripcion("uauario");

        calidad_operacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "operacion" }));

        jButton2.setText("guardar");

        jButton7.setText("cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jprenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "prenda" }));

        javax.swing.GroupLayout calidad_inspeccionLayout = new javax.swing.GroupLayout(calidad_inspeccion);
        calidad_inspeccion.setLayout(calidad_inspeccionLayout);
        calidad_inspeccionLayout.setHorizontalGroup(
            calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calidad_inspeccionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(calidad_inspeccionLayout.createSequentialGroup()
                        .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldRectBackground38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calidad_n_conformidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calidad_unidad_n_conforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calidad_unidad_chequeadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calidad_n_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calidad_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calidad_inspeccionLayout.createSequentialGroup()
                        .addComponent(calidad_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calidad_inspeccionLayout.createSequentialGroup()
                        .addComponent(jprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calidad_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calidad_inspeccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addGap(159, 159, 159))
        );
        calidad_inspeccionLayout.setVerticalGroup(
            calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calidad_inspeccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calidad_inspeccionLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calidad_inspeccionLayout.createSequentialGroup()
                        .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calidad_prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calidad_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calidad_n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calidad_unidad_n_conforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calidad_unidad_chequeadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldRectBackground38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calidad_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calidad_n_conformidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(calidad_inspeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addGap(14, 14, 14)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbInspeccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ESTUDIANTE", "FECHA DE INICIO", "FECHA DE FIN", "jornada", "TITULACION", "PORCENTAGE"
            }
        ));
        jScrollPane8.setViewportView(tbInspeccion);

        jButton4.setText("nueva inspeccion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addGap(250, 250, 250)
                .addComponent(calidad_inspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel10Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calidad_inspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton4)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        tabbedSelector4.addTab("Inspección de calidad  ", panel10);

        tabbedPaneVertical1.addTab("GESTION DE CALIDA", tabbedSelector4);

        panel11.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setText("Fecha de inicio de la etapa de producción");
        jLabel35.setFocusCycleRoot(true);
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textFieldRectBackground40.setDescripcion("uauario");

        textFieldRectBackground44.setDescripcion("uauario");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setText("Fecha en que finaliza la etapa de producción ");
        jLabel37.setFocusCycleRoot(true);
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setText("Operación asignada");
        jLabel38.setFocusCycleRoot(true);
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setText("Meta de producción propuesta");
        jLabel39.setFocusCycleRoot(true);
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textFieldRectBackground45.setDescripcion("uauario");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setText("Meta de producción alcanzada");
        jLabel40.setFocusCycleRoot(true);
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textFieldRectBackground49.setDescripcion("uauario");

        textFieldRectBackground50.setDescripcion("uauario");

        jButton8.setText("cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historico_aprendizLayout = new javax.swing.GroupLayout(historico_aprendiz);
        historico_aprendiz.setLayout(historico_aprendizLayout);
        historico_aprendizLayout.setHorizontalGroup(
            historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historico_aprendizLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(historico_aprendizLayout.createSequentialGroup()
                        .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldRectBackground40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground44, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historico_aprendizLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(182, 182, 182))
        );
        historico_aprendizLayout.setVerticalGroup(
            historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historico_aprendizLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historico_aprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setText("Ficha");
        jLabel47.setFocusCycleRoot(true);
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel47.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textFieldRectBackground54.setDescripcion("uauario");

        textFieldRectBackground55.setDescripcion("uauario");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setText("Id ");
        jLabel48.setFocusCycleRoot(true);
        jLabel48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel48.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton3.setText("aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves6Layout = new javax.swing.GroupLayout(panelCurves6);
        panelCurves6.setLayout(panelCurves6Layout);
        panelCurves6Layout.setHorizontalGroup(
            panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(118, 118, 118)
                .addGroup(panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldRectBackground54, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground55, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(162, 162, 162))
        );
        panelCurves6Layout.setVerticalGroup(
            panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(textFieldRectBackground54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCurves6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRectBackground55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(historico_aprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(historico_aprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelCurves6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        tabbedSelector5.addTab("HISTORICO APRENDIZ ", panel11);

        panel12.setColorSecundario(new java.awt.Color(255, 255, 255));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ficha", "fase de operacion", "Cantidad", "Fecha_Inicio ", "Fecha_Fin "
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        tabbedSelector5.addTab("HISTORICO PRODUCCIÓN ", panel12);

        tabbedPaneVertical1.addTab("HISTORICOS", tabbedSelector5);

        panel4.setColorSecundario(new java.awt.Color(255, 255, 255));

        labelMetric7.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric7.setText("Buscar");
        labelMetric7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Seleccionar", "ID", "FECHA", "PRENDA", "CANTIDAD", "COMENTARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setOpaque(false);
        jScrollPane4.setViewportView(jTable4);

        jToggleButton1.setText("nueva operacion");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(tfbuscar_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(603, 603, 603))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(57, 57, 57))))
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfbuscar_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(96, 96, 96)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );

        tabbedPaneVertical1.addTab("GESTION DE OPERACIONES", panel4);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneVertical1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneVertical1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void calidad_prendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calidad_prendaActionPerformed
          calidad_prenda.transferFocus();
    }//GEN-LAST:event_calidad_prendaActionPerformed

    private void calidad_prendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calidad_prendaFocusGained
         
    }//GEN-LAST:event_calidad_prendaFocusGained

    private void nuevo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_registroActionPerformed
         registro_or_confeccio b=new registro_or_confeccio();
         b.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_nuevo_registroActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.calidad_inspeccion.setVisible(true);
        this.tbInspeccion.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            this.calidad_inspeccion.setVisible(false);
        this.tbInspeccion.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          this.historico_aprendiz.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.historico_aprendiz.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         operaciones v=new operaciones();
         v.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void confeccion_tallaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_tallaPopupMenuWillBecomeInvisible
           this.inserTallas();
    }//GEN-LAST:event_confeccion_tallaPopupMenuWillBecomeInvisible

    private void confeccion_prendaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_prendaPopupMenuWillBecomeInvisible
       this.inserPrenda();
    }//GEN-LAST:event_confeccion_prendaPopupMenuWillBecomeInvisible

    private void confeccion_comb_agujaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_comb_agujaPopupMenuWillBecomeInvisible
        this.inserAguja();
    }//GEN-LAST:event_confeccion_comb_agujaPopupMenuWillBecomeInvisible

    private void confeccion_comb_hiloPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_comb_hiloPopupMenuWillBecomeInvisible
          this.insertHilo();
    }//GEN-LAST:event_confeccion_comb_hiloPopupMenuWillBecomeInvisible

    private void confeccion_comb_cierrePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_comb_cierrePopupMenuWillBecomeInvisible
          this.inserCierres();
    }//GEN-LAST:event_confeccion_comb_cierrePopupMenuWillBecomeInvisible

    private void confeccion_comb_botonPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_comb_botonPopupMenuWillBecomeInvisible
         this.inserCierre();
    }//GEN-LAST:event_confeccion_comb_botonPopupMenuWillBecomeInvisible

    private void confeccion_comb_cordonPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_confeccion_comb_cordonPopupMenuWillBecomeInvisible
        this.inserCordon();
    }//GEN-LAST:event_confeccion_comb_cordonPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prin().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRectBackground botones_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_fecha;
    private org.edisoncor.gui.panel.PanelCurves calidad_inspeccion;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_n_conformidad;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_n_orden;
    private javax.swing.JComboBox calidad_operacion;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_prenda;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_unidad_chequeadas;
    private org.edisoncor.gui.textField.TextFieldRectBackground calidad_unidad_n_conforme;
    private org.edisoncor.gui.textField.TextFieldRectBackground cantidad_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground cantidadtalla_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground codigo_orden;
    private javax.swing.JComboBox confeccion_comb_aguja;
    private javax.swing.JComboBox confeccion_comb_boton;
    private javax.swing.JComboBox confeccion_comb_cierre;
    private javax.swing.JComboBox confeccion_comb_cordon;
    private javax.swing.JComboBox confeccion_comb_hilo;
    private javax.swing.JComboBox confeccion_prenda;
    private javax.swing.JComboBox confeccion_talla;
    private org.edisoncor.gui.textField.TextFieldRectBackground cordon_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground embodados_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground hilo_orden;
    private org.edisoncor.gui.panel.PanelCurves historico_aprendiz;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox jprenda;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.textField.TextFieldRectBackground marquilla_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground n_orden;
    private javax.swing.JToggleButton nuevo_registro;
    private org.edisoncor.gui.textField.TextFieldRectBackground orden_puntada_pulgada;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel10;
    private org.edisoncor.gui.panel.Panel panel11;
    private org.edisoncor.gui.panel.Panel panel12;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.panel.Panel panel8;
    private org.edisoncor.gui.panel.Panel panel9;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves6;
    private javax.swing.JTextField prenda;
    private org.edisoncor.gui.textField.TextFieldRectBackground referenciacierre_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground referenciaguja_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground referenciahilo_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground resorteancho_orden;
    private org.edisoncor.gui.textField.TextFieldRectBackground resortecolor_orden;
    private org.edisoncor.gui.tabbedPane.TabbedPaneVertical tabbedPaneVertical1;
    private org.edisoncor.gui.tabbedPane.TabbedSelector tabbedSelector1;
    private org.edisoncor.gui.tabbedPane.TabbedSelector tabbedSelector3;
    private org.edisoncor.gui.tabbedPane.TabbedSelector tabbedSelector4;
    private org.edisoncor.gui.tabbedPane.TabbedSelector tabbedSelector5;
    private javax.swing.JTextField tallas;
    private javax.swing.JTable tbInspeccion;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground38;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground40;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground44;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground45;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground49;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground50;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground54;
    private org.edisoncor.gui.textField.TextFieldRectBackground textFieldRectBackground55;
    private org.edisoncor.gui.textField.TextField tfbuscar_operacion;
    private org.edisoncor.gui.textField.TextFieldRectBackground ubicacion_orden;
    // End of variables declaration//GEN-END:variables
}
