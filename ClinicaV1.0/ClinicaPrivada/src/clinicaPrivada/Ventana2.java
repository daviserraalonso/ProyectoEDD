/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaPrivada;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Laura
 */
public class Ventana2 extends javax.swing.JFrame {

    /*Variables JDialog*/
    JLabel jbMedicamento = new JLabel("Medicamento");
    JLabel jbPeriodicidad = new JLabel("Periodicidad");
    JLabel jbTomas = new JLabel("Tomas");
    
    JTextField tfMedicamentos = new JTextField();
    JTextField tfPeriodicidad = new JTextField();
    JTextField tfTomas = new JTextField();
    
    JButton btGuardar = new JButton("Guardar");
    JButton btImprimir = new JButton("Imprimir");
    
    public Ventana2() {
        initComponents();
        setVisible(true);
        setSize(410,350);
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        fecnacJL = new javax.swing.JLabel();
        apeJL = new javax.swing.JLabel();
        direccionJL = new javax.swing.JLabel();
        ape2JL = new javax.swing.JLabel();
        tlfJL = new javax.swing.JLabel();
        calleJL = new javax.swing.JLabel();
        calleJL1 = new javax.swing.JLabel();
        apeTF = new javax.swing.JTextField();
        ape2TF = new javax.swing.JTextField();
        fecnacTF = new javax.swing.JTextField();
        tlfTF = new javax.swing.JTextField();
        calleTF = new javax.swing.JTextField();
        localidadTF = new javax.swing.JTextField();
        medicoJL = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        idJL = new javax.swing.JLabel();
        apellidoMJL = new javax.swing.JLabel();
        apeMTF = new javax.swing.JTextField();
        medicamentosJL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicamentosTA = new javax.swing.JTextArea();
        guardarJB = new javax.swing.JButton();
        volverJB = new javax.swing.JButton();
        btRecetas = new javax.swing.JButton();

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

        nombreJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        nombreJL.setText("Nombre");
        jPanel1.add(nombreJL);
        nombreJL.setBounds(10, 53, 38, 21);
        jPanel1.add(nombreTF);
        nombreTF.setBounds(99, 51, 100, 20);

        fecnacJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        fecnacJL.setText("Fecha Nacimiento");
        jPanel1.add(fecnacJL);
        fecnacJL.setBounds(10, 138, 85, 14);

        apeJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        apeJL.setText("1º Apellido");
        jPanel1.add(apeJL);
        apeJL.setBounds(10, 81, 52, 14);

        direccionJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        direccionJL.setText("Dirección");
        jPanel1.add(direccionJL);
        direccionJL.setBounds(10, 197, 45, 14);

        ape2JL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ape2JL.setText("2º Apellido");
        jPanel1.add(ape2JL);
        ape2JL.setBounds(10, 107, 52, 14);

        tlfJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tlfJL.setText("Telefono ");
        jPanel1.add(tlfJL);
        tlfJL.setBounds(10, 165, 43, 14);

        calleJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        calleJL.setText("Calle");
        jPanel1.add(calleJL);
        calleJL.setBounds(71, 221, 24, 14);

        calleJL1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        calleJL1.setText("Localidad");
        jPanel1.add(calleJL1);
        calleJL1.setBounds(49, 252, 46, 14);
        jPanel1.add(apeTF);
        apeTF.setBounds(99, 77, 100, 20);
        jPanel1.add(ape2TF);
        ape2TF.setBounds(99, 103, 100, 20);

        fecnacTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecnacTFActionPerformed(evt);
            }
        });
        jPanel1.add(fecnacTF);
        fecnacTF.setBounds(99, 134, 100, 20);

        tlfTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlfTFActionPerformed(evt);
            }
        });
        jPanel1.add(tlfTF);
        tlfTF.setBounds(99, 165, 100, 20);
        jPanel1.add(calleTF);
        calleTF.setBounds(99, 217, 100, 20);

        localidadTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadTFActionPerformed(evt);
            }
        });
        jPanel1.add(localidadTF);
        localidadTF.setBounds(99, 248, 100, 20);

        medicoJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        medicoJL.setText("Médico");
        jPanel1.add(medicoJL);
        medicoJL.setBounds(232, 55, 35, 14);

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });
        jPanel1.add(idTF);
        idTF.setBounds(294, 77, 100, 20);

        idJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        idJL.setText("ID");
        jPanel1.add(idJL);
        idJL.setBounds(257, 81, 10, 14);

        apellidoMJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        apellidoMJL.setText("Apellido");
        jPanel1.add(apellidoMJL);
        apellidoMJL.setBounds(228, 107, 39, 14);
        jPanel1.add(apeMTF);
        apeMTF.setBounds(294, 103, 100, 20);

        medicamentosJL.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        medicamentosJL.setText("Medicamentos");
        jPanel1.add(medicamentosJL);
        medicamentosJL.setBounds(228, 138, 71, 14);

        medicamentosTA.setColumns(20);
        medicamentosTA.setRows(5);
        jScrollPane1.setViewportView(medicamentosTA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(228, 160, 170, 119);

        guardarJB.setBackground(new java.awt.Color(153, 153, 255));
        guardarJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        guardarJB.setText("GUARDAR");
        guardarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJBActionPerformed(evt);
            }
        });
        jPanel1.add(guardarJB);
        guardarJB.setBounds(10, 300, 110, 23);

        volverJB.setBackground(new java.awt.Color(153, 153, 255));
        volverJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        volverJB.setText("VOLVER");
        volverJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverJBActionPerformed(evt);
            }
        });
        jPanel1.add(volverJB);
        volverJB.setBounds(150, 300, 110, 23);

        btRecetas.setBackground(new java.awt.Color(153, 153, 255));
        btRecetas.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btRecetas.setText("RECETAR");
        btRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecetasActionPerformed(evt);
            }
        });
        jPanel1.add(btRecetas);
        btRecetas.setBounds(290, 300, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecnacTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecnacTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecnacTFActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

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
        Ventana ven = new Ventana();
    }//GEN-LAST:event_volverJBActionPerformed

    private void btRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecetasActionPerformed
        JDialog jdMedicamentos = new JDialog();
        jdMedicamentos.setSize(400,400);
        jdMedicamentos.setVisible(true);
        jdMedicamentos.setLayout(null);
        jdMedicamentos.setLocationRelativeTo(null); 
        
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
        btImprimir.setBounds(150, 230, 90, 30);
        
    }//GEN-LAST:event_btRecetasActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
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
    private javax.swing.JLabel direccionJL;
    private javax.swing.JLabel fecnacJL;
    private javax.swing.JTextField fecnacTF;
    private javax.swing.JButton guardarJB;
    private javax.swing.JLabel idJL;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField localidadTF;
    private javax.swing.JLabel medicamentosJL;
    private javax.swing.JTextArea medicamentosTA;
    private javax.swing.JLabel medicoJL;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel tlfJL;
    private javax.swing.JTextField tlfTF;
    private javax.swing.JButton volverJB;
    // End of variables declaration//GEN-END:variables
}
