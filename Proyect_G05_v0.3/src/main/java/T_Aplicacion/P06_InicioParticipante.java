/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestas;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P06_InicioParticipante extends javax.swing.JPanel {

    ListaEncuestas T_listaEncuesta = new ListaEncuestas();
    
    private String codigo;
    private String titulo;
    private String descripcion;
    private String nombreEnc;
    private String fecha;
    
    public P06_InicioParticipante() {
        initComponents();
        mostrarEncuestas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbCodigoEncuesta = new javax.swing.JLabel();
        lbTituloEncuesta = new javax.swing.JLabel();
        lbDescripcionEncuesta = new javax.swing.JLabel();
        IconoEncuesta = new javax.swing.JLabel();
        lbNombreEncuestador = new javax.swing.JLabel();
        lbFechaDeCreacion = new javax.swing.JLabel();
        btnResponderEncuesta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecibidas = new javax.swing.JTable();
        btnVerEncuesta = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 472));
        setMinimumSize(new java.awt.Dimension(846, 472));
        setPreferredSize(new java.awt.Dimension(846, 472));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(846, 472));
        jPanel1.setMinimumSize(new java.awt.Dimension(846, 472));
        jPanel1.setPreferredSize(new java.awt.Dimension(846, 472));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Encuestas recientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Recibidas");

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(834, 142));
        jPanel5.setMinimumSize(new java.awt.Dimension(834, 142));
        jPanel5.setPreferredSize(new java.awt.Dimension(834, 145));

        lbCodigoEncuesta.setText("Codigo :");

        lbTituloEncuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloEncuesta.setText("Titulo :");
        lbTituloEncuesta.setToolTipText("");
        lbTituloEncuesta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbTituloEncuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTituloEncuesta.setMaximumSize(new java.awt.Dimension(206, 16));
        lbTituloEncuesta.setMinimumSize(new java.awt.Dimension(206, 16));
        lbTituloEncuesta.setPreferredSize(new java.awt.Dimension(206, 16));

        lbDescripcionEncuesta.setText("Descripción :");
        lbDescripcionEncuesta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbDescripcionEncuesta.setMaximumSize(new java.awt.Dimension(262, 55));
        lbDescripcionEncuesta.setMinimumSize(new java.awt.Dimension(262, 55));
        lbDescripcionEncuesta.setPreferredSize(new java.awt.Dimension(262, 55));

        IconoEncuesta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaAbierta (100px).png")); // NOI18N
        IconoEncuesta.setMaximumSize(new java.awt.Dimension(100, 100));
        IconoEncuesta.setMinimumSize(new java.awt.Dimension(100, 100));
        IconoEncuesta.setPreferredSize(new java.awt.Dimension(100, 100));

        lbNombreEncuestador.setText("Enviado por :");

        lbFechaDeCreacion.setText("Fecha de publicación :");

        btnResponderEncuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResponderEncuesta.setForeground(new java.awt.Color(51, 51, 255));
        btnResponderEncuesta.setText("Responder");
        btnResponderEncuesta.setBorder(null);
        btnResponderEncuesta.setContentAreaFilled(false);
        btnResponderEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(IconoEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescripcionEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbNombreEncuestador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbFechaDeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCodigoEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(btnResponderEncuesta)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDescripcionEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IconoEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreEncuestador)
                    .addComponent(lbFechaDeCreacion)
                    .addComponent(btnResponderEncuesta)
                    .addComponent(lbCodigoEncuesta))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(834, 231));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(834, 231));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(834, 231));

        tblRecibidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Descripción", "Encuestador", "Fecha de creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecibidas.setMaximumSize(new java.awt.Dimension(834, 800));
        tblRecibidas.setMinimumSize(new java.awt.Dimension(834, 800));
        tblRecibidas.setPreferredSize(new java.awt.Dimension(834, 800));
        jScrollPane1.setViewportView(tblRecibidas);

        btnVerEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerEncuesta.setText("Ver Informacion");
        btnVerEncuesta.setBorder(null);
        btnVerEncuesta.setContentAreaFilled(false);
        btnVerEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerEncuesta)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEncuesta)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEncuestaActionPerformed
        // Escoger a la encuesta de la tabla
            int selectedRow = tblRecibidas.getSelectedRow();
    
        // Validación
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador.");
                return;
            }   
    
        // Obtener valores de la tabla
            String codigoEncuesta = tblRecibidas.getValueAt(selectedRow, 0).toString();
            String tituloEncuesta = tblRecibidas.getValueAt(selectedRow, 1).toString();
            String descripcionEncuesta = tblRecibidas.getValueAt(selectedRow, 2).toString();
            String nombreEncuestador = tblRecibidas.getValueAt(selectedRow, 3).toString();
            String fechaCreacion = tblRecibidas.getValueAt(selectedRow,4).toString();
            
        this.codigo = codigoEncuesta;
        this.titulo = tituloEncuesta;
        this.descripcion = descripcionEncuesta;
        this.nombreEnc = nombreEncuestador;
        this.fecha = fechaCreacion;
        
        MostrarCodigoDeEncuesta();
        MostrarTitulo();
        MostrarDescripcion();
        MostrarNombreDelEncuestador();
        MostrarFechaDeCreacion();
    }//GEN-LAST:event_btnVerEncuestaActionPerformed

    
    
    // METODO PARA MOSTRAR EL TITULO DE LA ENCUESTA:____________________________
    public void MostrarTitulo(){
        lbTituloEncuesta.setText("Titulo : " + titulo);
    }
    // METODO PARA MOSTRAR LA DESCRIPCION DE LA ENCUESTA:_______________________
    public void MostrarDescripcion(){
        lbDescripcionEncuesta.setText("Descripción : " + descripcion);
    }
    // METODO PARA MOSTRAR EL NOMBRE DEL ENCUESTADOR:___________________________
    public void MostrarNombreDelEncuestador(){
        lbNombreEncuestador.setText("Enviado por : " + nombreEnc);
    }
    // METODO PARA MOSTRAR LA FECHA DE CREACION:________________________________
    public void MostrarFechaDeCreacion(){
        lbFechaDeCreacion.setText("Fecha de creación : " + fecha);
    }
    // METODO PARA MOSTRAR EL CODIGO DE LA ENCUESTA:____________________________
    public void MostrarCodigoDeEncuesta(){
        lbCodigoEncuesta.setText("Codigo : " + codigo);
    }
    
    // METODO PARA MOSTRAR LAS ENCUESTAS EN LA TABLA tblRecibidas:______________
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoEncuesta;
    private javax.swing.JButton btnResponderEncuesta;
    private javax.swing.JButton btnVerEncuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigoEncuesta;
    private javax.swing.JLabel lbDescripcionEncuesta;
    private javax.swing.JLabel lbFechaDeCreacion;
    private javax.swing.JLabel lbNombreEncuestador;
    private javax.swing.JLabel lbTituloEncuesta;
    private javax.swing.JTable tblRecibidas;
    // End of variables declaration//GEN-END:variables
}
