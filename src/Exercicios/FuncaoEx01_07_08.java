/**
 * Criar uma função que receba como parâmetro um número inteiro e retorne true se o número for par e
 * false se o número for ímpar. A função principal deve ler um número inteiro, chamar a função criada e
 * apresentar uma mensagem indicando se o número é par ou ímpar.
 */
package Exercicios;
//@Monteiro

import java.util.Scanner;

public class FuncaoEx01_07_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        int num = input.nextInt();
        boolean parImpar = ehPar(num);

        if (parImpar) {
            System.out.println("o número é Par");
        } else {
            System.out.println("o número é Impar");
        }
    }

    static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
