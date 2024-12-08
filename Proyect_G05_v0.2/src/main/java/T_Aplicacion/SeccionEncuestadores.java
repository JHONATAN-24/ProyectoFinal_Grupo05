/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_CLASES.Encuestador;
import T_CONEXION_BD.CRUDJavaE;
import T_CONEXION_BD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeccionEncuestadores extends javax.swing.JFrame {
    
    ListaEncuestadores T_listaEnc2 = new ListaEncuestadores();

    public SeccionEncuestadores(ListaEncuestadores T_encuestador) {
        initComponents();
        this.setTitle("JDM Surveys-ListaEncuestadores");
        this.setSize(815, 540);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        T_listaEnc2 = T_encuestador;
        // Cargar datos al iniciar la ventana
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo3 = new javax.swing.JPanel();
        lbRegEnc = new javax.swing.JLabel();
        lbSelectName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestadores = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelFondo3.setBackground(new java.awt.Color(153, 204, 255));
        PanelFondo3.setMaximumSize(new java.awt.Dimension(800, 500));
        PanelFondo3.setMinimumSize(new java.awt.Dimension(800, 500));
        PanelFondo3.setPreferredSize(new java.awt.Dimension(800, 500));

        lbRegEnc.setFont(new java.awt.Font("Bungee Inline", 0, 24)); // NOI18N
        lbRegEnc.setText("Registro  de  Encuestadores");

        lbSelectName1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbSelectName1.setText("Selecciona tu nombre para continuar");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(788, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(788, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(788, 350));

        tblEncuestadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Genero", "Fecha de nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEncuestadores.setMaximumSize(new java.awt.Dimension(788, 350));
        tblEncuestadores.setMinimumSize(new java.awt.Dimension(788, 350));
        tblEncuestadores.setPreferredSize(new java.awt.Dimension(788, 350));
        jScrollPane1.setViewportView(tblEncuestadores);

        btnListar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar\n");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondo3Layout = new javax.swing.GroupLayout(PanelFondo3);
        PanelFondo3.setLayout(PanelFondo3Layout);
        PanelFondo3Layout.setHorizontalGroup(
            PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(btnListar)
                        .addGap(26, 26, 26)
                        .addComponent(btnSiguiente)
                        .addGap(6, 6, 6))
                    .addGroup(PanelFondo3Layout.createSequentialGroup()
                        .addGroup(PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRegEnc)
                            .addComponent(lbSelectName1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelFondo3Layout.setVerticalGroup(
            PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRegEnc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSelectName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(PanelFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente)
                        .addComponent(btnListar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblEncuestadores.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaE crud = new CRUDJavaE();
        List<Encuestador> lista = crud.obtenerEncuestadores(conexion);
        
            for (Encuestador e : lista) {
                Object[] rowData = {
                    e.getCodigo(),
                    e.getNombre(),
                    e.getApellidos(),
                    e.getGenero(),
                    e.getFechaNacimiento()
                };
                dtm.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // Escoger al usuario de la tabla
            int selectedRow = tblEncuestadores.getSelectedRow();
    
        // Validación
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador.");
                return;
            }   
    
        // Obtener valores de la tabla
            String nombreEncuestador = tblEncuestadores.getValueAt(selectedRow, 1).toString();
            String apellidoEncuestador = tblEncuestadores.getValueAt(selectedRow, 2).toString();

        // Crear y mostrar nueva ventana
            MenuEncuestador nuevaVentana = new MenuEncuestador(T_listaEnc2, nombreEncuestador, apellidoEncuestador);
                nuevaVentana.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // Obtener la fila seleccionada
            int selectedRow = tblEncuestadores.getSelectedRow();

            // Validar que se haya seleccionado una fila
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador");
                return;
            }

            // Confirmación de eliminación
            int T_confirmarE = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este encuestador?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (T_confirmarE != JOptionPane.YES_OPTION) {
                return;
            }

            // Obtener el código del encuestador directamente de la tabla
            String codigoEncuestador = (String) tblEncuestadores.getValueAt(selectedRow, 0);

            // Obtener la conexión usando getInstance()
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUDJavaE T_crudE = new CRUDJavaE();

            // Borrar el encuestador de la base de datos
            T_crudE.borrarEncuestador(conexion, codigoEncuestador);

            // Actualizar la tabla
            DefaultTableModel dtm = (DefaultTableModel) tblEncuestadores.getModel();
            dtm.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Encuestador eliminado.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo3;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRegEnc;
    private javax.swing.JLabel lbSelectName1;
    private javax.swing.JTable tblEncuestadores;
    // End of variables declaration//GEN-END:variables
}
