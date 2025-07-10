
/**
 * Exercicio11_VerificadorDeNivel
 *
 * Peça ao jogador o XP atual e classifique o nível:
 * - Ferro: XP < 500
 * - Prata: 500 <= XP < 1000
 * - Ouro: 1000 <= XP < 1500
 * - Diamante: XP >= 1500
 */
import java.util.Scanner;

public class Exercicio11_VerifyLevel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seu XP corresponde seu elo:\n0 - infinito.");
        int xP;
        xP = scanner.nextInt();
        if (xP < 500)
            System.out.println("Ferro");
        else if (xP < 1000)
            System.out.println("Prata");
        else if (xP < 1500) {
            System.out.println("Ouro");
        } else
            System.out.println("Diamante");
        scanner.close();
    }
}