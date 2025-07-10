import java.util.Scanner;

/**
 * Exercicio14_EscolhaDeSkin
 *
 * Mostre um menu com 4 skins (1 a 4).
 * O jogador escolhe uma opção e você imprime o nome da skin.
 * Se digitar um número inválido, mostre "Skin não encontrada".
 */

public class Exercicio14_RandomSkin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selecionaSkin;
        System.out.println("escolha uma skin de 1 a 4 sorteado");
        selecionaSkin = scanner.nextInt();
        if (selecionaSkin != 0 && selecionaSkin < 4) {

            if (selecionaSkin == 1)
                System.out.println("Curtindo verao");
            else if (selecionaSkin == 2)
                System.out.println("porcelana");
            else if (selecionaSkin == 3)
                System.out.println("pulsefire");
            else if (selecionaSkin == 4)
                System.out.println("psyops");

        } else
            System.out.println("Digite de 1-4");
        scanner.close();

    }
}
