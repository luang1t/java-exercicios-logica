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

        int nivelAtual, i;

        System.out.println("Digite seu nível atual: ");
        nivelAtual = scanner.nextInt();

        if (nivelAtual >= 1 && nivelAtual <= 18) {
            System.out.println("Evoluindo do nível " + nivelAtual + " até o nível 18.");

            for (i = nivelAtual; i <= 18; i++) {
                System.out.println("Nível subindo: " + i);
            }
        } else
            System.out.println("Digite um nível entre 1 e 18.");

    }

}
