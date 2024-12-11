/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_HashSet.HashEncuesta;
import T_HashSet.HashPregunta;
import T_Clases.Encuesta;
import T_Clases.Pregunta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.CRUDJavaPre;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EncuestaTipoAbierta extends javax.swing.JFrame {
   
    ListaEncuestadores T_listaEnc4 = new ListaEncuestadores();
    HashEncuesta nuevoEnc = new HashEncuesta();
    HashPregunta nuevoPre = new HashPregunta();
    private int idEncuestaActual = -1;
    private boolean encuestaGuardada = false;
    
    private String codigoEncuestador;
    private String nombreEncuestador;
    private String apellidoEncuestador;
    
    public EncuestaTipoAbierta(ListaEncuestadores encuestador, String codigoEncuestador, String nombreEncuestador , String apellidoEncuestador) {
        initComponents();
        this.setTitle("Plantilla N° 1");
        this.setSize(965, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        this.T_listaEnc4=encuestador;
        this.codigoEncuestador=codigoEncuestador;
        this.nombreEncuestador=nombreEncuestador;
        this.apellidoEncuestador=apellidoEncuestador;
        
        System.out.println("Código de Encuestador: " + codigoEncuestador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPlantilla01 = new javax.swing.JPanel();
        pnlTituloEncuesta = new javax.swing.JPanel();
        icnEncuesta = new javax.swing.JLabel();
        txtTituloEncuesta = new javax.swing.JTextField();
        btnPublicar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtTituloPregunta = new javax.swing.JTextField();
        btnEliminarPregunta = new javax.swing.JButton();
        btnAgregarPregunta = new javax.swing.JButton();
        btnGuardarPregunta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcalender = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreguntas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 500));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setResizable(false);

        FondoPlantilla01.setBackground(new java.awt.Color(173, 197, 255));
        FondoPlantilla01.setMaximumSize(new java.awt.Dimension(950, 500));
        FondoPlantilla01.setMinimumSize(new java.awt.Dimension(950, 500));
        FondoPlantilla01.setPreferredSize(new java.awt.Dimension(958, 500));

        pnlTituloEncuesta.setBackground(new java.awt.Color(193, 224, 255));
        pnlTituloEncuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTituloEncuesta.setMaximumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setMinimumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setPreferredSize(new java.awt.Dimension(910, 80));

        icnEncuesta.setMaximumSize(new java.awt.Dimension(60, 60));
        icnEncuesta.setMinimumSize(new java.awt.Dimension(60, 60));
        icnEncuesta.setPreferredSize(new java.awt.Dimension(60, 60));

        txtTituloEncuesta.setBackground(new java.awt.Color(193, 224, 255));
        txtTituloEncuesta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTituloEncuesta.setText("Encuesta sin titulo");
        txtTituloEncuesta.setBorder(null);

        btnPublicar.setBackground(new java.awt.Color(153, 204, 255));
        btnPublicar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPublicar.setContentAreaFilled(false);
        btnPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublicar.setOpaque(true);
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDescripcion.setText("Descripcion");

        txtTituloPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTituloPregunta.setText("Pregunta sin titulo");

        btnEliminarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEliminarPregunta.setText("Eliminar Pregunta");
        btnEliminarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarPregunta.setContentAreaFilled(false);
        btnEliminarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPreguntaActionPerformed(evt);
            }
        });

        btnAgregarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAgregarPregunta.setText("Agregar");
        btnAgregarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarPregunta.setContentAreaFilled(false);
        btnAgregarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreguntaActionPerformed(evt);
            }
        });

        btnGuardarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnGuardarPregunta.setText("Guardar");
        btnGuardarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarPregunta.setContentAreaFilled(false);
        btnGuardarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPreguntaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Cierre:");

        javax.swing.GroupLayout pnlTituloEncuestaLayout = new javax.swing.GroupLayout(pnlTituloEncuesta);
        pnlTituloEncuesta.setLayout(pnlTituloEncuestaLayout);
        pnlTituloEncuestaLayout.setHorizontalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addComponent(txtTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTituloPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addComponent(txtDescripcion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTituloEncuestaLayout.setVerticalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icnEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarPregunta)
                        .addComponent(btnGuardarPregunta))
                    .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tblEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Decripción", "Tipo", "Fecha de creación", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncuestas);

        tblPreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enunciado", "Tipo de pregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPreguntas);

        javax.swing.GroupLayout FondoPlantilla01Layout = new javax.swing.GroupLayout(FondoPlantilla01);
        FondoPlantilla01.setLayout(FondoPlantilla01Layout);
        FondoPlantilla01Layout.setHorizontalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoPlantilla01Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2))
                .addGap(17, 17, 17))
        );
        FondoPlantilla01Layout.setVerticalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPlantilla01Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, 950, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPreguntaActionPerformed
        
        try {
        if (txtTituloEncuesta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar el TITULO");
            return;
        }
        
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar la DESCRIPCION");
            return;
        }
        
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        CRUDJavaEn crudEncuestas = new CRUDJavaEn();
        CRUDJavaPre crudPreguntas = new CRUDJavaPre();

        // Only save the survey once
        if (!encuestaGuardada) {
            // Obtener la fecha actual y formatearla
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaCreacion = formatoFecha.format(fechaActual);

            // Usar el JDateChooser    
            Date T_fecha = jcalender.getDate();
            SimpleDateFormat T_FechaE = new SimpleDateFormat("yyyy-MM-dd");
            String date = T_FechaE.format(T_fecha);

            // Validar la fecha de cierre
            Calendar calFechaActual = Calendar.getInstance();
            Calendar calFechaCierre = Calendar.getInstance();
            calFechaCierre.setTime(T_fecha);

            // Comparar fechas
            if (calFechaCierre.before(calFechaActual) || 
                calFechaCierre.equals(calFechaActual)) {
                JOptionPane.showMessageDialog(this, 
                    "La fecha de cierre debe ser un día posterior a la fecha actual", 
                    "Error de Fecha", 
                    JOptionPane.ERROR_MESSAGE);
                return; // Detener el proceso
            }
        
            // Crear y guardar la encuesta
            Encuesta nuevaEncuesta = new Encuesta();
            nuevaEncuesta.setTitulo(txtTituloEncuesta.getText());
            nuevaEncuesta.setDescripción(txtDescripcion.getText());
            nuevaEncuesta.setTipoEncuesta("Abierta");
            nuevaEncuesta.setFechaCreacion(fechaCreacion);
            nuevaEncuesta.setFechaCierre(date);
            
            // Insertar encuesta
            crudEncuestas.insertarEncuestas(conexion, nuevaEncuesta, codigoEncuestador);
            
            // Obtener el ID de la encuesta recién insertada
            idEncuestaActual = obtenerIdUltimaEncuesta();
            
            // Marcar que la encuesta ha sido guardada
            encuestaGuardada = true;
            
            JOptionPane.showMessageDialog(this, "Encuesta guardada");
            nuevoEnc.agregarEncuesta(nuevaEncuesta);
        }

        if (txtTituloPregunta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar el Título de la Pregunta");
            return;
        }

        // Crear y guardar la pregunta
        Pregunta nuevaPregunta = new Pregunta();
        nuevaPregunta.setEnunciado(txtTituloPregunta.getText());
        nuevaPregunta.setTipoPregunta("Abierta");
        
        // Insertar pregunta con el ID de la encuesta
        crudPreguntas.insertarPregunta(conexion, nuevaPregunta, idEncuestaActual);
        
        JOptionPane.showMessageDialog(this, "Pregunta guardada");
        nuevoPre.agregarPregunta(nuevaPregunta);
        
        // Limpiar campos de pregunta para la siguiente
        txtTituloPregunta.setText("");

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }   
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed

    private int obtenerIdUltimaEncuesta() throws SQLException {
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        String sql = "SELECT TOP 1 id_encuestas FROM T_Encuestas ORDER BY id_encuestas DESC";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_encuestas");
            }
        }

        return -1; // Return -1 if no surveys found
    }
    
    private void btnAgregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreguntaActionPerformed
        
        DefaultTableModel tblEnc = (DefaultTableModel) tblEncuestas.getModel();
        while(tblEnc.getRowCount()!=0) tblEnc.removeRow(0);
        
        for (Encuesta enc : nuevoEnc.listarEncuesta()){
            Object[] rowData = {
                enc.getTitulo(),
                enc.getDescripción(),
                enc.getTipoEncuesta(),
                enc.getFechaCreacion(),
                enc.getFechaCierre()

            };
            tblEnc.addRow(rowData);
        }

    try {
        // Obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        CRUDJavaPre crudPreguntas = new CRUDJavaPre();

        // Limpiar la tabla de preguntas
        DefaultTableModel tblPre = (DefaultTableModel) tblPreguntas.getModel();
        while(tblPre.getRowCount() != 0) tblPre.removeRow(0);
        
        // Obtener las preguntas para el ID de la encuesta actual
        if (idEncuestaActual != -1) {
            List<Pregunta> preguntas = crudPreguntas.obtenerPreguntas(conexion, idEncuestaActual);
            
            // Llenar la tabla con las preguntas
            for(Pregunta pre : preguntas){
                Object[] rowData = {
                    pre.getEnunciado(),
                    pre.getTipoPregunta()
                };
                tblPre.addRow(rowData);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay una encuesta seleccionada");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener preguntas: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnAgregarPreguntaActionPerformed

    private void btnEliminarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPreguntaActionPerformed
        try {
        // Obtener la fila seleccionada
        int selectedRow = tblPreguntas.getSelectedRow();

        // Validar que se haya seleccionado una fila
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Pregunta");
            return;
        }

        // Confirmación de eliminación
        int T_confirmarE = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar esta Pregunta?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (T_confirmarE != JOptionPane.YES_OPTION) {
            return;
        }

        // Obtener el enunciado de la pregunta seleccionada
        String enunciadoPre = (String) tblPreguntas.getValueAt(selectedRow, 0);

        // Obtener la conexión usando getInstance()
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        CRUDJavaPre T_crudE = new CRUDJavaPre();

        // Borrar la pregunta de la base de datos
        int filasEliminadas = T_crudE.borrarPregunta(conexion, enunciadoPre);

            if (filasEliminadas > 0) {
                // Actualizar la tabla
                DefaultTableModel dtm = (DefaultTableModel) tblPreguntas.getModel();
                dtm.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Pregunta eliminada.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la pregunta.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarPreguntaActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        if (encuestaGuardada) {
            JOptionPane.showMessageDialog(this, "Encuesta finalizada");
            // Resetear banderas para una nueva encuesta
            encuestaGuardada = false;
            idEncuestaActual = -1;

            // Limpiar campos
            txtTituloEncuesta.setText("");
            txtDescripcion.setText("");
            txtTituloPregunta.setText("");
            jcalender.setDate(null);
        } else {
            JOptionPane.showMessageDialog(this, "Primero debe guardar la encuesta");
        }
        
        MenuEncuestador T_volverMenu = new MenuEncuestador(T_listaEnc4,codigoEncuestador, nombreEncuestador, apellidoEncuestador);
            T_volverMenu.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btnPublicarActionPerformed
    
    public void fechaDeEncuesta(){
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPlantilla01;
    private javax.swing.JButton btnAgregarPregunta;
    private javax.swing.JButton btnEliminarPregunta;
    private javax.swing.JButton btnGuardarPregunta;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel icnEncuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jcalender;
    private javax.swing.JPanel pnlTituloEncuesta;
    private javax.swing.JTable tblEncuestas;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTituloEncuesta;
    private javax.swing.JTextField txtTituloPregunta;
    // End of variables declaration//GEN-END:variables
}
