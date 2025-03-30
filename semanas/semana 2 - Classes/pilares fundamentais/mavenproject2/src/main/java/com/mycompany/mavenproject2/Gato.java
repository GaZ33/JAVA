/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author gasin
 */
public class Gato extends AnimalClass {
    private String cor;
    private Boolean ehFilhote;
    private int vidas = 7;
    
    
    public Gato(String nome)
    {
        this.nome = nome;
    }
    public Gato(String nome, String cor)
    {
        this.nome = nome;
        this.cor = cor;
    }
    public Gato(String nome, int idade)
    {
        this.nome = nome;
        this.setIdade(idade);
    }
    public Gato(String nome, int idade, Boolean ehFilhote)
    {
        this.nome = nome;
        this.setIdade(idade);
        this.ehFilhote = ehFilhote;
    }

    // Sobrescrevendo o método
    @Override
    public void animalFaz() {
        System.out.println("Miau");
    }
    @Override
    public void animalAniversario() {
        this.setIdade(getIdade() + 7);
    }
    
    // Getters
    public boolean getEhFilhote()
    {
        return this.ehFilhote;
    }
    public String getCor()
    {
        return this.cor;
    }
    public int getVidas()
    {
        return this.vidas;
    }
    
    // Setters
    public void setEhFilhote(boolean ehFilhote)
    {
        this.ehFilhote = ehFilhote;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public void setVidas(int vidas)
    {
        this.vidas = vidas;
    }
    
    
}
