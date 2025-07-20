import java.util.Scanner;

/**
 * Exercicio 4 - Loop de Experiência
 * 
 * Peça ao jogador o nível atual e mostre a progressão de níveis até o nível 18.
 * Use um laço de repetição para exibir cada nível subsequente.
 * 
 * Entrada:
 * - Nível atual do jogador (int)
 * 
 * Saída:
 * - Lista de níveis até 18 (int)
 */

public class Exercicio04_LevelUpLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nível atual para ter o print dos próximos níveis.");
        int nivelAtual = scanner.nextInt();
        for (int i = nivelAtual; i <= 18; i++) {
            System.out.println("Level Up: " + i);
        }
        scanner.close();
    }
}
