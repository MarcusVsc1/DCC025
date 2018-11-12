/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1211;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ice
 */
public class Aula1211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Pudim!");
        
        JLabel resposta = new JLabel("Eu quero.");
        JButton botao1 = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");
        JButton botao4 = new JButton("Botao 4");
        JButton botao5 = new JButton("Botao 5");
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        janela.setSize(500,500);
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object [] opcoes = {"Vai botar na mesa?","Quero comer."};
                JOptionPane.showOptionDialog(janela, "Hoje tem pudim?", "Corrida do pudim", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE ,null, opcoes, opcoes[1]);
                JOptionPane.showMessageDialog(janela, "Hoje tem pudim em casa.","Ebaaa",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        
        janela.getContentPane().add(painel);
        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2, BorderLayout.SOUTH);
        painel.add(botao3, BorderLayout.WEST);
        painel.add(botao4, BorderLayout.EAST);
        painel.add(botao5, BorderLayout.CENTER);
        
        
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
