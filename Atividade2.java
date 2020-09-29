/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Ana Vilaca
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //o scanner lê os valores do teclado que serão armazenados no vetor
        Scanner lervetor = new Scanner(System.in);
        int vetor[];
        vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o elemento da posicao " + (i + 1) + ": ");
            //a posicao i recebe o valor inteiro que foi digitado pelo usuario
            vetor[i] = lervetor.nextInt();
            System.out.println("");
        }
        //imprime o vetor na tela
        System.out.println("VETOR");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println("");
    }
}
