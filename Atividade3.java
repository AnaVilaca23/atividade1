/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author Ana Vilaca
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //o scanner le os valores do teclado que serao armazenados na matriz
        Scanner lermatriz = new Scanner(System.in);
        int matriz[][];
        matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ":");
                //a posicao i recebe o valor que sera colocado na linha e a posicao j recebe o valor da coluna
                matriz[i][j] = lermatriz.nextInt();
                System.out.println("");
            }

        }
         //imprime a matriz na tela
          System.out.println("MATRIZ"); 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }

}
