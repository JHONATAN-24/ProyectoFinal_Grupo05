/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/
package Aplicacion;

public class InicioJDM extends javax.swing.JFrame {
  
    public InicioJDM() {
        initComponents();
        this.setTitle("JDM Surveys");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBienvenida = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        LogoOso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JDM Surveys");
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelBienvenida.setBackground(new java.awt.Color(255, 243, 232));

        jLabel3.setFont(new java.awt.Font("Cabin Sketch", 2, 48)); // NOI18N
        jLabel3.setText("Surveys");

        jLabel4.setFont(new java.awt.Font("Cabin Sketch", 2, 48)); // NOI18N
        jLabel4.setText("JDM ");

        btnIniciar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBienvenidaLayout = new javax.swing.GroupLayout(PanelBienvenida);
        PanelBienvenida.setLayout(PanelBienvenidaLayout);
        PanelBienvenidaLayout.setHorizontalGroup(
            PanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                .addGroup(PanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4))
                    .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnIniciar)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PanelBienvenidaLayout.setVerticalGroup(
            PanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBienvenidaLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(79, 79, 79)
                .addComponent(btnIniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LogoOso.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\Oso logo de JDM Surveys (Color) (PNG).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogoOso)
                .addGap(0, 0, 0)
                .addComponent(PanelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoOso)
            .addComponent(PanelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        RegistroJDM nuevaventana = new RegistroJDM();
        nuevaventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioJDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioJDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioJDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioJDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioJDM().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoOso;
    private javax.swing.JPanel PanelBienvenida;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
