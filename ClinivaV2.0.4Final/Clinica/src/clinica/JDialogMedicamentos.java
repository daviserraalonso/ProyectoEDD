
package clinica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JDialogMedicamentos {

    private Connection conexion;
    private JDialog jdMedicamentos;
    private MySQL mysql;
    private JLabel jbMedicamento = new JLabel("Medicamento");
    private JLabel jbPeriodicidad = new JLabel("Periodicidad");
    private JLabel jbTomas = new JLabel("Tomas");

    private JTextField tfMedicamentos = new JTextField();
    private JTextField tfPeriodicidad = new JTextField();
    private JTextField tfTomas = new JTextField();

    private JButton btGuardar;
    private JButton btImprimir;

    private Image imagenLogo = new ImageIcon("src\\images\\logo.png").getImage();
    private Image imagenTijera = new ImageIcon("src\\images\\tijera.jpg").getImage();
    Font fuente = new Font("Times New Roman", Font.TRUETYPE_FONT, 17);
    Font fuenteTitulos = new Font("Times New Roman", Font.BOLD, 24);
    Font fuenteFirma = new Font("Times New Roman", Font.BOLD, 20);
    Font fuenteDoctor = new Font("Times New Roman", Font.TRUETYPE_FONT, 20);
    Font fuentePie = new Font("Times New Roman", Font.ITALIC, 24);
    Calendar c1 = Calendar.getInstance();
    int x = 40;
    int y = -60;

    String ApeDoc;
    String especialidad;
    String nombre;
    String apellido1;
    String apellido2;
    String DNI;

    public JDialogMedicamentos(String ApeDoc, String DocEspecialidad, String nombre, String apellido1, String apellido2, String nus, Connection conexion, MySQL mysql) {
        
        
        this.mysql = mysql;
        this.conexion = conexion;
        this.ApeDoc = ApeDoc;
        this.especialidad = DocEspecialidad;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
        
        jdMedicamentos = new JDialog();
        jdMedicamentos.setLayout(null);
        
        jdMedicamentos.add(jbMedicamento);
        jbMedicamento.setBounds(10, 40, 100, 50);
        jdMedicamentos.add(jbPeriodicidad);
        jbPeriodicidad.setBounds(10, 80, 100, 50);
        jdMedicamentos.add(jbTomas);
        jbTomas.setBounds(10, 120, 100, 50);

        jdMedicamentos.add(tfMedicamentos);
        tfMedicamentos.setBounds(110, 55, 150, 20);
        jdMedicamentos.add(tfPeriodicidad);
        tfPeriodicidad.setBounds(110, 95, 150, 20);
        jdMedicamentos.add(tfTomas);
        tfTomas.setBounds(100, 135, 150, 20);
        
        jdMedicamentos.setLocationRelativeTo(null);
        
        btGuardar = new JButton("Guardar");
        btImprimir = new JButton("Imprimir");
        

        jdMedicamentos.add(btGuardar);
        btGuardar.setBounds(50, 230, 90, 30);
        
        jdMedicamentos.add(btImprimir);
        btImprimir.setBounds(170, 230, 90, 30); 
        
        btGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PreparedStatement prepared;
                ResultSet rs = mysql.ejecutaConsulta("SELECT * FROM medico");

                int medicamento = 0;
                int idMedico = 0;
                int paciente = 0;
                Date fechaReceta = null;
                
                medicamento = Integer.valueOf(tfMedicamentos.getText());
                try {
                    
                    while(rs.next()){
                        idMedico = rs.getInt(1);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(JDialogMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                }
                paciente = Integer.parseInt(nus);
                fechaReceta = Date.valueOf(LocalDate.now());
                
                try {

                    prepared = mysql.getConexion().prepareStatement("INSERT INTO receta (idMedicamento, idMedico, Paciente, fecha_receta)"
                            + " VALUES(?,?,?,?)");

                    // Parámetros para el preparedStatement
                    prepared.setInt(1, medicamento);
                    prepared.setInt(2, idMedico);
                    prepared.setInt(3, paciente);
                    prepared.setDate(4, fechaReceta);

                    JOptionPane.showMessageDialog(null, "Receta insertada Correctamente");

                    // llemada al métdo ejecuta update el cual actualiza
                    prepared.executeUpdate();
                    prepared.close();
                    
                    IOFicheros.escribeFichero("Receta.txt", tfMedicamentos.getText() + "\n" + tfPeriodicidad.getText() + "\n" + tfTomas.getText());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(JDialogMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                btImprimir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    /*
                    Tenemos que crear un job que es el que será enviado a la impresora seleccionada
                    Establecemos que sea imprimible y pasamos como parámetro nuestra clase interna
                    Seleccionamos el dialogo de impresion por último imprimimos */
                        
                        try {
                            PrinterJob job = PrinterJob.getPrinterJob();
                            PageFormat pf = job.defaultPage();
                            Paper paper = new Paper();

                            job.setPrintable(new miPrintable(), pf);
                            job.printDialog();
                            job.print();
                        } catch (PrinterException ex) {
                            Logger.getLogger(JDialogMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }); 
            jdMedicamentos.pack();
            }
        });
        
        
        jdMedicamentos.setSize(400, 500);
        jdMedicamentos.setVisible(true);
        
    }

 
    public class miPrintable implements Printable {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            String cadena = "";
            if (pageIndex == 0) {
                Graphics2D g2d = (Graphics2D) graphics;

                //Punto donde empezará a imprimir dentro la pagina (100, 50)
                g2d.translate(pageFormat.getImageableX() + 50,
                        pageFormat.getImageableY() + 70);
                
                g2d.scale(0.50, 0.50); //Reducción de la impresión al 50%
                //Líneas información paciente
                g2d.drawLine(410, -100, 800, -100);
                g2d.drawLine(410, -100, 410, 70);
                g2d.drawLine(800, -100, 800, 70);
                g2d.drawLine(410, 70, 800, 70);
                //Líneas información prescripcion
                g2d.drawLine(20, 190, 780, 190);
                g2d.drawLine(20, 190, 20, 395);
                g2d.drawLine(780, 190, 780, 395);
                g2d.drawLine(20, 395, 780, 395);
                //Líneas firma y sello
                g2d.drawLine(590, 202, 770, 202);
                g2d.drawLine(590, 202, 590, 383);
                g2d.drawLine(770, 202, 770, 383);
                g2d.drawLine(590, 383, 770, 383);
                //Lineas tijeras
                  for (int i = 0; i < 24; i++) {
                    g2d.drawLine(-60+x*i, 523, -40+x*i, 523);
                }
                //Información doctor
                g2d.setFont(fuenteDoctor);
                g2d.drawString("Doctor "+ApeDoc, 425, -70);
                g2d.drawString("Especialidad "+especialidad, 425, -50);
                g2d.setFont(fuente);
                g2d.drawImage(imagenLogo, -100, -150, null);
                g2d.drawString("Fecha: "+c1.get(Calendar.DATE)+"/"+c1.get(Calendar.MONTH)+"/"+c1.get(Calendar.YEAR), 425,-20);
                g2d.drawString("Nombre del paciente: "+nombre, 425,00);
                g2d.drawString("Apellidos del paciente: "+apellido1+" "+apellido2, 425,20);
                g2d.drawString("DNI: "+DNI, 425,40);
                //Cada salto de línea de 20 en 20 o de 30 en 30
                g2d.drawString("• Medicamento:", 60,255);
                g2d.drawString(tfMedicamentos.getText(), 70,275);
                g2d.drawString("• Periocidad:", 60,300);
                g2d.drawString(tfPeriodicidad.getText(), 70,320);
                g2d.drawString("• Tomas:", 60,345);
                g2d.drawString(tfTomas.getText(), 70,365);
                //Titulos
                g2d.setFont(fuenteTitulos);
                g2d.drawString("Prescripción: ", 40,220);
                //Firma
                g2d.setFont(fuenteFirma);
                g2d.drawString("Firma", 650,230);
                //Pie
                g2d.drawImage(imagenTijera, -100, 510, null);
                g2d.setFont(fuenteFirma);
                g2d.setColor(Color.BLUE);
                g2d.drawString("Clínica privada de especialidades médicas", 200,440);
                g2d.drawString("C/Primavera, 26-28, 18008 Granada", 225,460);
                g2d.drawString("Teléfono: 958 89 38 50", 285,480);
                
                /*Con esta línea imprimimos el JDialog completo*/
                //jdMedicamentos.printAll(graphics);
                
                return PAGE_EXISTS;

            } else {
                return NO_SUCH_PAGE;
            }

        }
    }
    
 }


