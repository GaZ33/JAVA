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
        casting();
        manipulacaoString();
        hello();
        loops();
        condicionais();
    }
    
    public static void hello() {
        String nome = inputMame();
        System.err.println("Hello " + nome);
    }

    public static void manipulacaoString() {
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

    public static void casting() 
    {
        Integer inteiro = 10;
        Long longo = 1000l; // Precisa do l no final
        Float flutuante = 5.0f; // Precisa de um f no final
        Double duplo = 5.1; //
        Boolean booleano = true;
        String caracteres = "O imundo";
        
        System.out.println("Tipos em java:");
        System.out.println("Inteiro: " + inteiro.getClass().getName());
        System.out.println("Longo: " + longo.getClass().getName());
        System.out.println("Flutuante: " + flutuante.getClass().getName());
        System.out.println("Duplo: " + duplo.getClass().getName());
        System.out.println("Boolean: " + booleano.getClass().getName());
        System.out.println("String: " + caracteres.getClass().getName());
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
            case "PãO":
                System.err.println("A variável é P?O");
                break;
            case "batata":
                System.err.println("A variável é batata");
                break;
            case "queijo":
                System.err.println("A variável é queijo");
            default:
                System.err.println("A variável não é nenhuma das anteriores");
        }
    }
    public static void arrayMatrizes() 
    {
        // Array
        int vetor[] = {1, 2, 3, 4, 5}; // 1° maneira de declarar
        int[] vetor2 = {6, 7, 8, 9, 10}; // 2° maneira de declarar
        
        // Iterando o vetor
        for (int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i]);
            
        }
        // For each do python
        for (int numero : vetor2)
        {
            System.out.println(numero);
        }
        
        // Matrizes
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // 1° maneira de declarar matriz
        
        int[][] matriz2 = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
        };
        
        // iterando
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("");
        }
        // 2° maneira de iterar
        for (int[] matriz1 : matriz2) {
            for (int matrzv : matriz1) {
                System.out.print(matriz1[matrzv]);
            }
            System.out.print("");
        }
    }
}
