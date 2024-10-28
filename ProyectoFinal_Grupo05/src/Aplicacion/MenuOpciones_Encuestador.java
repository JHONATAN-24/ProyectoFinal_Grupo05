/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;


/**
 *
 * @author user
 */
public class MenuOpciones_Encuestador extends javax.swing.JFrame {

    /**
     * Creates new form MenuOpciones_Encuestador
     */
    public MenuOpciones_Encuestador() {
        initComponents();
        mensajeFecha();
        mensajeHora();
        this.setTitle("JDM Surveys - Registros");
        this.setSize(940, 560);
        this.setLocationRelativeTo(null);
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
        String horaCompleta;
 
        // Obtener la hora y formatearla con ceros si es necesario
        hora = nuevocalendario.get(Calendar.HOUR_OF_DAY) > 9 
                        ? "" + nuevocalendario.get(Calendar.HOUR_OF_DAY) 
                        : "0" + nuevocalendario.get(Calendar.HOUR_OF_DAY);

        // Obtener los minutos y formatearlos con ceros si es necesario
        minutos = nuevocalendario.get(Calendar.MINUTE) > 9 
                        ? "" + nuevocalendario.get(Calendar.MINUTE) 
                        : "0" + nuevocalendario.get(Calendar.MINUTE);

        // Unir la hora, los minutos y los segundos en un formato "HH:mm:ss"
        horaCompleta = hora + ":" + minutos;

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
        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCrearEncuestas = new javax.swing.JButton();
        btnEncuestasGuardadas = new javax.swing.JButton();
        btnEncuestasPublicadas = new javax.swing.JButton();
        btnReportesEncuestas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Fecha = new javax.swing.JPanel();
        lbFecha = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        Contorno = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 560));

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        MenuOpciones.setBackground(new java.awt.Color(51, 153, 255));

        Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\menuOpciones_Icon.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JDM");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnInicio.setBackground(new java.awt.Color(102, 153, 255));
        btnInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\InicioIcon.png")); // NOI18N
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

        btnCrearEncuestas.setBackground(new java.awt.Color(102, 153, 255));
        btnCrearEncuestas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrearEncuestas.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearEncuestas.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\CrearEncuestas_Icon1.png")); // NOI18N
        btnCrearEncuestas.setText("Crear Encuestas");
        btnCrearEncuestas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCrearEncuestas.setBorderPainted(false);
        btnCrearEncuestas.setContentAreaFilled(false);
        btnCrearEncuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrearEncuestas.setIconTextGap(10);
        btnCrearEncuestas.setOpaque(true);

        btnEncuestasGuardadas.setBackground(new java.awt.Color(102, 153, 255));
        btnEncuestasGuardadas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEncuestasGuardadas.setForeground(new java.awt.Color(0, 0, 0));
        btnEncuestasGuardadas.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\EncuestasGuardadas.png")); // NOI18N
        btnEncuestasGuardadas.setText("Encuestas Guardadas");
        btnEncuestasGuardadas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEncuestasGuardadas.setBorderPainted(false);
        btnEncuestasGuardadas.setContentAreaFilled(false);
        btnEncuestasGuardadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasGuardadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEncuestasGuardadas.setIconTextGap(10);
        btnEncuestasGuardadas.setOpaque(true);

        btnEncuestasPublicadas.setBackground(new java.awt.Color(102, 153, 255));
        btnEncuestasPublicadas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEncuestasPublicadas.setForeground(new java.awt.Color(0, 0, 0));
        btnEncuestasPublicadas.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\EncuestasPublicadas.png")); // NOI18N
        btnEncuestasPublicadas.setText("Encuestas Publicadas");
        btnEncuestasPublicadas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEncuestasPublicadas.setBorderPainted(false);
        btnEncuestasPublicadas.setContentAreaFilled(false);
        btnEncuestasPublicadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncuestasPublicadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEncuestasPublicadas.setIconTextGap(10);
        btnEncuestasPublicadas.setOpaque(true);

        btnReportesEncuestas.setBackground(new java.awt.Color(102, 153, 255));
        btnReportesEncuestas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnReportesEncuestas.setForeground(new java.awt.Color(0, 0, 0));
        btnReportesEncuestas.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\ReportesEncuestas.png")); // NOI18N
        btnReportesEncuestas.setText("Reportes Encuestas");
        btnReportesEncuestas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReportesEncuestas.setBorderPainted(false);
        btnReportesEncuestas.setContentAreaFilled(false);
        btnReportesEncuestas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportesEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportesEncuestas.setIconTextGap(10);
        btnReportesEncuestas.setOpaque(true);

        btnSalir.setBackground(new java.awt.Color(102, 153, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\POO_PROYECTO\\ProyectoFinal_Grupo05\\ProyectoFinal_Grupo05\\src\\Iconos\\Salir.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(10);
        btnSalir.setOpaque(true);

        javax.swing.GroupLayout MenuOpcionesLayout = new javax.swing.GroupLayout(MenuOpciones);
        MenuOpciones.setLayout(MenuOpcionesLayout);
        MenuOpcionesLayout.setHorizontalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuOpcionesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCrearEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEncuestasGuardadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEncuestasPublicadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportesEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuOpcionesLayout.setVerticalGroup(
            MenuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpcionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncuestasGuardadas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncuestasPublicadas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportesEncuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Fecha.setBackground(new java.awt.Color(102, 153, 255));

        lbFecha.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(0, 0, 0));
        lbFecha.setText("{day}/{month}/{year}");

        jlHora.setBackground(new java.awt.Color(0, 0, 0));
        jlHora.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jlHora.setForeground(new java.awt.Color(0, 0, 0));
        jlHora.setText("{HH}:{mm}");

        javax.swing.GroupLayout FechaLayout = new javax.swing.GroupLayout(Fecha);
        Fecha.setLayout(FechaLayout);
        FechaLayout.setHorizontalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFecha)
                .addGap(18, 18, 18)
                .addComponent(jlHora)
                .addContainerGap())
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(jlHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContornoLayout = new javax.swing.GroupLayout(Contorno);
        Contorno.setLayout(ContornoLayout);
        ContornoLayout.setHorizontalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        ContornoLayout.setVerticalGroup(
            ContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
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
                        .addComponent(Contorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        panelInicial();
    }//GEN-LAST:event_btnInicioActionPerformed

    //Metodo para Impletar un Panel dentro de Otro
    public void panelInicial(){
        PanelInicio nuevoP = new PanelInicio();
            nuevoP.setSize(703,507); //Colocamos el tamaño de nuestro Jpanel
            nuevoP.setLocation(0,0);
            
            Contorno.removeAll();
            Contorno.add(nuevoP,BorderLayout.CENTER);
            Contorno.revalidate();
            Contorno.repaint();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones_Encuestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones_Encuestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones_Encuestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones_Encuestador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpciones_Encuestador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contorno;
    private javax.swing.JPanel Fecha;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel MenuOpciones;
    private javax.swing.JButton btnCrearEncuestas;
    private javax.swing.JButton btnEncuestasGuardadas;
    private javax.swing.JButton btnEncuestasPublicadas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnReportesEncuestas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel lbFecha;
    // End of variables declaration//GEN-END:variables
}
