/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author Laura
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setVisible(true);
        setSize(400,350);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nusTF = new javax.swing.JTextField();
        accederJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salirJB = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel2.setText("       del paciente para ver su historial");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 370, 50);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("NUS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 190, 27, 36);

        nusTF.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        nusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nusTFActionPerformed(evt);
            }
        });
        jPanel1.add(nusTF);
        nusTF.setBounds(120, 200, 210, 25);

        accederJB.setBackground(new java.awt.Color(255, 255, 255));
        accederJB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        accederJB.setText("ACCEDER");
        accederJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederJBActionPerformed(evt);
            }
        });
        jPanel1.add(accederJB);
        accederJB.setBounds(140, 250, 120, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/carpeta.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 90, 360, 230);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setText("Introduzca el numero de la Seguridad Social");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 370, 50);

        salirJB.setBackground(new java.awt.Color(153, 153, 255));
        salirJB.setText("Salir");
        salirJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJBActionPerformed(evt);
            }
        });
        jPanel1.add(salirJB);
        salirJB.setBounds(333, 0, 60, 23);

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

    private void nusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nusTFActionPerformed

    private void accederJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederJBActionPerformed
        Ventana2 ven = new Ventana2();
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_accederJBActionPerformed

    private void salirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirJBActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField nusTF;
    private javax.swing.JButton salirJB;
    // End of variables declaration//GEN-END:variables
}
