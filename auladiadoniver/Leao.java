/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladiadoniver;

/**
 *
 * @author ice
 */
public class Leao extends Felino{

    public Leao(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }
    @Override
    public void emitirSom(){
        System.out.println(nome+" está imitando o leao da MGM.");        
    }
}
