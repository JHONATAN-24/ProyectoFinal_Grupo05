
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package Aplicacion;

import Clases.Encuesta;
import Clases.Pregunta;
import HashSet.HashEncuesta;
import HashSet.HashPregunta;
import ArrayList.ListaEncuestas;
import ArrayList.ListaPreguntas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlantillaEncuesta_01 extends javax.swing.JFrame {
   
    HashEncuesta nuevoEnc = new HashEncuesta();
    HashPregunta nuevoPre = new HashPregunta();
    public PlantillaEncuesta_01() {
        initComponents();
        this.setTitle("Plantilla N° 1");
        this.setLocationRelativeTo(null);
        this.setSize(950, 580);
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoEncuesta = new javax.swing.ButtonGroup();
        bgTipoPregunta = new javax.swing.ButtonGroup();
        FondoPlantilla01 = new javax.swing.JPanel();
        pnlTituloEncuesta = new javax.swing.JPanel();
        icnEncuesta = new javax.swing.JLabel();
        txtTituloEncuesta = new javax.swing.JTextField();
        btnPublicar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEliminarEncuesta = new javax.swing.JButton();
        pnlPregunta = new javax.swing.JPanel();
        txtTituloPregunta = new javax.swing.JTextField();
        icnEncuesta1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestas = new javax.swing.JTable();
        btnGuardarPregunta = new javax.swing.JButton();
        btnAgregarPregunta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreguntas = new javax.swing.JTable();
        btnEliminarPregunta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 580));

        FondoPlantilla01.setBackground(new java.awt.Color(173, 197, 255));
        FondoPlantilla01.setMaximumSize(new java.awt.Dimension(950, 580));
        FondoPlantilla01.setMinimumSize(new java.awt.Dimension(950, 580));

        pnlTituloEncuesta.setBackground(new java.awt.Color(193, 224, 255));
        pnlTituloEncuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTituloEncuesta.setMaximumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setMinimumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setPreferredSize(new java.awt.Dimension(910, 80));

        icnEncuesta.setMaximumSize(new java.awt.Dimension(55, 55));
        icnEncuesta.setMinimumSize(new java.awt.Dimension(55, 55));
        icnEncuesta.setPreferredSize(new java.awt.Dimension(55, 55));

        txtTituloEncuesta.setBackground(new java.awt.Color(193, 224, 255));
        txtTituloEncuesta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTituloEncuesta.setText("Encuesta sin titulo");
        txtTituloEncuesta.setBorder(null);

        btnPublicar.setBackground(new java.awt.Color(153, 204, 255));
        btnPublicar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(0, 0, 0));
        btnPublicar.setText("Publicar");
        btnPublicar.setBorder(new javax.swing.border.MatteBorder(null));
        btnPublicar.setBorderPainted(false);
        btnPublicar.setContentAreaFilled(false);
        btnPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublicar.setOpaque(true);

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDescripcion.setText("Descripcion");

        btnEliminarEncuesta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEliminarEncuesta.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarEncuesta.setText("Eliminar Encuesta");
        btnEliminarEncuesta.setBorder(null);
        btnEliminarEncuesta.setContentAreaFilled(false);
        btnEliminarEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloEncuestaLayout = new javax.swing.GroupLayout(pnlTituloEncuesta);
        pnlTituloEncuesta.setLayout(pnlTituloEncuestaLayout);
        pnlTituloEncuestaLayout.setHorizontalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addComponent(txtTituloEncuesta)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarEncuesta)
                        .addGap(51, 51, 51)
                        .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTituloEncuestaLayout.setVerticalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarEncuesta)
                            .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlPregunta.setBackground(new java.awt.Color(193, 224, 255));
        pnlPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPregunta.setMaximumSize(new java.awt.Dimension(910, 100));
        pnlPregunta.setMinimumSize(new java.awt.Dimension(910, 100));

        txtTituloPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTituloPregunta.setText("Pregunta sin titulo");

        javax.swing.GroupLayout pnlPreguntaLayout = new javax.swing.GroupLayout(pnlPregunta);
        pnlPregunta.setLayout(pnlPreguntaLayout);
        pnlPreguntaLayout.setHorizontalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnEncuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlPreguntaLayout.setVerticalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnEncuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnGuardarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnGuardarPregunta.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarPregunta.setText("Guardar");
        btnGuardarPregunta.setBorder(null);
        btnGuardarPregunta.setContentAreaFilled(false);
        btnGuardarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPreguntaActionPerformed(evt);
            }
        });

        btnAgregarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAgregarPregunta.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarPregunta.setText("Agregar");
        btnAgregarPregunta.setBorder(null);
        btnAgregarPregunta.setContentAreaFilled(false);
        btnAgregarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreguntaActionPerformed(evt);
            }
        });

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

        btnEliminarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEliminarPregunta.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarPregunta.setText("Eliminar Pregunta");
        btnEliminarPregunta.setBorder(null);
        btnEliminarPregunta.setContentAreaFilled(false);
        btnEliminarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoPlantilla01Layout = new javax.swing.GroupLayout(FondoPlantilla01);
        FondoPlantilla01.setLayout(FondoPlantilla01Layout);
        FondoPlantilla01Layout.setHorizontalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoPlantilla01Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(FondoPlantilla01Layout.createSequentialGroup()
                        .addComponent(btnGuardarPregunta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPregunta)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPregunta)))
                .addGap(22, 22, 22))
        );
        FondoPlantilla01Layout.setVerticalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPlantilla01Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPregunta)
                    .addComponent(btnAgregarPregunta)
                    .addComponent(btnEliminarPregunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPreguntaActionPerformed
        
        if (txtTituloEncuesta.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar el TITULO");
            return;
        }
        
        if (txtDescripcion.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar la DESCRIPCION");
            return;
        }
        
        if (txtTituloPregunta.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar la DESCRIPCION");
            return;
        }
        
        Pregunta nuevaPregunta = new Pregunta();
        nuevaPregunta.setEnunciado(txtTituloPregunta.getText());
        nuevaPregunta.setTipoPregunta("Abierta");
        nuevoPre.agregarPregunta(nuevaPregunta);
        JOptionPane.showMessageDialog(this, "Pregunta listada");
        
        Encuesta nuevaEncuesta = new Encuesta();
        nuevaEncuesta.setTitulo(txtTituloEncuesta.getText());
        nuevaEncuesta.setDescripción(txtDescripcion.getText());
        nuevaEncuesta.setTipoEncuesta("Abierta");
        nuevaEncuesta.setFechaCreacion("");
        nuevaEncuesta.setFechaCierre("");
        nuevoEnc.agregarEncuesta(nuevaEncuesta);
        JOptionPane.showMessageDialog(this, "Encuesta listada");
     
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed

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
        
        DefaultTableModel tblPre = (DefaultTableModel) tblPreguntas.getModel();
        while(tblPre.getRowCount() !=0) tblPre.removeRow(0);
        
        for(Pregunta pre : nuevoPre.listarPregunta()){
            Object[] rowData = {
                pre.getEnunciado(),
                pre.getTipoPregunta()
            };
            tblPre.addRow(rowData);
        }
        
    }//GEN-LAST:event_btnAgregarPreguntaActionPerformed

    private void btnEliminarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEncuestaActionPerformed
        // Obtener la fila seleccionada
        int selectEnc = tblEncuestas.getSelectedRow();

        // Validar que se haya seleccionado una fila
        if (selectEnc == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador");
            return;
        }

        // Convertir el Set a List para poder acceder por índice
        List<Encuesta> listaEncuestas = new ArrayList<>(nuevoEnc.listarEncuesta());
        Encuesta pEliminar = listaEncuestas.get(selectEnc);

        nuevoEnc.quitarEncuesta(pEliminar);

        // Actualizar la tabla
        DefaultTableModel tblEnc = (DefaultTableModel) tblEncuestas.getModel();
        tblEnc.removeRow(selectEnc);
        JOptionPane.showMessageDialog(this, "Encuesta eliminada.");
    
    }//GEN-LAST:event_btnEliminarEncuestaActionPerformed

    private void btnEliminarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPreguntaActionPerformed
         // Obtener la fila seleccionada
        int selectPre = tblPreguntas.getSelectedRow();

        // Validar que se haya seleccionado una fila
        if (selectPre == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Pregunta");
            return;
        }

        // Convertir el Set a List para poder acceder por índice
        List<Pregunta> listaPreguntas = new ArrayList<>(nuevoPre.listarPregunta());
        Pregunta deletePre = listaPreguntas.get(selectPre);

        nuevoPre.eliminarPregunta(deletePre);

        // Actualizar la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblPreguntas.getModel();
        dtm.removeRow(selectPre);
        JOptionPane.showMessageDialog(this, "Pregunta eliminada.");
    }//GEN-LAST:event_btnEliminarPreguntaActionPerformed
    
    public void fechaDeEncuesta(){
        
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
            java.util.logging.Logger.getLogger(PlantillaEncuesta_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantillaEncuesta_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantillaEncuesta_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantillaEncuesta_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantillaEncuesta_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPlantilla01;
    private javax.swing.ButtonGroup bgTipoEncuesta;
    private javax.swing.ButtonGroup bgTipoPregunta;
    private javax.swing.JButton btnAgregarPregunta;
    private javax.swing.JButton btnEliminarEncuesta;
    private javax.swing.JButton btnEliminarPregunta;
    private javax.swing.JButton btnGuardarPregunta;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel icnEncuesta;
    private javax.swing.JLabel icnEncuesta1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlPregunta;
    private javax.swing.JPanel pnlTituloEncuesta;
    private javax.swing.JTable tblEncuestas;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTituloEncuesta;
    private javax.swing.JTextField txtTituloPregunta;
    // End of variables declaration//GEN-END:variables
}