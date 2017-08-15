/*
 O quadrado de um número natural n é dado pela soma dos n primeiros números ímpares consecutivos. 
Porexemplo, 12 = 1, 22 = 1+3, 32 = 1+3+5, 42 = 1+3+5+7, etc. Criarumafunçãoquereceba como 
parâmetro um número inteiro positivo maior que zero, calcule e retorne o seu quadrado usando a 
soma de ímpares ao invés do produto. A função principal deve ler um número inteiro, chamar a função 
criada e apresentar na tela o valor retornado pela função.

 */
package Exercicios;

import java.util.Scanner;

public class FuncaoEx03_07_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Lendo um número natural*/
        System.out.print("Número: ");
        int num = input.nextInt();
        
        int quadrado = calcularQuadrado(num);
        
        System.out.println(num+"² = "+quadrado);
    }

    static int calcularQuadrado(int n) {
        int quadrado = 0;
        int impar = 1;

        for (int i = 0; i < n; i++) {
            quadrado += impar;
            impar += 2;
        }
        return quadrado;
    }
}
