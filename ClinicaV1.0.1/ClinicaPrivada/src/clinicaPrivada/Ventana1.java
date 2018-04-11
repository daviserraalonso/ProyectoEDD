
package clinicaPrivada;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrarJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        entrarJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaPrivada/logo.png"))); // NOI18N
        entrarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarJB, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarJB)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJBActionPerformed
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_entrarJBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarJB;
    // End of variables declaration//GEN-END:variables
}
