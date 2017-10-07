package ADO_II;

import java.util.Scanner;

/**
 *
 * @author Monteiro
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Pessoa people = new Pessoa();//Instancia da Classe Pessoa

        System.out.println("CALCULE O SEU IMC");

        //Nome
        System.out.print("Nome: ");
        String nome = console.next();
        people.setNome(nome);

        //Idade
        System.out.print("Idade: ");
        int idade = console.nextInt();
        people.setIdade(idade);

        System.out.println("***Use a virgula ao invez do ponto EX: 52,40 / 1,69*** ");

        //Peso
        System.out.print("Peso: ");
        float peso = console.nextFloat();
        people.setPeso(peso);

        //Altura
        System.out.print("Altura: ");
        float altura = console.nextFloat();
        people.setAltura(altura);

        //Calculando o valor do IMC
        float imc = people.calcIMC(peso, altura);

        //Exibindo o resultado do calculo IMC
        System.out.println("\nRESULTADO");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("IMC: %.2f", imc);
        System.out.print("\nCategoria: ");
        people.categoriaIMC(imc);

    }
}
