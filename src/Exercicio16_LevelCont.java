import java.util.Scanner;

/**
 * Exercicio16_ContadorDeNiveis
 *
 * Peça o nível inicial (1 a 18) e mostre todos os níveis até o 18 usando for.
 */

public class Exercicio16_LevelCont {
    public static void main(String[] args) {
        System.out.println("Digite o seu nível de (1 a 18):");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level >= 1 && level <= 18) {
            for (int i = level; i <= 18; i++) {
                System.out.println("Level Up: " + i);
            }
        } else {
            System.out.println("Nível inválido. Digite um valor entre 1 e 18.");
        }
        scanner.close();
    }
}
