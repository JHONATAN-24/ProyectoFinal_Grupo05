
package T_Aplicacion;

import T_ArrayList.ListaParticipantes;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EncuestasRecibidas extends javax.swing.JPanel {
    ListaParticipantes T_listaP3 = new ListaParticipantes();
    private MenuParticipante T_menuPart;
    private int codigoparticipante;
    private int encuestaId;
    private String nombreParticipante;
    private String apellidoParticipante;
            
    public EncuestasRecibidas(MenuParticipante T_menuParticipante, ListaParticipantes participante, 
            int codigoparticipante ,String nombreParticipante, String apellidoParticipante, int encuestaId) {
        initComponents();
        this.T_menuPart = T_menuParticipante;
        T_listaP3=participante;
        
        this.codigoparticipante=codigoparticipante;
        System.out.println(codigoparticipante);
        this.nombreParticipante=nombreParticipante;
        this.apellidoParticipante=apellidoParticipante;
        
        mostrarEncuestas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecibidas = new javax.swing.JTable();
        btnAbrirEncuesta = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(745, 420));
        setMinimumSize(new java.awt.Dimension(745, 420));
        setPreferredSize(new java.awt.Dimension(745, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(745, 420));
        jPanel1.setMinimumSize(new java.awt.Dimension(745, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 420));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Recibidas");

        tblRecibidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Descripcion", "Encuestador", "Fecha de creacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecibidas.setMaximumSize(new java.awt.Dimension(733, 343));
        tblRecibidas.setMinimumSize(new java.awt.Dimension(733, 343));
        tblRecibidas.setPreferredSize(new java.awt.Dimension(733, 343));
        jScrollPane1.setViewportView(tblRecibidas);

        btnAbrirEncuesta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAbrirEncuesta.setText("Abrir");
        btnAbrirEncuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAbrirEncuesta.setContentAreaFilled(false);
        btnAbrirEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirEncuesta.setIconTextGap(10);
        btnAbrirEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 671, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAbrirEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirEncuesta)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarEncuestas(){
        try{
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblRecibidas.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaEn crud = new CRUDJavaEn();
        List<Encuesta> lista = crud.obtenerEncuestasPar(conexion);
        
            for (Encuesta e : lista) {
                Object[] rowData = {
                  e.getId(),
                  e.getTitulo(),
                  e.getDescripción(),
                  e.getEncuestador().getNombre(),
                  e.getFechaCreacion()
                };
                dtm.addRow(rowData);
            }
           
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void btnAbrirEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirEncuestaActionPerformed
        // Escoger al usuario de la tabla
        int selectedRow = tblRecibidas.getSelectedRow();

        // Validación
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Encuesta.");
            return;
        }

        // Obtener el ID de la encuesta seleccionada
        int codigoEncuesta = (int) tblRecibidas.getValueAt(selectedRow, 0);
        System.out.println("ID de encuesta seleccionada: " + codigoEncuesta);

        // Crear una instancia del frame EncuestaBase
        EncuestaBase encuestaBase = new EncuestaBase(codigoparticipante,codigoEncuesta);
            encuestaBase.mostrarPreguntasEncuesta(codigoEncuesta);
            encuestaBase.setVisible(true);
    }//GEN-LAST:event_btnAbrirEncuestaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirEncuesta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecibidas;
    // End of variables declaration//GEN-END:variables
}
