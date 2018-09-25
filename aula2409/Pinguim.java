package aula2409;

/**
 *
 * @author Marcus
 */
public class Pinguim extends Animal{

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Qual o som do pinguim mesmo?");
    }
    @Override
    public boolean equals(Object p1){
        if (p1 instanceof Pinguim) {
            Pinguim qualquer = (Pinguim) p1;
            return (this.getNome().equals(qualquer.getNome()));
    }else{
        return false;
    }
    }
}
