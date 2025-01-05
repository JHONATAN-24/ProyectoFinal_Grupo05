
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaRespuestas;
import T_Clases.Encuesta;
import T_Clases.Pregunta;
import T_Clases.Respuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.CRUDJavaPre;
import T_ConexionBD.CRUDJavaRes;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EncBaseAbierta extends javax.swing.JFrame {
    
    ListaRespuestas T_respuestas = new ListaRespuestas();
    private JLabel[] labels;
    private int codigoparticipante;
    private int codigoEncuestas;
    private List<Integer> id_preguntas = new ArrayList<>();
    
    public EncBaseAbierta(int codigoparticipante, int codigoEncuestas) {
        
        this.codigoparticipante= codigoparticipante;
        this.codigoEncuestas=codigoEncuestas;
        
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
        id_preguntas.clear();

        CRUDJavaPre crudJavaPre = new CRUDJavaPre();
        try (Connection conexion = crudJavaPre.obtenerConexion()) {
            List<Pregunta> preguntas = crudJavaPre.obtenerPreguntasPorEncuesta(conexion, idEncuesta);

            System.out.println("Número de preguntas obtenidas: " + preguntas.size());

            initLabels();

            for (int i = 0; i < preguntas.size() && i < labels.length; i++) {
                Pregunta pregunta = preguntas.get(i);
                labels[i].setText((i + 1) + ". " + pregunta.getEnunciado());
                id_preguntas.add(pregunta.getId());
            }

            for (int i = preguntas.size(); i < labels.length; i++) {
                labels[i].setText("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener preguntas: " + e.getMessage());
        }
    

        CRUDJavaEn T_crudJavaEn = new CRUDJavaEn();
        try (Connection conexion = T_crudJavaEn.obtenerConexion()) {
            List<Encuesta> encuestas = T_crudJavaEn.obtenerTituloEncuesta(conexion, idEncuesta);

            System.out.println("Número de Encuestas obtenidas: " + encuestas.size());

            if (!encuestas.isEmpty()) {
                Encuesta nuevaEncuesta = encuestas.get(0);

                lbTituloEncuesta.setText(nuevaEncuesta.getTitulo());

                System.out.println("Título obtenido: " + nuevaEncuesta.getTitulo());
            } else {
                lbTituloEncuesta.setText("Título no encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener título: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbTituloEncuesta = new javax.swing.JLabel();
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
        txtRespuesta1 = new javax.swing.JTextField();
        txtRespuesta8 = new javax.swing.JTextField();
        txtRespuesta9 = new javax.swing.JTextField();
        txtRespuesta10 = new javax.swing.JTextField();
        txtRespuesta2 = new javax.swing.JTextField();
        txtRespuesta3 = new javax.swing.JTextField();
        txtRespuesta4 = new javax.swing.JTextField();
        txtRespuesta5 = new javax.swing.JTextField();
        txtRespuesta6 = new javax.swing.JTextField();
        txtRespuesta7 = new javax.swing.JTextField();
        btnEnviarRespuestas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 540));
        setResizable(false);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(960, 540));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(960, 540));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(960, 540));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        lbTituloEncuesta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbTituloEncuesta.setText("Titulo de encuesta");

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
                        .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addComponent(txtRespuesta10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbEnunciado10, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addComponent(txtRespuesta9)
                        .addComponent(lbEnunciado9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta8)
                        .addComponent(lbEnunciado8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta7)
                        .addComponent(lbEnunciado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta6)
                        .addComponent(lbEnunciado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta5)
                        .addComponent(lbEnunciado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEnunciado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta4)
                        .addComponent(txtRespuesta3)
                        .addComponent(lbEnunciado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta2)
                        .addComponent(lbEnunciado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEnunciado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRespuesta1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        try {
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUDJavaRes T_nrespuesta = new CRUDJavaRes();

            String[] respuestas = {
                txtRespuesta1.getText(), txtRespuesta2.getText(), txtRespuesta3.getText(), 
                txtRespuesta4.getText(), txtRespuesta5.getText(), txtRespuesta6.getText(), 
                txtRespuesta7.getText(), txtRespuesta8.getText(), txtRespuesta9.getText(), 
                txtRespuesta10.getText()
            };

            boolean todasRespondidas = true;
            for (int i = 0; i < respuestas.length; i++) {
                if (respuestas[i].trim().isEmpty()) {
                    todasRespondidas = false;
                    JOptionPane.showMessageDialog(this, "Por favor, responda la pregunta " + (i + 1));
                    break;
                }
            }

            if (todasRespondidas) {
                System.out.println("id Preguntas recopiladas: " + id_preguntas);
                String sql = "SELECT id_preguntas FROM T_Preguntas WHERE id_encuestas = ?";
                List<Integer> T_preguntaValida = new ArrayList<>();

                try (PreparedStatement T_depredator = conexion.prepareStatement(sql)) {
                    T_depredator.setInt(1, codigoEncuestas);
                    try (ResultSet rs = T_depredator.executeQuery()) {
                        while (rs.next()) {
                            T_preguntaValida.add(rs.getInt("id_preguntas"));
                        }
                    }
                }

                System.out.println("Preguntas válidas para esta encuesta: " + T_preguntaValida);

                for (int i = 0; i < respuestas.length && i < T_preguntaValida.size(); i++) {
                    Respuesta T_nuevarespuesta = new Respuesta();
                    T_nuevarespuesta.setTextoRespuesta(respuestas[i]);
                    T_nrespuesta.insertarRespuesta(conexion, codigoparticipante, codigoEncuestas, T_preguntaValida.get(i), T_nuevarespuesta);
                    T_respuestas.agregarRespuesta(T_nuevarespuesta);
                }

                JOptionPane.showMessageDialog(null, "Respuestas registradas");
                this.dispose();
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }  
    }//GEN-LAST:event_btnEnviarRespuestasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarRespuestas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lbTituloEncuesta;
    private javax.swing.JTextField txtRespuesta1;
    private javax.swing.JTextField txtRespuesta10;
    private javax.swing.JTextField txtRespuesta2;
    private javax.swing.JTextField txtRespuesta3;
    private javax.swing.JTextField txtRespuesta4;
    private javax.swing.JTextField txtRespuesta5;
    private javax.swing.JTextField txtRespuesta6;
    private javax.swing.JTextField txtRespuesta7;
    private javax.swing.JTextField txtRespuesta8;
    private javax.swing.JTextField txtRespuesta9;
    // End of variables declaration//GEN-END:variables
}
