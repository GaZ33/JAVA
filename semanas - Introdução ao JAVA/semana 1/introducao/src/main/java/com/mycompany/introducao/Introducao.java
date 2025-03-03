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

    public static void stringManipulation(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in); // Criando o scanner para ler um input do usuário

        System.out.println("Digite algum texto: ");

        text = scanner.next();

        String text2 = text; // Cria uma cópia de text para text2
        System.out.println("Quantidade de caracteres na string: " + text.length()); // Quantidade de caracteres
        System.out.println("Upper case: " + text.toUpperCase()); // Texto para uppercase
        System.out.println("Lower case:" + text.toLowerCase()); // Texto para lowercase
        System.out.println("Substring da 2° para a 5° letra" + text.substring(2, 6));
        System.out.println("Remover espaços em branco: " + text.trim());
        System.out.println("Retornar a 3° letra do texto" + text.charAt(2));
        System.out.println("Retorna o index do 1° 'a' que encontrar, se retornar -1 é pq n existe na string:" + text.indexOf(("a")));
        System.out.println("Retorna o index da última ocorrência, se não existir retorna -1" + text.lastIndexOf(text2));
        System.out.println("Comparação de duas strings text igual a text2:" + text.equals(text2));
        System.out.println("Retorna em boolean se o texto está vazio" + text.isEmpty());
        System.out.println("Retorna uma lista com as palavras separadas por espaço" + text.split(" ")); // Semelhando ao python
        System.out.println("Retorna uma lista com os caracteres separadas individualmente" + text.split("")); 
        System.out.println("Retorna uma lista com os textos separados por ',': " + text.split(","));
        System.out.println("Retorna todos os \"a\" por \"#\":" + text.replace("a", text));

        scanner.close(); // Fechando o scanner após o uso
        System.out.println("");
    }
    
    public static String inputMame() {
        String name;
        Scanner scanner = new Scanner(System.in); // Criando o scanner para ler do usu�rio
    
        System.out.println("Digite seu nome: ");
        name = scanner.next(); // Lendo o input do usuário em string
        scanner.close(); // Fechando o objeto scanner - evitar vazamento de dados

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
            System.out.println("True � verdadeiro");
        }
        
        int valor1 = 10;
        int valor2 = 20;
        if (valor1 > valor2)
        {
            System.err.println("Valor1 � meaior que valor2");
        }
        else
        {
            System.out.println("Valor2 � maior que valor1");
        }
        
        String valorSwitch = "batata";
        switch (valorSwitch) {
            case "P?O":
                System.err.println("A vari�vel � P?O");
                break;
            case "batata":
                System.err.println("A vari�vel � batata");
                break;
            case "queijo":
                System.err.println("A vari�vel � queijo");
            default:
                System.err.println("A vari�vel n?o � nenhuma das anteriores");
        }
    }
}
