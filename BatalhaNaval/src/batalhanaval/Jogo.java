package batalhanaval;

public class Jogo {
    Jogador j1;
    Jogador j2;
    public Jogo() {
        System.out.println("======================");
        System.out.println("Jogador 1");
        j1 = new Jogador();
        System.out.println("======================");
        System.out.println("Jogador 2");
        j2 = new Jogador();
    }
    public void iniciarGame(){
        boolean win = false;
        while (!win) {
            System.out.println("======================");
            j1.imprimeInfo();
            win=j2.palpitar();
            if(win){
                System.out.println("Todos os navios do jogador "+j2.nome+" afundaram.");
                System.out.println("Vencedor: Jogador "+j1.nome+".");
                break;
            }
            System.out.println("======================");
            j2.imprimeInfo();
            win=j1.palpitar();
            if(win){
                System.out.println("Todos os navios do jogador "+j1.nome+" afundaram.");
                System.out.println("Vencedor: Jogador "+j2.nome+".");
                break;
            }
        }  
    }
}
