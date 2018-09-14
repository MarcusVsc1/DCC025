//aula de herança, 14/09/2018!
package auladiadoniver;

/**
 *
 * @author Marcus
 */
public class AulaDiaDoNiver {

    public static void main(String[] args) {
        Cachorro cao = new Cachorro(10,"Collie","Dogao");
        cao.emitirSom();
        Gato bichano = new Gato(5,"Persa","Shamisen");
        bichano.comer();
        bichano.emitirSom();
        bichano.comerCarne();
        Leao rei = new Leao(10, "Lion", "king");
        rei.emitirSom();
        rei.comerCarne();
    }
    
}
