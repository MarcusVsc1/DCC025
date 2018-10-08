/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0810;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class ClasseC {
    public static void m4() throws FileNotFoundException{
        File arq = new File("Teste.txt");
        FileInputStream fi = new FileInputStream(arq);
       
    }
}
