package aula2409;

/**
 *
 * @author Marcus
 */
public abstract class Animal {
    private String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract void emitirSom();
}
