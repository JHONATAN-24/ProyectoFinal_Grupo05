
package T_Aplicacion;

import T_Clases.Pregunta;
import T_ConexionBD.CRUDJavaPre;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EncuestaBase extends javax.swing.JFrame {
    private JLabel[] labels;
    
    public EncuestaBase() {
        initComponents();
        this.setTitle("Encuesta Recibida");
        this.setSize(970, 580);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
    }
    
    private void initLabels() {
    labels = new JLabel[]{
        lbEnunciado1, lbEnunciado2, lbEnunciado3, lbEnunciado4,
        lbEnunciado5, lbEnunciado6, lbEnunciado7, lbEnunciado8, lbEnunciado9, lbEnunciado10
    };
}
    
    public void mostrarPreguntasEncuesta(int idEncuesta) {
        CRUDJavaPre crudJavaPre = new CRUDJavaPre();
        try (Connection conexion = crudJavaPre.obtenerConexion()) {
            List<Pregunta> preguntas = crudJavaPre.obtenerPreguntasPorEncuesta(conexion, idEncuesta);

            // Debug print
            System.out.println("Número de preguntas obtenidas: " + preguntas.size());

            // Inicializar los labels
            initLabels();

            // Asignar texto a cada JLabel
            for (int i = 0; i < labels.length; i++) {
                if (i < preguntas.size()) {
                    Pregunta pregunta = preguntas.get(i);
                    labels[i].setText((i + 1) + ". " + pregunta.getEnunciado());
                } else {
                    // Vaciar el texto de los JLabel restantes
                    labels[i].setText("");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener preguntas: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbEnunciado1 = new javax.swing.JLabel();
        lbEnunciado2 = new javax.swing.JLabel();
        lbEnunciado3 = new javax.swing.JLabel();
        lbEnunciado4 = new javax.swing.JLabel();
        lbEnunciado5 = new javax.swing.JLabel();
        lbEnunciado6 = new javax.swing.JLabel();
        lbEnunciado7 = new javax.swing.JLabel();
        lbEnunciado8 = new javax.swing.JLabel();
        lbEnunciado9 = new javax.swing.JLabel();
        lbEnunciado10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        btnEnviarRespuestas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 540));
        setMinimumSize(new java.awt.Dimension(950, 540));
        setPreferredSize(new java.awt.Dimension(950, 540));
        setResizable(false);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(960, 540));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(960, 540));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(960, 540));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Titulo de encuesta");

        lbEnunciado1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado1.setText("1. Enunciado de pregunta");

        lbEnunciado2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado2.setText("2. Enunciado de pregunta");

        lbEnunciado3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado3.setText("3. Enunciado de pregunta");

        lbEnunciado4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado4.setText("4. Enunciado de pregunta");

        lbEnunciado5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado5.setText("5. Enunciado de pregunta");

        lbEnunciado6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado6.setText("6. Enunciado de pregunta");

        lbEnunciado7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado7.setText("7. Enunciado de pregunta");

        lbEnunciado8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado8.setText("8. Enunciado de pregunta");

        lbEnunciado9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado9.setText("9. Enunciado de pregunta");

        lbEnunciado10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbEnunciado10.setText("10. Enunciado de pregunta");

        btnEnviarRespuestas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEnviarRespuestas.setText("Enviar");
        btnEnviarRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEnviarRespuestas.setContentAreaFilled(false);
        btnEnviarRespuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarRespuestas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviarRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarRespuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnviarRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbEnunciado10, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addComponent(jTextField9)
                        .addComponent(lbEnunciado9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField8)
                        .addComponent(lbEnunciado8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7)
                        .addComponent(lbEnunciado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6)
                        .addComponent(lbEnunciado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(lbEnunciado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEnunciado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3)
                        .addComponent(lbEnunciado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2)
                        .addComponent(lbEnunciado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEnunciado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviarRespuestas)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRespuestasActionPerformed
        // Regresar al MenuParticipante
        
    }//GEN-LAST:event_btnEnviarRespuestasActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarRespuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbEnunciado1;
    private javax.swing.JLabel lbEnunciado10;
    private javax.swing.JLabel lbEnunciado2;
    private javax.swing.JLabel lbEnunciado3;
    private javax.swing.JLabel lbEnunciado4;
    private javax.swing.JLabel lbEnunciado5;
    private javax.swing.JLabel lbEnunciado6;
    private javax.swing.JLabel lbEnunciado7;
    private javax.swing.JLabel lbEnunciado8;
    private javax.swing.JLabel lbEnunciado9;
    // End of variables declaration//GEN-END:variables
}
