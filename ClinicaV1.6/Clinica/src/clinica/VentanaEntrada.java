
package clinica;


import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaEntrada extends javax.swing.JFrame {
    private MySQL mysql;
    private ResultSet rs;
    private ResultSet resultSet;
    private ResultSet resultSetPacientes;
    private ArrayList<Pacientes> pacientes;
    private Connection conexion;
    private int nuss;

    public VentanaEntrada() {
        mysql = new MySQL();
        conexion = mysql.conecta("root", "1234", "clinicaprivada");
        pacientes = new ArrayList<>();
        initComponents();
        setVisible(true);

        setLocationRelativeTo(null);
        
 
        try {
            llenarArrayList();
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Problema al llenar el ArrayList");
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        accederJB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btNuevo = new javax.swing.JButton();
        tfNuss = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        salirJB = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("NUSS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 230, 40, 36);

        accederJB.setBackground(new java.awt.Color(255, 255, 255));
        accederJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        accederJB.setText("ACCEDER");
        accederJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederJBActionPerformed(evt);
            }
        });
        jPanel1.add(accederJB);
        accederJB.setBounds(360, 310, 120, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setText("Introduzca el numero de la Seguridad Social");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 60, 370, 50);

        btNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btNuevo.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btNuevo.setText("Nuevo Paciente");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btNuevo);
        btNuevo.setBounds(220, 310, 120, 23);

        tfNuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNussActionPerformed(evt);
            }
        });
        jPanel1.add(tfNuss);
        tfNuss.setBounds(340, 240, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carpeta.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 120, 360, 250);

        salirJB.setBackground(new java.awt.Color(153, 153, 255));
        salirJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        salirJB.setText("SALIR");
        salirJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJBActionPerformed(evt);
            }
        });
        jPanel1.add(salirJB);
        salirJB.setBounds(650, 10, 70, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederJBActionPerformed
        try {
            if(comprobarNuss() == true){
                VentanaFormulario ven = new VentanaFormulario(pacientes, nuss, conexion);                
                this.setEnabled(false);
                this.setVisible(false);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "MAL en ventanaEntrada");
        }catch(NumberFormatException e){
            tfNuss.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Solo números por favor");
        }
    }//GEN-LAST:event_accederJBActionPerformed

    private void salirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirJBActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        new VentanaFormulario();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void tfNussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNussActionPerformed
        
    }//GEN-LAST:event_tfNussActionPerformed

    public boolean comprobarNuss() throws SQLException{
       boolean correcto = false;
        for(Pacientes p : pacientes){
            if(Integer.parseInt(tfNuss.getText()) == p.getNus()){
                correcto = true;
                nuss = p.getNus();
            }
        }        
    return correcto;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEntrada().setVisible(true);
            }
        });
    }

    
    public void llenarArrayList() throws UnsupportedEncodingException{
        resultSet = mysql.ejecutaConsulta("SELECT * FROM paciente");
        int nuss = 0;
        String dni = "";
        String nombre = "";
        String primerApellido = "";
        String segundoApellido = "";
        String calle = "";
        String localidad = "";
        int telf = 0;
        Date fechaNacimiento = null;
        Date fechaAlta = null;
        int medico = 0;
        String historial = "";
        Object medicamento = 0;
        
        try {
            while(resultSet.next()){
                nuss = resultSet.getInt(1);
                dni = resultSet.getString(2);
                nombre = resultSet.getString(3);
                primerApellido = resultSet.getString(4);
                segundoApellido = resultSet.getString(5);
                telf = resultSet.getInt(6);
                calle = resultSet.getString(7);
                localidad = resultSet.getString(8);
                fechaNacimiento = resultSet.getDate(9);
                fechaAlta = resultSet.getDate(10);
                medico = resultSet.getInt(11);
                historial = resultSet.getString(12);
                                
                Pacientes paciente = new Pacientes(nuss, dni, nombre, primerApellido, segundoApellido, telf, calle, localidad, fechaNacimiento, fechaAlta, medico, historial);
                this.nuss = nuss;
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederJB;
    private javax.swing.JButton btNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton salirJB;
    private javax.swing.JTextField tfNuss;
    // End of variables declaration//GEN-END:variables
}
