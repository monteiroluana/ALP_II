/*
Criar uma função que receba como parâmetros dois números (m e n) inteiros positivos maiores que zero
e retorne a soma dos números no intervalo entre m (inclusive) e n (inclusive); assumir que o valor de m
é menor ou igual ao valor de n. A função principal deve ler dois números inteiros positivos maiores que
zero, chamar a função criada e apresentar o valor retornado pela função.

 */
package Exercicios;
//@Monteiro

import java.util.Scanner;

public class FuncaoEx02_07_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*A função principal deve ler dois números inteiros positivos maiores que zero*/
        System.out.print("Insira M: ");
        int m = input.nextInt();
        System.out.print("Insira N: ");
        int n = input.nextInt();

        /*Chamando a função que irá soma dos números no intervalo entre m (inclusive) e n (inclusive)*/
        int soma = somarElementos(m, n);

        System.out.println("Soma = " + soma);
    }

    /**
     * Criar uma função que receba como parâmetros dois números (m e n) inteiros
     * positivos maiores que zero e retorne a soma dos números no intervalo
     * entre m (inclusive) e n (inclusive)
     */
    static int somarElementos(int m, int n) {
        int soma = 0;
        for (int i = m; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
