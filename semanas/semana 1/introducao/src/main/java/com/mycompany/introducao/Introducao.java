/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introducao;

import java.util.Scanner;

/**
 *
 * @author gasin
 */
public class Introducao {

    public static void main(String[] args) {
        hello();
        loops();
        condicionais();
    }
    
    public static void hello() {
        String nome = inputMame();
        System.err.println("Hello " + nome);
    }
    
    public static String inputMame() {
        String name;
        Scanner scanner = new Scanner(System.in); // Criando o scanner para ler do usuário
    
        System.out.println("Digite seu nome: ");
        name = scanner.next(); // Lendo o input do usuário em string
        
        return name;
    }
    
    public static void loops() {
        int n = 10;
        int iterator = 0;
        
        for(int i = 0; i < n; i++)
        {
            System.out.println("Valor no for: " + i);
        }
        
        while (iterator < n) 
        {
            iterator++;
            System.out.println("Valor no while: " + iterator);
        }
    }
    public static void condicionais() {
        if (true) {
            System.out.println("True é verdadeiro");
        }
        
        int valor1 = 10;
        int valor2 = 20;
        if (valor1 > valor2)
        {
            System.err.println("Valor1 é meaior que valor2");
        }
        else
        {
            System.out.println("Valor2 é maior que valor1");
        }
        
        String valorSwitch = "batata";
        switch (valorSwitch) {
            case "P?O":
                System.err.println("A variável é P?O");
                break;
            case "batata":
                System.err.println("A variável é batata");
                break;
            case "queijo":
                System.err.println("A variável é queijo");
            default:
                System.err.println("A variável n?o é nenhuma das anteriores");
        }
    }
}
