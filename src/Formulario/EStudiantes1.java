/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;


import com.toedter.calendar.JDateChooser;
import conector.baseDatos;
import java.util.Calendar;
import java.util.Date;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public final class EStudiantes1 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form EStudiantes
     */
    public EStudiantes1() {
        initComponents();
        
        //llamamos este metodo
        //cuando abra la consulta me cargue los datos de los empleados
        CargarTablaAlumnos(""); 
        
        
         cbosexo.addItem("F");  //LE ASIGNAMOS VALORES AL COMBO
     cbosexo.addItem("M");
     
     inhabilitar();  //cargamos este metodo para colocar en blando los campos e inhabilitarlos
    }
    
    void CargarTablaAlumnos(String valor)  //este valor sirve para filtrar los datos
    {
        String[] titulos = {"ID", "NOMBRE1", "NOMBRE2", "APELLIDO1", "APELLIDO2", "FEC_NACIMIENTO", "GENERO"};
        String[] registro=new String[7];  //variable de tipo vector 
        String  ssSQL="";
        modelo=new DefaultTableModel(null, titulos);
        
        baseDatos mysql=new baseDatos();
        Connection cn=mysql.Conectar();
        ssSQL = "SELECT * FROM alumnos WHERE CONCAT( nombre1,'', nombre2) LIKE '%"+valor+"%'";
        try {
            Statement st=cn.createStatement();
            
            // almacenamos los datos en un resultset
            ResultSet rs=st.executeQuery(ssSQL); // OBTENEMOS TODOS LOS DATOS
            
            while(rs.next())  //recorremos toda la matriz result set
            {
                registro[0]=rs.getString("id_alumno");  //almacenamos el campo en el registro 0
                registro[1]=rs.getString("nombre1");  //almacenamos el campo en el registro 0
                registro[2]=rs.getString("nombre2");  //almacenamos el campo en el registro 0
                registro[3]=rs.getString("apellido1");  //almacenamos el campo en el registro 0
                registro[4]=rs.getString("apellido2");  //almacenamos el campo en el registro 0
                registro[5]=rs.getString("fecha_naci");  //almacenamos el campo en el registro 0
                registro[6]=rs.getString("genero");  //almacenamos el campo en el registro 0
                
                //despues de recuperarlo datos los almacenamos en el modelo
                modelo.addRow(registro);
                
                
                
                }
            
            //agregamos los datos a la tabla
            tblconsulta.setModel(modelo);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); //ex la variable que maneja la exception
        }
        
    }
    
    
    void BuscarAlumnosEditar(String ID)  //este valor sirve para filtrar los datos
    {
        
        String  ssSQL="";
        String id="", nom1="", nom2="", apell1="", apell2="", fn="", gen="";
       
        
       baseDatos mysql=new baseDatos();
        Connection cn=mysql.Conectar();
        ssSQL = "SELECT * FROM alumnos  WHERE id_alumno = "+ ID;
        try {
            Statement st=cn.createStatement();
            
            // almacenamos los datos en un resultset
            ResultSet rs=st.executeQuery(ssSQL); // OBTENEMOS TODOS LOS DATOS
            
            while(rs.next())  //recorremos toda la matriz result set
            {
                
               id=rs.getString("id_alumno") ;
                nom1=rs.getString("nombre1");  //almacenamos el campo en el registro 0
                nom2=rs.getString("nombre2");  //almacenamos el campo en el registro 0
                apell1=rs.getString("apellido1");  //almacenamos el campo en el registro 0
                apell2=rs.getString("apellido2");  //almacenamos el campo en el registro 0
                fn=rs.getString("fecha_naci");  //almacenamos el campo en el registro 0
                gen=rs.getString("genero");  //almacenamos el campo en el registro 0
                
                
                
                
                
                }
            
            
            
            //agregamos los datos a la tabla
            
        //    txtid.setText();
            txtid.setText(id);
            txtnombre1.setText(nom1);
            txtnombre2.setText(nom2);
            txtapellido1.setText(apell1);
            txtapellido2.setText(apell2);
            txtfenaci.setText(fn);
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); //ex la variable que maneja la exception
        }
        
    }
    
    
    void habilitar()   //creamos un metodo para habilitar las cajas de texto
    {
        txtid.setEnabled(true);
        txtnombre1.setEnabled(true);   //habilitamos las cajas de texto cuando oprimamos cancelar
        txtnombre2.setEnabled(true);
        txtapellido1.setEnabled(true);
        txtapellido2.setEnabled(true);
        txtfenaci.setEnabled(true);
        cbosexo.setEnabled(true);
        
        btnguardar.setEnabled(true);   //habilitamos los botones guardar y cancelar
        btncancelar.setEnabled(true);
        
        txtid.setText("");
        txtnombre1.setText("");   //enviamos espacios en blanco a los campos cuando oprimamos nuevo
        txtnombre2.setText("");
        txtapellido1.setText("");
        txtapellido2.setText("");
        txtfenaci.setText("");
        
        txtid.requestFocus();  //recibe el cursor
    }
    
    void inhabilitar()   //creamos un metodo para inhabilitar las cajas de texto
    {
        txtid.setEnabled(false);
        txtnombre1.setEnabled(false);   //inhabilitamos las cajas de texto cuando oprimamos cancelar
        txtnombre2.setEnabled(false);
        txtapellido1.setEnabled(false);
        txtapellido2.setEnabled(false);
        txtfenaci.setEnabled(false);
        cbosexo.setEnabled(false);
        
        btnguardar.setEnabled(false);   //inhanibilitamos los botones guardar y cancelar
        btncancelar.setEnabled(false);
        
        txtid.setText("");
        txtnombre1.setText("");   //enviamos espacios en blanco a los campos cuando oprimamos nuevo
        txtnombre2.setText("");
        txtapellido1.setText("");
        txtapellido2.setText("");
        txtfenaci.setText("");   
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mneditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        cbosexo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtfenaci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapellido2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtnombre1 = new javax.swing.JTextField();
        txtnombre2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        chooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsulta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();

        mneditar.setText("Modificar");
        mneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("APELLIDO 2");

        jLabel4.setText("APELLIDO 1");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnguardarKeyPressed(evt);
            }
        });

        jLabel1.setText("ID_ALUMNO");

        txtfenaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfenaciActionPerformed(evt);
            }
        });
        txtfenaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfenaciKeyPressed(evt);
            }
        });

        jLabel3.setText("NOMBRE 2");

        jLabel2.setText("NOMBRE 1");

        jLabel7.setText("SEXO");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("FECHA NACIMIENTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid)
                            .addComponent(txtnombre1)
                            .addComponent(txtnombre2)
                            .addComponent(txtapellido1)
                            .addComponent(txtapellido2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 97, Short.MAX_VALUE))
                            .addComponent(txtfenaci))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(btncancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtfenaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(jButton2)
                    .addComponent(btncancelar)
                    .addComponent(jButton4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "CONSULTA ALUMNOS"));

        tblconsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblconsulta.setComponentPopupMenu(jPopupMenu1);
        tblconsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblconsultaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblconsulta);

        jLabel8.setText("Buscar Alumnos");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar)
                        .addGap(32, 32, 32))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfenaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfenaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfenaciActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        txtid.transferFocus();
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.dispose();  //le damos la orden al boton salir para que termine la aplicacion

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        habilitar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btncancelarActionPerformed

    String action="Insertar";
    
    /*public static Date Fecha(JDateChooser jDatefecha) {
        java.util.Date date = jDatefecha.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
      
        return fecha;
    }
    */
    
   
    
   /* void mostrarfecha(){
       String formato="dd/mm/aa";
        Date date=chooser.getDate();
        SimpleDateFormat sdf=new SimpleDateFormat(formato);
        lblfecha.setText(sdf.format(date));
        txtfenaci.setText(date);
        
        
    }
    * 
    */
    void mostrarfecha()
    {
       
    }
    void guardar(){
        
       baseDatos mysql=new baseDatos(); //instanciamos para hacer la conexion con mysql
        Connection cn = mysql.Conectar();  //nos conectamos con el metodo conectar.
        
        String id, nom1, nom2, ape1, ape2, fec_na, gen, fnacim;
        
        String SSQL = "";  //Inicializamos una Variable para insertar los datos de la tabla
        
        String Mensaje;
        
        id = txtid.getText();   //capturamos lo del campo del texto y lo guardamos en la variable
        nom1 = txtnombre1.getText();
        nom2 = txtnombre2.getText();
        ape1 = txtapellido1.getText();
        ape2 = txtapellido2.getText();
    
    
    //String formato = chooser.getDateFormatString();
        
    Date date = chooser.getDate();
    //SimpleDateFormat sdf = new SimpleDateFormat(formato);
   // fnacim = String.valueOf(sdf.format(date));
    //fnacim=String.valueOf(date);
    //fec_na = txtfenaci.getText();
   //  fec_na = fnacim; 
        gen = cbosexo.getSelectedItem().toString();  // pasamos de un tipo a un tipo string
        
        SSQL = "INSERT INTO alumnos(id_alumno, nombre1, nombre2, apellido1, apellido2, fecha_naci, genero)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Mensaje="los datos se han Insertado Satisfactoriamente";
        try
        
        {
            PreparedStatement pst = cn.prepareStatement(SSQL);  // usamos esta interfaz para poder insertar estos elementos en la BD
            pst.setString(1, id);  //ingresamos los datos en la cadena de acuerdo al orden de la bd
            pst.setString(2, nom1);
            pst.setString(3, nom2);
            pst.setString(4, ape1);
            pst.setString(5, ape2);
    //        pst.setString(6, fec_na);
   //         pst.setString(6, fnacim);
            pst.setDate(6, new java.sql.Date(date.getTime()));
            pst.setString(7, gen);
            
            int n = pst.executeUpdate(); //verifica si los datos fueron insertados
            
            if (n > 0) //si los datos se insertaron la variable sera mayor a 0 de lo contrario no se insertaron
            {
                JOptionPane.showMessageDialog(null, Mensaje);
                 CargarTablaAlumnos("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);  //me devuelve la exception por defecto en caso de error
        }
        
        
        
    }
    
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        guardar();
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String valor=txtbuscar.getText();
        CargarTablaAlumnos(valor);
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    void Seleccionar(){
         int filaseleccionada=0;
        String id="";
        filaseleccionada=tblconsulta.getSelectedRow();
        if(tblconsulta.getSelectedRows().length > 0 ) 
       //    JOptionPane.showMessageDialog( null ,"No son molestos los popups?");
        // TODO add your handling code here:
            
             action="Modificar"; //variable que nos sirve para saber cuando se va a modificar
                modelo= (DefaultTableModel)tblconsulta.getModel();//obtener los datos de la tabla a traves de una conversion
               
                //convertimos para asegurar cualquier valor a strin sellecionamos la primera fila
               id = (String) modelo.getValueAt(filaseleccionada, 0); 
                
                //mandamos la variable a la funcion 
                
                BuscarAlumnosEditar(id);
    }
    
    private void mneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneditarActionPerformed
// creamos una variable que es la que nos va a guardar la fila seleccionada
        int filaseleccionada;
        String id;
        
        // os sirve para almacenar las filas seleccionadas
        try
        {
            filaseleccionada=tblconsulta.getSelectedRow();
            
            //comprobamos que realmente se haya selccionado una fila
            
            if (filaseleccionada == -1)
            {
                JOptionPane.showMessageDialog(null, "no se ha seleccionado ninguna fila");
            }
            else
            {
                action="Modificar"; //variable que nos sirve para saber cuando se va a modificar
                modelo= (DefaultTableModel)tblconsulta.getModel();//obtener los datos de la tabla a traves de una conversion
               
                //convertimos para asegurar cualquier valor a strin sellecionamos la primera fila
                id = (String) modelo.getValueAt(filaseleccionada, 0); 
                
                //mandamos la variable a la funcion 
                
                BuscarAlumnosEditar(id);
                
            }
        }
        
        catch(Exception ex)
                {
                    
                }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mneditarActionPerformed

    
    
    private void tblconsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblconsultaKeyPressed
        Seleccionar();
    }//GEN-LAST:event_tblconsultaKeyPressed

    private void btnguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyPressed
guardar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarKeyPressed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed

  /* *    txtid.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtnombre1.requestFocus();
        }
        // TODO add your handling code here:
        * 
        */
    }//GEN-LAST:event_txtidKeyPressed

    private void txtfenaciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfenaciKeyPressed

      
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfenaciKeyPressed

    private void chooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chooserKeyPressed

      
        // TODO add your handling code here:
    }//GEN-LAST:event_chooserKeyPressed

    private void chooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooserMouseClicked
         
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chooserMouseClicked

    private void chooserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chooserKeyReleased
   
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chooserKeyReleased

    private void chooserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chooserKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_chooserKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EStudiantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EStudiantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EStudiantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EStudiantes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EStudiantes1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox cbosexo;
    private com.toedter.calendar.JDateChooser chooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JMenuItem mneditar;
    private javax.swing.JTable tblconsulta;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtapellido2;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtfenaci;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    // End of variables declaration//GEN-END:variables
}
