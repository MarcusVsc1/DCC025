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
public class Jogador extends Pessoa {

    public Jogador(int pizza, String nome, int idade) {
        super(pizza, nome, idade);
    }

    @Override
    public void quantasPizzas() {
        System.out.println(this.getNome()+", "+this.getIdade()+" anos, comeu "+this.getPizza()+" pizzas.");
    }
    
}
