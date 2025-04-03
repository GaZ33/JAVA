/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa1;

/**
 *
 * @author gasin
 */
public class DisciplinaRegular extends Disciplina{
    private int faltas, totalAulas;
    private double notasAvaliacoes[], pesosAvaliacoes[];
    
    // Construtor completo
    public DisciplinaRegular(int faltas, int totalAulas, String nome, double notasAvaliacoes[], double pesosAvaliacoes[]){
        super(nome);
        this.faltas = faltas;
        this.totalAulas = totalAulas;
        this.pesosAvaliacoes = pesosAvaliacoes;
        this.notasAvaliacoes = notasAvaliacoes;
    }

    // Getters e setters
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    public double[] getNotasAvaliacoes() {
        return notasAvaliacoes;
    }

    public void setNotasAvaliacoes(double[] notasAvaliacoes) {
        this.notasAvaliacoes = notasAvaliacoes;
    }

    public double[] getPesosAvaliacoes() {
        return pesosAvaliacoes;
    }

    public void setPesosAvaliacoes(double[] pesosAvaliacoes) {
        this.pesosAvaliacoes = pesosAvaliacoes;
    }
    
    // Sobrescrita dos métodos abstratos
    @Override
    public double calcularMedia() {
        return 1;
    }

    @Override
    public boolean situacaoAprovacao() {
       return true;
    }
    
}
