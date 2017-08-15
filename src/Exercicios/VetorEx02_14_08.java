/*
Criar uma função que receba como parâmetro um vetor de inteiros e retorne o elemento de menor valor
do vetor. A função principal deve inicializar um vetor com os seguintes valores: 5, 8, 9, 1, -3, 2, 7,
chamar a função criada e apresentar o valor retornado na tela

 */
package Exercicios;
//@Monteiro

import java.util.Scanner;

public class VetorEx02_14_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int vetor[] = {5, 8, 9, 1, -3, 2, 7};
        int vetor[] = new int[7];
        
        /*Dando um valor para os elementos do vetor*/
        System.out.println("Preenchendo o VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        //Chamando a função ´para achar o menor número;
        int menor = verMenorNum(vetor);
        
        //Apresentado o menor número
        System.out.println("Menor número do vetor = " + menor);
    }

    /**
     * Criar uma função que receba como parâmetro um vetor de inteiros e retorne
     * o elemento de menor valor do vetor.
     */
    static int verMenorNum(int[] v) {
        int menor = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }
}
