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
        System.out.println("Escolha um tipo para saber suas características:\nLutador\nAtirador\nMago");
        String selecionaTipoCampeao = scanner.nextLine().toLowerCase();

        switch (selecionaTipoCampeao) {
            case "lutador":
                System.out.println("Lutador:\nLutadores são resistentes e gostam do corpo a corpo!");
                break;
            case "atirador":
                System.out.println("Atirador:\nAtiradores causam muito dano de longe, mas são frágeis.");
                break;
            case "mago":
                System.out.println("Mago:\nMagos usam habilidades poderosas e controlam a batalha.");
                break;

            default:
                System.out.println("Tipo inválido. Escolha entre: lutador, atirador ou mago.");
                break;
        }
        scanner.close();
    }
}
