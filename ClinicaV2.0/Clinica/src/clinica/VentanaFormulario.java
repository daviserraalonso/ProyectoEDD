
package clinica;

import clinica.VentanaEntrada;
import clinica.JDialogMedicamentos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaFormulario extends javax.swing.JFrame{

    
    private static ArrayList<Pacientes> pacientes;
    private static String nus;
    private MySQL mysql;        
    public VentanaFormulario(ArrayList<Pacientes> pacientes, String nuss) {
        mysql = new MySQL();
        initComponents();
        this.pacientes = pacientes;
        setVisible(true);
        setLocationRelativeTo(null);
        nus = nuss;
        
        jpMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Médico Asociado"));
        jpMedicamentosHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicamentos e Historial"));
        jpDatosPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Paciente"));
        
        
        llenarFormulario(Integer.parseInt(nus));
        
        idMedicoTF.setEnabled(false);
        apeMTF.setEnabled(false);
        tfEspecialidad.setEnabled(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        guardarJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();
        btRecetas = new javax.swing.JButton();
        jpMedico = new javax.swing.JPanel();
        apeMTF = new javax.swing.JTextField();
        apellidoMJL = new javax.swing.JLabel();
        idMedicoTF = new javax.swing.JTextField();
        idJL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEspecialidad = new javax.swing.JTextField();
        jpMedicamentosHistorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicamentosTA = new javax.swing.JTextArea();
        jpDatosPaciente = new javax.swing.JPanel();
        nombreJL = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apeJL = new javax.swing.JLabel();
        apeTF = new javax.swing.JTextField();
        ape2JL = new javax.swing.JLabel();
        fecnacJL = new javax.swing.JLabel();
        tlfJL = new javax.swing.JLabel();
        localidadTF = new javax.swing.JTextField();
        calleJL1 = new javax.swing.JLabel();
        calleTF = new javax.swing.JTextField();
        calleJL = new javax.swing.JLabel();
        tlfTF = new javax.swing.JTextField();
        fecnacTF = new javax.swing.JTextField();
        ape2TF = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 25)); // NOI18N
        jLabel1.setText("Historial del paciente...");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 250, 31);

        guardarJB.setBackground(new java.awt.Color(255, 255, 255));
        guardarJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        guardarJB.setText("GUARDAR");
        guardarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJBActionPerformed(evt);
            }
        });
        jPanel1.add(guardarJB);
        guardarJB.setBounds(60, 400, 110, 23);

        volverJB.setBackground(new java.awt.Color(255, 255, 255));
        volverJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        volverJB.setText("VOLVER");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });
        jPanel1.add(volverJB);
        volverJB.setBounds(260, 400, 110, 23);

        btRecetas.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btRecetas.setText("RECETAR");
        btRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecetasActionPerformed(evt);
            }
        });
        jPanel1.add(btRecetas);
        btRecetas.setBounds(460, 400, 110, 23);

        jpMedico.setBackground(new java.awt.Color(153, 153, 255));

        apellidoMJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        apellidoMJL.setText("Apellido");

        idMedicoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMedicoTFActionPerformed(evt);
            }
        });

        idJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        idJL.setText("ID");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setText("Especialidad");

        javax.swing.GroupLayout jpMedicoLayout = new javax.swing.GroupLayout(jpMedico);
        jpMedico.setLayout(jpMedicoLayout);
        jpMedicoLayout.setHorizontalGroup(
            jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMedicoLayout.createSequentialGroup()
                        .addComponent(idJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(idMedicoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMedicoLayout.createSequentialGroup()
                        .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoMJL)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apeMTF)
                            .addComponent(tfEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jpMedicoLayout.setVerticalGroup(
            jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMedicoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idJL)
                    .addComponent(idMedicoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMJL)
                    .addComponent(apeMTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jpMedico);
        jpMedico.setBounds(390, 30, 220, 150);

        jpMedicamentosHistorial.setBackground(new java.awt.Color(153, 153, 255));

        medicamentosTA.setColumns(20);
        medicamentosTA.setRows(5);
        jScrollPane1.setViewportView(medicamentosTA);

        javax.swing.GroupLayout jpMedicamentosHistorialLayout = new javax.swing.GroupLayout(jpMedicamentosHistorial);
        jpMedicamentosHistorial.setLayout(jpMedicamentosHistorialLayout);
        jpMedicamentosHistorialLayout.setHorizontalGroup(
            jpMedicamentosHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMedicamentosHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMedicamentosHistorialLayout.setVerticalGroup(
            jpMedicamentosHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMedicamentosHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jpMedicamentosHistorial);
        jpMedicamentosHistorial.setBounds(320, 190, 320, 170);

        jpDatosPaciente.setBackground(new java.awt.Color(153, 153, 255));

        nombreJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        nombreJL.setText("Nombre");

        apeJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        apeJL.setText("1º Apellido");

        ape2JL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ape2JL.setText("2º Apellido");

        fecnacJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        fecnacJL.setText("Fecha Nacimiento");

        tlfJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tlfJL.setText("Telefono ");

        localidadTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadTFActionPerformed(evt);
            }
        });

        calleJL1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        calleJL1.setText("Localidad");

        calleJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        calleJL.setText("Calle");

        tlfTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlfTFActionPerformed(evt);
            }
        });

        fecnacTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecnacTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatosPacienteLayout = new javax.swing.GroupLayout(jpDatosPaciente);
        jpDatosPaciente.setLayout(jpDatosPacienteLayout);
        jpDatosPacienteLayout.setHorizontalGroup(
            jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                        .addComponent(calleJL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(localidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPacienteLayout.createSequentialGroup()
                        .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreJL)
                            .addComponent(apeJL)
                            .addComponent(ape2JL)
                            .addComponent(fecnacJL)
                            .addComponent(tlfJL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tlfTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecnacTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ape2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                        .addComponent(calleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jpDatosPacienteLayout.setVerticalGroup(
            jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apeJL)
                    .addComponent(apeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape2JL)
                    .addComponent(ape2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecnacJL)
                    .addComponent(fecnacTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlfJL)
                    .addComponent(tlfTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calleJL)
                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calleJL1)
                    .addComponent(localidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jpDatosPaciente);
        jpDatosPaciente.setBounds(20, 70, 270, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecnacTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecnacTFActionPerformed
        for(int i=0; i<pacientes.size();i++){
            fecnacTF.setText(String.valueOf(pacientes.get(i).getFechaNacimiento()));
        }
    }//GEN-LAST:event_fecnacTFActionPerformed

    private void idMedicoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMedicoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMedicoTFActionPerformed

    private void tlfTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlfTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlfTFActionPerformed

    private void localidadTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadTFActionPerformed

    private void guardarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        this.dispose();
        VentanaEntrada ven = new VentanaEntrada();
    }//GEN-LAST:event_volverJBActionPerformed

    private void btRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecetasActionPerformed

        new JDialogMedicamentos();
        
    }//GEN-LAST:event_btRecetasActionPerformed

    
     public void llenarFormulario(int nuss){
        for(int i=0; i<pacientes.size();i++){
            if(pacientes.get(i).getNus() == nuss){
                nombreTF.setText(pacientes.get(i).getNombre());
                apeTF.setText(pacientes.get(i).getPrimerApellido());
                ape2TF.setText(pacientes.get(i).getSegundoApellido());
                fecnacTF.setText(String.valueOf(pacientes.get(i).getFechaNacimiento()));
                tlfTF.setText(String.valueOf(pacientes.get(i).getTelefono()));
                calleTF.setText(pacientes.get(i).getCalle());
                localidadTF.setText(pacientes.get(i).getLocalidad());
                idMedicoTF.setText(String.valueOf(pacientes.get(i).getMedico()));
                medicamentosTA.setText(pacientes.get(i).getHistorial());         
            }
        }
        ResultSet rsMedico = mysql.ejecutaConsulta("SELECT apellido FROM medico WHERE idM =" +
                                                            "(SELECT Medico FROM paciente where NUS =" + nus +")");
        String medico = "";
        try {
            while(rsMedico.next()){
                medico = rsMedico.getString(1);
            }
            apeMTF.setText(medico); 
        } catch (SQLException ex) {
            Logger.getLogger(VentanaFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ResultSet rsEspecialidad = mysql.ejecutaConsulta("SELECT especialidad FROM medico WHERE idM =" + 
                                                                                      "(SELECT Medico FROM paciente WHERE NUS='"+nus+"')");
        String especialidad = ""; 
        try {
            while(rsEspecialidad.next()){
                especialidad = rsEspecialidad.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
            tfEspecialidad.setText(especialidad); 
     }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFormulario(pacientes, nus).setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ape2JL;
    private javax.swing.JTextField ape2TF;
    private javax.swing.JLabel apeJL;
    private javax.swing.JTextField apeMTF;
    private javax.swing.JTextField apeTF;
    private javax.swing.JLabel apellidoMJL;
    private javax.swing.JButton btRecetas;
    private javax.swing.JLabel calleJL;
    private javax.swing.JLabel calleJL1;
    private javax.swing.JTextField calleTF;
    private javax.swing.JLabel fecnacJL;
    private javax.swing.JTextField fecnacTF;
    private javax.swing.JButton guardarJB;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextField idMedicoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDatosPaciente;
    private javax.swing.JPanel jpMedicamentosHistorial;
    private javax.swing.JPanel jpMedico;
    private javax.swing.JTextField localidadTF;
    private javax.swing.JTextArea medicamentosTA;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JLabel tlfJL;
    private javax.swing.JTextField tlfTF;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables

    
}
