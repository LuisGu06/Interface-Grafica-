package Exercicio1;

import javax.swing.JOptionPane;

public class Exemplo12 extends javax.swing.JFrame {

    public Exemplo12() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        SN = new javax.swing.JRadioButton();
        SNC = new javax.swing.JRadioButton();
        OC = new javax.swing.JRadioButton();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 12");

        grupo.add(SN);
        SN.setText("Sim e Não");

        grupo.add(SNC);
        SNC.setText("Sim, Não e Cancelar");

        grupo.add(OC);
        OC.setText("Ok e Cancelar");

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrar)
                    .addComponent(OC)
                    .addComponent(SNC)
                    .addComponent(SN))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(SN)
                .addGap(18, 18, 18)
                .addComponent(SNC)
                .addGap(18, 18, 18)
                .addComponent(OC)
                .addGap(33, 33, 33)
                .addComponent(mostrar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        int resp = 0;
        if(SN.isSelected()){
            resp = JOptionPane.showConfirmDialog(null, "Erro ao acessar o arquivo. Tentar novamente?", "Erro de arquivo", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        else if(SNC.isSelected()){
            resp = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "Salvar arquivo", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        else if(OC.isSelected()){
            resp = JOptionPane.showConfirmDialog(null, "Deseja abrir o arquivo?", "Abrir arquivo", 
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, resp, "Resposta", 1);
    }//GEN-LAST:event_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton OC;
    private javax.swing.JRadioButton SN;
    private javax.swing.JRadioButton SNC;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton mostrar;
    // End of variables declaration//GEN-END:variables
}
