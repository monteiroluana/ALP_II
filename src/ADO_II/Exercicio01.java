package ADO_II;

import java.util.Scanner;

/**
 *
 * @author Monteiro
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Tv televisao = new Tv();//Instancia da Classe TV

        boolean ligado = false;
        boolean sair = false;
        do {
            int menu = menu(); //Chamando o método para visualizar o menu (controle)
            switch (menu) {

                //Desligar a TV
                case 0:
                    televisao.setLiga(ligado = true);
                    ligado = televisao.getLiga();
                    break;

                //Ligar a TV
                case 1:
                    televisao.setLiga(ligado = false);
                    ligado = televisao.getLiga();
                    break;

                //Aumentar o volume
                case 2:
                    //Se ligado for 'false' pedir para ligar a TV
                    if (!ligado) {
                        System.out.println("\nLigue a TV");

                        //Se for 'true' passa por parametro o valor '1' que o volume será aumentado
                    } else {
                        televisao.setVolume(1);
                    }
                    break;

                //Diminuir o volume
                case 3:
                    //Se ligado for 'false' pedir para ligar a TV
                    if (!ligado) {
                        System.out.println("\nLigue a TV");

                        //Se for 'true' passa por parametro o valor '0' que o volume será diminuido
                    } else {
                        televisao.setVolume(0);
                    }
                    break;

                //Trocar o canal
                case 4:
                    //Se ligado for 'false' pedir para ligar a TV
                    if (!ligado) {
                        System.out.println("\nLigue a TV");

                        //Se for 'true' pedir o número do canal
                    } else {
                        System.out.print("Canal: ");
                        int canal = console.nextInt();

                        //Se o canal for menor que 0 e maior que 99, não será possivel trocar de canal
                        if (canal < 0 || canal > 99) {
                            System.out.println("Canal inválido!");

                            //Se não, o canal será trocado
                        } else {
                            televisao.setCanal(ligado, canal);
                        }
                    }
                    break;

                //Visualizar
                case 5:
                    //Se ligado for 'false' pedir para ligar a TV
                    if (!ligado) {
                        System.out.println("\nLigue a TV");
                    
                    //Se não, será exibido uma mensagem com o canal e o volume
                    } else {
                        System.out.println("\nSTATUS DA TV");
                        int chanel = televisao.getCanal();
                        System.out.println("Canal: " + chanel);
                        int volume = televisao.getVolume();
                        System.out.println("Volume: " + volume);
                    }
                    break;

                //Sair do laço de repetição
                case 6:
                    sair = true;
                    break;
            }

        } while (!sair);

    }

    static int menu() {
        Scanner console = new Scanner(System.in);
        System.out.println("\n      MENU");
        System.out.println("0 - desligar TV");
        System.out.println("1 - ligar TV");
        System.out.println("2 - aumentar volume");
        System.out.println("3 - diminuir volume");
        System.out.println("4 - trocar canal");
        System.out.println("5 - visualizar canal e volume");
        System.out.println("6 - sair");
        System.out.print("OPÇÃO: ");
        int acao = console.nextInt();
        return acao;
    }

}
