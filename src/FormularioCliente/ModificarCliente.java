package FormularioCliente;


import Control_BD.ControlCliente;

/**
 *@@literal ModificarClientes
 * @author Samuel
 * @author Jesiel
 */
public class ModificarCliente extends javax.swing.JDialog {
     String id_clientes="";
    
    public ModificarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        llamarClientes();
    }
    
    private void llamarClientes() {
        // llamada de datos
        
        ControlCliente load = new ControlCliente();
        load.CargarModificarClientes();
       int[] anchos = {180, 220, 250, 350, 120, 250, 250,230};
        for (int i = 0; i < jTable_clientes.getColumnCount(); i++) {
            jTable_clientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_busqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonModificarVendedor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_busqueda.setToolTipText("Introduce el codigo de cliente ");
        jTextField_busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_busquedaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar  Cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jButtonModificarVendedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificarVendedor.setText("Actualizar");
        jButtonModificarVendedor.setToolTipText("presiona para modificar");
        jButtonModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 130, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Actualizar Cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField_correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Apellidos");

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setText("Teléfono");

        jTextField_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setText("Dirección");

        jTextField_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 310));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, 10));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 130, 30));

        jTable_clientes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_clientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 595, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
  dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarVendedorActionPerformed

        ControlCliente change = new ControlCliente();
        String id = jTextField_busqueda.getText();
       
    String nombre = jTextFieldNombre.getText();
        String apellido  = jTextFieldApellido.getText();
        String telefono =(jTextField_telefono.getText());
        String correo =(jTextField_correo.getText());
     String direccion =(jTextField_direccion.getText());
        change.Modificar(id_clientes, nombre,apellido,telefono,correo,direccion);
      llamarClientes();  
      
       dispose();
        ModificarCliente.main(null);
    }//GEN-LAST:event_jButtonModificarVendedorActionPerformed

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked
        
        int fila = jTable_clientes.rowAtPoint(evt.getPoint());

        id_clientes=(jTable_clientes.getValueAt(fila, 0).toString());
        jTextFieldNombre.setText((jTable_clientes.getValueAt(fila, 1).toString()));
        jTextFieldApellido.setText((jTable_clientes.getValueAt(fila, 2).toString()));
         jTextField_telefono.setText((jTable_clientes.getValueAt(fila, 3).toString()));
        jTextField_correo.setText((jTable_clientes.getValueAt(fila, 4).toString()));
         jTextField_direccion.setText((jTable_clientes.getValueAt(fila, 5).toString()));
    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void jTextField_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_busquedaKeyPressed
        // TODO add your handling code here:
        ControlCliente cc = new ControlCliente();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarModificarCliente(parametroBusqueda);
        int[] anchos = {180, 220, 250, 350, 120, 250, 250,230};
        for (int i = 0; i < jTable_clientes.getColumnCount(); i++) {
            jTable_clientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
    }//GEN-LAST:event_jTextField_busquedaKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ModificarCliente dialog = new ModificarCliente(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificarVendedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextField_busqueda;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
