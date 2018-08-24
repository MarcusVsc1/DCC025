/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Estoque {

    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void mudaQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public void mudaQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public void imprimeProduto(){
        System.out.println("Dados do produto. ");
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade atual: "+this.quantidadeAtual);
        System.out.println("Quantidade Minima: "+this.quantidadeMinima); 
    }
    
    public void darBaixa(){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n>quantidadeAtual){
            System.out.println("Quantidade digitada é maior do que o estoque!");
        }else{            
         quantidadeAtual-=n;
         System.out.println("Foi dada baixa de "+n+" produtos do estoque de "+this.nome);
        }
    }
    public void reporEstoque(int n){
        Scanner num = new Scanner(System.in);
        int n2 = num.nextInt();
        quantidadeAtual+=n2;
        System.out.println("Foi aumentado em "+n+" a quantidade de produtos do estoque de "+this.nome);
    }
    
    public void verificarReposicao(){
        if(quantidadeAtual<quantidadeMinima){
            System.out.println(this.nome+" precisa ser resposto em "+(quantidadeMinima-quantidadeAtual)+" itens");
        }
    }
}
