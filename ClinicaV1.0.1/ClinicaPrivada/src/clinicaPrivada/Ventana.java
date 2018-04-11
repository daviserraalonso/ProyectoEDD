
package clinicaPrivada;

import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setVisible(true);
        setSize(400,350);
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nussTf = new javax.swing.JTextField();
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
        jLabel3.setText("NUSS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 190, 40, 36);

        nussTf.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        nussTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nussTfActionPerformed(evt);
            }
        });
        jPanel1.add(nussTf);
        nussTf.setBounds(120, 200, 210, 25);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaPrivada/carpeta.png"))); // NOI18N
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

    private void nussTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nussTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nussTfActionPerformed

    private void accederJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederJBActionPerformed
        if(comprobarNuss(nussTf.getText()) == false || nussTf.getText().contains(" ")){
            JOptionPane.showMessageDialog(null, "El Nº Nuss introducido no es correcto");
        }else{
            Ventana2 ven = new Ventana2();
            this.setEnabled(false);
            this.setVisible(false);
        }
    }//GEN-LAST:event_accederJBActionPerformed

    private void salirJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirJBActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField nussTf;
    private javax.swing.JButton salirJB;
    // End of variables declaration//GEN-END:variables
}
