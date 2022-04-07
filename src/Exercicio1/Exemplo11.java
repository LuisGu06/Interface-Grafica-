package Exercicio1;

import javax.swing.JOptionPane;

public class Exemplo11 extends javax.swing.JFrame {
  
    public Exemplo11() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcoes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 11");

        opcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pergunta", "Informação", "Alerta", "Erro", "Personalizada", "Somente mensagem " }));
        opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesActionPerformed
        switch(opcoes.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null, "Como você está?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
            break;
            case 1:
                JOptionPane.showMessageDialog(null, "Essa atividade é avaliativa.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Perigo!", "Alerta", JOptionPane.WARNING_MESSAGE);
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Ocorreu algum erro!", "Erro", JOptionPane.ERROR_MESSAGE);
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Trazei três pratos de trigo para três tigres tristes comerem.", "Personalizado", 
                        JOptionPane.INFORMATION_MESSAGE);
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mensagem simples", "Somente mensagem", JOptionPane.PLAIN_MESSAGE);
            break;
        }
    }//GEN-LAST:event_opcoesActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> opcoes;
    // End of variables declaration//GEN-END:variables
}
