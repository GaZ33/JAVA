/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author gasin
 */
public class AnimalClass {
    private int idade;
    protected String nome;
    
    // Construtores
    public AnimalClass()
    {
        System.out.println("Criado AnimalClass sem argumentos");
    }
    public AnimalClass(int idade)
    {
        this.idade = idade;
    }
    public AnimalClass(String nome)
    {
        this.nome = nome;
    }
    public AnimalClass(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Getters
    public int getIdade()
    {
        return this.idade;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    // Setters
    public void setIdade(int n)
    {
        this.idade = n;
    }
    public void setNome(String str)
    {
        this.nome = str;
    }
    
    // Métodos
    public void animalFaz()
    {
        System.out.println("*Barulho*");
    }
    public void animalAniversario()
    {
        this.idade = this.idade + 1;
    }
    public void metodoTesteParaHeranca()
    {
        System.out.println("Utilizando metodoTesteParaHeranca");
    }
}
