/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0810;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Arquivo {
       
    public static void m1(){
        try {
            ClasseB.m2();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo tem nome mais fake news do que Jair Bolsonaro no dia primeiro de abril.","Favor verificar novamente",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
