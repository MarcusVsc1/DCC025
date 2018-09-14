package auladiadoniver;

/**
 *
 * @author Marcus
 */
public class Animal {
    protected int idade;
    protected String raca;
    protected String nome;
    protected String som;

    public Animal() {
    }

    
    public Animal(int idade, String raca, String nome) {
        this.idade = idade;
        this.raca = raca;
        this.nome = nome;
    }     
    
    public void comer(){
        System.out.println(nome+" acabou de comer a comida do potinho.");
    }
    
    public void dormir(){
        System.out.println(nome+" esta descansando o sono de um bebe.");
    
    }
    
    public void emitirSom(){
        System.out.println(nome+" acabou de fazer "+som+".");        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
