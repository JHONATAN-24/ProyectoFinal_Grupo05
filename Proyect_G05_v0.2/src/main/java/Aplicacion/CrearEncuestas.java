
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package Aplicacion;

import java.awt.BorderLayout;

public class CrearEncuestas extends javax.swing.JPanel {

    //Atributo para instanciar un jframe (MenuEncuestador)
    private MenuEncuestador T_menuEnc; //Funcionalidad que va a tener es poder poner al jframe Invisible
    
    
    public CrearEncuestas(MenuEncuestador T_menuEncuestador) {
        initComponents();
        this.T_menuEnc = T_menuEncuestador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPlantilla01 = new javax.swing.JButton();
        btnPlantilla02 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPlantilla03 = new javax.swing.JButton();
        btnPlantilla04 = new javax.swing.JButton();

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

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPlantilla01.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPlantilla01.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Plantilla01.png")); // NOI18N
        btnPlantilla01.setText("Encuesta Simple");
        btnPlantilla01.setBorder(null);
        btnPlantilla01.setContentAreaFilled(false);
        btnPlantilla01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlantilla01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlantilla01.setIconTextGap(0);
        btnPlantilla01.setMaximumSize(new java.awt.Dimension(100, 130));
        btnPlantilla01.setMinimumSize(new java.awt.Dimension(100, 130));
        btnPlantilla01.setPreferredSize(new java.awt.Dimension(100, 130));
        btnPlantilla01.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnPlantilla01.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPlantilla01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantilla01ActionPerformed(evt);
            }
        });

        btnPlantilla02.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPlantilla02.setText("Plantilla 2");
        btnPlantilla02.setBorder(new javax.swing.border.MatteBorder(null));
        btnPlantilla02.setBorderPainted(false);
        btnPlantilla02.setContentAreaFilled(false);
        btnPlantilla02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlantilla02.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPlantilla02.setIconTextGap(10);
        btnPlantilla02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantilla02ActionPerformed(evt);
            }
        });

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPlantilla03.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPlantilla03.setText("Plantilla 3");
        btnPlantilla03.setBorder(new javax.swing.border.MatteBorder(null));
        btnPlantilla03.setBorderPainted(false);
        btnPlantilla03.setContentAreaFilled(false);
        btnPlantilla03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlantilla03.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPlantilla03.setIconTextGap(10);

        btnPlantilla04.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPlantilla04.setText("Plantilla 4");
        btnPlantilla04.setBorder(new javax.swing.border.MatteBorder(null));
        btnPlantilla04.setBorderPainted(false);
        btnPlantilla04.setContentAreaFilled(false);
        btnPlantilla04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlantilla04.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPlantilla04.setIconTextGap(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnPlantilla01, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlantilla02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPlantilla03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlantilla04, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPlantilla04, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPlantilla03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPlantilla02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnPlantilla01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
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

    private void btnPlantilla01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantilla01ActionPerformed
        PlantillaEncuesta_01 plan = new PlantillaEncuesta_01();
            plan.setVisible(true);
            T_menuEnc.setVisible(false);
    }//GEN-LAST:event_btnPlantilla01ActionPerformed

    private void btnPlantilla02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantilla02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlantilla02ActionPerformed

        public void plantilla01(){
        PlantillaEncuesta_01 plantilla01 = new PlantillaEncuesta_01();
            plantilla01.setSize(700,500); //Colocamos el tamaño de nuestro Jpanel
            plantilla01.setLocation(0,0);
            
            Fondo.removeAll();
            Fondo.add(plantilla01,BorderLayout.CENTER);
            Fondo.revalidate();
            Fondo.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnPlantilla01;
    private javax.swing.JButton btnPlantilla02;
    private javax.swing.JButton btnPlantilla03;
    private javax.swing.JButton btnPlantilla04;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
