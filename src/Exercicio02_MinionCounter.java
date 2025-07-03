import java.util.Scanner;

/**
 * Exercicio 2 - Contador de Minions
 * 
 * Peça ao jogador quantos minions ele farmou nos primeiros 10 minutos.
 * Calcule a média de farm por minuto e mostre na tela.
 * 
 * Entrada:
 * - Número total de minions (int)
 * 
 * Saída:
 * - Média de farm por minuto (double)
 */

public class Exercicio02_MinionCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tropasAbatidas;
        double tropasPorMinuto;

        System.out.println("Quantos minions voce farmou na partida:");
        tropasAbatidas = scanner.nextInt();

        tropasPorMinuto = (tropasAbatidas / 10.0);
        System.out.println("Você farmou " + tropasPorMinuto + " minions em 10 minutos!");

        scanner.close();
    }
}