
package com.mycompany.proyect_g05_v2;

import com.HashSet.SetParticipantes;
import com.Clases.Encuestador;
import com.HashSet.SetEncuestadores;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeccionEnc_Maven extends javax.swing.JFrame {
    SetEncuestadores setEnc1 = new SetEncuestadores();
    SetParticipantes setPart = new SetParticipantes();

    public SeccionEnc_Maven(SetEncuestadores setEnc2) {
        initComponents();
        this.setTitle("JDM Surveys-ListaEncuestadores");
        this.setSize(800, 540);
        this.setLocationRelativeTo(null);
        
        setEnc1 = setEnc2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestadores = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel3.setFont(new java.awt.Font("Bungee Inline", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro  de  Encuestadores");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Selecciona tu nombre para continuar");

        tblEncuestadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Genero", "Fecha de nacimiento"
            }
        ));
        tblEncuestadores.setMaximumSize(new java.awt.Dimension(740, 300));
        tblEncuestadores.setMinimumSize(new java.awt.Dimension(740, 300));
        tblEncuestadores.setPreferredSize(new java.awt.Dimension(740, 300));
        jScrollPane1.setViewportView(tblEncuestadores);

        btnSiguiente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 381, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnGuardar))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel) tblEncuestadores.getModel();
        while(dtm.getRowCount() !=0)dtm.removeRow(0);

        for(Encuestador e: setEnc1.listarEncuestador()){
            Object[] rowData = {
                e.getCodigo(),
                e.getNombre(),
                e.getApellidos(),
                e.getGenero(),
                e.getFechaNacimiento()
            };
            dtm.addRow(rowData);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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

        /*
        // Crear y mostrar nueva ventana
        MenuEncuestador nuevaVentana = new MenuEncuestador(datos1, nombreEncuestador, apellidoEncuestador);
            nuevaVentana.setVisible(true);
            this.dispose();
        */
    }//GEN-LAST:event_btnSiguienteActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncuestadores;
    // End of variables declaration//GEN-END:variables
}
