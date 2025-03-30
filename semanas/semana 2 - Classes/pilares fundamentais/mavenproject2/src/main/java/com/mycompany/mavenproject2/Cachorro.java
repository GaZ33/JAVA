/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author gasin
 */
public class Cachorro extends AnimalClass{
    private String raca;
    
    public Cachorro()
    {
        this.raca = "";
    }
    public Cachorro(String nome, int idade, String raca)
    {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    

    @Override
    public void animalFaz() {
        System.out.print("Au au");
    }
}
