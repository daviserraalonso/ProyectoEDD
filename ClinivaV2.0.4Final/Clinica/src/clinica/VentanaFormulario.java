
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
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
    static String nus = "";
    String nusa = "";
    private MySQL mysql;
    private JButton btInsertar;
    static Connection conexion;
    
    public VentanaFormulario(ArrayList<Pacientes> pacientes, String nuss, Connection conexion) {
        
        this.conexion = conexion;
        mysql = new MySQL();
        initComponents();
        btInsertar = new JButton("Insertar");
        this.pacientes = pacientes;
        setVisible(true);
        setLocationRelativeTo(null);
        this.nus = nuss;
        
        btInsertar.setVisible(false);
        
        nusa = nus;
        
        System.out.println("nusss: " + nusa);
        
        jpMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Médico Asociado"));
        jpMedicamentosHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicamentos e Historial"));
        jpDatosPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Paciente"));
        
        
        llenarFormulario(Integer.parseInt(nus));
        
        idMedicoTF.setEnabled(false);
        apeMTF.setEnabled(false);
        tfEspecialidad.setEnabled(false);
        
    }
    
    public VentanaFormulario(){
        mysql = new MySQL();
        initComponents();
        
        guardarJB.setVisible(false);
        setLocationRelativeTo(null);
        btInsertar = new JButton("Insertar");
        jPanel1.add(btInsertar);
        
        btInsertar.setBounds(2, 14, 2, 14);
        btInsertar.setVisible(true);
        btInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarBd();
            }
        });
        
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfFechaAlta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNus = new javax.swing.JTextField();
        guardarJB = new javax.swing.JButton();
        jbInsertar = new javax.swing.JButton();

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

        volverJB.setBackground(new java.awt.Color(255, 255, 255));
        volverJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        volverJB.setText("VOLVER");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });
        jPanel1.add(volverJB);
        volverJB.setBounds(250, 470, 110, 23);

        btRecetas.setBackground(new java.awt.Color(255, 255, 255));
        btRecetas.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btRecetas.setText("RECETAR");
        btRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecetasActionPerformed(evt);
            }
        });
        jPanel1.add(btRecetas);
        btRecetas.setBounds(460, 470, 110, 23);

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
        jpMedico.setBounds(560, 80, 220, 150);

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
        jpMedicamentosHistorial.setBounds(470, 250, 320, 170);

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

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel6.setText("Fecha Alta");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel7.setText("NUS");

        javax.swing.GroupLayout jpDatosPacienteLayout = new javax.swing.GroupLayout(jpDatosPaciente);
        jpDatosPaciente.setLayout(jpDatosPacienteLayout);
        jpDatosPacienteLayout.setHorizontalGroup(
            jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                        .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tlfJL)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tlfTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(nombreJL)
                                    .addComponent(apeJL)
                                    .addComponent(ape2JL)
                                    .addComponent(fecnacJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecnacTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ape2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                        .addComponent(calleJL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                        .addComponent(calleJL1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpDatosPacienteLayout.setVerticalGroup(
            jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosPacienteLayout.createSequentialGroup()
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfNus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apeJL)
                    .addComponent(apeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape2JL)
                    .addComponent(ape2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecnacJL)
                    .addComponent(fecnacTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlfJL)
                    .addComponent(tlfTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calleJL)
                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calleJL1)
                    .addComponent(localidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpDatosPaciente);
        jpDatosPaciente.setBounds(80, 70, 300, 380);

        guardarJB.setBackground(new java.awt.Color(255, 255, 255));
        guardarJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        guardarJB.setText("GUARDAR");
        guardarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJBActionPerformed(evt);
            }
        });
        jPanel1.add(guardarJB);
        guardarJB.setBounds(40, 470, 110, 23);

        jbInsertar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jbInsertar.setText("INSERTAR");
        jbInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jbInsertar);
        jbInsertar.setBounds(40, 470, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
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
        ActualizarBD();
    }//GEN-LAST:event_guardarJBActionPerformed

    private void volverJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverJBActionPerformed
        this.dispose();
        VentanaEntrada ven = new VentanaEntrada();
    }//GEN-LAST:event_volverJBActionPerformed

    private void btRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecetasActionPerformed

        new JDialogMedicamentos(apeMTF.getText(), tfEspecialidad.getText(), nombreTF.getText(), apeTF.getText(), ape2TF.getText(), nus, tfDni.getText(), mysql.getConexion(), mysql);
        
    }//GEN-LAST:event_btRecetasActionPerformed

    private void jbInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertarActionPerformed
        insertarBd();  
    }//GEN-LAST:event_jbInsertarActionPerformed

    
     public void llenarFormulario(int nuss){
        for(int i=0; i<pacientes.size();i++){
            if(pacientes.get(i).getNus() == nuss){
                tfNus.setText(String.valueOf(pacientes.get(i).getNus()));
                tfDni.setText(pacientes.get(i).getDni());
                nombreTF.setText(pacientes.get(i).getNombre());
                apeTF.setText(pacientes.get(i).getPrimerApellido());
                ape2TF.setText(pacientes.get(i).getSegundoApellido());
                fecnacTF.setText(String.valueOf(pacientes.get(i).getFechaNacimiento()));
                tfFechaAlta.setText(String.valueOf(pacientes.get(i).getFechaAlta()));
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
     
     
     public void ActualizarBD(){
           PreparedStatement ps;
           String nus = tfNus.getText();
           String dni = tfDni.getText();
           String nombre = nombreTF.getText();
           String primerApellido = apeTF.getText();
           String segundoApellido = ape2TF.getText();
           int telf = Integer.parseInt(tlfTF.getText());
           String calle = calleTF.getText();
           String localidad = localidadTF.getText();
           Date fechaNacimiento = Date.valueOf(fecnacTF.getText());
           Date fechaAlta = Date.valueOf(tfFechaAlta.getText());
           int medico = Integer.parseInt(idMedicoTF.getText());
           String historial = medicamentosTA.getText();
           
           System.out.println("pepe"+nusa);
           
        try {
            
            ps = mysql.getConexion().prepareStatement("UPDATE paciente SET NUS= ?, DNI= ?," + "nombre= ?, primer_apellido= ?," +
                    "segundo_apellido= ?, tlf= ?," + "Calle= ?, Localidad= ?," + "fecha_nacimiento= ?, fecha_alta= ?," +
                    "Medico= ?, Historial= ?" + "WHERE NUS= ?");

                    
             // Parámetros para el preparedStatement
            ps.setString(1,nus);
            ps.setString(2,dni);
            ps.setString(3,nombre);
            ps.setString(4,primerApellido);
            ps.setString(5, segundoApellido);
            ps.setInt(6,telf);
            ps.setString(7,calle);
            ps.setString(8,localidad);
            ps.setDate(9,fechaNacimiento);
            ps.setDate(10, fechaAlta);
            ps.setInt(11, medico);
            ps.setString(12, historial);
            ps.setString(13, nus);

            // llemada al métdo ejecuta update el cual actualiza
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void insertarBd(){
         PreparedStatement prepared;
         
         String nus = tfNus.getText();
         String dni = tfDni.getText();
         String nombre = nombreTF.getText();
         String primerApellido = apeTF.getText();
         String segundoApellido = ape2TF.getText();
         int telf = Integer.parseInt(tlfTF.getText());
         String calle = calleTF.getText();
         String localidad = localidadTF.getText();
         Date fechaNacimiento = Date.valueOf(fecnacTF.getText());
         Date fechaAlta = Date.valueOf(tfFechaAlta.getText());
         int medico = Integer.parseInt(idMedicoTF.getText());
         String historial = medicamentosTA.getText();

        try {
            
            prepared = mysql.getConexion().prepareStatement("INSERT INTO paciente (NUS, DNI, nombre, primer_apellido, segundo_apellido, tlf, "
                    + "Calle, Localidad, fecha_nacimiento, fecha_alta, Medico, Historial)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

                    
             // Parámetros para el preparedStatement
            prepared.setString(1,nus);
            prepared.setString(2,dni);
            prepared.setString(3,nombre);
            prepared.setString(4,primerApellido);
            prepared.setString(5, segundoApellido);
            prepared.setInt(6,telf);
            prepared.setString(7,calle);
            prepared.setString(8,localidad);
            prepared.setDate(9,fechaNacimiento);
            prepared.setDate(10, fechaAlta);
            prepared.setInt(11, medico);
            prepared.setString(12, historial);
            
            JOptionPane.showMessageDialog(null, "Paciente insertado Correctamente");

            // llemada al métdo ejecuta update el cual actualiza
            prepared.executeUpdate();
            prepared.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFormulario(pacientes, nus, conexion).setVisible(true); 
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInsertar;
    private javax.swing.JPanel jpDatosPaciente;
    private javax.swing.JPanel jpMedicamentosHistorial;
    private javax.swing.JPanel jpMedico;
    private javax.swing.JTextField localidadTF;
    private javax.swing.JTextArea medicamentosTA;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JTextField tfFechaAlta;
    private javax.swing.JTextField tfNus;
    private javax.swing.JLabel tlfJL;
    private javax.swing.JTextField tlfTF;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
