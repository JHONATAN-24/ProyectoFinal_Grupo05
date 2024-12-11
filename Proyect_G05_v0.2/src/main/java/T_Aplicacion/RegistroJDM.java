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
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class RegistroJDM extends javax.swing.JFrame {
    
    ListaEncuestadores T_listaEnc1 = new ListaEncuestadores(); 
    ListaParticipantes T_listaPart1 = new ListaParticipantes();
    
    public RegistroJDM() {
        initComponents();
        this.setTitle("JDM Surveys - Registros");
        this.setSize(815, 540);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo01 = new javax.swing.ButtonGroup();
        bgGrupo02 = new javax.swing.ButtonGroup();
        PanelFondo2 = new javax.swing.JPanel();
        IconoRegistros = new javax.swing.JLabel();
        PanelRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbEncuestador = new javax.swing.JRadioButton();
        rbParticipante = new javax.swing.JRadioButton();
        lbVariante = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtVariante = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jcalendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelFondo2.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo2.setMaximumSize(new java.awt.Dimension(800, 500));
        PanelFondo2.setMinimumSize(new java.awt.Dimension(800, 500));
        PanelFondo2.setPreferredSize(new java.awt.Dimension(800, 500));

        IconoRegistros.setBackground(new java.awt.Color(252, 228, 186));
        IconoRegistros.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono de Registro de JDM Surveys (PNG).png")); // NOI18N
        IconoRegistros.setMaximumSize(new java.awt.Dimension(398, 500));
        IconoRegistros.setMinimumSize(new java.awt.Dimension(398, 500));
        IconoRegistros.setPreferredSize(new java.awt.Dimension(398, 500));

        PanelRegistro.setBackground(new java.awt.Color(153, 204, 255));
        PanelRegistro.setMaximumSize(new java.awt.Dimension(398, 500));
        PanelRegistro.setMinimumSize(new java.awt.Dimension(398, 500));
        PanelRegistro.setPreferredSize(new java.awt.Dimension(398, 500));

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

        lbVariante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbVariante.setText("Codigo :");

        bgGrupo02.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbMasculino.setText("Masculino");

        bgGrupo02.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbFemenino.setText("Femenino");

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

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Password :");

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(txtVariante))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbEncuestador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbParticipante)
                        .addGap(42, 42, 42))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(rbMasculino)
                        .addGap(27, 27, 27)
                        .addComponent(rbFemenino)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtApellido))
                                    .addComponent(txtNombre)))
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarDatos))
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(lbVariante)
                                    .addComponent(jLabel8))
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jcalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(128, 128, 128))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEncuestador)
                    .addComponent(rbParticipante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addGap(10, 10, 10)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVariante)
                    .addComponent(txtVariante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardarDatos))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout PanelFondo2Layout = new javax.swing.GroupLayout(PanelFondo2);
        PanelFondo2.setLayout(PanelFondo2Layout);
        PanelFondo2Layout.setHorizontalGroup(
            PanelFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo2Layout.createSequentialGroup()
                .addComponent(IconoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelFondo2Layout.setVerticalGroup(
            PanelFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondo2Layout.createSequentialGroup()
                .addGroup(PanelFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconoRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        LoginJDM T_login = new LoginJDM();
            T_login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void rbEncuestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEncuestadorActionPerformed
        lbVariante.setText("Codigo:");
    }//GEN-LAST:event_rbEncuestadorActionPerformed

    private void rbParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParticipanteActionPerformed
        lbVariante.setText("Email:");
    }//GEN-LAST:event_rbParticipanteActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
    try{     
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
                
                //Pattern and Matcher
                String nombre = txtNombre.getText();
                Pattern validarNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$"); //Formato
                Matcher validacionNombre = validarNombre.matcher(nombre);
                if (!validacionNombre.matches()){ //Comprueba si el nombre ingresado no coincide con el patrón esperado (que son letras)
                    JOptionPane.showMessageDialog(this, "[x] El nombre solo puede contener letras");
                    return; //Salir del bucle
                }
                
                //Validando Apellido
                if(txtApellido.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar su Apellido");
                    return;
                }
                
                String apellido = txtApellido.getText();
                Pattern validarApellido = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
                Matcher validandoA = validarApellido.matcher(apellido);
                if(!validandoA.matches()){
                    JOptionPane.showMessageDialog(this, "[x] El apellido solo puede contener letras");
                    return; //Salir del bucle
                }
                
                
                //Validando Fecha Nacimiento
                if (jcalendario.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "[x] Por Favor, Debe Ingresar su Fecha de Nacimiento");
                    return; // Detener la ejecución si no se seleccionó una fecha
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
                String codigo = txtVariante.getText();

                // Verifica si el código tiene exactamente 9 dígitos (sin letra al inicio)
                Pattern validarNumeros = Pattern.compile("^[0-9]{9}$");
                Matcher validandoNumeros = validarNumeros.matcher(codigo);

                // Verifica si el código empieza con una letra pero tiene menos de 8 dígitos
                Pattern validarNumF = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ][0-9]{1,7}$");
                Matcher validandoNume = validarNumF.matcher(codigo);

                // Verifica si el código comienza con una letra y tiene exactamente 8 dígitos
                Pattern validarCodigo = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ][0-9]{8}$");
                Matcher validandoCodigo = validarCodigo.matcher(codigo);

                if (validandoCodigo.matches()) {
                    // El código cumple con el formato correcto, continúa el flujo normal
                } else if (validandoNumeros.matches()) {
                    JOptionPane.showMessageDialog(this, "[x] Falta la letra al inicio del código.");
                    return; // Salir del método si falta la letra
                } else if (validandoNume.matches()) {
                    JOptionPane.showMessageDialog(this, "[x] Faltan numeros en el código - Debe tener 8 nuemros después de la letra.");
                    return; // Salir del método si faltan dígitos
                } else {
                    JOptionPane.showMessageDialog(this, "[x] El código no cumple con el formato - Ejemplo: [Letra + 8 digitos].");
                    return; // Salir del método si el formato es incorrecto
                }

                //Validando Contraseña
                if(txtContraseña.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar una contraseña");
                    return;
                }
                
                //Usaremos el JDateChooser    
                // Obtener la fecha seleccionada
                Date T_fecha = jcalendario.getDate();
                SimpleDateFormat T_FechaE = new SimpleDateFormat("yyyy-MM-dd");
                String date = T_FechaE.format(T_fecha);

                // Calcular la edad
                Calendar fechaNacimiento = Calendar.getInstance();
                fechaNacimiento.setTime(T_fecha);
                Calendar today = Calendar.getInstance();

                int edad = today.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

                // Ajustar la edad considerando mes y día
                if (today.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) || 
                    (today.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) && 
                     today.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
                    edad--;
                }

                // Validaciones de fecha
                if (date.compareTo(T_FechaE.format(today.getTime())) > 0) {
                    JOptionPane.showMessageDialog(this, 
                        "No se puede seleccionar una fecha de nacimiento futura", 
                        "Error de Fecha", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (edad < 14) {
                    JOptionPane.showMessageDialog(this, 
                        "El encuestador debe tener al menos 14 años", 
                        "Error de Edad", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
}

            Encuestador nuevoENC = new Encuestador();
                nuevoENC.setNombre(txtNombre.getText());
                nuevoENC.setApellidos(txtApellido.getText());
                nuevoENC.setFechaNacimiento(date);
                if(rbMasculino.isSelected()) nuevoENC.setGenero("Masculino");
                if(rbFemenino.isSelected()) nuevoENC.setGenero("Femenino");
                nuevoENC.setCodigo(txtVariante.getText());
                nuevoENC.setPassword(txtContraseña.getText());

                JOptionPane.showMessageDialog(this,"¡Encuestador Registrado!");

                Connection conexion = ConexionSQLServer.getInstance().getConnection();

                CRUDJavaE crud = new CRUDJavaE();
                crud.insertarEncuestador(conexion, nuevoENC);

                T_listaEnc1.agregarEncuestador(nuevoENC);     
                
                //Metodo para limpiar los controles
                limpiarControles();
                
                // Pasar la misma instancia de datos al nuevo frame
                SeccionEncuestadores T_seccionE = new SeccionEncuestadores(T_listaEnc1);
                T_seccionE.setVisible(true);
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
                if (jcalendario.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "[x] Por Favor, Debe Ingresar su Fecha de Nacimiento");
                    return; // Detener la ejecución si no se seleccionó una fecha
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
                
                //Validando Contraseña
                if(txtContraseña.getText().length()==0){
                    JOptionPane.showMessageDialog(this,"[x] Por Favor, Debe Ingresar una contraseña");
                    return;
                }
           //Usaremos el JDateChooser    
            //Usaremos el JDateChooser    
                // Obtener la fecha seleccionada
                Date T_fecha = jcalendario.getDate();
                SimpleDateFormat T_FechaE = new SimpleDateFormat("yyyy-MM-dd");
                String dateP = T_FechaE.format(T_fecha);

                // Calcular la edad
                Calendar fechaNacimiento = Calendar.getInstance();
                fechaNacimiento.setTime(T_fecha);
                Calendar today = Calendar.getInstance();

                int edad = today.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

                // Ajustar la edad considerando mes y día
                if (today.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) || 
                    (today.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) && 
                     today.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
                    edad--;
                }

                // Validaciones de fecha
                if (dateP.compareTo(T_FechaE.format(today.getTime())) > 0) {
                    JOptionPane.showMessageDialog(this, 
                        "No se puede seleccionar una fecha de nacimiento futura", 
                        "Error de Fecha", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (edad < 14) {
                    JOptionPane.showMessageDialog(this, 
                        "El encuestador debe tener al menos 14 años", 
                        "Error de Edad", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
          Participante nuevoPART = new Participante();
                nuevoPART.setNombre(txtNombre.getText());
                nuevoPART.setApellidos(txtApellido.getText());
                nuevoPART.setFechaNacimiento(dateP);
                if(rbMasculino.isSelected()) nuevoPART.setGenero("Masculino");
                if(rbFemenino.isSelected()) nuevoPART.setGenero("Femenino");
                nuevoPART.setEmail(txtVariante.getText());
                nuevoPART.setPassword(txtContraseña.getText());
                
                JOptionPane.showMessageDialog(this,"¡Participante Registrado!");
                
                Connection conexion = ConexionSQLServer.getInstance().getConnection();

                CRUDJavaP T_crudP = new CRUDJavaP();
                T_crudP.insertarParticipante(conexion, nuevoPART);
                
                
                T_listaPart1.agregarParticipante(nuevoPART);
                
                
                
                //Metodo para limpiar los controles
                limpiarControles();   
                
                SeccionParticipantes T_seccionP = new SeccionParticipantes(T_listaPart1);
                T_seccionP.setVisible(true);
                this.dispose();

        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        e.printStackTrace();
    }   
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    public void limpiarControles(){
        txtNombre.setText("");
        txtApellido.setText("");
        jcalendario.setDate(null);
        bgGrupo01.clearSelection();
        bgGrupo02.clearSelection();
        txtVariante.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoRegistros;
    private javax.swing.JPanel PanelFondo2;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.ButtonGroup bgGrupo01;
    private javax.swing.ButtonGroup bgGrupo02;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jcalendario;
    private javax.swing.JLabel lbVariante;
    private javax.swing.JRadioButton rbEncuestador;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbParticipante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVariante;
    // End of variables declaration//GEN-END:variables
}
