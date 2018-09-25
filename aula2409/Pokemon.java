package aula2409;

/**
 *
 * @author Marcus
 */
public class Pokemon extends Animal {

    public Pokemon(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("POKEMON! TEMOS QUE PEGAR, ISSO EU SEI");
    }
    
}
