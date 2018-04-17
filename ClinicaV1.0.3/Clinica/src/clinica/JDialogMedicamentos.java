
package clinica;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JDialogMedicamentos{

        private JDialog jdMedicamentos;
        private JLabel jbMedicamento = new JLabel("Medicamento");
        private JLabel jbPeriodicidad = new JLabel("Periodicidad");
        private JLabel jbTomas = new JLabel("Tomas");

        private JTextField tfMedicamentos = new JTextField();
        private JTextField tfPeriodicidad = new JTextField();
        private JTextField tfTomas = new JTextField();

        private JButton btGuardar = new JButton("Guardar");
        private JButton btImprimir = new JButton("Imprimir");

        public JDialogMedicamentos(){
            jdMedicamentos = new JDialog();

            jdMedicamentos.setSize(400, 500);
            jdMedicamentos.setVisible(true);
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

            jdMedicamentos.add(btGuardar);
            btGuardar.setBounds(50, 230, 90, 30);
            jdMedicamentos.add(btImprimir);
            btImprimir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    /*
                    Tenemos que crear un job que es el que será enviado a la impresora seleccionada
                    Establecemos que sea imprimible y pasamos como parámetro nuestra clase interna
                    Seleccionamos el dialogo de impresion
                    Por último imprimimos*/
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
            btImprimir.setBounds(150, 230, 90, 30);
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

                /*Con estas líneas imprimimos el contenido de los TF*/

                g2d.drawString("Medicamento: " + "\t" + tfMedicamentos.getText() + "\n" + " Periodicidad: " + "\t" + tfPeriodicidad.getText() +
                        "\n" + " Tomas: " + "\t" + tfTomas.getText() + "\n" + "\t\t\t\t" + " Firma", 50, 70);

                /*Con esta línea imprimimos el JDialog completo*/
                //jdMedicamentos.printAll(graphics);
                
                return PAGE_EXISTS;

            } else {
                return NO_SUCH_PAGE;
            }

        }
    }
    
 }


