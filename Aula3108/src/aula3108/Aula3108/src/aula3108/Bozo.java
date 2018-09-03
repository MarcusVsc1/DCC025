/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3108;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Marcus
 */
public class Bozo {
    public Jogador jogadores[];
    Dado dice;
    int numJog;

    public Bozo() {
        System.out.println("************Jogo de Bozo************");
        System.out.println("Digite a quantidade de jogadores (máximo de 6 jogadores).");
        Scanner n = new Scanner(System.in);
        numJog = n.nextInt();
        jogadores = new Jogador[numJog];
        for(int i = 0; i < numJog; i++){
            System.out.println("Jogador "+i+1);
            jogadores[i] = new Jogador();
        }
        
    }
    
    
    
    /**
     * funcao que inicia o jogo
     */
    public void Jogar(){
        boolean win = false;
        int i = 0;
        Random gerador = new Random();
        while(!win){
            System.out.println("Jogador "+jogadores[i].getNome());
            jogadores[i].lancarDados();
            
            
            i++;
            if(i == 6){
                i=0;
            }
        }
        
    }
}
