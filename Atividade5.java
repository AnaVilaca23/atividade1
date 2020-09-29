/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ana Vilaca
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz1[][];
        int matriz2[][];
        int matrizsoma[][];
        matriz1 = new int[10][10];
        matriz2 = new int[10][10];
        matrizsoma = new int[10][10];

        try { //Recurso usado para tratamento de excessões do Java. Requisito do leitor de arquivo  

            Scanner input = new Scanner(new File("C:\\Users\\Ana Vilaca\\Desktop\\matriz.txt")); 
            //lê o arquivo e preenche as linhas e colunas da primeira matriz 
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz1[i][j] = input.nextInt();
                }

            }

            System.out.println("Matriz 1"); 

            //imprime a matriz na tela
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(" " + matriz1[i][j] + " "); 
                }

                System.out.println(" "); 

            }

            System.out.println(); 

            //lê o arquivo e preenche as linhas e colunas da segunda matriz
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    matriz2[k][l] = input.nextInt(); 
                }

            }

            System.out.println("Matriz 2");
            
            //imprime a segunda matriz na tela
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    System.out.print(" " + matriz2[k][l] + " ");
                }

                System.out.println(" ");
            }

            System.out.println();

            //soma
            for (int u = 0; u < 10; u++) {
                for (int v = 0; v < 10; v++) {
                    matrizsoma[u][v] = matriz1[u][v] + matriz2[u][v]; 
                }
            }

            //imprime a matriz resultante da soma na tela
            System.out.println("Matriz resultante da soma das matrizes 1 e 2");
            for (int u = 0; u < 10; u++) {
                for (int v = 0; v < 10; v++) {
                    System.out.print( matrizsoma[u][v]+ " ");
                }

                System.out.println(" ");

            }

        } catch (IOException ioe) { 

            System.out.println(ioe); 

        }

    }
}


