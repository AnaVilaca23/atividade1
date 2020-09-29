/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import java.util.Scanner;

/**
 *
 * @author Ana Vilaca
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lervetor = new Scanner(System.in);
        int vetor[];
        vetor = new int[10];
        int maior;
        int menor;
        int media;
        int soma;
        soma = 0;
        maior = 0;
        menor = 9999999;

        for (int i = 0; i < 10; i++) {
            //recebe os 10 valores para armazenar no vetor 
            System.out.printf("Digite o elemento da posicao " + (i + 1) + ": ");
            vetor[i] = lervetor.nextInt();
            System.out.println(" ");
            //a cada novo valor a soma e incrementada
            soma = soma + vetor[i];

        }
        //compara os valores das posicoes com os valores setados para as variaveis maior e menor e a variavel recebe 
        //o valor da posicao comparada caso obedeca ao criterio do if
        for (int i = 0; i < 10; i++) {
            if (vetor[i] >= maior) {
                maior = vetor[i];
            }

            if (vetor[i] <= menor) {
                menor = vetor[i];
            }
        }
        //imprime o vetor na tela
        System.out.println("VETOR");
        for (int i = 0; i < 10; i++) {

            System.out.print(vetor[i] + "   ");
            System.out.println(" ");
        }
        media = soma / 10;
        //imprime na tela a media e o maior e menor valor armazenados dentro do vetor
        System.out.println(" a media e " + (media) + " ");
        System.out.println(" ");
        System.out.println(" o menor valor e " + (menor) + " ");
        System.out.println(" ");
        System.out.println(" o maior valor e " + (maior) + " ");
        System.out.println(" ");
    }

}
