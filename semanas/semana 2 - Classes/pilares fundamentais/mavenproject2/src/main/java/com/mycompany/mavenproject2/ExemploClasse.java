/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author gasin
 */
public class ExemploClasse {
    // Criando variável privada para a clase
    private int valor;
    private String nome;
    
    // Criando variável publica para a classe
    public int valor2;
    
    // Criando variável constantes
    public static final Double PI = 3.14;
    
    
    // Criando construtor sem argumento
    public ExemploClasse() // Inicialização da classe sem argumento
    {
        System.out.println("Inicialização da Classe ExemploClasse sem argumetno");
    }
    // Criando construtor com 1 argumetno
    public ExemploClasse(String nome)
    {
        // Utilizando o this para referênciar a variável nome desse objeto
        this.nome = nome;
        System.out.println("Inicializando a Classe com um argumento de string: " + this.nome);
    }
    // Criando construtor com 2 argumentos
    public ExemploClasse(int n, String nome)
    {
        this.valor2 = n;
        valor = n;
        this.nome = nome;
        System.out.println("Inicializando a Classe com 2 argumentos string: " + this.nome + " e int público: " + valor2);
    }
    
    
    
    // ENCAPSULAMENTO
    // TODO: Métodos de manipulação
    public void exemploMetodoClasse()
    {
        System.out.println("Método ExemploMetodoClasse");
    }
    public void incrementarUmNoValor()
    {
        System.out.println("Método: IncrementarUmNoValor");
        System.out.println("Valor antes: " + this.valor);
        this.valor = this.valor + 1;
        System.out.println("Valor depois: " + this.valor);
    }
    public void incrmentarValor2(int n)
    {
        System.out.println("Método: IncrmentarValor2");
        System.out.println("Valor2 antes: " + this.valor2);
        this.valor2 = this.valor2 + n;
        System.out.println("Valor2 depois: " + this.valor2);
    }
    
   
    
    // Getters and Setters
    // Getters
    public int getValor()
    {
        return this.valor;
    }
    public int getValor2()
    {
        return valor2;
    }
    public String getNome()
    {
        return this.nome;
    }
    public static Double getPI()
    {
        return PI;
    }
    // Setters
    public void setValor(int n)
    {
        this.valor = n;
    }
    public void setValor2(int n)
    {
        valor2 = n;
    }
    public void setNome(String str)
    {
        this.nome = str;
    }
}
