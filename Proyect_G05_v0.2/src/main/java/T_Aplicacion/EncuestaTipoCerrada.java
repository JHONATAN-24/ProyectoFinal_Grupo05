/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaAlternativas;
import T_ArrayList.ListaEncuestadores;
import T_Clases.Alternativa;
import T_Clases.Encuesta;
import T_Clases.Pregunta;
import T_ConexionBD.CRUDJavaAlter;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.CRUDJavaPre;
import T_ConexionBD.ConexionSQLServer;
import T_HashSet.HashEncuesta;
import T_HashSet.HashPregunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EncuestaTipoCerrada extends javax.swing.JFrame {
    
    ListaEncuestadores T_listaEnc9 = new ListaEncuestadores();
    ListaAlternativas T_nuevaAlt = new ListaAlternativas();
    HashPregunta nuevoPre = new HashPregunta();
    private int idEncuestaActual = -1;
    private boolean encuestaGuardada = false;
    private String codigoEncuestador;
    HashEncuesta nuevoEnc1 = new HashEncuesta();
    
    public EncuestaTipoCerrada(ListaEncuestadores encuestador, String codigoEncuestador) {
        
        T_listaEnc9=encuestador;
        this.codigoEncuestador=codigoEncuestador;    
        System.out.println(codigoEncuestador);
        this.setTitle("Plantilla N° 2");
        this.setSize(965, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        
        initComponents();
        
        
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
        txtOpcion3 = new javax.swing.JTextField();
        txtOpcion4 = new javax.swing.JTextField();
        txtOpcion2 = new javax.swing.JTextField();
        txtOpcion1 = new javax.swing.JTextField();
        txtTituloPregunta = new javax.swing.JTextField();
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

        txtOpcion3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOpcion3.setText("Opción 3");
        txtOpcion3.setMaximumSize(new java.awt.Dimension(168, 25));
        txtOpcion3.setMinimumSize(new java.awt.Dimension(168, 25));
        txtOpcion3.setPreferredSize(new java.awt.Dimension(168, 25));

        txtOpcion4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOpcion4.setText("Opción 4");
        txtOpcion4.setMaximumSize(new java.awt.Dimension(168, 25));
        txtOpcion4.setMinimumSize(new java.awt.Dimension(168, 25));
        txtOpcion4.setPreferredSize(new java.awt.Dimension(168, 25));

        txtOpcion2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOpcion2.setText("Opción 2");
        txtOpcion2.setMaximumSize(new java.awt.Dimension(168, 25));
        txtOpcion2.setMinimumSize(new java.awt.Dimension(168, 25));
        txtOpcion2.setPreferredSize(new java.awt.Dimension(168, 25));

        txtOpcion1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOpcion1.setText("Opción 1");
        txtOpcion1.setMaximumSize(new java.awt.Dimension(168, 25));
        txtOpcion1.setMinimumSize(new java.awt.Dimension(168, 25));
        txtOpcion1.setPreferredSize(new java.awt.Dimension(168, 25));

        txtTituloPregunta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtTituloPregunta.setText("Pregunta sin titulo");
        txtTituloPregunta.setMaximumSize(new java.awt.Dimension(727, 25));
        txtTituloPregunta.setMinimumSize(new java.awt.Dimension(727, 25));
        txtTituloPregunta.setPreferredSize(new java.awt.Dimension(727, 25));

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
                                        .addComponent(txtOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTituloPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
                .addComponent(txtTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloEncuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOpcion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Enunciado", "Opciónes", "Tipo de pregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
         try {
            if (txtTituloEncuesta.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar el TITULO");
                return;
            }

            if (txtDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar la DESCRIPCION");
                return;
            }

            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUDJavaEn crudEncuestas = new CRUDJavaEn();
            CRUDJavaPre crudPreguntas = new CRUDJavaPre();
            CRUDJavaAlter crudAlternativas = new CRUDJavaAlter();


            if (!encuestaGuardada) {
                // Obtener la fecha actual y formatearla
                Date fechaActual = new Date();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaCreacion = formatoFecha.format(fechaActual);

                // Usar el JDateChooser    
                Date T_fecha = jcalender.getDate();
                SimpleDateFormat T_FechaE = new SimpleDateFormat("yyyy-MM-dd");
                String date = T_FechaE.format(T_fecha);

                // Validar la fecha de cierre
                Calendar calFechaActual = Calendar.getInstance();
                Calendar calFechaCierre = Calendar.getInstance();
                calFechaCierre.setTime(T_fecha);

                // Comparar fechas
                if (calFechaCierre.before(calFechaActual) || 
                    calFechaCierre.equals(calFechaActual)) {
                    JOptionPane.showMessageDialog(this, 
                        "La fecha de cierre debe ser un día posterior a la fecha actual", 
                        "Error de Fecha", 
                        JOptionPane.ERROR_MESSAGE);
                    return; // Detener el proceso
                }

                // Crear y guardar la encuesta
                Encuesta nuevaEncuesta = new Encuesta();
                nuevaEncuesta.setTitulo(txtTituloEncuesta.getText());
                nuevaEncuesta.setDescripción(txtDescripcion.getText());
                nuevaEncuesta.setTipoEncuesta("Cerrada");
                nuevaEncuesta.setFechaCreacion(fechaCreacion);
                nuevaEncuesta.setFechaCierre(date);

                // Insertar encuesta
                crudEncuestas.insertarEncuestasCerradas(conexion, nuevaEncuesta,codigoEncuestador);

                // Obtener el ID de la encuesta recién insertada
                idEncuestaActual = obtenerIdUltimaEncuesta();

                // Marcar que la encuesta ha sido guardada
                encuestaGuardada = true;

                JOptionPane.showMessageDialog(this, "Encuesta guardada");
                nuevoEnc1.agregarEncuesta(nuevaEncuesta);
            }    
            
            //Validando campos Vacios
            if (txtTituloPregunta.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar el Título de la Pregunta");
                return;
            }
            
            if (txtOpcion1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar una primera opcion de la Pregunta");
                return;
            }
            
            if(txtOpcion2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar una segunda opcion de la Pregunta");
                return;
            }
            
            if(txtOpcion3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar una tercera opcion de la Pregunta");
                return;
            }
            
            if(txtOpcion4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Debe Ingresar una cuarta opcion de la Pregunta");
                return;
            }
            
            // Crear y guardar la pregunta
            Pregunta nuevaPregunta = new Pregunta();
                nuevaPregunta.setEnunciado(txtTituloPregunta.getText());
                nuevaPregunta.setTipoPregunta("Cerrada");
                
             int idPregunta = crudPreguntas.insertarPreguntaCerradas(conexion, nuevaPregunta, idEncuestaActual);
             nuevoPre.agregarPregunta(nuevaPregunta);
             
             if (idPregunta != -1) {
                Alternativa opcion1 = new Alternativa(txtOpcion1.getText());
                Alternativa opcion2 = new Alternativa(txtOpcion2.getText());
                Alternativa opcion3 = new Alternativa(txtOpcion3.getText());
                Alternativa opcion4 = new Alternativa(txtOpcion4.getText());

                crudAlternativas.insertarAlternativas(conexion, idPregunta, opcion1);
                crudAlternativas.insertarAlternativas(conexion, idPregunta, opcion2);
                crudAlternativas.insertarAlternativas(conexion, idPregunta, opcion3);
                crudAlternativas.insertarAlternativas(conexion, idPregunta, opcion4);

                // Optional: Clear fields or show success message
                JOptionPane.showMessageDialog(this, "Pregunta y Alternativas guardadas exitosamente");

                // Clear input fields if needed
                limpiarControles();
            }
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed
    
    private void limpiarControles() {
            txtTituloPregunta.setText("");
            txtOpcion1.setText("");
            txtOpcion2.setText("");
            txtOpcion3.setText("");
            txtOpcion4.setText("");
    }
    
    private int obtenerIdUltimaEncuesta() throws SQLException {
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        String sql = "SELECT TOP 1 id_encuestas FROM T_Encuestas ORDER BY id_encuestas DESC";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_encuestas");
            }
        }

        return -1; // Return -1 if no surveys found
    }
    
    private void btnAgregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreguntaActionPerformed
        DefaultTableModel tblEnc = (DefaultTableModel) tblEncuestas.getModel();
        while(tblEnc.getRowCount()!=0) tblEnc.removeRow(0);
        
        for (Encuesta enc : nuevoEnc1.listarEncuesta()){
            Object[] rowData = {
                enc.getTitulo(),
                enc.getDescripción(),
                enc.getTipoEncuesta(),
                enc.getFechaCreacion(),
                enc.getFechaCierre()

            };
            tblEnc.addRow(rowData);
        }
        
        //Obtener las preguntas y alternativas
        try {
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUDJavaAlter crudAlternativas = new CRUDJavaAlter();

            // Assuming you want to get questions for the current survey
            List<Pregunta> preguntas = crudAlternativas.obtenerAlternativayPregunta(conexion, idEncuestaActual);

            // Clear existing rows in the questions table
            DefaultTableModel tblPreg = (DefaultTableModel) tblPreguntas.getModel(); // Assuming you have a tblPreguntas
            while(tblPreg.getRowCount()!=0) tblPreg.removeRow(0);
        
            // Populate questions table
            for (Pregunta pregunta : preguntas) {
                // Display question details
                Object[] preguntaRowData = {
                    pregunta.getEnunciado(),
                    pregunta.getTipoPregunta()
                };
                tblPreg.addRow(preguntaRowData);

                // Optionally, display alternatives in another table or component
                for (Alternativa alternativa : pregunta.getAlternativas()) {
                    Object[] alternativaRowData = {
                        pregunta.getEnunciado(),
                        alternativa.getTextoOpcion()
                    };
                    // Add to a separate alternatives table if you have one
                    // tblAlternativas.addRow(alternativaRowData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener preguntas: " + e.getMessage());
        }
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
    private com.toedter.calendar.JDateChooser jcalender;
    private javax.swing.JPanel pnlTituloEncuesta;
    private javax.swing.JTable tblEncuestas;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtOpcion1;
    private javax.swing.JTextField txtOpcion2;
    private javax.swing.JTextField txtOpcion3;
    private javax.swing.JTextField txtOpcion4;
    private javax.swing.JTextField txtTituloEncuesta;
    private javax.swing.JTextField txtTituloPregunta;
    // End of variables declaration//GEN-END:variables
}
