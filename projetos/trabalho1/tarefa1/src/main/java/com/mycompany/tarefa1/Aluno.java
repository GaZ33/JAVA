/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1;

/**
 *
 * @author gasin
 */
public class Aluno {
    private String nome, ra;
    private Disciplina disciplinas[];
    
    
    // Getters
    public String getNome() {
        return this.nome;
    }
    public String getRa() {
        return this.ra;
    }
    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    
}
