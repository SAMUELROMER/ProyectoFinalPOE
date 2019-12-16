
package Control_BD;

import java.sql.SQLException;
import FormularioCliente.AgregarCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *@@literal ClienteBDD
 * @author Samuel
 * @author Jesiel
 */
public class ClientesBDD {
       public int Id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;
    public String direccion;
    
    public void EliminarPorId()throws SQLException{
        String sql = "delete from clientes where id_clientes = "+Id;
        BBD1.EjecutarActualizacion(sql);
    }
    //Para que este insert funcione el id en la tabla de la base de datos
    //debe ser AI (Autoincrement).
    public void Insertar() throws SQLException{
      //  String sql = "insert into fantasia(nombre,origen,uniones)"+
     ///           " values('"+Nombre+"','"+Apellido+"','"+telefono+"','"+correo+"','"+direccion+"')";
     //   BDD.EjecutarActualizacion(sql);
     Connection reg = BBD1.ConectarMysql();
        
         String sql = "INSERT INTO clientes (id_clientes,nombre,apellido,telefono,correo,direccion)VALUES (?,?,?,?,?,?)";
            try {
            PreparedStatement pst= reg.prepareStatement(sql);
            pst.setString(1,"");
            pst.setString(2,nombre);
            pst.setString(3,apellido);
            pst.setString(4,telefono);
            pst.setString(5,correo);
             pst.setString(6,direccion);
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Regristado Exitosamente de Cliente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error - "+ex);
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
    }
  
}
