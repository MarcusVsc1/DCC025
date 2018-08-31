/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3108;

import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class Bozo {
    public Jogador jogadores[];
    
    /**
     * funcao que inicia o jogo
     */
    public void Jogar(){
        System.out.println("************Jogo de Bozo************");
        System.out.println("Digite a quantidade de jogadores.");
        Scanner n = new Scanner(System.in);
        jogadores = new Jogador[n.nextInt()];
    }
}
