package Control_BD;

import FormulariosServicios.ConsultarServicios;
import FormulariosServicios.EliminarServicios;
import FormulariosServicios.ModificarServicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class ControlServicios{
 /**
 *@@literal ControlServcisios
 * @author Samuel
 * @author Jesiel
 */
    
    
    
    public ControlServicios(){
        
        
        
    
        this.info = new String[][]{};
    
    }
    
    public void ejecutarConsultaTodaTabla() {

        try {
            conexion2 = BBD1.getConexion();
            sentencia2 = conexion2.createStatement();
            String consultaSQL = "SELECT * FROM servicios ORDER BY IdServicio ASC";
            resultado2 = sentencia2.executeQuery(consultaSQL);
            //mientras haya datos en la BD ejecutar eso...
            while (resultado2.next()) {
                String codigo = resultado2.getString("IdServicio");
                String nombre = resultado2.getString("Nombre");
                String preciocompra = resultado2.getString("Precio");
                String descripcion = resultado2.getString("Descripcion");
                String  CantidadPaquetes = resultado2.getString("CantidadPaquetes");
               
                
       

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre,preciocompra,descripcion,CantidadPaquetes};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion2 = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }

    }//cierra metodo ejecutarConsulta
  
      
      //Esto es para el control de clientes 
       //modelo para la tabla
    DefaultTableModel modelo1;   
       private String sSQL1 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnasp = {"ID", "NOMBRE", " PRECIO","DESCRIPCION","CANTIDAD DE PAQUETES"};
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

    
    
    //Esto es para el control de productos
      //modelo para la tabla
    DefaultTableModel modelo;   
       String sSQL2 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnas = {"ID", "NOMBRE", " PRECIO","DESCRIPCION","CANTIDAD DE PAQUETES"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info2 = {};
    
    
    
    Connection conexion2 = null;
    Statement sentencia2 = null;
    ResultSet resultado2 = null;
    PreparedStatement ps2 = null; 
    //Hoy haremos los metodos para productos
     public void CargarServicios(){ 
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
      //  RealizarServicios.SeleccionarProductos.setModel(modelo);
       
     }
          public void CargarServiciosVentas(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
       // RealizarServicios.SeleccionarProductos.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTablaServicios();
     }  
          public void CargarServicios2(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
//        ModificarServicios.jTableServicios.setModel(modelo);
   
     }
    
          public void CargarServicio_Eliminar(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
              EliminarServicios.jTable_servicios.setModel(modelo);

        //ejecuta una consulta a la BD
      ejecutarConsultaTodaTabla();
         
     }    
     
      public DefaultTableModel mostrar_inicial() {
        //cargar tabla plan sin parametros
            // conexion2 = ConexionConBaseDatos.getConexion();
          
          int totalregistros;
     //   DefaultTableModel modelo1;

        String[] titulos = {"id", "nombres", "precio", "dias"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

            sSQL2 = "SELECT IdServicio,Nombre,Precios,Descripcion,CantidadPaquetes FROM servicios ORDER BY IdServicio ASC";

        try {
            conexion2 = BBD1.getConexion();

//              conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/Ultimate_FerreteriaAndres", "root", "");
            Statement st = conexion2.createStatement();
            ResultSet rs = st.executeQuery(sSQL2);

            while (rs.next()) {
            
                 registro[0]  = resultado2.getString("IdServicio");
                registro[1] = resultado2.getString("Nombre");
                registro[2] = resultado2.getString("Precio");
                registro[3] = resultado2.getString("Descripcion");
                 registro[4] = resultado2.getString("CantidadPaquetes");
               
               
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
      public void listarTodosServicios_por_agotar() {

        modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        ConsultarServicios.jTableListarCliente.setModel(modelo);


        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla_por_agotar();
        

    }
      
      
    public void listarTodosServicios() {

        modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        ConsultarServicios.jTableListarCliente.setModel(modelo);


        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
        

    }//cierra metodo listarTodosClientes
    
     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

        public void ejecutarConsultaTodaTabla_por_agotar() {

        try {
            conexion2 = BBD1.getConexion();

            sentencia2 = conexion2.createStatement();
            //ORDER BY idProductos
            String consultaSQL = "select * from servicios where cantidadPaquetes<=4";
                          Statement st = conexion2.createStatement();
            ResultSet ResultadoPorAgotar = st.executeQuery(consultaSQL);


            
            //mientras haya datos en la BD ejecutar eso...
            while (ResultadoPorAgotar.next()) {
                String codigo = ResultadoPorAgotar.getString("IdServicio");
                String nombre = ResultadoPorAgotar.getString("Nombre");
                String preciocompra = ResultadoPorAgotar.getString("Precio");
                String descripcion = ResultadoPorAgotar.getString("Descripcion");
                String  CantidadPaquetes = ResultadoPorAgotar.getString("CantidadPaquetes");

                
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, preciocompra,descripcion,CantidadPaquetes};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion2 = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }

    }//cierra metodo ejecutarConsulta
        
        
        
        
            public void ejecutarConsultaTodaTablaServicios() {

        try {
            conexion2 = BBD1.getConexion();

            sentencia2 = conexion2.createStatement();
            String consultaSQL = "SELECT * FROM servicios WHERE CantidadPaquetes>0 ORDER BY IdServicio ASC ";
            resultado2 = sentencia2.executeQuery(consultaSQL);


            //mientras haya datos en la BD ejecutar eso...
            while (resultado2.next()) {


                String codigo = resultado2.getString("IdServicio");
                String nombre = resultado2.getString("Nombre");
                String Precio = resultado2.getString("Precio");
                String descripcion = resultado2.getString("Descripcion");
                String CantidadPaquetes = resultado2.getString("CantidadPaquetes");
              

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, Precio,descripcion,CantidadPaquetes};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion2 = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }

    }//cierra metodo ejecutarConsulta
        
    
  
    public void buscarServicios(String parametroBusqueda) {
            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
            ConsultarServicios.jTableListarCliente.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroServicios(parametroBusqueda);

    }

    public void buscarRegistroServicios(String parametroBusqueda) {

        try {

            conexion2 = BBD1.getConexion();
            String selectSQL;
            resultado2 = null;
                            
                selectSQL = "SELECT * FROM servicios WHERE Nombre LIKE ? ORDER BY IdServicio ASC";
                ps2 = conexion2.prepareStatement(selectSQL);
                ps2.setString(1, "%" + parametroBusqueda + "%");
    
            resultado2 = ps2.executeQuery();

            while (resultado2.next()) {
                String codigo = resultado2.getString("IdServicio");
                String nombre = resultado2.getString("Nombre");
                String Precio = resultado2.getString("Precio");
                String descripcion = resultado2.getString("Descripcion");
                String CantidadPaquetes = resultado2.getString("CantidadPaquetes");
                
            
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, Precio,descripcion,CantidadPaquetes};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    
    public void EliminarServicio(String code) {

        try {            
             conexion2 = BBD1.getConexion();
            Statement comando = conexion2.createStatement();
            int cantidad = comando.executeUpdate("delete from servicios where IdServicio=" + code);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Servicio de Codigo "+code);
            }
            conexion2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminarCliente

           public void ModificarServicio(String IdServicio, String nombre, float preciocompra, String descripcion, int CantidadPaquetes) {
          try {
             conexion2 = BBD1.getConexion();
            Statement comando = conexion2.createStatement();                                 
            
            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update servicios set Nombre ='" + nombre + "', "
                + " Precio ='" + preciocompra+ "' "+ ", Descripcion ='" + descripcion + "'"+ ", CantidadPaquetes =" + CantidadPaquetes + "  where IdServicio=" + IdServicio);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null," Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+IdServicio);
            }
            conexion2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }
        
    //es para buscar productos de compras en ventas- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
     
    public void buscarServiciosparaVentas(String parametroBusqueda) {
            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
          //  RealizarServicios.SeleccionarProductos.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroServicioss(parametroBusqueda);

    }
        public void buscarServiciosparaServicios(String parametroBusqueda) {

        

            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
            ModificarServicios.jTableServicios.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroServicioss(parametroBusqueda);

    }
        
             public void buscarServiciosparaEliminarServicios(String parametroBusqueda) {
            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
                 EliminarServicios.jTable_servicios.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroServicioss(parametroBusqueda);

    } 
    
    
    public void buscarRegistroServicioss(String parametroBusqueda) {

        try {

            conexion2 = BBD1.getConexion();
            String selectSQL;
            resultado2 = null;
//  + " nombres like '%"
  //              + buscar + "%'                            
                selectSQL = "SELECT * FROM servicios WHERE Nombre LIKE ? AND CantidadPaquetes>0 ORDER BY IdServicio ASC";
                ps2 = conexion2.prepareStatement(selectSQL);
                ps2.setString(1, "%" + parametroBusqueda + "%");
    
            resultado2 = ps2.executeQuery();
            
            
            while (resultado2.next()) {
                String codigo = resultado2.getString("IdServicio");
                String nombre = resultado2.getString("Nombre");
                String Precio = resultado2.getString("Precio");
                String descripcion = resultado2.getString("Descripcion");
                String CantidadPaquetes = resultado2.getString("CantidadPaquetes");
                
            
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, Precio,descripcion,CantidadPaquetes};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion2, sentencia2, resultado2, ps2);
        }
    }

   
    
}//cierra class
