/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.util.Objects;

/**
 *
 * @author gasin
 */
public class Triangulo {
    public Double lado1; // Sim, os lados são public e não private
    public Double lado2; 
    public Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) 
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public boolean ehTriangulo()
    {           // Verificando se a soma de 2 lados é maior que um lado
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1 &&
                // Verificando se os lados são maiores ue 0
                 lado1 > 0 && lado2 > 0 && lado3 > 0;
    }
    public boolean ehEquilatero()
    {
        // Comparando os valores cpm 2 métodos diferentes
        return Objects.equals(lado1, lado2) && lado2.equals(lado3);
        
    }
    public boolean ehIsosceles()
    {
        return Objects.equals(lado1, lado2) || lado2.equals(lado3) || lado1.equals(lado3); 
    }
    public boolean ehEscaleno()
    {
        return !(Objects.equals(lado1, lado2) || lado2.equals(lado3) || lado1.equals(lado3)); 
    }
    public boolean ehRetangulo()
    {
        
    }
    public Double calcularArea()
    {
        
    }
    
}
