/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaParticipantes;
import T_Clases.Participante;
import T_ConexionBD.CRUDJavaP;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SeccionParticipantes extends javax.swing.JFrame {
    ListaParticipantes T_listaPart2 = new ListaParticipantes();
    
    public SeccionParticipantes(ListaParticipantes T_participante) {
        initComponents();
        this.setTitle("JDM Surveys-ListaParticiapantes");
        this.setSize(820, 540);
        this.setLocationRelativeTo(null);
        
        T_listaPart2 = T_participante;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParticipante = new javax.swing.JTable();
        btnListarParticipante = new javax.swing.JButton();
        btnSiguienteP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Selecciona tu nombre para continuar");

        tblParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "E-mail", "Nombre", "Apellido", "Genero", "Fecha de nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblParticipante.setMaximumSize(new java.awt.Dimension(788, 350));
        tblParticipante.setMinimumSize(new java.awt.Dimension(788, 350));
        tblParticipante.setPreferredSize(new java.awt.Dimension(788, 350));
        jScrollPane1.setViewportView(tblParticipante);

        btnListarParticipante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnListarParticipante.setText("Listar");
        btnListarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarParticipanteActionPerformed(evt);
            }
        });

        btnSiguienteP.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSiguienteP.setText("Siguiente");
        btnSiguienteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bungee Inline", 0, 24)); // NOI18N
        jLabel3.setText("Registro  de  participantes");

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(32, 32, 32)
                        .addComponent(btnListarParticipante)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguienteP)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(497, 497, 497))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarParticipante)
                    .addComponent(btnSiguienteP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarParticipanteActionPerformed
        try {
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblParticipante.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaP T_crudP = new CRUDJavaP();
        List<Participante> listaP = T_crudP.obtenerParticipantesP(conexion);
        
            for (Participante p : listaP) {
                Object[] rowData = {
                    p.getEmail(),
                    p.getNombre(),
                    p.getApellidos(),
                    p.getGenero(),
                    p.getFechaNacimiento()
                };
                dtm.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarParticipanteActionPerformed

    private void btnSiguientePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePActionPerformed
        int selectRow = tblParticipante.getSelectedRow();
        
        if(selectRow == -1){
            JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Seleccionar un Participante");
            return; 
        }
        
        String nombreParticipante = tblParticipante.getValueAt(selectRow, 1).toString();
        String apellidoParticipante = tblParticipante.getValueAt(selectRow, 2 ).toString();
        
        MenuParticipante nuevaVentana = new MenuParticipante (T_listaPart2, nombreParticipante ,apellidoParticipante);
            nuevaVentana.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnSiguientePActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // Obtener la fila seleccionada
            int selectedRow = tblParticipante.getSelectedRow();

            // Validar que se haya seleccionado una fila
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un Participante");
                return;
            }

            // Confirmación de eliminación
            int T_confirmarE = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este participante?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (T_confirmarE != JOptionPane.YES_OPTION) {
                return;
            }

            // Obtener el código del encuestador directamente de la tabla
            String emailParticipante = (String) tblParticipante.getValueAt(selectedRow, 0);

            // Obtener la conexión usando getInstance()
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUDJavaP T_crudP = new CRUDJavaP();

            // Borrar el encuestador de la base de datos
            T_crudP.borrarParticipante(conexion, emailParticipante);

            // Actualizar la tabla
            DefaultTableModel dtm = (DefaultTableModel) tblParticipante.getModel();
            dtm.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Encuestador eliminado.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListarParticipante;
    private javax.swing.JButton btnSiguienteP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblParticipante;
    // End of variables declaration//GEN-END:variables
}
