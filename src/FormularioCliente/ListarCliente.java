
package FormularioCliente;
import Control_BD.ControlCliente;



public class ListarCliente extends javax.swing.JDialog {

    /**
 *@@literal ListarClientes
 * @author Samuel
 * @author Jesiel
 */
    ControlCliente cc = new ControlCliente();
    
    public ListarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarCliente = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBuscarTodos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 450, 50));

        jTableListarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListarCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 700, 150));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 110, -1));

        jButtonBuscarTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarTodos.setText("Mostrar Todos");
        jButtonBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 480, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.gc();//limpiar basura
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTodosActionPerformed
  
        cc.listarTodosClientes();
                                                                     int[] anchos = {200, 200, 350, 250, 200, 250,200,200};
        for (int i = 0; i < jTableListarCliente.getColumnCount(); i++) {
            jTableListarCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
    }//GEN-LAST:event_jButtonBuscarTodosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
      
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarCliente dialog = new ListarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTodos;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableListarCliente;
    // End of variables declaration//GEN-END:variables

    
}
