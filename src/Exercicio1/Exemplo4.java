package Exercicio1;

import javax.swing.JOptionPane;

public class Exemplo4 extends javax.swing.JFrame {

    public Exemplo4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbverificar = new javax.swing.JButton();
        jbmarcar = new javax.swing.JButton();
        jbdesmarcar = new javax.swing.JButton();
        cxingles = new javax.swing.JCheckBox();
        cxinformatica = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 4");

        jbverificar.setText("Verificar");
        jbverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbverificarActionPerformed(evt);
            }
        });

        jbmarcar.setText("Marcar");
        jbmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmarcarActionPerformed(evt);
            }
        });

        jbdesmarcar.setText("Desmarcar");
        jbdesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdesmarcarActionPerformed(evt);
            }
        });

        cxingles.setText("Inglês");
        cxingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxinglesActionPerformed(evt);
            }
        });

        cxinformatica.setText("Informática");
        cxinformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxinformaticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbdesmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxingles)
                    .addComponent(jbmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxinformatica)
                    .addComponent(jbverificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cxingles)
                .addGap(18, 18, 18)
                .addComponent(cxinformatica)
                .addGap(29, 29, 29)
                .addComponent(jbverificar)
                .addGap(26, 26, 26)
                .addComponent(jbmarcar)
                .addGap(29, 29, 29)
                .addComponent(jbdesmarcar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cxinglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxinglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxinglesActionPerformed

    private void cxinformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxinformaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxinformaticaActionPerformed

    private void jbmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmarcarActionPerformed
        cxingles.setSelected(true);
        cxinformatica.setSelected(true);
    }//GEN-LAST:event_jbmarcarActionPerformed

    private void jbdesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdesmarcarActionPerformed
        cxingles.setSelected(false);
        cxinformatica.setSelected(false);
    }//GEN-LAST:event_jbdesmarcarActionPerformed

    private void jbverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbverificarActionPerformed
        String selecao = "Selecionados: \n";
        if(cxingles.isSelected()){
            selecao += cxingles.getText() +"\n";
        }
        if(cxinformatica.isSelected()){
            selecao += cxinformatica.getText();
        }     
        JOptionPane.showMessageDialog(null, selecao);
    }//GEN-LAST:event_jbverificarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cxinformatica;
    private javax.swing.JCheckBox cxingles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbdesmarcar;
    private javax.swing.JButton jbmarcar;
    private javax.swing.JButton jbverificar;
    // End of variables declaration//GEN-END:variables
}
