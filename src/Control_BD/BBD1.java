/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@@literal BBD1
 * @author Samuel
 * @author Jesiel
 */

public class BBD1 {
      public static String driver = "com.mysql.jdbc.Driver";
    public static String database = "univodestinosoriente";
    public static String hostname = "localhost";
    public static String port = "3306";
    public static String url = "jdbc:mysql://" + hostname + ":" 
            + port + "/" + database + "?useSSL=false";
    public static String username = "root";
    public static String password = "";
    private static Connection Conexion;
    
    
    public static Connection conectarMySQL() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username,
                    password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        Conexion = conn;
        return conn;
    }
    public static Connection ConectarMysql(){
        return (Conexion==null)?
            conectarMySQL():Conexion;
    }
    public static DefaultTableModel ConsultaTabla(String sql)
    throws SQLException {
        return BuildTableModel(ConsultaDatos(sql));
    }
    public static ResultSet ConsultaDatos(String sql){
        Statement st;
        ResultSet datos = null;
        try{
            st = Conexion.createStatement();
            datos = st.executeQuery(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
        return datos;
    }
    public static DefaultTableModel BuildTableModel(ResultSet rs)
        throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }
    public static void EjecutarActualizacion(String sql)
            throws SQLException{
        Conexion.createStatement().executeUpdate(sql);
    }
    
    public static Connection conexion = null;
 
    public static Connection getConexion() {
        try {
           conexion = null;
           Class.forName("com.mysql.jdbc.Driver");
           conexion =DriverManager.getConnection("jdbc:mysql://localhost/univodestinosoriente","root","");
           System.out.println("conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
//Si todo salio bien tendre con exito la conexion.
        return conexion;
    }
   
    
}
