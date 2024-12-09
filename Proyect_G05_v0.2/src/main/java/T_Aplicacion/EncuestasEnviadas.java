/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class EncuestasEnviadas extends javax.swing.JPanel {

   ListaEncuestadores T_listaEnc6 = new ListaEncuestadores();
    private String codigoEncuestador;
    
    public EncuestasEnviadas(ListaEncuestadores encuestador, String codigoEncuestador) {
        initComponents();
        T_listaEnc6=encuestador;
        this.codigoEncuestador=codigoEncuestador;
        System.out.println(codigoEncuestador);
        listarEncuestas();
    }

    public void listarEncuestas(){
        try{
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) jListaEncuestas.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaEn crud = new CRUDJavaEn();
        List<Encuesta> lista = crud.obtenerEncuestas(conexion, codigoEncuestador);
        
            for (Encuesta e : lista) {
                Object[] rowData = {
                  e.getEncuestador().getCodigo(),
                  e.getTitulo(),
                  e.getDescripción(),
                  e.getTipoEncuesta(),
                  e.getFechaCreacion(),
                  e.getFechaCierre()
                };
                dtm.addRow(rowData);
            }
           
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaEncuestas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jListaEncuestas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encuestas recientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        jListaEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripción", "Tipo", "Fecha de creación", "Fecha de cierre"
            }
        ));
        jScrollPane2.setViewportView(jListaEncuestas);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Encuestas recientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jListaEncuestas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
