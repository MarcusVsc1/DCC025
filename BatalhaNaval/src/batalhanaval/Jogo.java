//objeto do Jogo. Inicializa dois jogadores, apenas (seria possivel mais, porem precisaria de algumas alteracoes no construtor e no metodo inicializarGame).

package batalhanaval;

public class Jogo {
    Jogador j1;
    Jogador j2;
//construtor: dois jogadores incluidos.
    public Jogo() {
        System.out.println("======================");
        System.out.println("Jogador 1");
        j1 = new Jogador();
        System.out.println("======================");
        System.out.println("Jogador 2");
        j2 = new Jogador();
    }
//metodo de iniciar o jogo. continua no while enquanto nao tiver um vencedor. imprime os dados de cada jogador e permite um palpite por rodada.
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
