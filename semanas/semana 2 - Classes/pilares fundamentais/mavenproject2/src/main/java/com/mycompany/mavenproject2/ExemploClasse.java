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
    public ExemploClasse(int n, String nome)
    {
        valor2 = n;
        valor = n;
        this.nome = nome;
        System.out.println("Inicializando a Classe com 2 argumentos string: " + this.nome + " e int público: " + valor2);
    }
    
    
    
    
    
    
}
