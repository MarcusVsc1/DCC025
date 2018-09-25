/**
 * Aula sobre herança
 * 
 */
package aula2409;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Aula2409 {


    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList();
        animais.add(new Pokemon("Bulbasauro", 12));
        animais.add(new Pinguim("Pingu", 15));
        animais.add(new Pinguim("Pingu", 15));
        Pinguim tobias = new Pinguim("Tobias",18);
        Pinguim tobias2 = new Pinguim("Tobias",19);
        System.out.println(tobias.equals(tobias2));
        for(int i = 0; i<animais.size(); i++){
            animais.get(i).emitirSom();
            System.out.println(animais.get(i).toString());
        }
        
    }
    
}
