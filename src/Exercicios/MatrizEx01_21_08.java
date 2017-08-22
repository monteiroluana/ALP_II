/*
Faça um programa para somar duas matrizes.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author luana.mpereira5
 */
public class MatrizEx01_21_08 {

    public static void main(String[] args) {

        /*Tamanho da matriz*/
        System.out.print("LINHAS: ");
        int row = tamanhoMatriz();
        System.out.print("COLUNAS: ");
        int column = tamanhoMatriz();

        /*Populando a Matriz A*/
        int[][] matrizA = new int[row][column];
        System.out.println("PREENCHENDO MATRIZ A");
        matrizA = preenchendoMatriz(matrizA);

        /*Populando a Matriz B*/
        int[][] matrizB = new int[row][column];
        System.out.println("PREENCHENDO MATRIZ B");
        matrizB = preenchendoMatriz(matrizB);

        /*Somando as duas matrizes*/
        int[][] somaMatriz = new int[row][column];
        somaMatriz = somandoMatrizes(matrizA, matrizB, somaMatriz);
        
        
        /*Mostrando a soma das matrizes*/
        System.out.println("SOMA");
        for (int i = 0; i < somaMatriz.length; i++) {
            for (int j = 0; j < somaMatriz[i].length; j++) {
                System.out.println("matriz [" + i + "][" + j + "] = "+somaMatriz[i][j]);
                
            }
        }
        
    }

    static int tamanhoMatriz() {
        Scanner console = new Scanner(System.in);

        System.out.print("Size: ");
        int size = console.nextInt();
        return size;
    }

    static int[][] preenchendoMatriz(int[][] matriz) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    static int[][] somandoMatrizes(int[][] mA, int[][] mB, int[][] sM) {
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                sM[i][j] = mA[i][j] + mB[i][j];
            }
        }
        return sM;

    }

}
