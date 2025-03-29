/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author gasin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int n = 10;
        // Instanciando a classe com o construtor sem argumento
        ExemploClasse exemploSemArgumento = new ExemploClasse();
        
        // Instanciando a classe com o construtor de 1 argumento
        ExemploClasse exemploComString = new ExemploClasse("Jhonn");
        
        // Instanciando a classe com o construtor sem argumetno
        ExemploClasse exemploCom2Argumentos= new ExemploClasse(n, "SP");
        
        // Criando classe de AnimalClass e Gato
        AnimalClass animalGenerico = new AnimalClass("Animal Teste", 60);
        AnimalClass gatoExemplo = new Gato("Gato Teste", 20);
        
        System.out.println("Utilizando métodos do AnimalClass:");
        animalGenerico.animalFaz();
        System.out.println("Nome do animal: " + animalGenerico.getNome());
        System.out.println("Idade antes do aniversário animal" + animalGenerico.getIdade());
        animalGenerico.animalAniversario();
        System.out.println("Idade depois do aniversário animal" + animalGenerico.getIdade());
        
        System.out.println("\nUtilizando métodos do Gato:");
        
        
        
        
        
    }

}
