/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2809;

/**
 *
 * @author Marcus
 */
public abstract class Pessoa {
    private int pizza;
    private String pizzas;
    private String nome;
    private int idade;

    /**
     *
     * @param pizza
     */
    public Pessoa(int pizza) {
        this.pizza = pizza;
    }

    /**
     *
     * @param pizzas
     */
    public Pessoa(String pizzas) {
        this.pizzas = pizzas;

    }

    public Pessoa() {
        
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getPizza() {
        return pizza;
    }

    public String getPizzas() {
        return pizzas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(int pizza, String nome, int idade) {
        this.pizza = pizza;
        this.nome = nome;
        this.idade = idade;
    }

    /**
     *
     */
    public abstract void quantasPizzas();
    
}
