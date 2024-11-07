/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/
package Aplicacion;

import ArrayList.ListaEncuestadores;
import ArrayList.ListaParticipante;
import Clases.Encuestador;
import Clases.Participante;
import HashSet.HashParticipante;
import javax.swing.JOptionPane;


public class RegistroJDM extends javax.swing.JFrame {
    
    ListaEncuestadores datosE = new ListaEncuestadores(); 
    HashParticipante hashP = new HashParticipante();
    
    public RegistroJDM() {
        initComponents();
        this.setTitle("JDM Surveys - Registros");
        this.setSize(800, 540);
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo01 = new javax.swing.ButtonGroup();
        bgGrupo02 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbEncuestador = new javax.swing.JRadioButton();
        rbParticipante = new javax.swing.JRadioButton();
        jlvariante = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtVariante = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(252, 228, 186));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Icono de Registro de JDM Surveys (PNG).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrate");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("BIENVENIDO!");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Rol :");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Nombre :");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Apellido :");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de nacimiento:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Genero :");

        bgGrupo01.add(rbEncuestador);
        rbEncuestador.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbEncuestador.setText("Encuestador");
        rbEncuestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEncuestadorActionPerformed(evt);
            }
        });

        bgGrupo01.add(rbParticipante);
        rbParticipante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbParticipante.setText("Participante");
        rbParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParticipanteActionPerformed(evt);
            }
        });

        jlvariante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlvariante.setText("Codigo :");

        bgGrupo02.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbMasculino.setText("Masculino");

        bgGrupo02.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbFemenino.setText("Femenino");

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtApellido.setForeground(new java.awt.Color(0, 0, 0));

        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        btnAtras.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardarDatos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarDatos.setText("Guardar");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(txtVariante))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbEncuestador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbParticipante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(rbMasculino)
                        .addGap(27, 27, 27)
                        .addComponent(rbFemenino)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtApellido))
                                    .addComponent(txtNombre)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaNacimiento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jlvariante))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarDatos)))))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEncuestador)
                    .addComponent(rbParticipante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlvariante)
                    .addComponent(txtVariante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardarDatos))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        InicioJDM ventana = new InicioJDM();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void rbEncuestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEncuestadorActionPerformed
        jlvariante.setText("Codigo:");
    }//GEN-LAST:event_rbEncuestadorActionPerformed

    private void rbParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParticipanteActionPerformed
        jlvariante.setText("Email:");
    }//GEN-LAST:event_rbParticipanteActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
        //Validando Encuestador y Participante
        if(rbEncuestador.isSelected()==false && rbParticipante.isSelected()==false){
            JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Seleccionar un Rol");
                    return; //Salir del metodo
        }
        
        if(rbEncuestador.isSelected()){
            //Validando Nombre
                if(txtNombre.getText().length()==0){ //get obtener
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su nombre");
                    return; //Salir del metodo
                }

                //Validando Apellido
                if(txtApellido.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Apellido");
                    return;
                }
                
                //Validando Fecha Nacimiento
                if(txtFechaNacimiento.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Fecha de Nacimiento");
                    return;
                }
                
                //Validando Genero
                if(rbMasculino.isSelected()==false && rbFemenino.isSelected()==false){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Seleccionar un Genero");
                    return;
                }
                
                //Validando Codigo
                if(txtVariante.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Codigo");
                    return;
                }

            Encuestador nuevoEncuestador = new Encuestador();
                nuevoEncuestador.setNombre(txtNombre.getText());
                nuevoEncuestador.setApellidos(txtApellido.getText());
                nuevoEncuestador.setFechaNacimiento(txtFechaNacimiento.getText());
                if(rbMasculino.isSelected()) nuevoEncuestador.setGenero("Masculino");
                if(rbFemenino.isSelected()) nuevoEncuestador.setGenero("Femenino");
                nuevoEncuestador.setCodigo(txtVariante.getText());
                
                datosE.agregar(nuevoEncuestador);
                JOptionPane.showMessageDialog(this,"¡Encuestador Registrado!");
                
                //Metodo para limpiar los controles
                limpiarControles();
                
                // Pasar la misma instancia de datos al nuevo frame
                SeccionEncuestadores nuevoMenu = new SeccionEncuestadores(datosE);
                nuevoMenu.setVisible(true);
                this.dispose();
                
        }else if(rbParticipante.isSelected()){
            
          //Validando 
                //Validando Nombre
                if(txtNombre.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Nombre");
                    return;
                }
                
                //Validando Apellido
                if(txtApellido.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Apellido");
                    return;
                }
          
                //Validando Fecha Nacimiento
                if(txtFechaNacimiento.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Fecha de Nacimiento");
                    return;
                }
                
                //Validando Genero
                if(rbMasculino.isSelected()==false && rbFemenino.isSelected()==false){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Seleccionar un Genero");
                    return;
                }
                
                //Validando Email
                if(txtVariante.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Escribir su Email");
                    return;
                }
                
          Participante nuevoParticipante = new Participante();
                nuevoParticipante.setNombre(txtNombre.getText());
                nuevoParticipante.setApellidos(txtApellido.getText());
                nuevoParticipante.setFechaNacimiento(txtFechaNacimiento.getText());
                if(rbMasculino.isSelected()) nuevoParticipante.setGenero("Masculino");
                if(rbFemenino.isSelected()) nuevoParticipante.setGenero("Femenino");
                nuevoParticipante.setEmail(txtVariante.getText());
                
                hashP.agregar(nuevoParticipante);
                JOptionPane.showMessageDialog(this,"¡Participante Registrado!");
                
                //Metodo para limpiar los controles
                limpiarControles();   
                
                SeccionParticipantes nuevoMenup = new SeccionParticipantes(hashP);
                nuevoMenup.setVisible(true);
                this.dispose();
        }
        
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    public void limpiarControles(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNacimiento.setText("");
        bgGrupo01.clearSelection();
        bgGrupo02.clearSelection();
        txtVariante.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupo01;
    private javax.swing.ButtonGroup bgGrupo02;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlvariante;
    private javax.swing.JRadioButton rbEncuestador;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbParticipante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVariante;
    // End of variables declaration//GEN-END:variables
}
