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
        
        
    }

}
