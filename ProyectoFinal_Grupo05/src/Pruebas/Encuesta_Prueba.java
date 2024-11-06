
package Pruebas;

import HashSet.HashEncuesta;
import javax.swing.JOptionPane;
import Clases.Encuesta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Encuesta_Prueba extends javax.swing.JFrame {
    
    HashEncuesta nuevoEnc = new HashEncuesta();
    
    public Encuesta_Prueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnContar = new javax.swing.JButton();
        txtTitulo1 = new javax.swing.JTextField();
        txtDescripcion1 = new javax.swing.JTextField();
        txtTipo1 = new javax.swing.JTextField();
        txtFechaCreacion1 = new javax.swing.JTextField();
        txtFechaCierre1 = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        txtFechaCreacion = new javax.swing.JLabel();
        txtFechaCierre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTitulo.setText("Titulo :");

        txtTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTipo.setText("Tipo :");

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDescripcion.setText("Descripción :");

        txtFechaCreacion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFechaCreacion.setText("Fecha de creación :");

        txtFechaCierre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFechaCierre.setText("Fecha de cierre :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion)
                    .addComponent(txtTitulo)
                    .addComponent(txtTipo)
                    .addComponent(txtFechaCreacion)
                    .addComponent(txtFechaCierre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaCierre1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtFechaCreacion1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipo1)
                    .addComponent(txtTitulo1)
                    .addComponent(txtDescripcion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnContar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnListar)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnContar)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaCreacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCreacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaCierre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCierre))
                .addContainerGap(44, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtTitulo1.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar el TITULO");
            return;
        }
        
        if (txtDescripcion1.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar la DESCRIPCION");
            return;
        }
        
        if (txtTipo1.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar el TIPO");
            return;
        }
        
        if (txtFechaCreacion1.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar la FECHA DE CREACION");
            return;
        }
        
        if (txtFechaCierre1.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar la FECHA DE CIERRE");
            return;
        }
        
        Encuesta e = new Encuesta();
        e.setTitulo(txtTitulo1.getText());
        e.setDescripción(txtDescripcion1.getText());
        e.setTipoEncuesta(txtTipo1.getText());
        e.setFechaCreacion(txtFechaCreacion1.getText());
        e.setFechaCierre(txtFechaCierre1.getText());
        
        nuevoEnc.agregarEncuesta(e);
        JOptionPane.showMessageDialog(this, "Libro Registrado");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) tblEncuestas.getModel();
        while(dtm.getRowCount()!=0)dtm.removeRow(0);
        
        for (Encuesta enc : nuevoEnc.listarEncuesta()){
            Object[] rowData = {
                enc.getTitulo(),
                enc.getDescripción(),
                enc.getTipoEncuesta(),
                enc.getFechaCreacion(),
                enc.getFechaCierre()

            };
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtener la fila seleccionada
        int selectedRow = tblEncuestas.getSelectedRow();

        // Validar que se haya seleccionado una fila
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador");
            return;
        }

        // Convertir el Set a List para poder acceder por índice
        List<Encuesta> listaEncuestas = new ArrayList<>(nuevoEnc.listarEncuesta());
        Encuesta pEliminar = listaEncuestas.get(selectedRow);

        nuevoEnc.quitarEncuesta(pEliminar);

        // Actualizar la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblEncuestas.getModel();
        dtm.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Encuesta eliminada.");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        JOptionPane.showMessageDialog(this, "El tamaño es de: "+ nuevoEnc.tamaño());
    }//GEN-LAST:event_btnContarActionPerformed

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
            java.util.logging.Logger.getLogger(Encuesta_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta_Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta_Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncuestas;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JLabel txtFechaCierre;
    private javax.swing.JTextField txtFechaCierre1;
    private javax.swing.JLabel txtFechaCreacion;
    private javax.swing.JTextField txtFechaCreacion1;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JTextField txtTipo1;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
