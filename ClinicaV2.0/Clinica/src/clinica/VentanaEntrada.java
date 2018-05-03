
package clinica;


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

    public VentanaEntrada() {
        mysql = new MySQL();
        conexion = mysql.conecta("root", "1234", "clinicaprivada");
        pacientes = new ArrayList<>();
        initComponents();
        setVisible(true);
        //setSize(500,600);
        setLocationRelativeTo(null);
        
        llenarCombo();
        
        try {
            llenarArrayList();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VentanaEntrada.class.getName()).log(Level.SEVERE, null, ex);
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
        jcNuss = new javax.swing.JComboBox<>();
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
        jLabel3.setBounds(280, 230, 40, 36);

        accederJB.setBackground(new java.awt.Color(255, 255, 255));
        accederJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        accederJB.setText("ACCEDER");
        accederJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederJBActionPerformed(evt);
            }
        });
        jPanel1.add(accederJB);
        accederJB.setBounds(290, 290, 120, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setText("Introduzca el numero de la Seguridad Social");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 60, 370, 50);

        jcNuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNussActionPerformed(evt);
            }
        });
        jPanel1.add(jcNuss);
        jcNuss.setBounds(360, 240, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\scorpions\\Documents\\NetBeansProjects\\Clinica\\images\\carpeta.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 120, 360, 250);

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

        VentanaFormulario ven = new VentanaFormulario(pacientes, String.valueOf(jcNuss.getSelectedItem()));

        this.setEnabled(false);
        this.setVisible(false);


    }//GEN-LAST:event_accederJBActionPerformed

    private void salirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirJBActionPerformed

    private void jcNussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNussActionPerformed

    }//GEN-LAST:event_jcNussActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEntrada().setVisible(true);
            }
        });
    }
    
    public boolean comprobarNuss(String nuss){
        try{
            Integer.parseInt(nuss);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public void llenarCombo(){
        rs = mysql.ejecutaConsulta("SELECT NUS FROM paciente");
        int nuss = 0;
        
        try {
            while(rs.next()){
                nuss = rs.getInt(1);  
                jcNuss.addItem(String.valueOf(nuss));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al llenar el combo");
        }
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
                
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JComboBox<String> jcNuss;
    private javax.swing.JButton salirJB;
    // End of variables declaration//GEN-END:variables
}
