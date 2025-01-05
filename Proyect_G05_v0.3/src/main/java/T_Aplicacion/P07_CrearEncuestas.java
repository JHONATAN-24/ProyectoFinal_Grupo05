
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P07_CrearEncuestas extends javax.swing.JPanel {

    //Atributo para instanciar un jframe (MenuEncuestador)
    private V05_MenuEnc T_menuEnc; //Funcionalidad que va a tener es poder poner al jframe Invisible
    ListaEncuestadores T_listaEnc5 = new ListaEncuestadores();
    private String codigoEncuestador;
    private String nombreEncuestador;
    private String apellidoEncuestador;
    
    
    public P07_CrearEncuestas(V05_MenuEnc T_menuEncuestador, ListaEncuestadores encuestador, String codigoEncuestador, String nombreEncuestador, String apellidoEncuestador) {
        initComponents();
        this.T_menuEnc = T_menuEncuestador;
        T_listaEnc5 = encuestador;
        this.codigoEncuestador = codigoEncuestador;
        this.nombreEncuestador = nombreEncuestador;
        this.apellidoEncuestador = apellidoEncuestador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEncuestaAbierta = new javax.swing.JButton();
        btnEncuestaMixta = new javax.swing.JButton();
        btnEncuestaCerrada = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(846, 472));
        setMinimumSize(new java.awt.Dimension(846, 472));
        setPreferredSize(new java.awt.Dimension(846, 472));

        Fondo.setBackground(new java.awt.Color(255, 255, 153));
        Fondo.setMaximumSize(new java.awt.Dimension(846, 472));
        Fondo.setMinimumSize(new java.awt.Dimension(846, 472));
        Fondo.setPreferredSize(new java.awt.Dimension(846, 472));

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

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Encuesta en Banco (Fondo 0)(100px).png")); // NOI18N
        jButton1.setText("En Blanco");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(112, 130));
        jButton1.setMinimumSize(new java.awt.Dimension(112, 130));
        jButton1.setPreferredSize(new java.awt.Dimension(112, 130));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnEncuestaAbierta;
    private javax.swing.JButton btnEncuestaCerrada;
    private javax.swing.JButton btnEncuestaMixta;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
