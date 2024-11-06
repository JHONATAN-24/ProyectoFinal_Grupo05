
/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package Aplicacion;

import ArrayList.ListaEncuestadores;
import Clases.Encuestador;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class MenuEncuestador extends javax.swing.JFrame{
    
    ListaEncuestadores datosEn = new ListaEncuestadores();
    private Timer timer;
    private String nombreEncuestador;
    private String apellidoEncuestador;

    public MenuEncuestador(ListaEncuestadores datos1, String nombreEncuestador, String apellidoEncuestador) {
        initComponents();
        this.setTitle("JDM Surveys - MenuOpciones");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        // Guardar los datos
        this.datosEn = datos1;
        this.nombreEncuestador = nombreEncuestador;
        this.apellidoEncuestador = apellidoEncuestador;
        
        // Inicializar componentes
        iniciarReloj();
        mensajeFecha();
        mensajeHora();
        MostrarNombre();
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
    
    // METODO PARA MOSTRAR EL NOMBRE DE PERFIL EN LOS MENUS
    public void MostrarNombre(){
        jlbNombreE.setText(nombreEncuestador + " " + apellidoEncuestador);
    }

    private void iniciarReloj() {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mensajeHora();
            }
        });
        timer.start();
    }

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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        MenuOpciones = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnPublicadas = new javax.swing.JButton();
        btnReportesEncuestas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Contorno = new javax.swing.JPanel();
        Fecha = new javax.swing.JPanel();
        jlHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jlbNombreE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 580));
        setMinimumSize(new java.awt.Dimension(950, 580));
        setResizable(false);

        FondoBlanco.setBackground(new java.awt.Color(255, 204, 102));
        FondoBlanco.setMaximumSize(new java.awt.Dimension(950, 580));
        FondoBlanco.setMinimumSize(new java.awt.Dimension(950, 580));
        FondoBlanco.setPreferredSize(new java.awt.Dimension(950, 580));

        MenuOpciones.setBackground(new java.awt.Color(255, 255, 204));
        MenuOpciones.setMaximumSize(new java.awt.Dimension(224, 580));
        MenuOpciones.setMinimumSize(new java.awt.Dimension(224, 580));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo JDM Surveys (JPEG) (140px) (Fondo 0).png"))); // NOI18N

        btnInicio.setBackground(new java.awt.Color(255, 204, 102));
        btnInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inicio Menu.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(10);
        btnInicio.setOpaque(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(255, 204, 102));
        btnCrear.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Crear Menu.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrear.setIconTextGap(10);
        btnCrear.setOpaque(true);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnPublicadas.setBackground(new java.awt.Color(255, 204, 102));
        btnPublicadas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnPublicadas.setForeground(new java.awt.Color(0, 0, 0));
        btnPublicadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Publicadas Menu.png"))); // NOI18N
        btnPublicadas.setText("Publicadas");
        btnPublicadas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPublicadas.setBorderPainted(false);
        btnPublicadas.setContentAreaFilled(false);
        btnPublicadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublicadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPublicadas.setIconTextGap(10);
        btnPublicadas.setOpaque(true);
        btnPublicadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicadasActionPerformed(evt);
            }
        });

        btnReportesEncuestas.setBackground(new java.awt.Color(255, 204, 102));
        btnReportesEncuestas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnReportesEncuestas.setForeground(new java.awt.Color(0, 0, 0));
        btnReportesEncuestas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Reportes Menu.png"))); // NOI18N
        btnReportesEncuestas.setText("Resultados");
        btnReportesEncuestas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReportesEncuestas.setBorderPainted(false);
        btnReportesEncuestas.setContentAreaFilled(false);
        btnReportesEncuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportesEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportesEncuestas.setIconTextGap(10);
        btnReportesEncuestas.setOpaque(true);
        btnReportesEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesEncuestasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 204, 102));
        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir Menu.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(10);
        btnSalir.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Cabin Sketch", 2, 48)); // NOI18N
        jLabel4.setText("JDM ");

        javax.swing.GroupLayout MenuOpcionesLayout = new javax.swing.GroupLayout(MenuOpciones);
        MenuOpciones.setLayout(MenuOpcionesLayout);
        MenuOpcionesLayout.setHorizontalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPublicadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportesEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MenuOpcionesLayout.setVerticalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPublicadas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportesEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        Contorno.setBackground(new java.awt.Color(255, 255, 153));
        Contorno.setForeground(new java.awt.Color(0, 0, 0));
        Contorno.setMaximumSize(new java.awt.Dimension(700, 500));
        Contorno.setMinimumSize(new java.awt.Dimension(700, 500));
        Contorno.setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout ContornoLayout = new javax.swing.GroupLayout(Contorno);
        Contorno.setLayout(ContornoLayout);
        ContornoLayout.setHorizontalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        ContornoLayout.setVerticalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Fecha.setBackground(new java.awt.Color(255, 204, 204));
        Fecha.setMaximumSize(new java.awt.Dimension(200, 40));
        Fecha.setMinimumSize(new java.awt.Dimension(200, 40));
        Fecha.setPreferredSize(new java.awt.Dimension(200, 40));

        jlHora.setBackground(new java.awt.Color(255, 255, 255));
        jlHora.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jlHora.setForeground(new java.awt.Color(0, 0, 0));
        jlHora.setText("{HH}:{mm}");

        lbFecha.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(0, 0, 0));
        lbFecha.setText("{day}/{month}/{year}");

        javax.swing.GroupLayout FechaLayout = new javax.swing.GroupLayout(Fecha);
        Fecha.setLayout(FechaLayout);
        FechaLayout.setHorizontalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jlHora)
                .addContainerGap())
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FechaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(jlHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jlbNombreE.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jlbNombreE.setText("Nombre Persona");
        jlbNombreE.setPreferredSize(new java.awt.Dimension(100, 20));

        jLabel1.setText("ICONO");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(MenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(MenuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        panelPlantilas();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnPublicadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicadasActionPerformed
        panelEncuestas();
    }//GEN-LAST:event_btnPublicadasActionPerformed

    private void btnReportesEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesEncuestasActionPerformed
        panelReportes();
    }//GEN-LAST:event_btnReportesEncuestasActionPerformed

    //Metodo para Impletar un Panel dentro de Otro
    public void panelInicial(){
        PanelBienvenidaE pInicio = new PanelBienvenidaE();
            pInicio.setSize(700,500); //Colocamos el tamaño de nuestro Jpanel
            pInicio.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pInicio,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    public void panelPlantilas(){
        CrearEncuestas pPlantillas = new CrearEncuestas();
            pPlantillas.setSize(700,500); //Colocamos el tamaño de nuestro Jpanel
            pPlantillas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(pPlantillas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    public void panelEncuestas(){
        EncuestasEnviadas eEnviadas = new EncuestasEnviadas();
            eEnviadas.setSize(700,500); //Colocamos el tamaño de nuestro Jpanel
            eEnviadas.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(eEnviadas,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    
    public void panelReportes(){
        ReportesEncuestas eReportes = new ReportesEncuestas();
            eReportes.setSize(700,500); //Colocamos el tamaño de nuestro Jpanel
            eReportes.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(eReportes,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contorno;
    private javax.swing.JPanel Fecha;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel MenuOpciones;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPublicadas;
    private javax.swing.JButton btnReportesEncuestas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlbNombreE;
    private javax.swing.JLabel lbFecha;
    // End of variables declaration//GEN-END:variables
}
