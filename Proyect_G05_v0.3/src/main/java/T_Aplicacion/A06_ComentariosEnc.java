
package T_Aplicacion;

import T_ArrayList.ListaComentarios;
import T_ArrayList.ListaEncuestadores;
import T_Clases.Comentario;
import T_ConexionBD.CRUD_Comentarios;
import T_ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class A06_ComentariosEnc extends javax.swing.JFrame {
    // INSTANCIA DE LA CLASE ListaEncuestadores:________________________________
    ListaEncuestadores T_listaEnc10 = new ListaEncuestadores();
    ListaComentarios T_listaComent = new ListaComentarios();
    
    // VARIABLES PARA LA CLASE Encuestador:_____________________________________
    private String nombreEncuestador;
    private String apellidoEncuestador;
    private String codigoEncuestador;
    private String genero;
    private String fechaNacimiento;
    
    private int idComentarioActual = -1;
    private boolean comentarioGuardado = false;
    
    public A06_ComentariosEnc(
    // PARAMETROS DEL CONSTRUCTOR:______________________________________________
            ListaEncuestadores encuestador, 
            String codigoEncuestador,                        
            String nombreEncuestador, 
            String apellidoEncuestador,                         
            String genero, 
            String fechaNacimiento
    ){
        
    // PROPIEDADES DE LA VENTANA:_______________________________________________
        this.setTitle("Comentarios de encuestadores");
        this.setSize(565, 340);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    // IGUALANDO LAS VARIBLES CON LOS PARAMETROS DEL CONSTRUCTOR:_______________
        this.T_listaEnc10 = encuestador;
        this.nombreEncuestador = nombreEncuestador;
        this.apellidoEncuestador = apellidoEncuestador;
        this.codigoEncuestador = codigoEncuestador;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        
    // INICIALIZAR LOS COMPONENTES:_____________________________________________
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        lbComentario = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 300));
        setResizable(false);

        Principal.setMaximumSize(new java.awt.Dimension(550, 300));
        Principal.setMinimumSize(new java.awt.Dimension(550, 300));

        lbComentario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbComentario.setForeground(new java.awt.Color(153, 153, 153));
        lbComentario.setText("Comentarios");

        lbMensaje.setText("¡Tu experiencia es invaluable! Ayúdanos a crear mejores encuestas.");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(538, 200));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(538, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(538, 200));

        txtComentario.setColumns(20);
        txtComentario.setLineWrap(true);
        txtComentario.setRows(5);
        txtComentario.setWrapStyleWord(true);
        txtComentario.setMaximumSize(new java.awt.Dimension(538, 350));
        txtComentario.setMinimumSize(new java.awt.Dimension(538, 350));
        txtComentario.setPreferredSize(new java.awt.Dimension(538, 350));
        jScrollPane1.setViewportView(txtComentario);

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(51, 51, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setMaximumSize(new java.awt.Dimension(50, 20));
        btnEnviar.setMinimumSize(new java.awt.Dimension(50, 20));
        btnEnviar.setPreferredSize(new java.awt.Dimension(50, 20));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbComentario))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(lbMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try { 
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            CRUD_Comentarios crudComentarios = new CRUD_Comentarios();
        
                Comentario nuevoComentario = new Comentario();
                nuevoComentario.setComentario(txtComentario.getText());

                JOptionPane.showMessageDialog(this,"¡Comentario recibido!");
                crudComentarios.insertarComentarioEnc(conexion, nuevoComentario, codigoEncuestador);  
            
        // OBTENER EL ID DE LA ENCUESTA RECIÉN INSERTADA:_______________________
            idComentarioActual = obtenerIdUltimoComentario();
            
        // MARCAR QUE LA ENCUESTA FUE GUARDADA:_________________________________
            comentarioGuardado = true;
        
        // DEJAR EN BLANCO EL AREA DE TEXTO:____________________________________
            limpiarControles();
            
        } catch (Exception e) { 
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnEnviarActionPerformed

    private int obtenerIdUltimoComentario() throws SQLException {
        Connection conexion = ConexionSQLServer.getInstance().getConnection();
        String sql = "SELECT TOP 1 id_comentario FROM T_ComentariosEnc ORDER BY id_comentario DESC";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_comentario");
            }
        }

        return -1; // Return -1 if no surveys found
    }
    
    public void limpiarControles(){
        txtComentario.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbComentario;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JTextArea txtComentario;
    // End of variables declaration//GEN-END:variables
}
