package Control_BD;
import FormularioCliente.EliminarCliente;
import FormularioCliente.ListarCliente;
import FormularioCliente.ModificarCliente;
import FormularioCliente.AgregarCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlCliente{

    /**
 *@@literal ControlCliente
 * @author Samuel
 * @author Jesiel
 */
    
           public int Id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;
    public String direccion;
    
    public static Connection getConexion() {
        return BBD1.ConectarMysql();
    }

    public static void EliminarPorId(String id_clientes) throws SQLException {
           String sql = "delete from clientes where id = "+id_clientes;
        BBD1.EjecutarActualizacion(sql);
       
    }
    
     //Esto es para el control de clientes 
       //modelo para la tabla
    DefaultTableModel modelo1;   
       private final String sSQL1 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnasp = {"ID", "NOMBRE", " APELLIDO","TELEFONO","CORREO","DIRECCION"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info1 = {};
   
    //Esto es para el consultas
     //modelo para la tabla
    DefaultTableModel modelo2;
    //matriz donde se almacena los datos de cada celda de la tablas
    //vector con los titulos de cada columna
    String info[][];
    // Conectar Base de Datos
    BBD1 conectar = new BBD1();
    
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public ControlCliente() {
        this.info = new String[][]{};
    }
 
    public void Agregar(String nombre, String apellido, String telefono, String correo, String direccion) {
       Connection reg = BBD1.ConectarMysql();
        
         String sql = "INSERT INTO clientes (id_clientes,nombre,apellido,telefono,correo,Direccion)VALUES (?,?,?,?,?,?)";
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
    public void listarTodosClientes() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //le asigna el modelo al jtable
        ListarCliente.jTableListarCliente.setModel(modelo1);
        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();

    }//cierra metodo listarTodosClientes
        public void CargarModificarClientes() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
         //le asigna el modelo al jtable
            ModificarCliente.jTable_clientes.setModel(modelo1);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }    
        //Este metodo es para eliminar clientes
    public void CargarEliminarClientes() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        EliminarCliente.jTable_clientes.setModel(modelo1);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    } 
       
    //----------------------------------------------------------------------------
   
    Connection conexion01 = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;
    //---------------------------------------------------------------------------------
    //Es para buscar Cliente
    @SuppressWarnings("empty-statement")
    public void buscar(String parametroBusqueda,boolean buscarPorNombre, boolean buscarPorApellido) {

            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
            //le asigna el modelo1 al jtable
            ListarCliente.jTableListarCliente.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscar(parametroBusqueda,buscarPorNombre, buscarPorApellido);
    }//Aqui se cierra metodo buscarCliente
    //-------------------------------------------------------------------------------
    
    //Este metodo es para buscar la lista de cliente
    public void buscar(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            //le asigna el modelo1 al jtable
            ListarCliente.jTableListarCliente.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscar(parametroBusqueda);
    }//cierra metodo buscarCliente  
    //Este metodo es para buscarModificarCliente 
    public void buscarModificarCliente(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
          
    }//cierra metodo buscarCliente    
    public void buscarEliminarCliente(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
    }//Aqui cierra metodo buscarCliente
    
        
        //Este es el metodo es para buscar registro por nombre o apellido.
    public void buscarT(String parametroBusqueda, boolean buscarPordni, boolean buscarPorNombre, boolean buscarPorApellido) {

        try {

            conexion01 = BBD1.ConectarMysql();
            String selectSQL;
            resultado = null;
       
             if(buscarPorNombre== true){
                selectSQL = "SELECT * FROM clientes WHERE nombre LIKE ? ORDER BY id_clientes ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorApellido== true){

                selectSQL = "SELECT * FROM clientes WHERE apellido LIKE ? ORDER BY id_clientes ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int codigo = resultado.getInt("id_clientes");
                String nombreb = resultado.getString("nombre");
                String apellidob = resultado.getString("apellido");
                String direccionb = resultado.getString("Direccion");
                              

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] infob = {codigo,nombreb, apellidob, direccionb};
                //Al modelo1 de la tabla le agrega una fila
                //con los datos que están en info1
                modelo1.addRow(infob);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } 
    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    
    //Este es el metodo para eliminar Cliente
    public void EliminarCliente(String Id_clientes) {

        try {            
     Connection Conexion = BBD1.ConectarMysql();
            Statement comando = Conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from clientes where id_clientes=" + Id_clientes);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Cliente de Codigo "+Id_clientes);
            }
            Conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminarCliente
    
     public void Modificar(String id, String nombre, String apellido, String telefono, String correo, String direccion) {
      
        try {
            Connection Conexion1= DriverManager.getConnection("jdbc:mysql://localhost/univodestinosoriente", "root", "");
      
            Statement comando = Conexion1.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update clientes set nombre ='" + nombre + "', "
                + " apellido ='" + apellido + "'" +  " "+ ",telefono ='" + telefono + "', correo ='" + correo + "' , direccion ='" + direccion + "'   where id_clientes=" + id);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null," Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+id);
            }
            Conexion1.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }
 
 //--------------------------------------------------------------------------------------
   public void CargarClientesServicios() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; 
        //    RealizarServicios.SeleccionarCliente.setModel(modelo1);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }
     
    
     public void ejecutarConsultaTodaTabla() {
        try {
            //conexion = ConexionConBaseDatos.getConexion();
            //Como heredamos el metodo getConexion() queda;
            conexion01 =  BBD1.getConexion(); 
            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM clientes ORDER BY nombre ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            //Hacemos un bulce es decir mientras haya datos en la BaseDeDatos se estara ejecutar eso.
            while (resultado.next()) {
                int codigo = resultado.getInt("id_clientes");
                String Nombre = resultado.getString("nombre");
                String Apellido = resultado.getString("apellido");
                String Telefono = resultado.getString("telefono");
                String Correo = resultado.getString("correo");
                 String Direccion = resultado.getString("Direccion");
                
                //Aqui creamos un vector donde los está la informacion se creara una fila
                Object[] Infor = {codigo, Nombre, Apellido,Telefono,Correo,Direccion};

                //Aqui al modelo1 de la tabla le agrega una fila con los datos que están en info1
                modelo1.addRow(Infor);
            }//Aqui se cierra while porque no hay mas datos en la BD .
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion01 = null;
        } 

    }//Aqui se cierra metodo ejecutarConsulta    

}//cierra class

   
