/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class B01_InicioEnc extends javax.swing.JPanel {

    public B01_InicioEnc() {
        initComponents();
        listarEncuestas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEncuestaAbierta = new javax.swing.JButton();
        btnEncuestaMixta = new javax.swing.JButton();
        btnEncuestaCerrada = new javax.swing.JButton();
        btnEncuestaEnBlanco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEncuestas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(846, 472));
        setMinimumSize(new java.awt.Dimension(846, 472));
        setPreferredSize(new java.awt.Dimension(846, 472));

        Fondo.setBackground(new java.awt.Color(255, 255, 153));
        Fondo.setMaximumSize(new java.awt.Dimension(846, 472));
        Fondo.setMinimumSize(new java.awt.Dimension(846, 472));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear una encuesta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(660, 220));
        jPanel2.setMinimumSize(new java.awt.Dimension(660, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(806, 210));

        btnEncuestaAbierta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaAbierta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaAbierta (100px).png")); // NOI18N
        btnEncuestaAbierta.setText("Tipo Abierta");
        btnEncuestaAbierta.setBorder(null);
        btnEncuestaAbierta.setContentAreaFilled(false);
        btnEncuestaAbierta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaAbierta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaAbierta.setIconTextGap(0);
        btnEncuestaAbierta.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaAbierta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaAbierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaAbiertaActionPerformed(evt);
            }
        });

        btnEncuestaMixta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaMixta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaMixta (100px).png")); // NOI18N
        btnEncuestaMixta.setText("Tipo Mixta");
        btnEncuestaMixta.setBorder(null);
        btnEncuestaMixta.setContentAreaFilled(false);
        btnEncuestaMixta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaMixta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaMixta.setIconTextGap(0);
        btnEncuestaMixta.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaMixta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaMixta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaMixtaActionPerformed(evt);
            }
        });

        btnEncuestaCerrada.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaCerrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaCerrada (100px).png")); // NOI18N
        btnEncuestaCerrada.setText("Tipo Cerrada");
        btnEncuestaCerrada.setBorder(null);
        btnEncuestaCerrada.setContentAreaFilled(false);
        btnEncuestaCerrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaCerrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaCerrada.setIconTextGap(0);
        btnEncuestaCerrada.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaCerrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaCerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaCerradaActionPerformed(evt);
            }
        });

        btnEncuestaEnBlanco.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaEnBlanco.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Encuesta en Banco (Fondo 0)(100px).png")); // NOI18N
        btnEncuestaEnBlanco.setText("En Blanco");
        btnEncuestaEnBlanco.setBorder(null);
        btnEncuestaEnBlanco.setContentAreaFilled(false);
        btnEncuestaEnBlanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaEnBlanco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaEnBlanco.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaEnBlanco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaEnBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaEnBlancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaEnBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncuestaEnBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(834, 217));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(834, 217));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(834, 217));

        tblListaEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripción", "Tipo", "Fecha de creación", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaEncuestas.setMaximumSize(new java.awt.Dimension(834, 500));
        tblListaEncuestas.setMinimumSize(new java.awt.Dimension(834, 500));
        tblListaEncuestas.setPreferredSize(new java.awt.Dimension(834, 500));
        jScrollPane1.setViewportView(tblListaEncuestas);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Encuestas recientes");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncuestaAbiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaAbiertaActionPerformed
        /*
        EncuestaTipoAbierta T_TipoAbierta = new EncuestaTipoAbierta(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
        T_TipoAbierta.setVisible(true);
        T_TipoAbierta.setSize(965, 540);
        T_menuEnc.setVisible(false);
        */
    }//GEN-LAST:event_btnEncuestaAbiertaActionPerformed

    private void btnEncuestaMixtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaMixtaActionPerformed
        /*
        EncuestaTipoMixta T_TipoMixta = new EncuestaTipoMixta(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
        T_TipoMixta.setVisible(true);
        T_TipoMixta.setSize(965, 540);
        T_menuEnc.setVisible(false);
        */
    }//GEN-LAST:event_btnEncuestaMixtaActionPerformed

    private void btnEncuestaCerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaCerradaActionPerformed
        /*
        EncuestaTipoCerrada T_TipoCerrada = new EncuestaTipoCerrada(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
        T_TipoCerrada.setVisible(true);
        T_TipoCerrada.setSize(965, 540);
        T_menuEnc.setVisible(false);
        */
    }//GEN-LAST:event_btnEncuestaCerradaActionPerformed

    private void btnEncuestaEnBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaEnBlancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncuestaEnBlancoActionPerformed

    public void listarEncuestas(){
        try{
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblListaEncuestas.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaEn crud = new CRUDJavaEn();
        List<Encuesta> lista = crud.obtenerListaEncuesta(conexion);
        
            for (Encuesta e : lista) {
                Object[] rowData = {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnEncuestaAbierta;
    private javax.swing.JButton btnEncuestaCerrada;
    private javax.swing.JButton btnEncuestaEnBlanco;
    private javax.swing.JButton btnEncuestaMixta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaEncuestas;
    // End of variables declaration//GEN-END:variables
}
