/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1;

/**
 *
 * @author gasin
 */
abstract class Disciplina {
    private String nome;
    
    // Declarando métodos abstratos
    public abstract double calcularMedia();
    public abstract boolean situacaoAprovacao();
    
    // Construtor
    public Disciplina(String nome) {
        this.nome = nome;
    }
    
    // Getters e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
