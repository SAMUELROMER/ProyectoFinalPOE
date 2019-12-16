package FormularioCliente;

import Control_BD.ControlCliente;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JDialog {

    public static String Servicios;
    ControlCliente add = new ControlCliente();
    
    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Registar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear Cliente");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales de Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Dirección:");

        jTextField_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Teléfono/celular:");

        jTextField_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonoActionPerformed(evt);
            }
        });
        jTextField_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_telefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Correo:");

        jTextField_correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        Nuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Registar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Registar.setText("Regristar");
        Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellido))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_correo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_telefono)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Registar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(Nuevo)
                    .addComponent(Registar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos personales del Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 334, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 335, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 334, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 335, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 145, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 144, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 145, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 144, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        dispose();
        AgregarCliente.main(null);
    }//GEN-LAST:event_NuevoActionPerformed

    private void RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarActionPerformed
        // TODO add your handling code here:
        if(jTextFieldNombre.getText().equals("")||jTextFieldApellido.getText().equals("")||jTextField_telefono.getText().equals("")||
               jTextField_correo.getText().equals("")||
                jTextField_direccion.getText().equals("")
                ){
            JOptionPane.showMessageDialog(null, "No se puede dejar campos sin llenar");
            
        }else{
               try{
             
                    // obtener datos 
        String nombre = jTextFieldNombre.getText();
        String apellido  = jTextFieldApellido.getText();
        String telefono =(jTextField_telefono.getText());
        String correo =(jTextField_correo.getText());
        String direccion =(jTextField_direccion.getText());
        add.Agregar(nombre,apellido,telefono,correo,direccion);
        // codigo de introducir datos a la mysql
        
        if(Servicios =="Servicios"){
                  dispose();
               //   RealizarVentas.main(null);
}
else{
      dispose();
        AgregarCliente.main(null);
      
}
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error en Registro "+e.getMessage());
            }
        }
        
    
    }//GEN-LAST:event_RegistarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jTextField_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_telefonoKeyTyped
        // TODO add your handling code here:
                char c=evt.getKeyChar(); 
//             String ruc=jTextField_rucKeyTyped(evt);.getText();
    
          if(Character.isLetter(c)) {        
              getToolkit().beep();   
              evt.consume(); 
               }
    }//GEN-LAST:event_jTextField_telefonoKeyTyped

    private void jTextField_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Registar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
