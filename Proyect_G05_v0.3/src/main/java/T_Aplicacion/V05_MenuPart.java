
package T_Aplicacion;

import T_ArrayList.ListaParticipantes;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class V05_MenuPart extends javax.swing.JFrame {
    // INSTANCIA DE LA CLASE ListaEncuestadores:________________________________
    ListaParticipantes T_listaPart4 = new ListaParticipantes();
    
    // VARIABLE Timer DEL PAQUETE javax.swing.Timer:____________________________
    private Timer timer;
    
    // VARIABLES PARA LA CLASE Participante:____________________________________
    private int codigoParticipante;
    private String correoParticipante;
    private String nombreParticipante;
    private String apellidoParticipante;
    private String genero;
    private String fechaNacimiento;
    
    // VARIABLES PARA LA CLASE Encuesta:________________________________________
    private String codigo;
    private String titulo;
    private String descripcion;
    private String nombreEnc;
    private String fecha;
    
    public V05_MenuPart(
    // PARAMETROS DEL CONSTRUCTOR:______________________________________________
            ListaParticipantes participante, 
            int codigoParticipante,          
            String correoParticipante, 
            String nombreParticipante,                         
            String apellidoParticipante, 
            String genero, 
            String fechaNacimiento
    ){
        
    // PROPIEDADES DE LA VENTANA:_______________________________________________ 
        this.setTitle("JDM Surveys - MenuOpciones");
        this.setSize(940, 580);
        this.setLocationRelativeTo(null);
        
    // IGUALANDO LAS VARIBLES CON LOS PARAMETROS DEL CONSTRUCTOR:_______________   
        this.T_listaPart4 = participante;
        this.codigoParticipante = codigoParticipante;
        this.correoParticipante = correoParticipante;
        this.nombreParticipante = nombreParticipante;
        this.apellidoParticipante = apellidoParticipante;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;

    // INICIALIZAR LOS COMPONENTES:_____________________________________________    
        initComponents();
        MostrarNombre();
        iniciarReloj();
        mensajeFecha();
        mensajeHora();
        mostrarEncuestas();
        
    // IMPRIMIR EL CODIGO DEL PARTICIPANTE AL ABRIR LA VENTANA:__________________    
    System.out.println(codigoParticipante);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        MenuOpciones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnEncuestasRecibidas = new javax.swing.JButton();
        lbLogoJDM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCuenta = new javax.swing.JButton();
        btnComentarios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Contorno = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbCodigoEncuesta = new javax.swing.JLabel();
        lbTituloEncuesta = new javax.swing.JLabel();
        lbDescripcionEncuesta = new javax.swing.JLabel();
        IconoEncuesta = new javax.swing.JLabel();
        lbNombreEncuestador = new javax.swing.JLabel();
        lbFechaDeCreacion = new javax.swing.JLabel();
        btnResponderEncuesta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecibidas = new javax.swing.JTable();
        btnVerEncuesta = new javax.swing.JButton();
        lbNombrePar = new javax.swing.JLabel();
        lbFotoPerfil = new javax.swing.JLabel();
        Fecha = new javax.swing.JPanel();
        lbHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 153));
        FondoBlanco.setMaximumSize(new java.awt.Dimension(960, 540));
        FondoBlanco.setMinimumSize(new java.awt.Dimension(960, 540));
        FondoBlanco.setPreferredSize(new java.awt.Dimension(960, 540));

        MenuOpciones.setBackground(new java.awt.Color(255, 204, 102));
        MenuOpciones.setMaximumSize(new java.awt.Dimension(102, 540));
        MenuOpciones.setMinimumSize(new java.awt.Dimension(102, 540));
        MenuOpciones.setPreferredSize(new java.awt.Dimension(102, 540));

        btnInicio.setBackground(new java.awt.Color(255, 204, 102));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono inicio (Fondo 0)(50px).png")); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setMaximumSize(new java.awt.Dimension(90, 80));
        btnInicio.setMinimumSize(new java.awt.Dimension(90, 80));
        btnInicio.setOpaque(true);
        btnInicio.setPreferredSize(new java.awt.Dimension(90, 80));
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnEncuestasRecibidas.setBackground(new java.awt.Color(255, 204, 102));
        btnEncuestasRecibidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEncuestasRecibidas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Publicadas (Fondo 0)(50px).png")); // NOI18N
        btnEncuestasRecibidas.setText("Recibidas");
        btnEncuestasRecibidas.setBorder(null);
        btnEncuestasRecibidas.setContentAreaFilled(false);
        btnEncuestasRecibidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasRecibidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestasRecibidas.setMaximumSize(new java.awt.Dimension(90, 80));
        btnEncuestasRecibidas.setMinimumSize(new java.awt.Dimension(90, 80));
        btnEncuestasRecibidas.setOpaque(true);
        btnEncuestasRecibidas.setPreferredSize(new java.awt.Dimension(90, 80));
        btnEncuestasRecibidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestasRecibidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestasRecibidasActionPerformed(evt);
            }
        });

        lbLogoJDM.setFont(new java.awt.Font("Cabin Sketch", 2, 48)); // NOI18N
        lbLogoJDM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\JDM Logo Letras (Fondo 0) (90-60 px).png")); // NOI18N
        lbLogoJDM.setMaximumSize(new java.awt.Dimension(180, 60));
        lbLogoJDM.setMinimumSize(new java.awt.Dimension(180, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));

        btnCuenta.setText("Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuenta.setMaximumSize(new java.awt.Dimension(90, 16));
        btnCuenta.setMinimumSize(new java.awt.Dimension(90, 16));
        btnCuenta.setPreferredSize(new java.awt.Dimension(90, 16));
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        btnComentarios.setText("Comentarios");
        btnComentarios.setBorder(null);
        btnComentarios.setContentAreaFilled(false);
        btnComentarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComentarios.setIconTextGap(0);
        btnComentarios.setMaximumSize(new java.awt.Dimension(90, 16));
        btnComentarios.setMinimumSize(new java.awt.Dimension(90, 16));
        btnComentarios.setPreferredSize(new java.awt.Dimension(90, 16));

        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(90, 16));
        btnSalir.setMinimumSize(new java.awt.Dimension(90, 16));
        btnSalir.setPreferredSize(new java.awt.Dimension(90, 16));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuOpcionesLayout = new javax.swing.GroupLayout(MenuOpciones);
        MenuOpciones.setLayout(MenuOpcionesLayout);
        MenuOpcionesLayout.setHorizontalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOpcionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogoJDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEncuestasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuOpcionesLayout.setVerticalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogoJDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncuestasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Contorno.setBackground(new java.awt.Color(255, 255, 153));
        Contorno.setMaximumSize(new java.awt.Dimension(846, 472));
        Contorno.setMinimumSize(new java.awt.Dimension(846, 472));
        Contorno.setPreferredSize(new java.awt.Dimension(846, 472));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(846, 472));
        jPanel1.setMinimumSize(new java.awt.Dimension(846, 472));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Encuestas recientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Recibidas");

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(834, 142));
        jPanel5.setMinimumSize(new java.awt.Dimension(834, 142));
        jPanel5.setPreferredSize(new java.awt.Dimension(834, 145));

        lbCodigoEncuesta.setText("Codigo :");

        lbTituloEncuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloEncuesta.setText("Titulo :");
        lbTituloEncuesta.setToolTipText("");
        lbTituloEncuesta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbTituloEncuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTituloEncuesta.setMaximumSize(new java.awt.Dimension(206, 16));
        lbTituloEncuesta.setMinimumSize(new java.awt.Dimension(206, 16));
        lbTituloEncuesta.setPreferredSize(new java.awt.Dimension(206, 16));

        lbDescripcionEncuesta.setText("Descripción :");
        lbDescripcionEncuesta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbDescripcionEncuesta.setMaximumSize(new java.awt.Dimension(262, 55));
        lbDescripcionEncuesta.setMinimumSize(new java.awt.Dimension(262, 55));
        lbDescripcionEncuesta.setPreferredSize(new java.awt.Dimension(262, 55));

        IconoEncuesta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaAbierta (100px).png")); // NOI18N

        lbNombreEncuestador.setText("Enviado por :");

        lbFechaDeCreacion.setText("Fecha de publicación :");

        btnResponderEncuesta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResponderEncuesta.setForeground(new java.awt.Color(51, 51, 255));
        btnResponderEncuesta.setText("Responder");
        btnResponderEncuesta.setBorder(null);
        btnResponderEncuesta.setContentAreaFilled(false);
        btnResponderEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResponderEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(IconoEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescripcionEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbNombreEncuestador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbFechaDeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCodigoEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(btnResponderEncuesta)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbTituloEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IconoEncuesta)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lbDescripcionEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreEncuestador)
                    .addComponent(lbFechaDeCreacion)
                    .addComponent(btnResponderEncuesta)
                    .addComponent(lbCodigoEncuesta))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(834, 231));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(834, 231));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(834, 231));

        tblRecibidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Descripción", "Encuestador", "Fecha de creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecibidas.setMaximumSize(new java.awt.Dimension(834, 800));
        tblRecibidas.setMinimumSize(new java.awt.Dimension(834, 800));
        tblRecibidas.setPreferredSize(new java.awt.Dimension(834, 800));
        jScrollPane1.setViewportView(tblRecibidas);

        btnVerEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerEncuesta.setText("Ver Informacion");
        btnVerEncuesta.setBorder(null);
        btnVerEncuesta.setContentAreaFilled(false);
        btnVerEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerEncuesta)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEncuesta)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContornoLayout = new javax.swing.GroupLayout(Contorno);
        Contorno.setLayout(ContornoLayout);
        ContornoLayout.setHorizontalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContornoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContornoLayout.setVerticalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContornoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbNombrePar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombrePar.setText("Nombre Persona");
        lbNombrePar.setPreferredSize(new java.awt.Dimension(100, 20));

        lbFotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Usuario BW (Fondo 0) (50px).png")); // NOI18N

        Fecha.setBackground(new java.awt.Color(255, 153, 153));
        Fecha.setMaximumSize(new java.awt.Dimension(200, 30));
        Fecha.setMinimumSize(new java.awt.Dimension(200, 30));

        lbHora.setBackground(new java.awt.Color(255, 255, 255));
        lbHora.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lbHora.setText("{HH}:{mm}");
        lbHora.setMaximumSize(new java.awt.Dimension(72, 18));
        lbHora.setMinimumSize(new java.awt.Dimension(72, 18));
        lbHora.setPreferredSize(new java.awt.Dimension(72, 18));

        lbFecha.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lbFecha.setText("{day}/{month}/{year}");
        lbFecha.setMaximumSize(new java.awt.Dimension(160, 18));
        lbFecha.setMinimumSize(new java.awt.Dimension(160, 18));
        lbFecha.setPreferredSize(new java.awt.Dimension(160, 18));

        javax.swing.GroupLayout FechaLayout = new javax.swing.GroupLayout(Fecha);
        Fecha.setLayout(FechaLayout);
        FechaLayout.setHorizontalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(lbFotoPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombrePar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFotoPerfil)
                    .addComponent(lbNombrePar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        V11_CuentasPart panelCuenta = new V11_CuentasPart(
                T_listaPart4, 
                codigoParticipante,
                correoParticipante, 
                nombreParticipante, 
                apellidoParticipante, 
                genero, 
                fechaNacimiento
        );
        panelCuenta.setVisible(true);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnEncuestasRecibidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestasRecibidasActionPerformed
        panelRecibidas();
    }//GEN-LAST:event_btnEncuestasRecibidasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicial();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVerEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEncuestaActionPerformed
        // Escoger a la encuesta de la tabla
        int selectedRow = tblRecibidas.getSelectedRow();

        // Validación
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Encuestador.");
            return;
        }

        // Obtener valores de la tabla
        String codigoEncuesta = tblRecibidas.getValueAt(selectedRow, 0).toString();
        String tituloEncuesta = tblRecibidas.getValueAt(selectedRow, 1).toString();
        String descripcionEncuesta = tblRecibidas.getValueAt(selectedRow, 2).toString();
        String nombreEncuestador = tblRecibidas.getValueAt(selectedRow, 3).toString();
        String fechaCreacion = tblRecibidas.getValueAt(selectedRow,4).toString();

        this.codigo = codigoEncuesta;
        this.titulo = tituloEncuesta;
        this.descripcion = descripcionEncuesta;
        this.nombreEnc = nombreEncuestador;
        this.fecha = fechaCreacion;

        MostrarCodigoDeEncuesta();
        MostrarTitulo();
        MostrarDescripcion();
        MostrarNombreDelEncuestador();
        MostrarFechaDeCreacion();
    }//GEN-LAST:event_btnVerEncuestaActionPerformed

    private void btnResponderEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderEncuestaActionPerformed
        // Escoger al usuario de la tabla
        int selectedRow = tblRecibidas.getSelectedRow();
        // Validación
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Encuesta.");
            return;
        }

        // Obtener el ID de la encuesta seleccionada
        int codigoEncuesta = (int) tblRecibidas.getValueAt(selectedRow, 0);
        System.out.println("ID de encuesta seleccionada: " + codigoEncuesta);

        // Verificar el estado de la encuesta
        String estadoEncuesta = obtenerEstadoEncuesta(codigoEncuesta);

        if ("Abierta".equals(estadoEncuesta)) {
            // Abrir ventana de encuesta abierta
            EncBaseAbierta encuestaBase = new EncBaseAbierta(codigoParticipante, codigoEncuesta);
            encuestaBase.mostrarPreguntasEncuesta(codigoEncuesta);
            encuestaBase.setVisible(true);
        } else if ("Cerrada".equals(estadoEncuesta)) {
            // Abrir ventana de encuesta cerrada
            EncBaseCerrada encuestaCerrada = new EncBaseCerrada(codigoParticipante, codigoEncuesta);
            encuestaCerrada.mostrarPreguntasEncuesta(codigoEncuesta);
            encuestaCerrada.setVisible(true);
        } else {
            // Manejar otros estados o mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Estado de encuesta no válido.");
        }
    }//GEN-LAST:event_btnResponderEncuestaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        V02_Login T_login = new V02_Login();
            T_login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    // METODO PARA MOSTRAR EL NOMBRE:___________________________________________
    public void MostrarNombre(){
        lbNombrePar.setText(nombreParticipante + " " + apellidoParticipante);
    }
    
    // METODO PARA MOSTRAR LA FECHA:____________________________________________
    public void mensajeFecha(){
        //Importamos la libreria LocalDate
        LocalDate nuevoDate = LocalDate.now();
        
        //creacion de Variables
        int año;
        int dia;
        int mes;
        
        año = nuevoDate.getYear();
        dia = nuevoDate.getDayOfMonth();
        mes = nuevoDate.getMonthValue();
        
        //Definimos un Arreglo
        String[] meses= {"01","02","03","04","05","06","07","08","09","10","11","12"};
        lbFecha.setText(dia+"/"+meses[mes-1]+"/"+año);
    }
    
    // METODO PARA INICIALIZAR EL RELOJ:________________________________________
    private void iniciarReloj() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mensajeHora();
            }
        });
        timer.start();
    }
    
    // METODO PARA MOSTRAR LA HORA:_____________________________________________
    public void mensajeHora(){
      Calendar nuevocalendario = new GregorianCalendar();  // Crear el calendario
        Date horaActual = new Date();                   // Obtener la fecha y hora actual
            nuevocalendario.setTime(horaActual);        // Configurar el calendario con la hora actual
            
        //Crear las variables
        String hora;
        String minutos;
        String segundos;
        String horaCompleta;
 
        // Obtener la hora y formatearla con ceros si es necesario
        hora = nuevocalendario.get(Calendar.HOUR_OF_DAY) > 9 
                        ? "" + nuevocalendario.get(Calendar.HOUR_OF_DAY) 
                        : "0" + nuevocalendario.get(Calendar.HOUR_OF_DAY);

        // Obtener los minutos y formatearlos con ceros si es necesario
        minutos = nuevocalendario.get(Calendar.MINUTE) > 9 
                        ? "" + nuevocalendario.get(Calendar.MINUTE) 
                        : "0" + nuevocalendario.get(Calendar.MINUTE);

         // Obtener los segundos y formatearlos con ceros si es necesario
        segundos = nuevocalendario.get(Calendar.SECOND) > 9 
                        ? "" + nuevocalendario.get(Calendar.SECOND) 
                        : "0" + nuevocalendario.get(Calendar.SECOND);

        // Unir la hora, los minutos y los segundos en un formato "HH:mm:ss"
        horaCompleta = hora + ":" + minutos + ":" + segundos;

        // Asignar la hora formateada al Label
        lbHora.setText(horaCompleta);
    }
    
    // METODO PARA MOSTRAR EL TITULO DE LA ENCUESTA:____________________________
    public void MostrarTitulo(){
        lbTituloEncuesta.setText("<html><p>" + "Titulo : " + titulo + "</p></html>");
    }
    
    // METODO PARA MOSTRAR LA DESCRIPCION DE LA ENCUESTA:_______________________
    public void MostrarDescripcion(){
        lbDescripcionEncuesta.setText("<html><p>" + "Descripción : " + descripcion + "</p></html>");
    }
    
    // METODO PARA MOSTRAR EL NOMBRE DEL ENCUESTADOR:___________________________
    public void MostrarNombreDelEncuestador(){
        lbNombreEncuestador.setText("<html><p>" + "Enviado por : " + nombreEnc + "</p></html>");
    }
    
    // METODO PARA MOSTRAR LA FECHA DE CREACION:________________________________
    public void MostrarFechaDeCreacion(){
        lbFechaDeCreacion.setText("Fecha de creación : " + fecha);
    }
    
    // METODO PARA MOSTRAR EL CODIGO DE LA ENCUESTA:____________________________
    public void MostrarCodigoDeEncuesta(){
        lbCodigoEncuesta.setText("Codigo : " + codigo);
    }
    
    // METODO PARA SABER EL TIPO DE ENCUESTA:___________________________________
    private String obtenerEstadoEncuesta(int codigoEncuesta) {
            String estadoEncuesta = "";
        try {
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
            String sql = "SELECT tipo FROM T_Encuestas WHERE id_encuestas = ?";

            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                stmt.setInt(1, codigoEncuesta);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        estadoEncuesta = rs.getString("tipo");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener el estado de la encuesta: " + ex.getMessage());
        }
    
        return estadoEncuesta;
    }
    
    // METODO PARA LISTAR LAS ENCUESTAS RECIBIDAS EN UNA TABLA:_________________
    public void mostrarEncuestas(){
        try{
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblRecibidas.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaEn crud = new CRUDJavaEn();
        List<Encuesta> lista = crud.obtenerEncuestasPar(conexion);
        
            for (Encuesta e : lista) {
                Object[] rowData = {
                  e.getId(),
                  e.getTitulo(),
                  e.getDescripción(),
                  e.getEncuestador().getNombre(),
                  e.getFechaCreacion()
                };
                dtm.addRow(rowData);
            }
           
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // METODO PARA MOSTRAR EL PANEL INICIAL:____________________________________
    public void panelInicial(){
        P06_InicioParticipante pInicio = new P06_InicioParticipante();
            pInicio.setSize(846,472); //Colocamos el tamaño de nuestro Jpanel
            pInicio.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pInicio,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    // METODO PARA MOSTRAR EL PANEL DE ENCUESTAS RECIBIDAS:_____________________
    public void panelRecibidas(){
        P09_Recibidas pPlantillas = new P09_Recibidas(
                this, 
                T_listaPart4, 
                codigoParticipante, 
                nombreParticipante, 
                apellidoParticipante, 
                PROPERTIES
        );
            pPlantillas.setSize(846,472);
            pPlantillas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pPlantillas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contorno;
    private javax.swing.JPanel Fecha;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JLabel IconoEncuesta;
    private javax.swing.JPanel MenuOpciones;
    private javax.swing.JButton btnComentarios;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnEncuestasRecibidas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnResponderEncuesta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerEncuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCodigoEncuesta;
    private javax.swing.JLabel lbDescripcionEncuesta;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFechaDeCreacion;
    private javax.swing.JLabel lbFotoPerfil;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbLogoJDM;
    private javax.swing.JLabel lbNombreEncuestador;
    private javax.swing.JLabel lbNombrePar;
    private javax.swing.JLabel lbTituloEncuesta;
    private javax.swing.JTable tblRecibidas;
    // End of variables declaration//GEN-END:variables
}
