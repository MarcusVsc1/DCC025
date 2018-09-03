/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3108;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class Jogador {
    private int pontos = 0;
    private String nome;
    ArrayList pontuacao;
    /**
     * construtor de cada jogador.
     */
    public Jogador() {
        System.out.println("Digite o nome do jogador.");
        Scanner nome = new Scanner(System.in);
        this.nome = nome.nextLine();
        pontuacao = new ArrayList();
        for(int i = 0; i <10; i++){
            pontuacao.add(0);
        }
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
    
    public void lancarDados(){
    
    }
    
    public void exibeTabuleiro(){
        System.out.println("   "+pontuacao.get(0)+
                + "    |   "+pontuacao.get(1)+
                + ""
                + ""
                + "");
    }
}
