/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pokemonrandombattle.Pokemon;

/**
 * Interface da batalha, recebe os IDs dos pokemons e monta o combate
 * @author Marcus
 */
public class InterfaceBatalha extends javax.swing.JFrame {

    public String tresDigNum1;
    public String tresDigNum2;
    public ImageIcon logo1;
    public ImageIcon logo2;
    public static Pokemon p1;
    public static Pokemon p2;
    public int move1;
    public int move2;
    public static int ID1;
    public static int ID2;
    
    /**
     * Creates new form InterfaceBatalha
     * @param p1 pokemon escolhido 1
     * @param p2 pokemon escolhido 2
     */
    public InterfaceBatalha(Pokemon p1, Pokemon p2) throws IOException, ClassNotFoundException {
        InterfaceBatalha.p1 = p1;
        InterfaceBatalha.p2 = p2;
        move1 = 0;
        move2 = 0;

        tresDigNum1 = criaCaminhoBack(InterfaceBatalha.p1.getID());
        tresDigNum2 = criaCaminhoFront(InterfaceBatalha.p2.getID());
        initComponents();
        jLabel2.setIcon(retornaIcone(tresDigNum1));
        jLabel3.setIcon(retornaIcone(tresDigNum2));

        this.getContentPane().setBackground(Color.GREEN);
        jTextArea1.setLineWrap(true);
        jTextArea3.setLineWrap(true);
        
        setSize(807, 595);
        setResizable(false);


        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        logDeBatalha = new javax.swing.JTextArea();

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(225, 247, 225));
        getContentPane().setLayout(null);

        jLabel2.setIcon(logo1);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 170, 90, 70);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 100, 70, 60);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/bg1.png"))); // NOI18N
        jLabelBackground.setToolTipText("");
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 380, 238);

        jButton1.setBackground(java.awt.Color.blue);
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText(p1.moves[2].getNome());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 60, 250, 25);

        jButton2.setBackground(java.awt.Color.blue);
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText(p1.moves[1].getNome());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 30, 250, 25);

        jButton3.setBackground(java.awt.Color.blue);
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText(p1.moves[3].getNome());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 90, 250, 25);

        jButton4.setBackground(java.awt.Color.blue);
        jButton4.setForeground(java.awt.Color.white);
        jButton4.setText(p1.moves[0].getNome());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(550, 0, 250, 25);

        jButton5.setBackground(java.awt.Color.yellow);
        jButton5.setText(p2.moves[1].getNome());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(550, 150, 250, 25);

        jButton6.setBackground(java.awt.Color.yellow);
        jButton6.setText(p2.moves[3].getNome());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(550, 210, 250, 25);

        jButton7.setBackground(java.awt.Color.yellow);
        jButton7.setText(p2.moves[0].getNome());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(550, 120, 250, 25);

        jButton8.setBackground(java.awt.Color.yellow);
        jButton8.setText(p2.moves[2].getNome());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(550, 180, 250, 25);

        jButton10.setBackground(java.awt.Color.red);
        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        jButton10.setText("Voltar ao Início");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(390, 100, 150, 30);
        jButton10.getAccessibleContext().setAccessibleName("Voltar ao Início");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(p1.getNome()+"\nHP: "+p1.getHp());
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 0, 166, 96);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText(p2.getNome()+"\nHP: "+p2.getHp());
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(380, 140, 166, 96);

        logDeBatalha.setBackground(new java.awt.Color(204, 204, 204));
        logDeBatalha.setColumns(20);
        logDeBatalha.setRows(5);
        jScrollPane2.setViewportView(logDeBatalha);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 240, 800, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        move1 = 2;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        move1 = 1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        move1 = 3;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        move1 = 0;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        move2 = 1;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        move2 = 3;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        move2 = 0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        move2 = 2;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
        TelaTitulo t1 = new TelaTitulo();
        t1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceBatalha(p1, p2).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceBatalha.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InterfaceBatalha.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea logDeBatalha;
    // End of variables declaration//GEN-END:variables
    /**
     * funcao para criar uma string que tem o caminho para o arquivo de imagem do pokemon 1
     * @param num
     * @return tresDig
     */
    private String criaCaminhoBack(int num) {
        String tresDig = null;
        if(num<10){
            tresDig = "/InterfacesGraficas/Spr_b_3f_00"+num+".png";
        }else{
            if(num<100){
                tresDig = "/InterfacesGraficas/Spr_b_3f_0"+num+".png";
            }else{
               tresDig = "/InterfacesGraficas/Spr_b_3f_"+num+".png"; 
            }
        }
        System.out.println(tresDig);
        return tresDig;
    }

    private Icon retornaIcone(String caminho) throws IOException {
        InputStream bytes = Object.class.getResourceAsStream(caminho);  
        Image imagem = ImageIO.read(bytes);  
        Icon icone = new ImageIcon(imagem); 
        return icone;
    }
    
    private String criaCaminhoFront(int num) {
        String tresDig = null;
        if(num<10){
            tresDig = "/InterfacesGraficas/Spr_3f_00"+num+".png";
        }else{
            if(num<100){
                tresDig = "/InterfacesGraficas/Spr_3f_0"+num+".png";
            }else{
               tresDig = "/InterfacesGraficas/Spr_3f_"+num+".png"; 
            }
        }
        System.out.println(tresDig);
        return tresDig;
    }
 
    public void setLogDeBatalha(String texto){
        logDeBatalha.setText(texto);
    }
}