
package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_ArrayList.ListaPreguntas;
import T_Clases.Encuesta;
import T_Clases.Pregunta;
import T_Clases.Respuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P10_Resultados extends javax.swing.JPanel {

    ListaEncuestadores T_listaEnc7 = new ListaEncuestadores();
    private String codigoEncuestador;
    
    public P10_Resultados(ListaEncuestadores encuestador, String codigoEncuestador) {
        this.T_listaEnc7=encuestador;
        this.codigoEncuestador= codigoEncuestador;
        initComponents();
        mostrarReportes();
    }
    
    public void mostrarReportes(){
        try {
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            CRUDJavaEn T_crudEn = new CRUDJavaEn();

            List<Encuesta> listaEncuestas = T_crudEn.reporteEncuesta(conexion, codigoEncuestador);

            DefaultTableModel modelo = (DefaultTableModel) tblReportes.getModel(); // Replace with your actual table
            modelo.setRowCount(0);

            for (Encuesta encuesta : listaEncuestas) {
                ListaPreguntas listaPreguntas = encuesta.getListaPreguntas();

                for (Pregunta pregunta : listaPreguntas.listarPregunta()) {
                    for (Respuesta respuesta : pregunta.getRespuestas().listar()) {
                        Object[] fila = new Object[] {
                            encuesta.getTitulo(),                      // titulo
                            pregunta.getEnunciado(),                   // enunciado
                            respuesta.getParticipante().getNombre(),   // nombreParticipante
                            respuesta.getTextoRespuesta(),             // respuesta
                            encuesta.getFechaCreacion(),               // fechaInicio
                            encuesta.getFechaCierre()                  // fechaCierre
                        };

                        modelo.addRow(fila);
                    }
                }
            }

            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, 
                    "No se encontraron encuestas para el encuestador: " + codigoEncuestador, 
                    "Sin Resultados", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        
        } catch (Exception e) {
            // Log the error and show a user-friendly message
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Error al recuperar los reportes de encuestas: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(745, 420));
        setMinimumSize(new java.awt.Dimension(745, 420));
        setPreferredSize(new java.awt.Dimension(745, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(745, 420));
        jPanel1.setMinimumSize(new java.awt.Dimension(745, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 420));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Resultados");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(733, 372));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(733, 372));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(733, 372));

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Enunciado", "Participante", "Respuestas", "Fecha de inicio", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReportes.setMaximumSize(new java.awt.Dimension(733, 800));
        tblReportes.setMinimumSize(new java.awt.Dimension(733, 800));
        tblReportes.setPreferredSize(new java.awt.Dimension(733, 800));
        jScrollPane1.setViewportView(tblReportes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReportes;
    // End of variables declaration//GEN-END:variables
}
