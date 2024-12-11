
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

public class EncBaseCerrada extends javax.swing.JFrame {
    
    ListaRespuestas T_respuestas = new ListaRespuestas();
    private JLabel[] labels;
    private int codigoparticipante;
    private int codigoEncuestas;
    private List<Integer> id_preguntas = new ArrayList<>();
    
    public EncBaseCerrada(int codigoparticipante, int codigoEncuestas) {
        
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
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEnunciado01 = new javax.swing.ButtonGroup();
        bgEnunciado02 = new javax.swing.ButtonGroup();
        bgEnunciado03 = new javax.swing.ButtonGroup();
        bgEnunciado04 = new javax.swing.ButtonGroup();
        bgEnunciado05 = new javax.swing.ButtonGroup();
        bgEnunciado06 = new javax.swing.ButtonGroup();
        bgEnunciado07 = new javax.swing.ButtonGroup();
        bgEnunciado08 = new javax.swing.ButtonGroup();
        bgEnunciado09 = new javax.swing.ButtonGroup();
        bgEnunciado10 = new javax.swing.ButtonGroup();
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
        btnEnviarRespuestas = new javax.swing.JButton();
        chbOpcion01 = new javax.swing.JCheckBox();
        chbOpcion02 = new javax.swing.JCheckBox();
        chbOpcion03 = new javax.swing.JCheckBox();
        chbOpcion04 = new javax.swing.JCheckBox();
        chbOpcion05 = new javax.swing.JCheckBox();
        chbOpcion06 = new javax.swing.JCheckBox();
        chbOpcion07 = new javax.swing.JCheckBox();
        chbOpcion08 = new javax.swing.JCheckBox();
        chbOpcion6 = new javax.swing.JCheckBox();
        chbOpcion7 = new javax.swing.JCheckBox();
        chbOpcion8 = new javax.swing.JCheckBox();
        chbOpcion9 = new javax.swing.JCheckBox();
        chbOpcion10 = new javax.swing.JCheckBox();
        chbOpcion11 = new javax.swing.JCheckBox();
        chbOpcion12 = new javax.swing.JCheckBox();
        chbOpcion13 = new javax.swing.JCheckBox();
        chbOpcion14 = new javax.swing.JCheckBox();
        chbOpcion15 = new javax.swing.JCheckBox();
        chbOpcion16 = new javax.swing.JCheckBox();
        chbOpcion17 = new javax.swing.JCheckBox();
        chbOpcion18 = new javax.swing.JCheckBox();
        chbOpcion19 = new javax.swing.JCheckBox();
        chbOpcion20 = new javax.swing.JCheckBox();
        chbOpcion21 = new javax.swing.JCheckBox();
        chbOpcion22 = new javax.swing.JCheckBox();
        chbOpcion23 = new javax.swing.JCheckBox();
        chbOpcion24 = new javax.swing.JCheckBox();
        chbOpcion25 = new javax.swing.JCheckBox();
        chbOpcion26 = new javax.swing.JCheckBox();
        chbOpcion27 = new javax.swing.JCheckBox();
        chbOpcion28 = new javax.swing.JCheckBox();
        chbOpcion29 = new javax.swing.JCheckBox();
        chbOpcion30 = new javax.swing.JCheckBox();
        chbOpcion31 = new javax.swing.JCheckBox();
        chbOpcion32 = new javax.swing.JCheckBox();
        chbOpcion33 = new javax.swing.JCheckBox();
        chbOpcion34 = new javax.swing.JCheckBox();
        chbOpcion35 = new javax.swing.JCheckBox();
        chbOpcion36 = new javax.swing.JCheckBox();
        chbOpcion37 = new javax.swing.JCheckBox();

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

        bgEnunciado01.add(chbOpcion01);
        chbOpcion01.setText("a) Opcion 1");

        bgEnunciado01.add(chbOpcion02);
        chbOpcion02.setText("b) Opcion 2");

        bgEnunciado01.add(chbOpcion03);
        chbOpcion03.setText("c) Opcion 3");

        bgEnunciado01.add(chbOpcion04);
        chbOpcion04.setText("d) Opcion 4");

        bgEnunciado02.add(chbOpcion05);
        chbOpcion05.setText("a) Opcion 1");

        bgEnunciado03.add(chbOpcion06);
        chbOpcion06.setText("a) Opcion 1");

        bgEnunciado04.add(chbOpcion07);
        chbOpcion07.setText("a) Opcion 1");

        bgEnunciado05.add(chbOpcion08);
        chbOpcion08.setText("a) Opcion 1");

        bgEnunciado06.add(chbOpcion6);
        chbOpcion6.setText("a) Opcion 1");

        chbOpcion7.setText("a) Opcion 1");

        bgEnunciado08.add(chbOpcion8);
        chbOpcion8.setText("a) Opcion 1");

        bgEnunciado09.add(chbOpcion9);
        chbOpcion9.setText("a) Opcion 1");

        bgEnunciado10.add(chbOpcion10);
        chbOpcion10.setText("a) Opcion 1");

        bgEnunciado03.add(chbOpcion11);
        chbOpcion11.setText("b) Opcion 2");

        bgEnunciado02.add(chbOpcion12);
        chbOpcion12.setText("b) Opcion 2");

        bgEnunciado04.add(chbOpcion13);
        chbOpcion13.setText("b) Opcion 2");

        bgEnunciado05.add(chbOpcion14);
        chbOpcion14.setText("b) Opcion 2");

        bgEnunciado06.add(chbOpcion15);
        chbOpcion15.setText("b) Opcion 2");

        bgEnunciado07.add(chbOpcion16);
        chbOpcion16.setText("b) Opcion 2");

        bgEnunciado08.add(chbOpcion17);
        chbOpcion17.setText("b) Opcion 2");

        bgEnunciado09.add(chbOpcion18);
        chbOpcion18.setText("b) Opcion 2");

        bgEnunciado10.add(chbOpcion19);
        chbOpcion19.setText("b) Opcion 2");

        bgEnunciado02.add(chbOpcion20);
        chbOpcion20.setText("c) Opcion 3");

        bgEnunciado03.add(chbOpcion21);
        chbOpcion21.setText("c) Opcion 3");

        bgEnunciado04.add(chbOpcion22);
        chbOpcion22.setText("c) Opcion 3");

        bgEnunciado05.add(chbOpcion23);
        chbOpcion23.setText("c) Opcion 3");

        bgEnunciado06.add(chbOpcion24);
        chbOpcion24.setText("c) Opcion 3");

        bgEnunciado07.add(chbOpcion25);
        chbOpcion25.setText("c) Opcion 3");

        bgEnunciado08.add(chbOpcion26);
        chbOpcion26.setText("c) Opcion 3");

        bgEnunciado09.add(chbOpcion27);
        chbOpcion27.setText("c) Opcion 3");

        bgEnunciado10.add(chbOpcion28);
        chbOpcion28.setText("c) Opcion 3");

        bgEnunciado02.add(chbOpcion29);
        chbOpcion29.setText("d) Opcion 4");

        bgEnunciado03.add(chbOpcion30);
        chbOpcion30.setText("d) Opcion 4");

        bgEnunciado04.add(chbOpcion31);
        chbOpcion31.setText("d) Opcion 4");

        bgEnunciado05.add(chbOpcion32);
        chbOpcion32.setText("d) Opcion 4");

        bgEnunciado06.add(chbOpcion33);
        chbOpcion33.setText("d) Opcion 4");

        bgEnunciado07.add(chbOpcion34);
        chbOpcion34.setText("d) Opcion 4");

        bgEnunciado08.add(chbOpcion35);
        chbOpcion35.setText("d) Opcion 4");

        bgEnunciado09.add(chbOpcion36);
        chbOpcion36.setText("d) Opcion 4");

        bgEnunciado10.add(chbOpcion37);
        chbOpcion37.setText("d) Opcion 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnviarRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                            .addComponent(lbEnunciado10, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                            .addComponent(lbEnunciado9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEnunciado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion01)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion02)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion03)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion04))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion05)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion12)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion20)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion29))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion06)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion11)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion21)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion30))
                                .addComponent(lbEnunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion07)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion13)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion22)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion08)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion14)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion23)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion32))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion6)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion15)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion24)
                                    .addGap(81, 81, 81)
                                    .addComponent(chbOpcion33))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion7)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion16)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion25)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion34))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion8)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion17)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion26)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion35))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion9)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion18)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion27)
                                    .addGap(78, 78, 78)
                                    .addComponent(chbOpcion36))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chbOpcion10)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion19)
                                    .addGap(83, 83, 83)
                                    .addComponent(chbOpcion28)
                                    .addGap(80, 80, 80)
                                    .addComponent(chbOpcion37))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion03)
                    .addComponent(chbOpcion04)
                    .addComponent(chbOpcion01)
                    .addComponent(chbOpcion02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chbOpcion05))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbOpcion12)
                            .addComponent(chbOpcion20)
                            .addComponent(chbOpcion29))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion06)
                    .addComponent(chbOpcion11)
                    .addComponent(chbOpcion21)
                    .addComponent(chbOpcion30))
                .addGap(8, 8, 8)
                .addComponent(lbEnunciado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion07)
                    .addComponent(chbOpcion13)
                    .addComponent(chbOpcion22)
                    .addComponent(chbOpcion31))
                .addGap(8, 8, 8)
                .addComponent(lbEnunciado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion08)
                    .addComponent(chbOpcion14)
                    .addComponent(chbOpcion23)
                    .addComponent(chbOpcion32))
                .addGap(8, 8, 8)
                .addComponent(lbEnunciado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion6)
                    .addComponent(chbOpcion15)
                    .addComponent(chbOpcion24)
                    .addComponent(chbOpcion33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion7)
                    .addComponent(chbOpcion16)
                    .addComponent(chbOpcion25)
                    .addComponent(chbOpcion34))
                .addGap(12, 12, 12)
                .addComponent(lbEnunciado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion8)
                    .addComponent(chbOpcion17)
                    .addComponent(chbOpcion26)
                    .addComponent(chbOpcion35))
                .addGap(8, 8, 8)
                .addComponent(lbEnunciado9)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion9)
                    .addComponent(chbOpcion18)
                    .addComponent(chbOpcion27)
                    .addComponent(chbOpcion36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEnunciado10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbOpcion10)
                    .addComponent(chbOpcion19)
                    .addComponent(chbOpcion28)
                    .addComponent(chbOpcion37))
                .addGap(14, 14, 14)
                .addComponent(btnEnviarRespuestas)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRespuestasActionPerformed
        
    }//GEN-LAST:event_btnEnviarRespuestasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEnunciado01;
    private javax.swing.ButtonGroup bgEnunciado02;
    private javax.swing.ButtonGroup bgEnunciado03;
    private javax.swing.ButtonGroup bgEnunciado04;
    private javax.swing.ButtonGroup bgEnunciado05;
    private javax.swing.ButtonGroup bgEnunciado06;
    private javax.swing.ButtonGroup bgEnunciado07;
    private javax.swing.ButtonGroup bgEnunciado08;
    private javax.swing.ButtonGroup bgEnunciado09;
    private javax.swing.ButtonGroup bgEnunciado10;
    private javax.swing.JButton btnEnviarRespuestas;
    private javax.swing.JCheckBox chbOpcion01;
    private javax.swing.JCheckBox chbOpcion02;
    private javax.swing.JCheckBox chbOpcion03;
    private javax.swing.JCheckBox chbOpcion04;
    private javax.swing.JCheckBox chbOpcion05;
    private javax.swing.JCheckBox chbOpcion06;
    private javax.swing.JCheckBox chbOpcion07;
    private javax.swing.JCheckBox chbOpcion08;
    private javax.swing.JCheckBox chbOpcion10;
    private javax.swing.JCheckBox chbOpcion11;
    private javax.swing.JCheckBox chbOpcion12;
    private javax.swing.JCheckBox chbOpcion13;
    private javax.swing.JCheckBox chbOpcion14;
    private javax.swing.JCheckBox chbOpcion15;
    private javax.swing.JCheckBox chbOpcion16;
    private javax.swing.JCheckBox chbOpcion17;
    private javax.swing.JCheckBox chbOpcion18;
    private javax.swing.JCheckBox chbOpcion19;
    private javax.swing.JCheckBox chbOpcion20;
    private javax.swing.JCheckBox chbOpcion21;
    private javax.swing.JCheckBox chbOpcion22;
    private javax.swing.JCheckBox chbOpcion23;
    private javax.swing.JCheckBox chbOpcion24;
    private javax.swing.JCheckBox chbOpcion25;
    private javax.swing.JCheckBox chbOpcion26;
    private javax.swing.JCheckBox chbOpcion27;
    private javax.swing.JCheckBox chbOpcion28;
    private javax.swing.JCheckBox chbOpcion29;
    private javax.swing.JCheckBox chbOpcion30;
    private javax.swing.JCheckBox chbOpcion31;
    private javax.swing.JCheckBox chbOpcion32;
    private javax.swing.JCheckBox chbOpcion33;
    private javax.swing.JCheckBox chbOpcion34;
    private javax.swing.JCheckBox chbOpcion35;
    private javax.swing.JCheckBox chbOpcion36;
    private javax.swing.JCheckBox chbOpcion37;
    private javax.swing.JCheckBox chbOpcion6;
    private javax.swing.JCheckBox chbOpcion7;
    private javax.swing.JCheckBox chbOpcion8;
    private javax.swing.JCheckBox chbOpcion9;
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
    // End of variables declaration//GEN-END:variables
}
