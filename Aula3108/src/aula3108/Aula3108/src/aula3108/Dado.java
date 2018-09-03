package aula3108;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Dado {
    private int roll;
    ArrayList vet;
    public String retornaDado(int n){
        switch(n){
            case 1:
                return "***************\n"+
                       "*             *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*             *\n"+
                       "***************";
            case 2:
                return "***************\n"+
                       "*             *\n"+
                       "*  *          *\n"+
                       "*             *\n"+
                       "*          *  *\n"+
                       "*             *\n"+
                       "***************";
            case 3:
                return "***************\n"+
                       "*  *          *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*          *  *\n"+
                       "***************";
            case 4:
                return "***************\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "***************";
            case 5:
                return "***************\n"+
                       "*  *       *  *\n"+
                       "*             *\n"+
                       "*      *      *\n"+
                       "*             *\n"+
                       "*  *       *  *\n"+
                       "***************";
            case 6:
                return "***************\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "*             *\n"+
                       "*   *     *   *\n"+
                       "***************";
            default:
                return "0";
                
                
                
        }
    }
    
    public void rolarDado(){
        
    }
}
