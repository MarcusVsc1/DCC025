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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class Cachorro {
    private int idade;
    private String nome;
    private String raca;

    public Cachorro(int idade, String nome, String raca) {
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
    
    @Override
    public String toString(){
        return "Cachorro "+nome+" da raca "+raca+".";
    }
    
    
}
