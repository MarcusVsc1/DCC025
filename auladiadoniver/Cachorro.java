package auladiadoniver;

/**
 *
 * @author Marcus
 */
public class Cachorro extends Canino{

    public Cachorro(int idade, String raca, String nome) {
        super(idade, raca, nome);
    }
    
    @Override
    public void emitirSom(){
        System.out.println(nome+" está latindo.");        
    }
}
