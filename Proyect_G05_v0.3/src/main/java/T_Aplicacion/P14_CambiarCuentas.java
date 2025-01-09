
package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_ArrayList.ListaParticipantes;
import T_Clases.Encuestador;
import T_Clases.Participante;
import T_ConexionBD.CRUD_Encuestadores;
import T_ConexionBD.CRUD_Participantes;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class P14_CambiarCuentas extends javax.swing.JPanel {
    // INSTANCIAS DE LAS CLASES:________________________________________________
    ListaEncuestadores T_listaEnc13 = new ListaEncuestadores(); 
    ListaParticipantes T_listaPart13 = new ListaParticipantes();
    
    // DECLARACION DE VARIABLES:________________________________________________
    private boolean contraseñaVisible = false;
    
    public P14_CambiarCuentas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        chbVisibilidad = new javax.swing.JCheckBox();
        btnVerificarCredenciales = new javax.swing.JButton();
        lbCuenta = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setMaximumSize(new java.awt.Dimension(300, 300));
        Principal.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Verificar Credenciales");

        txtCodigo.setMaximumSize(new java.awt.Dimension(288, 22));
        txtCodigo.setMinimumSize(new java.awt.Dimension(288, 22));
        txtCodigo.setPreferredSize(new java.awt.Dimension(288, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Codigo o correo electronico :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña :");

        txtContraseña.setMaximumSize(new java.awt.Dimension(288, 22));
        txtContraseña.setMinimumSize(new java.awt.Dimension(288, 22));
        txtContraseña.setPreferredSize(new java.awt.Dimension(288, 22));

        chbVisibilidad.setText("Visualizar la contraseña");
        chbVisibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisibilidadActionPerformed(evt);
            }
        });

        btnVerificarCredenciales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerificarCredenciales.setForeground(new java.awt.Color(51, 51, 255));
        btnVerificarCredenciales.setText("Validar");
        btnVerificarCredenciales.setBorder(null);
        btnVerificarCredenciales.setContentAreaFilled(false);
        btnVerificarCredenciales.setMaximumSize(new java.awt.Dimension(60, 22));
        btnVerificarCredenciales.setMinimumSize(new java.awt.Dimension(60, 22));
        btnVerificarCredenciales.setPreferredSize(new java.awt.Dimension(60, 22));
        btnVerificarCredenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarCredencialesActionPerformed(evt);
            }
        });

        lbCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCuenta.setText("Cambiar de cuenta");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbVisibilidad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVerificarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVisibilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnVerificarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chbVisibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbVisibilidadActionPerformed
        // Permitir la visualizacion de la contraseña
        if (contraseñaVisible) {
            txtContraseña.setEchoChar('•');
            contraseñaVisible = false;
        } else {
            txtContraseña.setEchoChar((char) 0);
            contraseñaVisible = true;
        }
    }//GEN-LAST:event_chbVisibilidadActionPerformed

    private void btnVerificarCredencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarCredencialesActionPerformed
        String codigoOEmail = txtCodigo.getText();
        String contraseña = new String(txtContraseña.getPassword());

        try {
            // Instancia de conexión a la base de datos
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            // Asegúrate de que la conexión no sea null
            if (conexion == null) {
                throw new SQLException("Conexión fallida");
            }

            CRUD_Encuestadores crudEncuestador = new CRUD_Encuestadores();
            Encuestador nuevoEncuestador = crudEncuestador.validarCredenciales(codigoOEmail, contraseña);

            if (nuevoEncuestador != null) {
                // Credenciales correctas del encuestador
                String nombreEncuestador = nuevoEncuestador.getNombre();
                String apellidoEncuestador = nuevoEncuestador.getApellidos();
                String codigoEncuestador = nuevoEncuestador.getCodigo();
                String genero = nuevoEncuestador.getGenero();
                String fechaNacimiento = nuevoEncuestador.getFechaNacimiento();

                // Abrir el jFrame V05_MenuEnc
                A04_MenuEnc menu = new A04_MenuEnc(
                    T_listaEnc13,
                    codigoEncuestador,
                    nombreEncuestador,
                    apellidoEncuestador,
                    genero,
                    fechaNacimiento
                );
                menu.setVisible(true);

            } else {
                // Intentar validar como participante
                CRUD_Participantes crudParticipante = new CRUD_Participantes();
                Participante nuevoParticipante = crudParticipante.validarCredenciales(codigoOEmail, contraseña);

                if (nuevoParticipante != null) {
                    // Credenciales correctas del participante
                    int codigoParticipante = nuevoParticipante.getCodigo();
                    String emailParticipante = nuevoParticipante.getEmail();
                    String nombreParticipante = nuevoParticipante.getNombre();
                    String apellidoParticipante = nuevoParticipante.getApellidos();
                    String generoParticipante = nuevoParticipante.getGenero();
                    String fechaNacimientoParticipante = nuevoParticipante.getFechaNacimiento();

                    // Abrir el jFrame V05_MenuPart
                    A04_MenuPart menuPart = new A04_MenuPart(
                        T_listaPart13,
                        codigoParticipante,
                        emailParticipante,
                        nombreParticipante,
                        apellidoParticipante,
                        generoParticipante,
                        fechaNacimientoParticipante
                    );
                    menuPart.setVisible(true);

                } else {
                    // Credenciales incorrectas para ambos
                    JOptionPane.showMessageDialog(this, "Código, email o contraseña incorrectos.", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarCredencialesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnVerificarCredenciales;
    private javax.swing.JCheckBox chbVisibilidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
