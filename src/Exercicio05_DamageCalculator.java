import java.util.Scanner;

/**
 * Exercicio 5 - Calculadora de Dano
 * 
 * Peça ao jogador o dano base de uma habilidade e o multiplicador de poder de
 * habilidade (AP).
 * Calcule o dano final usando a fórmula:
 * 
 * danoFinal = danoBase + (AP * multiplicador)
 * 
 * Entrada:
 * - Dano base (double)
 * - Poder de habilidade (double)
 * - Multiplicador (double)
 * 
 * Saída:
 * - Dano final (double)
 */

public class Exercicio05_DamageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double danoBase, poderDeHabilidade, multiplicador, danoFinal;

        System.out.println("Digite o dano base do seu personagem: ");
        danoBase = scanner.nextDouble();

        System.out.println("Digite o quanto de poder de habilidade voce conseguiu com itens: ");
        poderDeHabilidade = scanner.nextDouble();

        System.out.println("Digite o multiplicador de dano que seu personagem possuí (ex: 0.6 para 60%): ");
        multiplicador = scanner.nextDouble();

        danoFinal = danoBase + (poderDeHabilidade * multiplicador);
        System.out.println("Voce está com um total de: " + danoFinal + " poder de habilidade 'AP'.");

        scanner.close();
    }
}
