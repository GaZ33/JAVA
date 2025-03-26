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
    private String nome;
    
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
    
}
