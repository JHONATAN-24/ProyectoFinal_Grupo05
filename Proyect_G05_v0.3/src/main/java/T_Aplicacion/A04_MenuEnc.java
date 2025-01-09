
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_Aplicacion;

import T_ArrayList.ListaEncuestadores;
import T_Clases.Encuesta;
import T_ConexionBD.CRUDJavaEn;
import T_ConexionBD.ConexionSQLServer;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class A04_MenuEnc extends javax.swing.JFrame {
    // INSTANCIA DE LA CLASE ListaEncuestadores:________________________________
    ListaEncuestadores T_listaEnc4 = new ListaEncuestadores();
    
    // VARIABLE Timer DEL PAQUETE javax.swing.Timer:____________________________
    private Timer timer;
    
    // VARIABLES PARA LA CLASE Encuestador:_____________________________________
    private String codigoEncuestador;
    private String nombreEncuestador;
    private String apellidoEncuestador;
    private String genero;
    private String fechaNacimiento;
    
    public A04_MenuEnc(
    // PARAMETROS DEL CONSTRUCTOR:______________________________________________
            ListaEncuestadores encuestador, 
            String codigoEncuestador,                        
            String nombreEncuestador, 
            String apellidoEncuestador,                         
            String genero, 
            String fechaNacimiento
    ){
    
    // PROPIEDADES DE LA VENTANA:_______________________________________________     
        this.setTitle("JDM Surveys - MenuOpciones");
        this.setSize(975, 580);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    // IGUALANDO LAS VARIBLES CON LOS PARAMETROS DEL CONSTRUCTOR:_______________
        this.T_listaEnc4 = encuestador;
        this.codigoEncuestador = codigoEncuestador;
        this.nombreEncuestador = nombreEncuestador;
        this.apellidoEncuestador = apellidoEncuestador;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    
    // INICIALIZAR LOS COMPONENTES:_____________________________________________
        initComponents();
        iniciarReloj();
        mensajeFecha();
        mensajeHora();
        MostrarNombre();
        listarEncuestas();
    
    // IMPRIMIR EL CODIGO DEL ENCUESTADOR AL ABRIR LA VENTANA:__________________
        System.out.println(codigoEncuestador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        MenuOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCrearEncuesta = new javax.swing.JButton();
        btnEncuestasPublicadas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCuenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnComentarios = new javax.swing.JButton();
        Contorno = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEncuestaAbierta = new javax.swing.JButton();
        btnEncuestaMixta = new javax.swing.JButton();
        btnEncuestaCerrada = new javax.swing.JButton();
        btnEncuestaEnBlanco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEncuestas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbFotoPerfil = new javax.swing.JLabel();
        lbNombreEnc = new javax.swing.JLabel();
        Fecha = new javax.swing.JPanel();
        jlHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(255, 255, 153));
        PanelFondo.setMaximumSize(new java.awt.Dimension(960, 540));
        PanelFondo.setMinimumSize(new java.awt.Dimension(960, 540));
        PanelFondo.setPreferredSize(new java.awt.Dimension(960, 540));

        MenuOpciones.setBackground(new java.awt.Color(255, 204, 102));
        MenuOpciones.setMaximumSize(new java.awt.Dimension(102, 540));
        MenuOpciones.setMinimumSize(new java.awt.Dimension(102, 540));
        MenuOpciones.setPreferredSize(new java.awt.Dimension(102, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\JDM Logo Letras (Fondo 0) (90-60 px).png")); // NOI18N

        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono inicio (Fondo 0)(50px).png")); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setMaximumSize(new java.awt.Dimension(90, 80));
        btnInicio.setMinimumSize(new java.awt.Dimension(90, 80));
        btnInicio.setPreferredSize(new java.awt.Dimension(90, 80));
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCrearEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearEncuesta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Crear Encuesta (Fondo 0)(50px).png")); // NOI18N
        btnCrearEncuesta.setText("Crear");
        btnCrearEncuesta.setBorder(null);
        btnCrearEncuesta.setContentAreaFilled(false);
        btnCrearEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearEncuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearEncuesta.setMaximumSize(new java.awt.Dimension(90, 80));
        btnCrearEncuesta.setMinimumSize(new java.awt.Dimension(90, 80));
        btnCrearEncuesta.setPreferredSize(new java.awt.Dimension(90, 80));
        btnCrearEncuesta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEncuestaActionPerformed(evt);
            }
        });

        btnEncuestasPublicadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEncuestasPublicadas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Publicadas (Fondo 0)(50px).png")); // NOI18N
        btnEncuestasPublicadas.setText("Publicadas");
        btnEncuestasPublicadas.setBorder(null);
        btnEncuestasPublicadas.setContentAreaFilled(false);
        btnEncuestasPublicadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasPublicadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestasPublicadas.setMaximumSize(new java.awt.Dimension(90, 80));
        btnEncuestasPublicadas.setMinimumSize(new java.awt.Dimension(90, 80));
        btnEncuestasPublicadas.setPreferredSize(new java.awt.Dimension(90, 80));
        btnEncuestasPublicadas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestasPublicadas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestasPublicadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestasPublicadasActionPerformed(evt);
            }
        });

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

        btnComentarios.setText("Comentarios");
        btnComentarios.setBorder(null);
        btnComentarios.setContentAreaFilled(false);
        btnComentarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComentarios.setIconTextGap(0);
        btnComentarios.setMaximumSize(new java.awt.Dimension(90, 16));
        btnComentarios.setMinimumSize(new java.awt.Dimension(90, 16));
        btnComentarios.setPreferredSize(new java.awt.Dimension(90, 16));
        btnComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuOpcionesLayout = new javax.swing.GroupLayout(MenuOpciones);
        MenuOpciones.setLayout(MenuOpcionesLayout);
        MenuOpcionesLayout.setHorizontalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEncuestasPublicadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuOpcionesLayout.setVerticalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncuestasPublicadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
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

        Fondo.setBackground(new java.awt.Color(255, 255, 153));
        Fondo.setMaximumSize(new java.awt.Dimension(846, 472));
        Fondo.setMinimumSize(new java.awt.Dimension(846, 472));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear una encuesta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(660, 220));
        jPanel2.setMinimumSize(new java.awt.Dimension(660, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(806, 210));

        btnEncuestaAbierta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaAbierta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaAbierta (100px).png")); // NOI18N
        btnEncuestaAbierta.setText("Tipo Abierta");
        btnEncuestaAbierta.setBorder(null);
        btnEncuestaAbierta.setContentAreaFilled(false);
        btnEncuestaAbierta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaAbierta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaAbierta.setIconTextGap(0);
        btnEncuestaAbierta.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaAbierta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaAbierta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaAbierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaAbiertaActionPerformed(evt);
            }
        });

        btnEncuestaMixta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaMixta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaMixta (100px).png")); // NOI18N
        btnEncuestaMixta.setText("Tipo Mixta");
        btnEncuestaMixta.setBorder(null);
        btnEncuestaMixta.setContentAreaFilled(false);
        btnEncuestaMixta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaMixta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaMixta.setIconTextGap(0);
        btnEncuestaMixta.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaMixta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaMixta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaMixta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaMixtaActionPerformed(evt);
            }
        });

        btnEncuestaCerrada.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaCerrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\EncuestaCerrada (100px).png")); // NOI18N
        btnEncuestaCerrada.setText("Tipo Cerrada");
        btnEncuestaCerrada.setBorder(null);
        btnEncuestaCerrada.setContentAreaFilled(false);
        btnEncuestaCerrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaCerrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaCerrada.setIconTextGap(0);
        btnEncuestaCerrada.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaCerrada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaCerrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaCerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaCerradaActionPerformed(evt);
            }
        });

        btnEncuestaEnBlanco.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEncuestaEnBlanco.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Icono Encuesta en Banco (Fondo 0)(100px).png")); // NOI18N
        btnEncuestaEnBlanco.setText("En Blanco");
        btnEncuestaEnBlanco.setBorder(null);
        btnEncuestaEnBlanco.setContentAreaFilled(false);
        btnEncuestaEnBlanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestaEnBlanco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncuestaEnBlanco.setMaximumSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setMinimumSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setPreferredSize(new java.awt.Dimension(112, 130));
        btnEncuestaEnBlanco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEncuestaEnBlanco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEncuestaEnBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestaEnBlancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaEnBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncuestaEnBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaCerrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaMixta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncuestaAbierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(834, 217));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(834, 217));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(834, 217));

        tblListaEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripción", "Tipo", "Fecha de creación", "Fecha de cierre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaEncuestas.setMaximumSize(new java.awt.Dimension(834, 500));
        tblListaEncuestas.setMinimumSize(new java.awt.Dimension(834, 500));
        tblListaEncuestas.setPreferredSize(new java.awt.Dimension(834, 500));
        jScrollPane1.setViewportView(tblListaEncuestas);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Encuestas recientes");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContornoLayout = new javax.swing.GroupLayout(Contorno);
        Contorno.setLayout(ContornoLayout);
        ContornoLayout.setHorizontalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContornoLayout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContornoLayout.setVerticalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContornoLayout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbFotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Usuario BW (Fondo 0) (50px).png")); // NOI18N

        lbNombreEnc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreEnc.setText("Nombre Persona");
        lbNombreEnc.setMaximumSize(new java.awt.Dimension(200, 20));
        lbNombreEnc.setMinimumSize(new java.awt.Dimension(200, 20));
        lbNombreEnc.setPreferredSize(new java.awt.Dimension(200, 20));

        Fecha.setBackground(new java.awt.Color(255, 153, 153));
        Fecha.setMaximumSize(new java.awt.Dimension(200, 30));
        Fecha.setMinimumSize(new java.awt.Dimension(200, 30));
        Fecha.setPreferredSize(new java.awt.Dimension(200, 30));

        jlHora.setBackground(new java.awt.Color(255, 255, 255));
        jlHora.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlHora.setText("{HH}:{mm}");
        jlHora.setMaximumSize(new java.awt.Dimension(72, 18));
        jlHora.setMinimumSize(new java.awt.Dimension(72, 18));
        jlHora.setPreferredSize(new java.awt.Dimension(72, 18));

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
                .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(lbFotoPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombreEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Contorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombreEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFotoPerfil)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicial();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCrearEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEncuestaActionPerformed
        panelPlantillas();
    }//GEN-LAST:event_btnCrearEncuestaActionPerformed

    private void btnEncuestasPublicadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestasPublicadasActionPerformed
        panelEncuestas();
    }//GEN-LAST:event_btnEncuestasPublicadasActionPerformed

    private void btnEncuestaAbiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaAbiertaActionPerformed
        
        C01_EncTipoAbierta T_TipoAbierta = new C01_EncTipoAbierta(
                T_listaEnc4, 
                codigoEncuestador, 
                nombreEncuestador, 
                apellidoEncuestador, 
                genero, 
                fechaNacimiento
        );
        T_TipoAbierta.setVisible(true);
        T_TipoAbierta.setSize(965, 540);
        
    }//GEN-LAST:event_btnEncuestaAbiertaActionPerformed

    private void btnEncuestaMixtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaMixtaActionPerformed
        
        C03_EncTipoMixta T_TipoMixta = new C03_EncTipoMixta(
                T_listaEnc4, 
                codigoEncuestador, 
                nombreEncuestador, 
                apellidoEncuestador, 
                genero, 
                fechaNacimiento
        );
        T_TipoMixta.setVisible(true);
        T_TipoMixta.setSize(965, 540);
        
    }//GEN-LAST:event_btnEncuestaMixtaActionPerformed

    private void btnEncuestaCerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaCerradaActionPerformed
        
        C02_EncTipoCerrada T_TipoCerrada = new C02_EncTipoCerrada(
                T_listaEnc4, 
                codigoEncuestador, 
                nombreEncuestador, 
                apellidoEncuestador, 
                genero, 
                fechaNacimiento
        );
        T_TipoCerrada.setVisible(true);
        T_TipoCerrada.setSize(965, 540);
        
    }//GEN-LAST:event_btnEncuestaCerradaActionPerformed

    private void btnEncuestaEnBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestaEnBlancoActionPerformed
        // FALTA PLANTILLA
    }//GEN-LAST:event_btnEncuestaEnBlancoActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        A05_CuentasEnc panelCuenta = new A05_CuentasEnc(
                T_listaEnc4, 
                codigoEncuestador, 
                nombreEncuestador, 
                apellidoEncuestador, 
                genero, 
                fechaNacimiento
        );
        panelCuenta.setVisible(true);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        A02_Login T_login = new A02_Login();
            T_login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentariosActionPerformed
        A06_ComentariosEnc panelComentarios = new A06_ComentariosEnc(
                T_listaEnc4, 
                codigoEncuestador, 
                nombreEncuestador, 
                apellidoEncuestador, 
                genero, 
                fechaNacimiento
        );
        panelComentarios.setVisible(true);
    }//GEN-LAST:event_btnComentariosActionPerformed
    
    // METODO PARA MOSTRAR EL NOMBRE:___________________________________________
    public void MostrarNombre(){
        lbNombreEnc.setText(nombreEncuestador + " " + apellidoEncuestador);
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
    public void mensajeHora() {
        Calendar nuevocalendario = new GregorianCalendar();
        Date horaActual = new Date();
        nuevocalendario.setTime(horaActual);

        String hora, minutos, segundos, horaCompleta;

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
        jlHora.setText(horaCompleta);
    }

    // METODO PARA MOSTRAR EL PANEL INICIAL:____________________________________
    public void panelInicial(){
        B01_InicioEnc pInicio = new B01_InicioEnc();
            pInicio.setSize(846,472); //Colocamos el tamaño de nuestro Jpanel
            pInicio.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pInicio,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    // METODO PARA MOSTRAR EL PANEL DE CREAR ENCUESTAS:_________________________
    public void panelPlantillas(){
        B02_CrearEncuestas pPlantillas = new B02_CrearEncuestas(this, T_listaEnc4, codigoEncuestador, nombreEncuestador, apellidoEncuestador);
            pPlantillas.setSize(846,472); //Colocamos el tamaño de nuestro Jpanel
            pPlantillas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pPlantillas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    // METODO PARA MOSTRAR EL PANEL DE ENCUESTAS CREADAS:_______________________
    public void panelEncuestas(){
        B03_Recientes pEnviadas = new B03_Recientes(T_listaEnc4, codigoEncuestador);
            pEnviadas.setSize(846,472); //Colocamos el tamaño de nuestro Jpanel
            pEnviadas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pEnviadas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    // METODO PARA MOSTRAR EL PANEL DE ENCUESTAS RESPONDIDAS:___________________
    public void panelResultados(){
        B05_Resultados pReportes = new B05_Resultados(T_listaEnc4, codigoEncuestador);
            pReportes.setSize(846,472); //Colocamos el tamaño de nuestro Jpanel
            pReportes.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pReportes,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    // METODO PARA LISTAR LAS ENCUESTAS EN UNA TABLA:___________________________
    public void listarEncuestas(){
        try{
        // Obtener el modelo de la tabla
        DefaultTableModel dtm = (DefaultTableModel) tblListaEncuestas.getModel();
        while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla
     
        // Usar getInstance() para obtener la conexión
        Connection conexion = ConexionSQLServer.getInstance().getConnection(); 

        CRUDJavaEn crud = new CRUDJavaEn();
        List<Encuesta> lista = crud.obtenerListaEncuesta(conexion);
        
            for (Encuesta e : lista) {
                Object[] rowData = {
                  e.getTitulo(),
                  e.getDescripción(),
                  e.getTipoEncuesta(),
                  e.getFechaCreacion(),
                  e.getFechaCierre()
                };
                dtm.addRow(rowData);
            }
           
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contorno;
    private javax.swing.JPanel Fecha;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel MenuOpciones;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btnComentarios;
    private javax.swing.JButton btnCrearEncuesta;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnEncuestaAbierta;
    private javax.swing.JButton btnEncuestaCerrada;
    private javax.swing.JButton btnEncuestaEnBlanco;
    private javax.swing.JButton btnEncuestaMixta;
    private javax.swing.JButton btnEncuestasPublicadas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFotoPerfil;
    private javax.swing.JLabel lbNombreEnc;
    private javax.swing.JTable tblListaEncuestas;
    // End of variables declaration//GEN-END:variables
}
