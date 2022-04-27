package Exercicio1;

import javax.swing.*;

public class Exemplo8 extends javax.swing.JFrame {
    
        
    public void insert(){
        ImageIcon image = new ImageIcon(getClass().getResource("foto1.png"));
        imagem.setIcon(image);
    }
    
    
    public Exemplo8() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 8");

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Foto1", "Foto2", "Foto3", "Foto4", "Foto5", "Foto6", "Foto7", "Foto8", "Foto9", "Foto10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if(lista.getSelectedIndex()==0){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto1.png")));
       }else if(lista.getSelectedIndex()==1){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto2.png")));
       }else if(lista.getSelectedIndex()==2){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto3.png")));
       }if(lista.getSelectedIndex()==3){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto4.png")));
       }else if(lista.getSelectedIndex()==4){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto5.png")));
       }else if(lista.getSelectedIndex()==5){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto6.png")));
       }if(lista.getSelectedIndex()==6){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto7.png")));
       }else if(lista.getSelectedIndex()==7){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto8.png")));
       }else if(lista.getSelectedIndex()==8){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto9.png")));
       }else if(lista.getSelectedIndex()==9){
           imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/foto10.png")));
       }
    }//GEN-LAST:event_listaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
