/*
Criar uma função que receba como parâmetro um vetor de inteiros e troque os valores pares do vetor por
0 e os valores ímpares por 1. A função principal deve ler um vetor de 10 posições de inteiros, chamar a
função criada e apresentar o vetor alterado na tela

 */
package Exercicios;
//@Monteiro

import java.util.Scanner;

public class VetorEx01_14_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];

        /*Dando um valor para os elementos do vetor*/
        System.out.println("Preenchendo o VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]: ");
            vetor[i] = input.nextInt();
        }

        /*Chamando a função que ira mudar os valores do vetor*/
        mudarVetor(vetor);

        /*Mostrando o vetor com os valores alterados*/
        System.out.println("Mostrando o VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]: "+vetor[i]);
        }
    }

    /**
     * Criar uma função que receba como parâmetro um vetor de inteiros e troque
     * os valores pares do vetor por 0 e os valores ímpares por 1.
     */
    static void mudarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                v[i] = 0;
            } else {
                v[i] = 1;
            }
        }
    }
}
