
package T_Aplicacion;

import T_ArrayList.ListaParticipantes;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class MenuParticipante extends javax.swing.JFrame {
    
    ListaParticipantes T_listaP3 = new ListaParticipantes();
    private Timer timer;
    private String nombreParticipante;
    private String apellidoParticipante;
    
    public MenuParticipante(ListaParticipantes participante, String nombreParticipante ,String apellidoParticipante) {
        
        this.setTitle("JDM Surveys - MenuOpciones");
        this.setSize(940, 580);
        this.setLocationRelativeTo(null);
        
        T_listaP3 = participante;
        this.nombreParticipante = nombreParticipante;
        this.apellidoParticipante = apellidoParticipante;
        
        initComponents();
        MostrarNombre();
        iniciarReloj();
        mensajeFecha();
        mensajeHora();

    }
    
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
    
    private void iniciarReloj() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mensajeHora();
            }
        });
        timer.start();
    }
    
    public void MostrarNombre(){
        lbNombrePar.setText(nombreParticipante + " " + apellidoParticipante);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        MenuOpciones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnEncuestasRecibidas = new javax.swing.JButton();
        btnEncuestasRespondidas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbLogoOso2D = new javax.swing.JLabel();
        lbLogoJDM = new javax.swing.JLabel();
        Contorno = new javax.swing.JPanel();
        jPcontorno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbIconoBienvenido = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JPanel();
        lbHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbNombrePar = new javax.swing.JLabel();
        lbFotoPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 500));
        setResizable(false);

        FondoBlanco.setBackground(new java.awt.Color(255, 204, 102));
        FondoBlanco.setMaximumSize(new java.awt.Dimension(950, 500));
        FondoBlanco.setMinimumSize(new java.awt.Dimension(950, 500));
        FondoBlanco.setPreferredSize(new java.awt.Dimension(950, 500));

        MenuOpciones.setBackground(new java.awt.Color(255, 255, 204));
        MenuOpciones.setMaximumSize(new java.awt.Dimension(192, 500));
        MenuOpciones.setMinimumSize(new java.awt.Dimension(192, 500));
        MenuOpciones.setPreferredSize(new java.awt.Dimension(192, 500));

        btnInicio.setBackground(new java.awt.Color(255, 204, 102));
        btnInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(10);
        btnInicio.setMaximumSize(new java.awt.Dimension(150, 30));
        btnInicio.setMinimumSize(new java.awt.Dimension(150, 30));
        btnInicio.setOpaque(true);
        btnInicio.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnEncuestasRecibidas.setBackground(new java.awt.Color(255, 204, 102));
        btnEncuestasRecibidas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnEncuestasRecibidas.setText("Recibidas");
        btnEncuestasRecibidas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEncuestasRecibidas.setBorderPainted(false);
        btnEncuestasRecibidas.setContentAreaFilled(false);
        btnEncuestasRecibidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasRecibidas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEncuestasRecibidas.setIconTextGap(10);
        btnEncuestasRecibidas.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEncuestasRecibidas.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEncuestasRecibidas.setOpaque(true);
        btnEncuestasRecibidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestasRecibidasActionPerformed(evt);
            }
        });

        btnEncuestasRespondidas.setBackground(new java.awt.Color(255, 204, 102));
        btnEncuestasRespondidas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnEncuestasRespondidas.setText("Respondidas");
        btnEncuestasRespondidas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEncuestasRespondidas.setBorderPainted(false);
        btnEncuestasRespondidas.setContentAreaFilled(false);
        btnEncuestasRespondidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasRespondidas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEncuestasRespondidas.setIconTextGap(10);
        btnEncuestasRespondidas.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEncuestasRespondidas.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEncuestasRespondidas.setOpaque(true);
        btnEncuestasRespondidas.setPreferredSize(new java.awt.Dimension(150, 30));

        btnSalir.setBackground(new java.awt.Color(255, 204, 102));
        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(10);
        btnSalir.setMaximumSize(new java.awt.Dimension(150, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(150, 30));
        btnSalir.setOpaque(true);
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 30));

        lbLogoOso2D.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Surveys 2D (Color) (180 px).png")); // NOI18N

        lbLogoJDM.setFont(new java.awt.Font("Cabin Sketch", 2, 48)); // NOI18N
        lbLogoJDM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\JDM Logo Letras (Fondo 0) (90-60 px).png")); // NOI18N
        lbLogoJDM.setMaximumSize(new java.awt.Dimension(180, 60));
        lbLogoJDM.setMinimumSize(new java.awt.Dimension(180, 60));

        javax.swing.GroupLayout MenuOpcionesLayout = new javax.swing.GroupLayout(MenuOpciones);
        MenuOpciones.setLayout(MenuOpcionesLayout);
        MenuOpcionesLayout.setHorizontalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogoOso2D))
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEncuestasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEncuestasRespondidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbLogoJDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuOpcionesLayout.setVerticalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogoOso2D)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogoJDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncuestasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncuestasRespondidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        Contorno.setBackground(new java.awt.Color(255, 255, 153));
        Contorno.setMaximumSize(new java.awt.Dimension(745, 420));
        Contorno.setMinimumSize(new java.awt.Dimension(745, 420));
        Contorno.setPreferredSize(new java.awt.Dimension(745, 420));

        jPcontorno.setBackground(new java.awt.Color(255, 255, 255));
        jPcontorno.setMaximumSize(new java.awt.Dimension(745, 420));
        jPcontorno.setMinimumSize(new java.awt.Dimension(745, 420));
        jPcontorno.setPreferredSize(new java.awt.Dimension(745, 420));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setText("¡Bienvenido a JDM Surveys! ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel3.setText("Aquí, tu imaginación no tiene límites. ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel5.setText("Diseña encuestas únicas y personalizadas para cualquier propósito: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel6.setText("investigaciones académicas, evaluaciones empresariales, opiniones");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel7.setText("personales o simple diversión. ¡Tú decides! ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel8.setText("Con JDM Surveys podrás:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel9.setText("· Crea encuestas a tu gusto con preguntas personalizadas");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel10.setText("· Publícalas para que tus participantes las respondan");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel11.setText("· Ver las respuestas de los participantes");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel12.setText("Nuestra plataforma se adapta tanto a encuestas informativas ");

        lbIconoBienvenido.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\IconInicioPanel.png")); // NOI18N

        javax.swing.GroupLayout jPcontornoLayout = new javax.swing.GroupLayout(jPcontorno);
        jPcontorno.setLayout(jPcontornoLayout);
        jPcontornoLayout.setHorizontalGroup(
            jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontornoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcontornoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85))
                            .addGroup(jPcontornoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(125, 125, 125)))
                        .addGap(257, 257, 257))
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addGap(411, 411, 411))
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPcontornoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbIconoBienvenido)
                        .addContainerGap())))
        );
        jPcontornoLayout.setVerticalGroup(
            jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontornoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcontornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontornoLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(687, 687, 687))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontornoLayout.createSequentialGroup()
                        .addComponent(lbIconoBienvenido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout ContornoLayout = new javax.swing.GroupLayout(Contorno);
        Contorno.setLayout(ContornoLayout);
        ContornoLayout.setHorizontalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContornoLayout.createSequentialGroup()
                    .addComponent(jPcontorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 107, Short.MAX_VALUE)))
        );
        ContornoLayout.setVerticalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContornoLayout.createSequentialGroup()
                    .addComponent(jPcontorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );

        Fecha1.setBackground(new java.awt.Color(255, 204, 204));
        Fecha1.setMaximumSize(new java.awt.Dimension(200, 40));
        Fecha1.setMinimumSize(new java.awt.Dimension(200, 40));

        lbHora.setBackground(new java.awt.Color(255, 255, 255));
        lbHora.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lbHora.setText("{HH}:{mm}");

        lbFecha.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lbFecha.setText("{day}/{month}/{year}");

        javax.swing.GroupLayout Fecha1Layout = new javax.swing.GroupLayout(Fecha1);
        Fecha1.setLayout(Fecha1Layout);
        Fecha1Layout.setHorizontalGroup(
            Fecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fecha1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHora)
                .addGap(16, 16, 16))
        );
        Fecha1Layout.setVerticalGroup(
            Fecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fecha1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Fecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbNombrePar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbNombrePar.setText("Nombre Persona");
        lbNombrePar.setPreferredSize(new java.awt.Dimension(100, 20));

        lbFotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Proyecto\\Oso JDM Usuario BW (Fondo 0) (50px).png")); // NOI18N

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
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoBlancoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbFotoPerfil)))
                        .addGap(12, 12, 12))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbNombrePar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicial();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEncuestasRecibidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestasRecibidasActionPerformed
        panelRecibidas();
    }//GEN-LAST:event_btnEncuestasRecibidasActionPerformed

    //Metodo para Impletar un Panel dentro de Otro
    public void panelInicial(){
        PanelBienvenidaE pInicio = new PanelBienvenidaE();
            pInicio.setSize(745,420); //Colocamos el tamaño de nuestro Jpanel
            pInicio.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pInicio,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    public void panelRecibidas(){
        EncuestasRecibidas pPlantillas = new EncuestasRecibidas();
            pPlantillas.setSize(745,420); //Colocamos el tamaño de nuestro Jpanel
            pPlantillas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pPlantillas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contorno;
    private javax.swing.JPanel Fecha1;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JPanel MenuOpciones;
    private javax.swing.JButton btnEncuestasRecibidas;
    private javax.swing.JButton btnEncuestasRespondidas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPcontorno;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFotoPerfil;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbIconoBienvenido;
    private javax.swing.JLabel lbLogoJDM;
    private javax.swing.JLabel lbLogoOso2D;
    private javax.swing.JLabel lbNombrePar;
    // End of variables declaration//GEN-END:variables
}
