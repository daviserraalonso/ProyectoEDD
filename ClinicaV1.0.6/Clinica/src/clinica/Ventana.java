
package clinica;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {
    private MySQL conexion;
    private ResultSet rs;

    public Ventana() {
        initComponents();
        setVisible(true);
        setSize(400,350);
        setLocationRelativeTo(null);
        conexion = new MySQL();
        
        conexion.conecta("pepe", "pepa", "clinicaprivada");
        llenarCombo();
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
        jLabel3.setBounds(120, 150, 40, 36);

        accederJB.setBackground(new java.awt.Color(255, 255, 255));
        accederJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        accederJB.setText("ACCEDER");
        accederJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederJBActionPerformed(evt);
            }
        });
        jPanel1.add(accederJB);
        accederJB.setBounds(120, 220, 120, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setText("Introduzca el numero de la Seguridad Social");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 370, 50);

        jcNuss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcNuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNussActionPerformed(evt);
            }
        });
        jPanel1.add(jcNuss);
        jcNuss.setBounds(190, 160, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\prg\\Documents\\NetBeansProjects\\Clinica\\carpeta.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 60, 360, 250);

        salirJB.setBackground(new java.awt.Color(153, 153, 255));
        salirJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        salirJB.setText("SALIR");
        salirJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJBActionPerformed(evt);
            }
        });
        jPanel1.add(salirJB);
        salirJB.setBounds(323, 0, 70, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederJBActionPerformed

        Ventana2 ven = new Ventana2();

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
                new Ventana().setVisible(true);
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
        rs = conexion.ejecutaConsulta("SELECT NUS FROM paciente");
        String nuss = "";
        try {
            while(rs.next()){
                nuss = rs.getString(1);  
                jcNuss.addItem(nuss);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al llenar el combo");
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
