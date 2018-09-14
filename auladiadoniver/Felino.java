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
public class Felino extends Animal{

    public Felino(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }
    public void comerCarne(){
        System.out.println(nome+ " adora um filezinho. Precebe-se que nao tem vocacao para ser vegano");
    }
}
