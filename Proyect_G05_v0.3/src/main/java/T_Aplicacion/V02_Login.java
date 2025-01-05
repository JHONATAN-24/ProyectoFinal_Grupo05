
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_ArrayList.ListaParticipantes;
import T_Clases.Encuestador;
import T_Clases.Participante;
import T_ConexionBD.CRUDJavaE;
import T_ConexionBD.CRUDJavaP;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class V02_Login extends javax.swing.JFrame {
    // INSTANCIAS DE LAS CLASES:________________________________________________
    ListaEncuestadores T_listaEnc1 = new ListaEncuestadores(); 
    ListaParticipantes T_listaPart1 = new ListaParticipantes();
    
    // DECLARACION DE VARIABLES:________________________________________________
    private boolean isPasswordVisible = false;
    
    /*________________________________________________________________________*/
    public V02_Login() {
        initComponents();
        this.setTitle("JDM Surveys - Login");
        this.setSize(815, 540);
        this.setLocationRelativeTo(null);
        this.setResizable(false);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg01 = new javax.swing.ButtonGroup();
        PanelFondo1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbVariante = new javax.swing.JLabel();
        txtVariante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCrearcuenta = new javax.swing.JButton();
        rbEncuestador = new javax.swing.JRadioButton();
        rbParticipante = new javax.swing.JRadioButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chbVisibilidad = new javax.swing.JCheckBox();
        IconoRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelFondo1.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo1.setMaximumSize(new java.awt.Dimension(800, 500));
        PanelFondo1.setMinimumSize(new java.awt.Dimension(800, 500));
        PanelFondo1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(398, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(398, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(398, 500));

        lbVariante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbVariante.setText("Codigo :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña :");

        btnIniciarSesion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnIniciarSesion.setText("Ingresar");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCrearcuenta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCrearcuenta.setText("Registrarse");
        btnCrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearcuentaActionPerformed(evt);
            }
        });

        bg01.add(rbEncuestador);
        rbEncuestador.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbEncuestador.setText("Encuestador");
        rbEncuestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEncuestadorActionPerformed(evt);
            }
        });

        bg01.add(rbParticipante);
        rbParticipante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbParticipante.setText("Participante");
        rbParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParticipanteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Rol :");

        jLabel13.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("inicia sesion");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel14.setText("Hola!");

        chbVisibilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chbVisibilidad.setText("Visualizar la contraseña");
        chbVisibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisibilidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(rbEncuestador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbParticipante)))
                            .addComponent(chbVisibilidad)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbVariante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(txtVariante)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel14)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(btnCrearcuenta)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbParticipante)
                    .addComponent(rbEncuestador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVariante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVariante))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbVisibilidad)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearcuenta)
                    .addComponent(btnIniciarSesion))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        IconoRegistros.setBackground(new java.awt.Color(252, 228, 186));
        IconoRegistros.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono de Registro de JDM Surveys (PNG).png")); // NOI18N
        IconoRegistros.setMaximumSize(new java.awt.Dimension(398, 500));
        IconoRegistros.setMinimumSize(new java.awt.Dimension(398, 500));
        IconoRegistros.setPreferredSize(new java.awt.Dimension(398, 500));

        javax.swing.GroupLayout PanelFondo1Layout = new javax.swing.GroupLayout(PanelFondo1);
        PanelFondo1.setLayout(PanelFondo1Layout);
        PanelFondo1Layout.setHorizontalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IconoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelFondo1Layout.setVerticalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(IconoRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearcuentaActionPerformed
        // LLAMAR A LA VENTANA SIGUIENTE:_______________________________________
        V03_Registro T_Registro = new V03_Registro();
            T_Registro.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnCrearcuentaActionPerformed

    private void rbEncuestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEncuestadorActionPerformed
        lbVariante.setText("Codigo :");
    }//GEN-LAST:event_rbEncuestadorActionPerformed

    private void rbParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParticipanteActionPerformed
        lbVariante.setText("E-mail :");
    }//GEN-LAST:event_rbParticipanteActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if(rbEncuestador.isSelected()){
            if(txtVariante.getText().length()==0){
                JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su codigo");
                return;
            }
            
            String codigo = txtVariante.getText();

            // VERIFICACIÓN DE CÓDIGO tiene exactamente 9 dígitos (sin letra al inicio)
            Pattern validarNumeros = Pattern.compile("^[0-9]{9}$");
            Matcher validandoNumeros = validarNumeros.matcher(codigo);

            // VERIFICACIÓN DE CÓDIGO empieza con una letra pero tiene menos de 8 dígitos
            Pattern validarNumF = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ][0-9]{1,7}$");
            Matcher validandoNume = validarNumF.matcher(codigo);

            // VERIFICACIÓN DE CÓDIGO comienza con una letra y tiene exactamente 8 dígitos
            Pattern validarCodigo = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ][0-9]{8}$");
            Matcher validandoCodigo = validarCodigo.matcher(codigo);

            if (validandoCodigo.matches()) {
                // El código cumple con el formato correcto, continúa el flujo normal
            } else if (validandoNumeros.matches()) {
                JOptionPane.showMessageDialog(this, "El código debe tenr una letra al inicio");
                return; // Salir del método si falta la letra
            } else if (validandoNume.matches()) {
                JOptionPane.showMessageDialog(this, "El código debe tener 8 números después de la letra");
                return; // Salir del método si faltan dígitos
            } else {
                JOptionPane.showMessageDialog(this, "El código no cumple con el formato - Ejemplo: [Letra + 8 digitos]");
                return; // Salir del método si el formato es incorrecto
            }
            
            if(txtContraseña.getPassword().length==0){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese su contraseña");
                return;
            }
            
            // Validate Encuestador login
            CRUDJavaE T_crudEncuestador = new CRUDJavaE();
            String contraseña = new String(txtContraseña.getPassword());

            Encuestador encuestadorLogueado = T_crudEncuestador.validarLoginEncuestador(codigo, contraseña);

            if (encuestadorLogueado != null) {
                V04_SeccionEnc T_se= new V04_SeccionEnc(T_listaEnc1);
                    T_se.setVisible(true);
                    this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos");
            }
            
            //Metodo para limpiar los controles
            limpiarControles();
        }else if(rbParticipante.isSelected()){
            if(txtVariante.getText().length()==0){
                JOptionPane.showMessageDialog(this,"Por Favor, Debe Ingresar su Email");
                return;
            }
            
            Pattern T_validarEmail = Pattern.compile("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
            Matcher T_validandoEmail = T_validarEmail.matcher(txtVariante.getText());

            if (!T_validandoEmail.matches()) {
                JOptionPane.showMessageDialog(this, "El e-mail no cumple con la estructura 'usuario@dominio'.");
                return;
            }
            
            if(txtContraseña.getPassword().length==0){
                JOptionPane.showMessageDialog(this,"Por favor, ingrese su contraseña");
                return;
            }
            
            //Validacion del Participante Login
            CRUDJavaP T_participantel = new CRUDJavaP();
            String email = txtVariante.getText();
            String contraseña = new String(txtContraseña.getPassword());
            
            Participante T_participanteLogueo = T_participantel.validarLoginPartipante(email, contraseña);
            
            if(T_participanteLogueo != null){
                V04_SeccionPart T_sp = new V04_SeccionPart(T_listaPart1);
                    T_sp.setVisible(true);
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Email o contraseña incorrectos");
            }
            
            //Metodo para limpiar los controles
            limpiarControles();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de usuario");
        }   
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    public void limpiarControles(){
        txtVariante.setText("");
        txtContraseña.setText("");
    }
    
    private void chbVisibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbVisibilidadActionPerformed
        // Permitir la visualizacion de la contraseña
        if (isPasswordVisible) {

            txtContraseña.setEchoChar('•'); 
            isPasswordVisible = false; 
        } else {
            txtContraseña.setEchoChar((char) 0); 
            isPasswordVisible = true; 
        }
        
    }//GEN-LAST:event_chbVisibilidadActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoRegistros;
    private javax.swing.JPanel PanelFondo1;
    private javax.swing.ButtonGroup bg01;
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JCheckBox chbVisibilidad;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbVariante;
    private javax.swing.JRadioButton rbEncuestador;
    private javax.swing.JRadioButton rbParticipante;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtVariante;
    // End of variables declaration//GEN-END:variables
}
