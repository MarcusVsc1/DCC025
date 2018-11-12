/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0911;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class Aula0911 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File arq = new File("TesteBinario.bin");
        Cachorro dogao = new Cachorro(5,"Dogao","Yorkshire");
        ManipuladorDeArquivos.gravaObjeto(arq,dogao);
        
    }
    
}
