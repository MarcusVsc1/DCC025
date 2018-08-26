//objeto Navio. Dependendo do parametro passado no construtor, vai criar um navio com tamanho e tipo diferente.

package batalhanaval;

public class Navio {
    boolean afundou = false;
    String tipo;
    int vidas;
    public Navio(int n){
        vidas = n;
        switch(n) {
            case 1:
                tipo = "Submarino";
                break;
            case 2:
                tipo = "Contratorpedeiro";
                break;
            case 3:
                tipo = "Cruzador";
                break;
            case 4:
                tipo = "Couracado";
                break;
        }
        
    }
}
