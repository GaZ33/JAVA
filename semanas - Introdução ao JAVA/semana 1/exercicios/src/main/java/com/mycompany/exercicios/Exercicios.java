/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gasin
 */
public class Exercicios {

    public static void main(String[] args) {
//        CriaMatriz(20, 50, 2, 2);
        //chamandoFuncao();
        int lista[] = criaVetorFibonacci(6);;
        int v[] = inverterVetor(lista);
        for (int i = 0; i < lista.length; i++)
        {
            System.out.println(v[i]);
        }
        System.out.println("Hello World!");
    }
    
    // Questão 1
    public static int[] criaVetorFibonacci(int n) 
    {
        int[] lista = new int[n];
        lista[0] = 0;
        lista[1] = 1;

        for (int i = 2; i < n; i++)
        {
            lista[i] = lista[i-1] + lista[i-2];
        }
        return lista;
    }
    
    // Questão 2
    
    public static int[] inverterVetor(int[] v) 
    {
     int[] novoVetor = new int[v.length];
     for (int i = v.length - 1, j = 0; i >= 0; i--, j++)
     {
         novoVetor[j] = v[i];
     }
     return novoVetor;
    }
    
    // Questão 3
    public static void chamandoFuncao() 
    {
        int tamanho;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        tamanho = scanner.nextInt();
        
        int[] fibonacci = criaVetorFibonacci(tamanho);
        
        System.err.println("Sequência de fibonacci:");
        for(int i : fibonacci)
        {
            System.out.print("\t" + i);
        }
        
        int[] invertido = inverterVetor(fibonacci);
        
        System.err.println("\nSequência de fibonacci invertida:");
        for(int i : invertido)
        {
            System.out.print("\t" + i);
        }
        
        scanner.close();
    }
    
    // Questão 4
    
    public static int[] criaVetor(int min, int max, int n) 
    {
        int listaAleatoria[] = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
        {
            listaAleatoria[i] = random.nextInt(max - min + 1) + min;
        }
        
        return listaAleatoria;
    }
    
    // Questão 5
    
    public static int[][] CriaMatriz(int min, int max, int lin, int col) 
    {
        int matriz[][] = new int[lin][col];
        Random random = new Random();
        
        for(int[] linha : matriz)
        {
            for(int j = 0; j < col; j++)
            {
                linha[j] = random.nextInt(max - min + 1) + min;           
            }
        }
        
        for(int[] linha : matriz)
        {
            for(int coluna : linha)
            {
                System.out.print("\t" + coluna);
            }
            System.out.print("\n");
        }
        return matriz;
    }

    // Questão 6
    
    public static boolean ehSimetrica(iint m[][]) 
    {
        // Verificando se a matriz não é quadrada
        if(m.length != m[].length)
        {
            return false
        }
        // Verificando sua transposta
        for(int i = 0; i < m.length; i++) 
            {
                for(int j = i; j < m[i].length; j++)
                    {
                        if(m[i][j] != m[j][i])
                        {
                            return false;
                        }
                    }
            }
        return true;
    }

    // Questão 7

    public static int contaMaiores(int[][] m, int x) 
    {
        int total = 0;

        for(int i = 0; i < m.length; i++) 
            {
                for(int j = 0; j < m[i].length; j++)
                    {
                        if(m[i][j] > x)
                        {
                            total++;
                        }
                    }
            }
        return total;
    }

    // Questão 8

    public static int contaPares(int[][] m) 
    {
        int total = 0;

        for(int i = 0; i < m.length; i++) 
            {
                for(int j = 0; j < m[i].length; j++)
                    {
                        if(m[i][j] % 2 == 0)
                        {
                            total++;
                        }
                    }
            }
        return total;
    }

    // Questão 9

    public static double somaMaiores(double[][] m, double x) 
    {
        Double total = 0;

        for(int i = 0; i < m.length; i++) 
            {
                for(int j = 0; j < m[i].length; j++)
                    {
                        if(m[i][j] > x)
                        {
                            total = total + m[i][j];
                        }
                    }
            }
        return total;
    }

    // Questão 10
    
    public static double mediaMenores(double[][] m, double x) 
    {
        Double total = 0;
        double quantidade = 0;

        for(int i = 0; i < m.length; i++) 
            {
                for(int j = 0; j < m[i].length; j++)
                    {
                        if(m[i][j] < x)
                        {
                            total = total + m[i][j];
                            quantidade++;
                        }
                    }
            }
        if (quantidade == 0)
        {
            return 0;
        }
        return total / quantidade;
    }
    
    
    
}

