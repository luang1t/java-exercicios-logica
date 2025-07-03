import java.util.Scanner;

/**
 * Exercicio 3 - Quem tem mais gold?
 * 
 * Receba o gold de dois jogadores e mostre quem está com mais ouro.
 * Caso estejam empatados, mostre essa informação também.
 * 
 * Entrada:
 * - Gold do jogador 1 (int)
 * - Gold do jogador 2 (int)
 * 
 * Saída:
 * - Mensagem indicando quem tem mais gold ou se estão empatados
 */

public class Exercicio03_GoldComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goldJogadorUm, goldJogadorDois;

        System.out.println("Digite a quantidade de gold do primeiro jogador: ");
        goldJogadorUm = scanner.nextInt();

        System.out.println("Digite a quantidade de gold do segundo jogador: ");
        goldJogadorDois = scanner.nextInt();

        if (goldJogadorUm > goldJogadorDois)
            System.out.println("Jogador um tem mais gold!");
        else if (goldJogadorDois > goldJogadorUm)
            System.out.println("Jogador dois tem mais gold!");
        else
            System.out.println("Os dois tem o mesmo gold!");

        scanner.close();

    }
}