
package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_Clases.Encuestador;
import T_ConexionBD.CRUD_Encuestadores;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class A07_CambiarCuentasEnc extends javax.swing.JFrame {
    
    // INSTANCIA DE LA CLASE ListaEncuestadores:________________________________
    ListaEncuestadores T_listaEnc13 = new ListaEncuestadores();
    
    // VARIABLES PARA LA CLASE Encuestador:_____________________________________
    private String nombreEncuestador;
    private String apellidoEncuestador;
    private String codigoEncuestador;
    private String generoEncuestador;
    private String fechaNacimientoEnc;
    
    // DECLARACION DE VARIABLES:________________________________________________
    private boolean contraseñaVisible = false;
    
    public A07_CambiarCuentasEnc() {
    
    // PROPIEDADES DE LA VENTANA:_______________________________________________
        this.setTitle("Cambiar de cuenta");
        this.setSize(565, 340);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        lbCambiarCuenta = new javax.swing.JLabel();
        lbVerificarCredenciales = new javax.swing.JLabel();
        lbCorreoElectronico = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        chbVisibilidad = new javax.swing.JCheckBox();
        btnVerificarCredenciales = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        LogoOso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setPreferredSize(new java.awt.Dimension(550, 300));
        setResizable(false);

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setMaximumSize(new java.awt.Dimension(550, 300));
        Principal.setMinimumSize(new java.awt.Dimension(550, 300));
        Principal.setPreferredSize(new java.awt.Dimension(550, 300));

        lbCambiarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCambiarCuenta.setText("Cambiar de cuenta");

        lbVerificarCredenciales.setForeground(new java.awt.Color(51, 51, 255));
        lbVerificarCredenciales.setText("Verificar Credenciales");

        lbCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCorreoElectronico.setText("Codigo de encuestador :");

        txtCodigo.setMaximumSize(new java.awt.Dimension(238, 28));
        txtCodigo.setMinimumSize(new java.awt.Dimension(238, 28));
        txtCodigo.setPreferredSize(new java.awt.Dimension(238, 28));

        lbContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbContraseña.setText("Contraseña :");

        txtContraseña.setMaximumSize(new java.awt.Dimension(238, 28));
        txtContraseña.setMinimumSize(new java.awt.Dimension(238, 28));
        txtContraseña.setPreferredSize(new java.awt.Dimension(238, 28));

        chbVisibilidad.setText("Visualizar la contraseña");
        chbVisibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisibilidadActionPerformed(evt);
            }
        });

        btnVerificarCredenciales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerificarCredenciales.setForeground(new java.awt.Color(51, 51, 255));
        btnVerificarCredenciales.setText("Validar");
        btnVerificarCredenciales.setBorder(null);
        btnVerificarCredenciales.setContentAreaFilled(false);
        btnVerificarCredenciales.setMaximumSize(new java.awt.Dimension(60, 30));
        btnVerificarCredenciales.setMinimumSize(new java.awt.Dimension(60, 30));
        btnVerificarCredenciales.setPreferredSize(new java.awt.Dimension(60, 30));
        btnVerificarCredenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarCredencialesActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(51, 51, 255));
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setMaximumSize(new java.awt.Dimension(60, 30));
        btnAtras.setMinimumSize(new java.awt.Dimension(60, 30));
        btnAtras.setPreferredSize(new java.awt.Dimension(60, 30));

        LogoOso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Fondo Cuentas (300px).jpg")); // NOI18N

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnVerificarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVerificarCredenciales)
                            .addComponent(lbCorreoElectronico)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbVisibilidad)))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbCambiarCuenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoOso))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCambiarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVerificarCredenciales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVisibilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(LogoOso)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
        String codigo = txtCodigo.getText();
        String contraseña = new String(txtContraseña.getPassword());

        try {
            // Instancia de conexión a la base de datos 
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            // Asegúrate de que la conexión no sea null
            if (conexion == null) {
                throw new SQLException("Conexión fallida");
            }

            CRUD_Encuestadores crudEncuestador = new CRUD_Encuestadores(); 
            Encuestador nuevoEncuestador = crudEncuestador.validarCredenciales(codigo, contraseña);

            if (nuevoEncuestador != null) { 
                // Credenciales correctas, guardar valores en variables 
                String codigoEnc = nuevoEncuestador.getCodigo();
                String nombre = nuevoEncuestador.getNombre();
                String apellido = nuevoEncuestador.getApellidos();               
                String genero = nuevoEncuestador.getGenero();
                String fechaNacimiento = nuevoEncuestador.getFechaNacimiento();

                this.codigoEncuestador = codigoEnc;
                this.nombreEncuestador = nombre;
                this.apellidoEncuestador = apellido;
                this.generoEncuestador = genero;
                this.fechaNacimientoEnc = fechaNacimiento;

                // Abrir el jFrame V05_MenuEnc 
                A04_MenuEnc menu = new A04_MenuEnc(
                        T_listaEnc13, 
                        codigoEncuestador, 
                        nombreEncuestador, 
                        apellidoEncuestador, 
                        generoEncuestador, 
                        fechaNacimientoEnc
                );
                menu.setVisible(true);
                this.dispose(); // Cerrar la ventana actual

            } else { 
                // Credenciales incorrectas 
                JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos.", "Error de Autenticación", JOptionPane.ERROR_MESSAGE); 
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnVerificarCredencialesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoOso;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnVerificarCredenciales;
    private javax.swing.JCheckBox chbVisibilidad;
    private javax.swing.JLabel lbCambiarCuenta;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbCorreoElectronico;
    private javax.swing.JLabel lbVerificarCredenciales;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
