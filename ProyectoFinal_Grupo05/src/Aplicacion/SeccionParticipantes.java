
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package Aplicacion;

import ArrayList.ListaParticipante;
import Clases.Participante;
import javax.swing.table.DefaultTableModel;


public class SeccionParticipantes extends javax.swing.JFrame {
    ListaParticipante datosp = new ListaParticipante();
    
    public SeccionParticipantes(ListaParticipante datospe) {
        initComponents();
        this.setTitle("JDM Surveys-ListaParticiapantes");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        datosp = datospe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParticipante = new javax.swing.JTable();
        btnListarParticipante = new javax.swing.JButton();
        btnSiguienteP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Selecciona tu nombre para continuar");

        tblParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "FECHA NACIMIENTO", "GENERO", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(tblParticipante);

        btnListarParticipante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnListarParticipante.setForeground(new java.awt.Color(0, 0, 0));
        btnListarParticipante.setText("Listar");
        btnListarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarParticipanteActionPerformed(evt);
            }
        });

        btnSiguienteP.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSiguienteP.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguienteP.setText("Siguiente");
        btnSiguienteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bungee Inline", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro  de  participantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListarParticipante)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguienteP)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguienteP)
                    .addComponent(btnListarParticipante))
                .addContainerGap())
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

    private void btnListarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarParticipanteActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) tblParticipante.getModel();
        while(dtm.getRowCount() !=0)dtm.removeRow(0);
        
        for(Participante p: datosp.listar()){
            Object[] rowData = {
                p.getNombre(),
                p.getApellidos(),
                p.getFechaNacimiento(),
                p.getGenero(),
                p.getEmail(),
            };
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_btnListarParticipanteActionPerformed

    private void btnSiguientePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePActionPerformed
        MenuParticipante nuevaVentana = new MenuParticipante ();
            nuevaVentana.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnSiguientePActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarParticipante;
    private javax.swing.JButton btnSiguienteP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblParticipante;
    // End of variables declaration//GEN-END:variables
}
