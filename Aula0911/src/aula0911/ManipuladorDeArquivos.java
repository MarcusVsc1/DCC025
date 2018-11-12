/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0911;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ice
 */
class ManipuladorDeArquivos {
    public static void gravaObjeto(File arq, Object obj){
        try {
            
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(arq));
            arquivo.writeObject(obj);
            arquivo.flush();
            arquivo.close();
            
            
        } catch (IOException ex) {
            System.out.println("Erro! "+ex.getMessage());
        }
    }
}
