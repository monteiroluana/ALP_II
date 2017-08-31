/*
@Luana Monteiro Pereira


ATIVIDADE 01
2º semestre Análise e Desenvolvimento de Sistemas
    profº Alexandre Mignon
    31/08/17
 */
package Atividades;

import java.util.Scanner;

public class Atividade01 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;
        String lista[] = new String[50];

        do {
            //'opcaoMenu' irá chamar e receber o valor da funcao 'verMenu'
            opcaoMenu = verMenu();

            //De acordo com a opcao escolhida uma funcao especifica será executada
            //Se a opcao for diferente de 0,1,2,3 ou 4 uma mensagem será exibida;
            switch (opcaoMenu) {
                case 0:
                    System.out.println("Tchau!");
                    break;
                case 1:
                    adicionarNome(lista);
                    break;
                case 2:
                    verLista(lista);
                    break;
                case 3:
                    pesquisarNome(lista);
                    break;
                case 4:
                    deletarNome(lista);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            //Se a opcao for '0' a aplicacao será finalizar 
        } while (opcaoMenu != 0);
    }

    static int verMenu() {
        //Essa funcao mostra as opcoes da aplicacao e retorna a opcao escolhida pelo usuario
        System.out.println("\n|-----------MENU------------|");
        System.out.println(" 1 - Adicionar um novo nome");
        System.out.println(" 2 - Apresentar os nomes");
        System.out.println(" 3 - Pesquisar um nome");
        System.out.println(" 4 - Deletar um nome");
        System.out.println(" 0 - Sair");
        System.out.print("OPÇÃO: ");
        int opcao = console.nextInt();

        return opcao;
    }

    static void adicionarNome(String[] lista) {
        System.out.println("\n    ~~  ADICIONAR NOME  ~~");
        String nome;
        int nVazio = 0;

        System.out.print("Nome: ");
        nome = console.next();
        nome = nome.toLowerCase().trim();

        for (int i = 0; i < lista.length; i++) {

            //Se o nome já estiver na lista, vai ser exibido uma mensagem
            if (nome.equals(lista[i])) {
                System.out.println("** Esse nome já existe na lista **");
                // dando um valor para nVazio aqui, para quando sair do 'for' ele não executar o 'if' 
                nVazio++;
                break;
            }//Verificando se a posicao na lista está vazia, se estiver, adiciona o nome
            else if (lista[i] == null) {
                nVazio++;
                lista[i] = nome;
                System.out.println("** nome [" + nome.toUpperCase() + "] foi ADICIONADO com sucesso **");
                break;
            }
        }
        //Se a lista não tiver mais espaco, mostrar a mensagem Lista cheia e não deixar o usuário continuar
        if (nVazio == 0) {
            System.out.println("** Lista CHEIA **");

        }
    }

    static void verLista(String[] lista) {
        System.out.println("\n    ~~  APRESENTANDO OS NOMES  ~~");
        System.out.println("(nº)         (nome)");

        for (int i = 0; i < lista.length; i++) {
            //Se a lista na posicao '0' for 'null', apresentar uma mensagem e sair do 'for' 
            if (lista[0] == null) {
                System.out.println("** Lista vazia **");
                break;
            } //Se não, apresentar os nomes na lista
            else if (lista[i] != null) {
                System.out.println(" " + i + " - - - - - " + lista[i]);
            }
        }

    }

    static void pesquisarNome(String[] lista) {
        System.out.println("\n    ~~  PESQUISAR NOME  ~~");

        System.out.print("Nome: ");
        String nome = console.next();
        nome = nome.trim();

        boolean achou = false;
        for (int i = 0; i < lista.length; i++) {

            //Se o nome estiver na lista, 'achou' vai receber true, e depois irá apresentar o nome com a posicao na lista
            if (nome.equals(lista[i])) {
                achou = true;
                System.out.println("(nº)         (nome)\n[" + i + "]- - - - - " + lista[i]);
            }
        }
        //Se 'achou' for false, apresentar uma mensagem 
        if (!achou) {
            System.out.println("** Nome não encontrado na lista **");
        }

    }

    static void deletarNome(String[] lista) {
        System.out.println("\n    ~~  DELETAR NOME  ~~");

        System.out.print("Nome: ");
        String nome = console.next();

        int posicao = -1;

        //Esse vetor está removendo o nome, alterando o valor para null e pegando o indice em que ocorreu a exclusao
        for (int i = 0; i < lista.length; i++) {
            if (nome.equals(lista[i])) {
                lista[i] = null;
                posicao = i;
                System.out.println("** Nome[" + nome.toUpperCase() + "] foi REMOVIDO com sucesso **");
            }
        }

        if (posicao < 0) {
            System.out.println("** Nome não encontrado **");
        }

        //Esse vetor está organizando os valores na lista 
        for (int i = 0; i < lista.length; i++) {

            //Se o indice for igual ao valor da variavel 'posicao' e menor que o tamanho do vetor 
            if (i == posicao && i < lista.length - 1) {

                //lista na posicao [i] vai receber o valor da proxima posicao;
                lista[i] = lista[i + 1];

                //A proxima posicao vai receber o valor 'null'
                lista[i + 1] = null;

                //A variavel 'posicao' vai receber o valor do indice + 1
                posicao = i + 1;

                //Se não, se o indice for igual ao valor da variavel 'posicao' e for igual ao tamanho do vetor  
            } else if (i == posicao && i == lista.length) {

                //lista na posicao [i] vai receber 'null'
                lista[i] = null;
            }

        }
    }
}

/*
Criar um programa para o gerenciamento de uma lista de nomes. Os nomes devem ser armazenados em um
vetor do tipo String de tamanho 50. O programa deve possuir o seguinte menu:
1 - Adicionar um novo nome
2 - Apresentar os nomes
3 - Pesquisar um nome
4 - Remover um nome
0 - Sair

Observações
 
 Ao adicionar um novo nome:
– O nome deve ser lido via teclado;
– O nome deve ser inserido no final da lista;
– Caso a lista esteja cheia, apresentar uma mensagem indicativa ao usuário e não adicionar o nome
na lista;
– Não é permitido adicionar um nome já existente na lista. Caso já exista o nome na lista, apresentar
uma mensagem indicativa ao usuário.
    
Ao apresentar os nomes:
– Se a lista estiver vazia, apresentar uma mensagem indicativa ao usuário;
– Os nomes devem ser apresentados na ordem em que foram inseridos na lista.
    
 Ao pesquisar um nome:
– Ler via teclado o nome a ser pesquisado;
– Apresentar uma mensagem informando se o nome foi ou não encontrado. Caso o nome tenha sido
encontrado, apresentar também a posição do nome no vetor.

 Ao remover um nome:
– Ler via teclado o nome a ser removido;
– Se o nome informado não estiver na lista, apresentar uma mensagem indicativa ao usuário;
– A posição que contém o nome a ser removido deve ser preenchida com o próximo nome e assim
sucessivamente. Não podem haver posições vazias no meio do vetor

 */
