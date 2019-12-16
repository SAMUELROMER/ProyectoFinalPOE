
package Control_BD;

import Autos.ListarAutos;
import static Autos.ListarAutos.ListarAutos1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *@@literal Control_DB
 * @author Samuel
 * @author Jesiel
 */
public class ControlAutosConsulta {
  
  //Esto es para el control de clientes 
       //modelo para la tabla
    DefaultTableModel modelo1;   
       private String sSQL1 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnasp = {"ID", "MARCA", "MODELO","AÑO","CORREO","COLOR","PRECIO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info1 = {};
   
    //Esto es para el consultas
     //modelo para la tabla
    DefaultTableModel modelo2;
    //matriz donde se almacena los datos de cada celda de la tabla
    //vector con los titulos de cada columna
    String info[][];
    // Conectar Base de Datos
    BBD1 conectar = new BBD1();
    
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public ControlAutosConsulta() {
        this.info = new String[][]{};
    }
    
    //Esto es para el control de productos
      //modelo para la tabla
    DefaultTableModel modelo;   
       String sSQL2 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnas = {"ID", "MARCA", "MODELO","AÑO","CORREO","COLOR","PRECIO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info2 = {};
    
    
    //Primero haremos los metodos de Cliente.
    
    
    Connection conexion01 = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;
    public void AgregarAuto(String marca, String modelo, String anuario,String correo,String color,String precio) {

         Connection reg = BBD1.getConexion();
        
         String sql = "INSERT INTO autos (Marca, modelo,anuario,color,correo,precio)VALUES (?,?,?,?,?,?)";
            try {
            PreparedStatement pst= reg.prepareStatement(sql);
            pst.setString(1,marca);
            pst.setString(2,modelo);
            pst.setString(3, anuario);
            pst.setString(4, correo);
            pst.setString(5, color);
            pst.setString(6, precio);
              
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Regristado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error - "+ex);
            Logger.getLogger(ControlAutosConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Aqui cierra metodo agregarCliente
    //Aqui cierra metodo agregarCliente

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    /**
     * Metodo para listar todos los registros de la tabla
     * de clientes, los muestra en un jtable.
     */
    public void listarTodosAutos() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo1 al jtable
        ListarAutos.ListarAutos1.setModel(modelo1);

        //ejecuta una consulta a la BasesDeDatos
//        ejecutarConsultaTodaTabla();

    }//cierra metodo listarTodosClientes
        public void CargarModificarAutos() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    

    }    
        
    public void CargarEliminarAutos() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
     
    } 
        public void CargarAutos() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
     
       

    }//cierra metodo cargarTodosClientes
  
    //----------------------------------------------------------------------------
     /**
     * Metodo para consultar todos los registros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion2 = null;
    Statement sentencia2 = null;
    ResultSet resultado2 = null;
    PreparedStatement ps2 = null;

   
    //---------------------------------------------------------------------------------
    public void buscarAuto(String parametroBusqueda, boolean buscarPorMarca, boolean buscarPorModelo, boolean buscarPorColor) {

            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
            //le asigna el modelo1 al jtable
            ListarAutos.ListarAutos1(modelo1);
            //ejecuta una consulta a la B
            buscarRegistroAutosMarcaModelo(parametroBusqueda, buscarPorMarca, buscarPorModelo, buscarPorColor);
    }//Aqui se cierra metodo buscarCliente
    //-------------------------------------------------------------------------------
    public void buscarListaAuto(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
            //le asigna el modelo1 al jtable
            ListarAutos.ListarAutos1.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscarRegistroMarcaModelo(parametroBusqueda);
    }//cierra metodo buscarCliente  
    public void buscarModificarAuto(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
          
    }//cierra metodo buscarCliente    
    public void buscarEliminarAuto(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
    }//Aqui cierra metodo buscarCliente
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
        public void buscarRegistroMarcaModelo(String parametroBusqueda) {
        try {
            conexion2 = BBD1.getConexion();
            String selectSQL;
            resultado2 = null;

                selectSQL = "SELECT * FROM autos WHERE  marca LIKE ?  or  modelo LIKE ? or  anuario LIKE ? ORDER BY id_autos ASC";
                ps2 = conexion2.prepareStatement(selectSQL);
                ps2.setString(1, "%" + parametroBusqueda + "%");
                ps2.setString(2, "%" + parametroBusqueda + "%");
                ps2.setString(3, "%" + parametroBusqueda + "%");

            resultado2 = ps2.executeQuery();

            while (resultado2.next()) {
           
          int codigo = resultado2.getInt("id_autos");
                String marca = resultado2.getString("marca");
                String modelo = resultado2.getString("modelo");
                String anuario = resultado2.getString("anuario");
                String correo = resultado2.getString("correo");
                String color= resultado2.getString("color");
                String precio = resultado2.getString("precio");
                
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, marca, modelo, anuario,correo,color,precio};;                

                //al modelo1 de la tabla le agrega una fila
                //con los datos que están en info1
                modelo1.addRow(info);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }
    }//Aqui secierra metodo buscarRegistro
        //-----------------------------------------------------------------------------
    public void buscarRegistroAutosMarcaModelo(String parametroBusqueda, boolean buscarPorMarca, boolean buscarPorModelo, boolean buscarPorColor) {

        try {

            conexion2 = BBD1.getConexion();
            String selectSQL;
            resultado2 = null;
       
             if(buscarPorMarca== true){
                selectSQL = "SELECT * FROM autos WHERE marca LIKE ? ORDER BY id_autos ASC";
                ps2 = conexion2.prepareStatement(selectSQL);
                ps2.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorModelo== true){

                selectSQL = "SELECT * FROM autos WHERE modelo LIKE ? ORDER BY id_autos ASC";
                ps2 = conexion2.prepareStatement(selectSQL);
                ps2.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado2 = ps2.executeQuery();

            while (resultado2.next()) {
                int codigo = resultado2.getInt("id_autos");
                String marca = resultado2.getString("marca");
                String modelo = resultado2.getString("modelo");
                 String anuario = resultado2.getString("anuario");
                String color = resultado2.getString("color");
                String correo = resultado2.getString("precio");                

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo,marca, modelo, anuario,color,correo};
                //Al modelo1 de la tabla le agrega una fila
                //con los datos que están en info1
                modelo1.addRow(info);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }
    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    /**
     * Método para validar la entrada del usuario
     * que ingresa para eliminar un cliente
     */
    public void EliminarAuto(String code) {

        try {            
     Connection conexion = BBD1.getConexion();
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from autos where id_autos=" + code);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Cliente de Codigo "+code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminarCliente
    //----------------------------------------------------------------------------
    public void ModificarAutos(String code,String marca, String modelo, String anuario,String correo,String color,String precio) {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/univodestinosoriente", "root", "");
      
            Statement comando = conexion.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update autos set marca ='" + marca + "', "
                + " modelo ='" + modelo + "'" +  " "+ ", anuario ='" + anuario + "'"+  ", correo ='" + correo + "', color ='" + color + "', precio ='" + precio+"'  where id_autos=" + code);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null," Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null,"No existe carro de un codigo "+code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }//cierra metodo modificarAutos
 //--------------------------------------------------------------------------------------
public void ejecutarConsultaTodaTabla() {
//        try {
//            //conexion = ConexionConBaseDatos.getConexion();
//            //Como heredamos el metodo getConexion() queda;
//            conexion01 = BDD.ConectarMysql();
//            sentencia = conexion01.createStatement();
//            String consultaSQL = "SELECT * FROM autos ORDER BY marca ASC";
//            resultado = sentencia.executeQuery(consultaSQL);
//            //Hacemos un bulce es decir mientras haya datos en la BaseDeDatos se estara ejecutar eso.
//            while (resultado.next()) {
//                int codigo = resultado.getInt("id_autos");
//                String marca= resultado.getString("marca");
//                String modelo = resultado.getString("modelo");
//                String anuario = resultado.getString("anuario");
//                String correo = resultado.getString("correo");
//                String color = resultado.getString("color");
//                String precio = resultado.getString("precio");
//                //Aqui creamos un vector donde los está la informacion se creara una fila
//                Object[] info = {codigo, marca, modelo,anuario,correo,color,precio};
//
//                //Aqui al modelo1 de la tabla le agrega una fila con los datos que están en info1
//                modelo1.addRow(info);
//            }//Aqui se cierra while porque no hay mas datos en la BD .
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,e);
//            conexion01 = null;
//        } 
//    

       
try{
           DefaultTableModel modelo=new DefaultTableModel();
           ListarAutos1.setModel(modelo);
           
           PreparedStatement ps=null;
           ResultSet rs =null;
           BBD1 cc=new BBD1();
            Connection con=cc.getConexion();
            
            //
            String sql="SELECT id_autos, marca, modelo, anuario, correo, color,precio FROM autos ORDER BY marca ASC";
            
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Id_Autos");
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Año");
            modelo.addColumn("Correo");
            modelo.addColumn("Color");
            modelo.addColumn("Precio");
            
            while(rs.next()){ //Recorre los datos de cada fila
                
                Object[] filas = new Object[cantidadColumnas];
                for (int i=0; i<cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
            
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }


}
}
