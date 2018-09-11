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
    public ArrayList pontuacao;
    Dado dice[];
    boolean novoS[];
    
    
    /**
     *
     */
    public ArrayList tabuleiro;
    /**
     * construtor de cada jogador.
     */
    public Jogador() {
        System.out.println("Digite o nome do jogador.");
        Scanner nome = new Scanner(System.in);
        this.nome = nome.nextLine();
        pontuacao = new ArrayList();
        tabuleiro = new ArrayList();
        for(int i = 0; i <10; i++){
            pontuacao.add(0);
            tabuleiro.add(0);
        }
        for(int x = 0; x<6; x++){
            dice[x] = new Dado();
            novoS[x] = true;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
    
    public void lancarDados(int n, boolean dePrima){
        System.out.println("Dados sorteados: ");
        for(int i = 0; i<5;i++){
            if(novoS[i]){
                dice[i].rolaDado();
                System.out.println(dice[i].getFace());
            }
        }
        if(n<2){
            System.out.println("Deseja alterar as jogadas? 1 para SIM, ou qualquer tecla para NÃO.");
            Scanner j = new Scanner(System.in);
            int j1 = j.nextInt();
            if(j1==1){
                for(int a = 0; a < 5; a++){
                    System.out.println("Dado "+a+1+", alterar? 1 para SIM, ou qualquer outra tecla para NÃO.");
                    
                }
            }else{
                System.out.println("Digite a jogada que deseja fazer.");
                System.out.println("Ás = 1, Fu = 2, Quadra = 3, Duque = 4, Seguida = 5, Quina = 6, Terno = 7, Quadrada = 8, Sena = 9, General = 10 ");
                System.out.println("Cada jogada apenas uma vez.");
            }
        }else{
            System.out.println("Digite a jogada que deseja fazer.");
            System.out.println("Ás = 1, Fu = 2, Quadra = 3, Duque = 4, Seguida = 5, Quina = 6, Terno = 7, Quadrada = 8, Sena = 9, General = 10 ");
            System.out.println("Cada jogada apenas uma vez.");
        }
        
    }
    
    public void exibeTabuleiro(){
        System.out.println("Ás: "+pontuacao.get(0)+" pontos.");
        System.out.println("Fu: "+pontuacao.get(1)+" pontos.");
        System.out.println("Quadra: "+pontuacao.get(2)+" pontos.");
        System.out.println("Duque: "+pontuacao.get(3)+" pontos.");
        System.out.println("Seguida: "+pontuacao.get(4)+" pontos.");
        System.out.println("Quina: "+pontuacao.get(5)+" pontos.");
        System.out.println("Terno: "+pontuacao.get(6)+" pontos.");
        System.out.println("Quadrada: "+pontuacao.get(7)+" pontos.");
        System.out.println("Sena: "+pontuacao.get(8)+" pontos.");
        System.out.println("General: "+pontuacao.get(9)+" pontos.");
    }
}
