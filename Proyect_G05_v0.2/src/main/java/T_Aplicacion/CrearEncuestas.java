
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import java.awt.BorderLayout;

public class CrearEncuestas extends javax.swing.JPanel {

    //Atributo para instanciar un jframe (MenuEncuestador)
    private MenuEncuestador T_menuEnc; //Funcionalidad que va a tener es poder poner al jframe Invisible
    ListaEncuestadores T_listaEnc5 = new ListaEncuestadores();
    private String codigoEncuestador;
    private String nombreEncuestador;
    private String apellidoEncuestador;
    
    
    public CrearEncuestas(MenuEncuestador T_menuEncuestador, ListaEncuestadores encuestador, String codigoEncuestador, String nombreEncuestador, String apellidoEncuestador) {
        initComponents();
        this.T_menuEnc = T_menuEncuestador;
        T_listaEnc5 = encuestador;
        this.codigoEncuestador=codigoEncuestador;
        this.nombreEncuestador=nombreEncuestador;
        this.apellidoEncuestador=apellidoEncuestador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEncuestaAbierta = new javax.swing.JButton();
        btnEncuestaMixta = new javax.swing.JButton();
        btnEncuestaCerrada = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(745, 420));
        setMinimumSize(new java.awt.Dimension(745, 420));
        setPreferredSize(new java.awt.Dimension(745, 420));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMaximumSize(new java.awt.Dimension(745, 420));
        Fondo.setMinimumSize(new java.awt.Dimension(745, 420));
        Fondo.setPreferredSize(new java.awt.Dimension(745, 420));

        jPanel2.setBackground(new java.awt.Color(234, 255, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear una encuesta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(660, 220));
        jPanel2.setMinimumSize(new java.awt.Dimension(660, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(660, 200));

        btnEncuestaAbierta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaAbierta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Plantilla01.png")); // NOI18N
        btnEncuestaAbierta.setText("Encuesta Simple");
        btnEncuestaAbierta.setBorder(null);
        btnEncuestaAbierta.setContentAreaFilled(false);
        btnEncuestaAbierta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaAbierta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaAbierta.setIconTextGap(0);
        btnEncuestaAbierta.setMaximumSize(new java.awt.Dimension(100, 130));
        btnEncuestaAbierta.setMinimumSize(new java.awt.Dimension(100, 130));
        btnEncuestaAbierta.setPreferredSize(new java.awt.Dimension(100, 130));
        btnEncuestaAbierta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaAbierta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaAbierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaAbiertaActionPerformed(evt);
            }
        });

        btnEncuestaMixta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaMixta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaMixta (100px).png")); // NOI18N
        btnEncuestaMixta.setText("Encuesta Simple");
        btnEncuestaMixta.setBorder(null);
        btnEncuestaMixta.setContentAreaFilled(false);
        btnEncuestaMixta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaMixta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaMixta.setIconTextGap(0);
        btnEncuestaMixta.setMaximumSize(new java.awt.Dimension(100, 130));
        btnEncuestaMixta.setMinimumSize(new java.awt.Dimension(100, 130));
        btnEncuestaMixta.setPreferredSize(new java.awt.Dimension(100, 130));
        btnEncuestaMixta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaMixta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaMixta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaMixtaActionPerformed(evt);
            }
        });

        btnEncuestaCerrada.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaCerrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaCerrada (100px).png")); // NOI18N
        btnEncuestaCerrada.setText("Encuesta Simple");
        btnEncuestaCerrada.setBorder(null);
        btnEncuestaCerrada.setContentAreaFilled(false);
        btnEncuestaCerrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaCerrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaCerrada.setIconTextGap(0);
        btnEncuestaCerrada.setMaximumSize(new java.awt.Dimension(100, 130));
        btnEncuestaCerrada.setMinimumSize(new java.awt.Dimension(100, 130));
        btnEncuestaCerrada.setPreferredSize(new java.awt.Dimension(100, 130));
        btnEncuestaCerrada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaCerrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaCerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaCerradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncuestaAbiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaAbiertaActionPerformed
        EncuestaTipoAbierta T_TipoAbierta = new EncuestaTipoAbierta(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
            T_TipoAbierta.setVisible(true);
            T_TipoAbierta.setSize(965, 540);
            T_menuEnc.setVisible(false);
    }//GEN-LAST:event_btnEncuestaAbiertaActionPerformed

    private void btnEncuestaMixtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaMixtaActionPerformed
        // TODO add your handling code here:
        EncuestaTipoMixta T_TipoMixta = new EncuestaTipoMixta(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
            T_TipoMixta.setVisible(true);
            T_TipoMixta.setSize(965, 540);
            T_menuEnc.setVisible(false);
    }//GEN-LAST:event_btnEncuestaMixtaActionPerformed

    private void btnEncuestaCerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaCerradaActionPerformed
        // TODO add your handling code here:
        EncuestaTipoCerrada T_TipoCerrada = new EncuestaTipoCerrada(T_listaEnc5, codigoEncuestador);
            T_TipoCerrada.setVisible(true);
            T_TipoCerrada.setSize(965, 540);
            T_menuEnc.setVisible(false);
    }//GEN-LAST:event_btnEncuestaCerradaActionPerformed

    public void plantilla01(){
    EncuestaTipoAbierta plantilla01 = new EncuestaTipoAbierta(T_listaEnc5, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
        plantilla01.setSize(965,500); //Colocamos el tamaño de nuestro Jpanel
        plantilla01.setLocationRelativeTo(null);

        Fondo.removeAll();
        Fondo.add(plantilla01,BorderLayout.CENTER);
        Fondo.revalidate();
        Fondo.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnEncuestaAbierta;
    private javax.swing.JButton btnEncuestaCerrada;
    private javax.swing.JButton btnEncuestaMixta;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
