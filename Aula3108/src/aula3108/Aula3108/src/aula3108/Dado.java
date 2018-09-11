package aula3108;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Marcus
 */
public class Dado {
    private int roll;
    private String face;
    public void rolaDado(){
        Random n = new Random();
        int x = n.nextInt(5);
        roll = x;
        switch(x){
            case 0:
                face= "***************\n"+
                       "*             *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*             *\n"+
                       "***************";
                break;
            case 1:
                face = "***************\n"+
                       "*             *\n"+
                       "*  *          *\n"+
                       "*             *\n"+
                       "*          *  *\n"+
                       "*             *\n"+
                       "***************";
                break;
            case 2:
                face = "***************\n"+
                       "*  *          *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*          *  *\n"+
                       "***************";
                break;
            case 3:
                face = "***************\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "***************";
                break;
            case 4:
                face = "***************\n"+
                       "*  *       *  *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*  *       *  *\n"+
                       "***************";
                break;
            case 5:
                face = "***************\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "***************";
                break;
            default:
                break;          
        }
    }

    public String getFace() {
        return face;
    }
    
    public void rolarDado(){
        
    }
}
