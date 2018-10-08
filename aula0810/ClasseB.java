/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0810;

import java.io.FileNotFoundException;

/**
 *
 * @author ice
 */
public class ClasseB {
    public static void m2() throws FileNotFoundException{
        m3();
    }

    private static void m3() throws FileNotFoundException {
        ClasseC.m4();
    }
}
