/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2809;

/**
 *
 * @author Marcus
 */
public class Aluno extends Pessoa {

    public Aluno(String pizzas) {
        super(pizzas);
    }

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void quantasPizzas(){
        System.out.println(this.getPizzas());
    }
}
