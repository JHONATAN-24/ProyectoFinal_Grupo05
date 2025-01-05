/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_ArrayList.ListaParticipantes;
import javax.swing.JFrame;
    
public class V11_CuentasPart extends javax.swing.JFrame {
    
    ListaParticipantes T_listaPart10 = new ListaParticipantes();
    private int codigoparticipante;
    private String correoParticipante;
    private String nombreParticipante;
    private String apellidoParticipante;
    private String genero;
    private String fechaNacimiento;
    
    
    public V11_CuentasPart(ListaParticipantes participante, int codigoParticipante,
                        String correoParticipante, String nombreParticipante, 
                        String apellidoParticipante, String genero, String fechaNacimiento) {
        initComponents();
        this.setTitle("Cuentas Registradas");
        this.setSize(515, 340);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.T_listaPart10 = participante;
        this.codigoparticipante = codigoParticipante;
        this.correoParticipante = correoParticipante;
        this.nombreParticipante = nombreParticipante;
        this.apellidoParticipante = apellidoParticipante;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        
        System.out.println(codigoParticipante);
        
        MostrarNombre();
        MostrarCorreo();
        MostrarGenero();
        MostrarFechaDeNacimiento();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        lbCuenta = new javax.swing.JLabel();
        lbInformacionUsuario = new javax.swing.JLabel();
        IconoPerfil = new javax.swing.JLabel();
        lbNombreCompleto = new javax.swing.JLabel();
        lbCodigoEncuestador = new javax.swing.JLabel();
        lbVarianteGenero = new javax.swing.JLabel();
        lbFechaDeNacimiento = new javax.swing.JLabel();
        btnAcercaDeLaPlataforma = new javax.swing.JButton();
        btnCambiarCuenta = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        LogoOso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setResizable(false);

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setMaximumSize(new java.awt.Dimension(550, 300));
        Principal.setMinimumSize(new java.awt.Dimension(550, 300));

        lbCuenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbCuenta.setForeground(new java.awt.Color(153, 153, 153));
        lbCuenta.setText("Cuenta");

        lbInformacionUsuario.setForeground(new java.awt.Color(51, 51, 255));
        lbInformacionUsuario.setText("Información de usuario");

        IconoPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Usuario BW (Fondo 0) (50px).png")); // NOI18N

        lbNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNombreCompleto.setText("Nombre Persona");

        lbCodigoEncuestador.setText("Correo electronico");

        lbVarianteGenero.setText("Masculino o Femenino");

        lbFechaDeNacimiento.setText("11 - 11 - 1111");

        btnAcercaDeLaPlataforma.setForeground(new java.awt.Color(51, 51, 255));
        btnAcercaDeLaPlataforma.setText("Acerca de la plataforma");
        btnAcercaDeLaPlataforma.setBorder(null);
        btnAcercaDeLaPlataforma.setContentAreaFilled(false);
        btnAcercaDeLaPlataforma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDeLaPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeLaPlataformaActionPerformed(evt);
            }
        });

        btnCambiarCuenta.setForeground(new java.awt.Color(51, 51, 255));
        btnCambiarCuenta.setText("Cambiar de cuenta");
        btnCambiarCuenta.setBorder(null);
        btnCambiarCuenta.setContentAreaFilled(false);
        btnCambiarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCerrarSesion.setForeground(new java.awt.Color(51, 51, 255));
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Fondo.setMaximumSize(new java.awt.Dimension(300, 300));
        Fondo.setMinimumSize(new java.awt.Dimension(300, 300));

        LogoOso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Fondo Cuentas (300px).jpg")); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoOso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoOso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarSesion)
                            .addComponent(btnCambiarCuenta)
                            .addComponent(lbCuenta)
                            .addComponent(lbInformacionUsuario)
                            .addComponent(btnAcercaDeLaPlataforma))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbVarianteGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(IconoPerfil)
                        .addGap(7, 7, 7)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(lbCodigoEncuestador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbFechaDeNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbInformacionUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconoPerfil)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(lbNombreCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCodigoEncuestador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVarianteGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFechaDeNacimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcercaDeLaPlataforma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcercaDeLaPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeLaPlataformaActionPerformed
        
    }//GEN-LAST:event_btnAcercaDeLaPlataformaActionPerformed

    // METODO PARA MOSTRAR EL NOMBRE COMPLETO:__________________________________
    public void MostrarNombre(){
        lbNombreCompleto.setText(nombreParticipante + " " + apellidoParticipante);
    }
    
    // METODO PARA MOSTRAR EL CORREO ELECTRONICO:_______________________________
    public void MostrarCorreo(){
        lbCodigoEncuestador.setText(correoParticipante);
    }
    
    // METODO PARA MOSTRAR EL GENERO:___________________________________________
    public void MostrarGenero(){
        lbVarianteGenero.setText("Género: " + genero);
    }
    
    // METODO PARA MOSTRAR LA FECHA DE NACIMIENTO:______________________________
    public void MostrarFechaDeNacimiento(){
        lbFechaDeNacimiento.setText("Fecha de nacimiento: " + fechaNacimiento);
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel IconoPerfil;
    private javax.swing.JLabel LogoOso;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnAcercaDeLaPlataforma;
    private javax.swing.JButton btnCambiarCuenta;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel lbCodigoEncuestador;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JLabel lbFechaDeNacimiento;
    private javax.swing.JLabel lbInformacionUsuario;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JLabel lbVarianteGenero;
    // End of variables declaration//GEN-END:variables
}
