import java.util.Scanner;

/**
 * Exercicio13_ClassificadorDeCampeoes
 *
 * Peça ao jogador o tipo do campeão ("lutador", "atirador", "mago").
 * Use switch para mostrar uma característica do tipo escolhido.
 */

public class Exercicio13_SelectTypeOfChamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selecionaTipoCampeao;
        System.out.println("1-Lutador\n2-Atirador\n3-Mago");
        selecionaTipoCampeao = scanner.nextInt();

        switch (selecionaTipoCampeao) {
            case 1:
                System.out.println("Lutador");
                break;
            case 2:
                System.out.println("Atirador");
                break;
            case 3:
                System.out.println("Mago");
                break;

            default:
                break;
        }
        scanner.close();
    }
}
