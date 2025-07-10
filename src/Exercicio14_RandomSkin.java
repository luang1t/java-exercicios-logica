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
        System.out.println("Escolha uma skin do Ezreal de 1 a 4 sorteado:");
        int selecionaSkin = scanner.nextInt();

        switch (selecionaSkin) {
            case 1:
                System.out.println("Ez Porcelana");
                break;
            case 2:
                System.out.println("Ez Pulsefire");
                break;
            case 3:
                System.out.println("Ez PsyOps");
                break;
            case 4:
                System.out.println("Ez Dedão de Espuma");
                break;
            default:
                System.out.println("Skin não encontrada!");
                break;
        }
        scanner.close();
    }
}
