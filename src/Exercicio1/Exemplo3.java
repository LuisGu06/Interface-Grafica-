package Exercicio1;

import javax.swing.JOptionPane;

public class Exemplo3 extends javax.swing.JFrame {

    public Exemplo3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmsg = new javax.swing.JButton();
        jbteimoso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 3");

        jbmsg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jbmsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/java.png"))); // NOI18N
        jbmsg.setText("Mensagem");
        jbmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmsgActionPerformed(evt);
            }
        });

        jbteimoso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbteimoso.setText("Teimoso");
        jbteimoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbteimosoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbteimosoMouseExited(evt);
            }
        });
        jbteimoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbteimosoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jbmsg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jbteimoso)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jbmsg)
                .addGap(38, 38, 38)
                .addComponent(jbteimoso)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmsgActionPerformed
        JOptionPane.showMessageDialog(null, "Botão Mensagem");
    }//GEN-LAST:event_jbmsgActionPerformed

    private void jbteimosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbteimosoActionPerformed
        JOptionPane.showMessageDialog(null, "Botão Teimoso");
    }//GEN-LAST:event_jbteimosoActionPerformed

    private void jbteimosoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbteimosoMouseEntered
        jbteimoso.setBounds(50, 120, 100, 25);
    }//GEN-LAST:event_jbteimosoMouseEntered

    private void jbteimosoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbteimosoMouseExited
        jbteimoso.setBounds(50, 70, 100, 25);
    }//GEN-LAST:event_jbteimosoMouseExited

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
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbmsg;
    private javax.swing.JButton jbteimoso;
    // End of variables declaration//GEN-END:variables
}
