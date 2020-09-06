
package conector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class baseDatos
{
    public String db="textil";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="";
    //| 
    public baseDatos(){}
    
    public Connection Conectar()
    {
        Connection Link=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Link=(Connection) DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return Link;
    }
    
}
