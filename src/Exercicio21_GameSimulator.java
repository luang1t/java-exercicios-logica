import java.util.Scanner;

/**
 * Exercicio11_SimuladorDePartida
 *
 * O jogador inicia com 100 de energia.
 * A cada rodada ele escolhe: 1 - atacar (-10 energia), 2 - defender (-5
 * energia).
 * O jogo só termina quando a energia chegar a 0.
 */

public class Exercicio21_GameSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energia = 100;
        do {
            System.out.println("Digite\n1-Atacar\n2-Defender");
            int acao = scanner.nextInt();
            switch (acao) {
                case 1:
                    energia -= 10;
                    System.out.println("Você ainda tem " + energia + " energias");
                    break;
                case 2:
                    energia -= 5;
                    System.out.println("Você ainda tem " + energia + " energias");
                    break;
                default:
                    System.out.println("Digite 1 ou 2!");
            }
        } while (energia > 0);
        System.out.println("Fim das energias!");
        {
            scanner.close();
        }
    }
}