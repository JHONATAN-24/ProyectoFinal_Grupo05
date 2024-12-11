/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;

public class EncuestaTipoCerrada extends javax.swing.JFrame {
    
    public EncuestaTipoCerrada(ListaEncuestadores encuestador, String codigoEncuestador, String nombreEncuestador , String apellidoEncuestador) {
        initComponents();
        this.setTitle("Plantilla N° 2");
        this.setSize(965, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPlantilla01 = new javax.swing.JPanel();
        pnlTituloEncuesta = new javax.swing.JPanel();
        icnEncuesta = new javax.swing.JLabel();
        txtTituloEncuesta = new javax.swing.JTextField();
        btnPublicar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEliminarPregunta = new javax.swing.JButton();
        btnAgregarPregunta = new javax.swing.JButton();
        btnGuardarPregunta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcalender = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncuestas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreguntas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 500));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setResizable(false);

        FondoPlantilla01.setBackground(new java.awt.Color(255, 102, 102));
        FondoPlantilla01.setMaximumSize(new java.awt.Dimension(950, 500));
        FondoPlantilla01.setMinimumSize(new java.awt.Dimension(950, 500));
        FondoPlantilla01.setPreferredSize(new java.awt.Dimension(958, 500));

        pnlTituloEncuesta.setBackground(new java.awt.Color(255, 204, 204));
        pnlTituloEncuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTituloEncuesta.setMaximumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setMinimumSize(new java.awt.Dimension(910, 80));
        pnlTituloEncuesta.setPreferredSize(new java.awt.Dimension(910, 80));

        icnEncuesta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Surveys 2D (Color) (60 px).png")); // NOI18N

        txtTituloEncuesta.setBackground(new java.awt.Color(255, 204, 204));
        txtTituloEncuesta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTituloEncuesta.setText("Encuesta sin titulo");
        txtTituloEncuesta.setBorder(null);

        btnPublicar.setBackground(new java.awt.Color(153, 204, 255));
        btnPublicar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPublicar.setContentAreaFilled(false);
        btnPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublicar.setOpaque(true);
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDescripcion.setText("Descripcion");
        txtDescripcion.setMaximumSize(new java.awt.Dimension(727, 25));
        txtDescripcion.setMinimumSize(new java.awt.Dimension(727, 25));
        txtDescripcion.setPreferredSize(new java.awt.Dimension(727, 25));

        btnEliminarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEliminarPregunta.setText("Eliminar Pregunta");
        btnEliminarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarPregunta.setContentAreaFilled(false);
        btnEliminarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPreguntaActionPerformed(evt);
            }
        });

        btnAgregarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAgregarPregunta.setText("Agregar");
        btnAgregarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarPregunta.setContentAreaFilled(false);
        btnAgregarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreguntaActionPerformed(evt);
            }
        });

        btnGuardarPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnGuardarPregunta.setText("Guardar");
        btnGuardarPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarPregunta.setContentAreaFilled(false);
        btnGuardarPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPreguntaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Cierre:");

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField2.setText("Opción 3");
        jTextField2.setMaximumSize(new java.awt.Dimension(168, 25));
        jTextField2.setMinimumSize(new java.awt.Dimension(168, 25));
        jTextField2.setPreferredSize(new java.awt.Dimension(168, 25));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField3.setText("Opción 4");
        jTextField3.setMaximumSize(new java.awt.Dimension(168, 25));
        jTextField3.setMinimumSize(new java.awt.Dimension(168, 25));
        jTextField3.setPreferredSize(new java.awt.Dimension(168, 25));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField4.setText("Opción 2");
        jTextField4.setMaximumSize(new java.awt.Dimension(168, 25));
        jTextField4.setMinimumSize(new java.awt.Dimension(168, 25));
        jTextField4.setPreferredSize(new java.awt.Dimension(168, 25));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField1.setText("Opción 1");
        jTextField1.setMaximumSize(new java.awt.Dimension(168, 25));
        jTextField1.setMinimumSize(new java.awt.Dimension(168, 25));
        jTextField1.setPreferredSize(new java.awt.Dimension(168, 25));

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField5.setText("Pregunta sin titulo");
        jTextField5.setMaximumSize(new java.awt.Dimension(727, 25));
        jTextField5.setMinimumSize(new java.awt.Dimension(727, 25));
        jTextField5.setPreferredSize(new java.awt.Dimension(727, 25));

        javax.swing.GroupLayout pnlTituloEncuestaLayout = new javax.swing.GroupLayout(pnlTituloEncuesta);
        pnlTituloEncuesta.setLayout(pnlTituloEncuestaLayout);
        pnlTituloEncuestaLayout.setHorizontalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icnEncuesta)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloEncuestaLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTituloEncuestaLayout.setVerticalGroup(
            pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnEncuesta)
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarPregunta)
                            .addComponent(btnAgregarPregunta)
                            .addComponent(btnGuardarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addGroup(pnlTituloEncuestaLayout.createSequentialGroup()
                        .addComponent(jcalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );

        tblEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Decripción", "Tipo", "Fecha de creación", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncuestas);

        tblPreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enunciado", "Opción 1", "Opción 2", "Opción 3", "Opción 4", "Tipo de pregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPreguntas);

        javax.swing.GroupLayout FondoPlantilla01Layout = new javax.swing.GroupLayout(FondoPlantilla01);
        FondoPlantilla01.setLayout(FondoPlantilla01Layout);
        FondoPlantilla01Layout.setHorizontalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoPlantilla01Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2))
                .addGap(17, 17, 17))
        );
        FondoPlantilla01Layout.setVerticalGroup(
            FondoPlantilla01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPlantilla01Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlTituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, 950, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPlantilla01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPreguntaActionPerformed
        
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed

    private void btnAgregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreguntaActionPerformed
        
    }//GEN-LAST:event_btnAgregarPreguntaActionPerformed

    private void btnEliminarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPreguntaActionPerformed
       
    }//GEN-LAST:event_btnEliminarPreguntaActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        
    }//GEN-LAST:event_btnPublicarActionPerformed
    
    public void fechaDeEncuesta(){
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPlantilla01;
    private javax.swing.JButton btnAgregarPregunta;
    private javax.swing.JButton btnEliminarPregunta;
    private javax.swing.JButton btnGuardarPregunta;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel icnEncuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private com.toedter.calendar.JDateChooser jcalender;
    private javax.swing.JPanel pnlTituloEncuesta;
    private javax.swing.JTable tblEncuestas;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTituloEncuesta;
    // End of variables declaration//GEN-END:variables
}
