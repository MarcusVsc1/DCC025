//Objeto Jogador. 
package batalhanaval;

import java.util.Scanner;

public final class Jogador {
    int mapa[][]; 
    Navio b1[];
    String nome;
    int naviosOk = 4;
//Construtor. Vai conter quatro navios, de tamanho 1 a 4, nome e quantidade de navios ainda no jogo, como se fosse um contador de vidas.
//cada jogador vai ter um mapa 6x6 em que os navios serao incluidos.
    public Jogador(){
        mapa = new int[6][6];
        for(int i = 0;i<6;i++){
            for(int j = 0;j<6;j++){
                mapa[i][j]=0;
            }
        }
        b1 = new Navio[4];
        System.out.println("===================================");
        System.out.println("Digite o seu nome.");
        Scanner nm = new Scanner(System.in);
        nome = nm.nextLine();
        for(int n = 0;n<4;n++){
            b1[n] = new Navio(1+n);    
        }
        System.out.println("Para a posicao dos navios, sera usada a primeira direcao valida a partir da definida pelo usuario, em sentido horario.");
        System.out.println("Caso nao haja posicao possivel em todas as direcoes, o usuario devera definir novamente a posicao do navio.");
        posicaoNavio();
        for(int i = 0;i<20;i++){
            System.out.println("||");
        }
    }
//metodo do palpite. Verifica se o x e y passados sao validos e, caso sejam, verifica se o ha navio, se foi antigido, quantidade de vidas, etc.
    public boolean palpitar(){
        boolean ok = false;
        int x;
        int y;
        while(!ok){
                System.out.println("Digite a posição x de 0 a 5 do palpite");
                Scanner pos = new Scanner(System.in);
                x = pos.nextInt();
                System.out.println("Digite a posição y de 0 a 5 do palpite");
                Scanner pos2 = new Scanner(System.in);
                y = pos2.nextInt();
                if(x<0 || x>5 || y<0 || y>5){
                    System.out.println("Posicao invalida! Digite novamente.");
                }else{
                    if(mapa[x][y]<=0){
                            if(mapa[x][y]==-1){
                                System.out.println("Ponto ja atingido!");
                            }else{
                            System.out.println("Agua!");
                            }
                    }else{
                            System.out.println(b1[mapa[x][y]-1].tipo+" do jogador "+nome+" atingido!");
                            b1[mapa[x][y]-1].vidas--;
                            if(b1[mapa[x][y]-1].vidas==0){
                                naviosOk--;
                                b1[mapa[x][y]-1].afundou = true; 
                                System.out.println(b1[mapa[x][y]-1].tipo+" do jogador "+nome+" afundou!");
                            }
                            mapa[x][y]=-1;
                    }
                    ok=true;
                }   
        }
        return naviosOk==0;
    }
//metodo para insercao dos navios que eh chamado no construtor.
    public void posicaoNavio(){
        for(int i = 0;i<4;i++){
            boolean ok = false;
            int x;
            int y;
            while(!ok){
                System.out.println("Digite a posição x de 0 a 5 do "+b1[i].tipo);
                Scanner pos = new Scanner(System.in);
                x = pos.nextInt();
                System.out.println("Digite a posição y de 0 a 5 do "+b1[i].tipo);
                Scanner pos2 = new Scanner(System.in);
                y = pos2.nextInt();
                ok = verificaPosicao(x,y,i);
                if(!ok){
                    System.out.println("Nao foi possivel com as coordenadas digitadas em nenhum lado.");
                }
            }
        }
    }
//metodo auxiliar que eh chamado pelo metodo de insercao. verifica se a posicao eh valida.
    public boolean verificaPosicao(int x, int y, int i){
        if(x<0 || x>5 || y<0 || y>5){
            return false;
        }else {
            if(mapa[x][y]!=0){
                return false;
            }
            if(i!=0){
                System.out.println("Escolha um lado. Direita = 1, Esquerda = 2, Cima = 3, Baixo = 4.");
                Scanner d = new Scanner(System.in);
                int dir = d.nextInt();
                return viavel(x,y,i,dir,0);
            }else{
                mapa[x][y]=i+1;
            }
        }
        return true;
    }
// outro metodo auxiliar que verifica se a direcao do navio eh valida. Se negativo, verifica em sentido horario, comecando pela direcao indicada pelo
//jogador. Se nenhuma posicao for valida, pede outras coordenadas.
    public boolean viavel(int x, int y, int i, int dir,int t){
        if(t==4){
            return false;
            }
        switch(dir){
            case 1:
                if(x+i>=5){
                    return viavel(x,y,i,4,t+1);
                }
                for(int z=1;z<=i;z++){
                    if(mapa[x+z][y]!=0){
                        return viavel(x,y,i,4,t+1);
                    }
                }
                for(int z=0;z<=i;z++){
                    mapa[x+z][y]=i+1;
                }
                break;
            case 4:
                if(y+i>=5){
                    return viavel(x,y,i,2,t+1);
                }
                for(int z=1;z<=i;z++){
                    if(mapa[x][y+z]!=0){
                        return viavel(x,y,i,2,t+1);
                    }
                }
                for(int z=0;z<=i;z++){
                    mapa[x][y+z]=i+1;
                }
                break;
            case 2:
                if(x-i<0){
                    return viavel(x,y,i,3,t+1);
                }
                for(int z=1;z<=i;z++){
                    if(mapa[x-z][y]!=0){
                        return viavel(x,y,i,3,t+1);
                    }
                }
                for(int z=0;z<=i;z++){
                    mapa[x-z][y]=i+1;
                }
                break;
            case 3:
                if(y-i<0){
                    return viavel(x,y,i,1,t+1);
                }
                for(int z=1;z<=i;z++){
                    if(mapa[x][y-z]!=0){
                        return viavel(x,y,i,1,t+1);
                    }
                }
                for(int z=0;z<=i;z++){
                    mapa[x][y-z]=i+1;
                }
                break;
            default:
                return false;  
        }
        return true;
    }
//metodo para imprimir os dados de cada jogador quando iniciar a sua rodada. imprime SOMENTE os dados dos navios em combate - os afundados nao tem seus
//dados impressos.
    public void imprimeInfo(){
        System.out.println("Jogador "+nome);
        System.out.println("Navios ainda em combate: "+naviosOk);
        for(int i = 0;i<4;i++){
            if(!b1[i].afundou){
                System.out.println("Navio "+b1[i].tipo);
                int tiros = i+1-b1[i].vidas;
                System.out.println("Tiros tomados: "+tiros);
            } 
        }
    }
}