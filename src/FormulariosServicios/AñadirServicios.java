
package FormulariosServicios;

import Control_BD.BBD1;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *@@literal anadirServicios
 * @author Samuel
 * @author Jesiel
 */

public class AñadirServicios extends javax.swing.JDialog {
String path="";//creamos una variable global para guardar el path
String IdServicio="";
    /**
     * Creates new form addCliente
     */
    BBD1 conectar = new BBD1();
    
    public AñadirServicios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CantPaque = new javax.swing.JTextField();
        btn_abrir_imagen = new javax.swing.JButton();
        jLabel_imagen = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Servicio");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos de Productos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de Servicio");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad de Paquetes");

        jTextArea_descripcion.setColumns(20);
        jTextArea_descripcion.setRows(5);
        jTextArea_descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea_descripcion);

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setText("Descripción");

        jTextField_precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Precio compra");

        CantPaque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CantPaque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CantPaque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantPaqueKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(CantPaque, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CantPaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btn_abrir_imagen.setText("Seleccione imagen");
        btn_abrir_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrir_imagenActionPerformed(evt);
            }
        });

        jLabel_imagen.setText("Imagen");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Regristar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(btn_abrir_imagen))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton2)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel2)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_abrir_imagen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos del Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        AñadirServicios.main(null);
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code her
        
        Connection reg = conectar.getConexion();
        
        // codigo de introducir datos a la mysql
        String sql = "INSERT INTO servicios ( IdServicio, Nombre, Precio,Descripcion,CantidadPaquetes) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst= reg.prepareStatement(sql);
            pst.setString(1,"");
            pst.setString(2,jTextFieldNombre.getText());
            pst.setString(3,jTextField_precio.getText());
            pst.setString(4,jTextArea_descripcion.getText());
            pst.setString(5,CantPaque.getText());
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Regristado Exitosamente");
         
            }
            
              
//consulta mostrar cargar tabla plan con parametros nombre o dias
        //String[] titulos = {"id", "nombres", "precio", "dias"};

        String[] registro = new String[14];

        int totalregistros = 0;
   //     modelo = new DefaultTableModel(null, titulos);
     String sSQL = "";
        sSQL = "select IdServicio"
                + " from servicios "
                + "";

                   Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("IdServicio");
 
   IdServicio=(registro[0]);
                
                totalregistros = totalregistros + 1;
              //  modelo.addRow(registro);

            }
               save();
               
          dispose();
                      AñadirServicios.main(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error - "+ex);
            Logger.getLogger(AñadirServicios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_abrir_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrir_imagenActionPerformed
        // TODO add your handling code here:
             try {
                open();
        } catch (Exception e) {
                 System.err.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_abrir_imagenActionPerformed

    private void jTextField_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyTyped
        // TODO add your handling code here:
                char c=evt.getKeyChar(); 
//             String ruc=jTextField_rucKeyTyped(evt);.getText();
    
          if(Character.isLetter(c)) { 
         
                   
                   
              getToolkit().beep(); 
               
              evt.consume(); 
               }
    }//GEN-LAST:event_jTextField_precioKeyTyped

    private void CantPaqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantPaqueKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        //             String ruc=jTextField_rucKeyTyped(evt);.getText();

        if(Character.isLetter(c)) {

            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_CantPaqueKeyTyped
     void open() throws IOException {
        //empezamos implementando la clase JFileChooser para abrir archivos
        JFileChooser JFC = new JFileChooser();
        //filtro que muestra solo los archivos con extension *.edu
        JFC.setFileFilter(new FileNameExtensionFilter("todos los archivos *.jpg", "png","JPG"));
        //se comprueba si se ha dado al boton aceptar
        int abrir = JFC.showDialog(null, "Abrir");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            FileReader FR = null;
            BufferedReader BR = null;

            try {
                //abro el fichero y creo un BufferedReader para hacer
                //una lectura comoda (tener el metodo readLine();)
                File archivo = JFC.getSelectedFile();//abre un archivo .lengf
                
                //evitar abrir archivo con otra extension que no sea *.LFP
                String PATH = JFC.getSelectedFile().getAbsolutePath();
                if(PATH.endsWith(".jpg")||PATH.endsWith(".png")){
                    
                    FR = new FileReader(archivo);
                    BR = new BufferedReader(FR);
                    
                    //leyendo el archivo
                    String linea;//variable para leer linea por linea el archivo de entrada
                    if(path.compareTo(archivo.getAbsolutePath())==0){
                        System.out.println( "Archivo Abierto"+"Oops! Error"+ JOptionPane.ERROR_MESSAGE);
                    }else{
                        path = archivo.getAbsolutePath();
                     //   jTextArea.setText(null);//limpiamos el textArea antes de sobreescribir
                        while((linea=BR.readLine())!=null){ //cuando termina el texto del archivo?
                          //  jTextArea.append(linea+"\n");//utilizamos append para escribir en el textArea
                          //  textodir=linea+"\n";
                        }
                    }
                    jLabel_imagen.setIcon(new ImageIcon(path));
            ImageIcon icon=new ImageIcon(path);
            Image img=icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(),jLabel_imagen.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon= new ImageIcon(newimg);
            jLabel_imagen.setIcon(newIcon);
            jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());
                    
                }else{
                    System.out.println( "Archivo no soportado"+"Oops! Error"+ JOptionPane.ERROR_MESSAGE);
                    open();
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
            //cerramos el fichero, para asegurar que se cierra tanto
            // si todo va bien si salta una excepcion
            } finally {
                try {
                    if(null!= FR){
                        FR.close();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void save(){

        try {
                             String file = new String("/imgServicios/" + IdServicio + ".jpg"); 
     String master = System.getProperty("user.dir") + file;
    
                 File source = new File(path);

        File dest = new File(master);

            System.out.println("origen :"+path+ "destino: "+master);
 

        // copy file using FileStreams

        long start = System.nanoTime();

        long end;
      
                copyFileUsingFileStreams(source, dest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private static void copyFileUsingFileStreams(File source, File dest)

        throws IOException {

    InputStream input = null;

    OutputStream output = null;

    try {

        input = new FileInputStream(source);

        output = new FileOutputStream(dest);

        byte[] buf = new byte[1024];

        int bytesRead;

        while ((bytesRead = input.read(buf)) > 0) {

            output.write(buf, 0, bytesRead);

        }

    } finally {

        input.close();

        output.close();

    }
}
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
            java.util.logging.Logger.getLogger(AñadirServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AñadirServicios dialog = new AñadirServicios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantPaque;
    private javax.swing.JButton btn_abrir_imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_descripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextField_precio;
    // End of variables declaration//GEN-END:variables
}
