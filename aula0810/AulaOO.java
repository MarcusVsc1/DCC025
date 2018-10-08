/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0810;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class AulaOO {
    public static void chegarNaAula(int horario){
        try{
            if (horario > 19) {
                throw new ChegarAtrasadoException("Aluno está atrasado!");
            }
        }
        catch (ChegarAtrasadoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"A Vania vai te reprovar.",JOptionPane.ERROR_MESSAGE);

        }
    }
}
